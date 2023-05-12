package typings.jotai

import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomArgs
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomResult
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUseSetAtomMod {
  
  @JSImport("jotai/react/useSetAtom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSetAtom[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType): SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]]
  inline def useSetAtom[AtomType /* <: WritableAtom[Any, js.Array[Any], Any] */](atom: AtomType, options: Options): SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SetAtom[ExtractAtomArgs[AtomType], ExtractAtomResult[AtomType]]]
  inline def useSetAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result]): SetAtom[Args, Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any]).asInstanceOf[SetAtom[Args, Result]]
  inline def useSetAtom[Value, Args /* <: js.Array[Any] */, Result](atom: WritableAtom[Value, Args, Result], options: Options): SetAtom[Args, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSetAtom")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SetAtom[Args, Result]]
  
  trait Options extends StObject {
    
    var store: js.UndefOr[Store] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  type SetAtom[Args /* <: js.Array[Any] */, Result] = js.Function1[/* args */ Args, Result]
  
  type Store = ReturnType[
    js.Function1[
      /* options */ js.UndefOr[typings.jotai.reactProviderMod.Options], 
      typings.jotai.reactProviderMod.Store
    ]
  ]
}
