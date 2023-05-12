package typings.jotai

import typings.jotai.anon.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaAtomMod {
  
  @JSImport("jotai/vanilla/atom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atom[Value](initialValue: Value): PrimitiveAtom[Value] & WithInitialValue[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(initialValue.asInstanceOf[js.Any]).asInstanceOf[PrimitiveAtom[Value] & WithInitialValue[Value]]
  inline def atom[Value](read: Read[Value, scala.Nothing]): Atom_[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(read.asInstanceOf[js.Any]).asInstanceOf[Atom_[Value]]
  inline def atom[Value, Args /* <: js.Array[Any] */, Result](initialValue: Value, write: Write[Args, Result]): (WritableAtom[Value, Args, Result]) & WithInitialValue[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(initialValue.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[(WritableAtom[Value, Args, Result]) & WithInitialValue[Value]]
  inline def atom[Value, Args /* <: js.Array[Any] */, Result](read: Read[Value, SetAtom[Args, Result]], write: Write[Args, Result]): WritableAtom[Value, Args, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(read.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, Args, Result]]
  
  trait Atom_[Value] extends StObject {
    
    var debugLabel: js.UndefOr[String] = js.undefined
    
    /**
      * To ONLY be used by Jotai libraries to mark atoms as private. Subject to change.
      * @private
      */
    var debugPrivate: js.UndefOr[Boolean] = js.undefined
    
    var read: Read[Value, scala.Nothing]
  }
  object Atom_ {
    
    inline def apply[Value](read: (/* get */ Getter, /* options */ Signal[scala.Nothing]) => Value): Atom_[Value] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read))
      __obj.asInstanceOf[Atom_[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Atom_[?], Value] (val x: Self & Atom_[Value]) extends AnyVal {
      
      inline def setDebugLabel(value: String): Self = StObject.set(x, "debugLabel", value.asInstanceOf[js.Any])
      
      inline def setDebugLabelUndefined: Self = StObject.set(x, "debugLabel", js.undefined)
      
      inline def setDebugPrivate(value: Boolean): Self = StObject.set(x, "debugPrivate", value.asInstanceOf[js.Any])
      
      inline def setDebugPrivateUndefined: Self = StObject.set(x, "debugPrivate", js.undefined)
      
      inline def setRead(value: (/* get */ Getter, /* options */ Signal[scala.Nothing]) => Value): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    }
  }
  
  type Getter = js.Function1[/* atom */ Atom_[Any], Any]
  
  type OnMount[Args /* <: js.Array[Any] */, Result] = js.Function1[/* setAtom */ SetAtom[Args, Result], OnUnmount | Unit]
  
  type OnUnmount = js.Function0[Unit]
  
  type PrimitiveAtom[Value] = WritableAtom[Value, js.Array[SetStateAction[Value]], Unit]
  
  type Read[Value, SetSelf] = js.Function2[/* get */ Getter, /* options */ Signal[SetSelf], Value]
  
  type SetAtom[Args /* <: js.Array[Any] */, Result] = js.Function1[/* args */ Args, Result]
  
  type SetStateAction[Value] = Value | (js.Function1[/* prev */ Value, Value])
  
  type Setter = js.Function2[/* atom */ WritableAtom[Any, js.Array[Any], Any], /* args */ js.Array[Any], Any]
  
  trait WithInitialValue[Value] extends StObject {
    
    var init: Value
  }
  object WithInitialValue {
    
    inline def apply[Value](init: Value): WithInitialValue[Value] = {
      val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithInitialValue[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithInitialValue[?], Value] (val x: Self & WithInitialValue[Value]) extends AnyVal {
      
      inline def setInit(value: Value): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    }
  }
  
  trait WritableAtom[Value, Args /* <: js.Array[Any] */, Result]
    extends StObject
       with Atom_[Value] {
    
    var onMount: js.UndefOr[OnMount[Args, Result]] = js.undefined
    
    @JSName("read")
    var read_WritableAtom: Read[Value, SetAtom[Args, Result]]
    
    var write: Write[Args, Result]
  }
  object WritableAtom {
    
    inline def apply[Value, Args /* <: js.Array[Any] */, Result](
      read: (/* get */ Getter, /* options */ Signal[SetAtom[Args, Result]]) => Value,
      write: (/* get */ Getter, /* set */ Setter, Args) => Result
    ): WritableAtom[Value, Args, Result] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), write = js.Any.fromFunction3(write))
      __obj.asInstanceOf[WritableAtom[Value, Args, Result]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WritableAtom[?, ?, ?], Value, Args /* <: js.Array[Any] */, Result] (val x: Self & (WritableAtom[Value, Args, Result])) extends AnyVal {
      
      inline def setOnMount(value: /* setAtom */ SetAtom[Args, Result] => OnUnmount | Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction1(value))
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setRead(value: (/* get */ Getter, /* options */ Signal[SetAtom[Args, Result]]) => Value): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setWrite(value: (/* get */ Getter, /* set */ Setter, Args) => Result): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
    }
  }
  
  type Write[Args /* <: js.Array[Any] */, Result] = js.Function3[/* get */ Getter, /* set */ Setter, /* args */ Args, Result]
}
