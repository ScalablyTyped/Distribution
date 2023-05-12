package typings.jotai

import typings.jotai.anon.Observable
import typings.jotai.anon.Subscribe
import typings.jotai.anon.`0`
import typings.jotai.anon.`1`
import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.Getter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsAtomWithObservableMod {
  
  @JSImport("jotai/vanilla/utils/atomWithObservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atomWithObservable[Data](getObservable: js.Function1[/* get */ Getter, SubjectLike[Data]]): WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit]]
  inline def atomWithObservable[Data](getObservable: js.Function1[/* get */ Getter, SubjectLike[Data]], options: Options[Data]): WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit]]
  inline def atomWithObservable[Data](
    getObservable: js.Function1[/* get */ Getter, SubjectLike[Data]],
    options: OptionsWithInitialValue[Data]
  ): WritableAtom[Data, js.Array[Data], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Data, js.Array[Data], Unit]]
  
  inline def atomWithObservable_Data_Atom_[Data](getObservable: js.Function1[/* get */ Getter, ObservableLike[Data]]): Atom_[Data | js.Promise[Data]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any]).asInstanceOf[Atom_[Data | js.Promise[Data]]]
  inline def atomWithObservable_Data_Atom_[Data](getObservable: js.Function1[/* get */ Getter, ObservableLike[Data]], options: Options[Data]): Atom_[Data | js.Promise[Data]] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Atom_[Data | js.Promise[Data]]]
  inline def atomWithObservable_Data_Atom_[Data](
    getObservable: js.Function1[/* get */ Getter, ObservableLike[Data]],
    options: OptionsWithInitialValue[Data]
  ): Atom_[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Atom_[Data]]
  
  type AnyError = Any
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ObservableLike = {subscribe (observer : jotai.jotai/vanilla/utils/atomWithObservable.Observer<T>): jotai.jotai/vanilla/utils/atomWithObservable.Subscription} & {[Symbol.observable] : (): jotai.jotai/vanilla/utils/atomWithObservable.ObservableLike<T> | undefined | undefined} | {subscribe (observer : std.Partial<jotai.jotai/vanilla/utils/atomWithObservable.Observer<T>>): jotai.jotai/vanilla/utils/atomWithObservable.Subscription} & {[Symbol.observable] : (): jotai.jotai/vanilla/utils/atomWithObservable.ObservableLike<T> | undefined | undefined} | {subscribe (observer : std.Partial<jotai.jotai/vanilla/utils/atomWithObservable.Observer<T>>): jotai.jotai/vanilla/utils/atomWithObservable.Subscription, subscribe (next : (value : T): void): jotai.jotai/vanilla/utils/atomWithObservable.Subscription} & {[Symbol.observable] : (): jotai.jotai/vanilla/utils/atomWithObservable.ObservableLike<T> | undefined | undefined}
  }}}
  to avoid circular code involving: 
  - jotai.jotai/vanilla/utils/atomWithObservable.ObservableLike
  */
  type ObservableLike[T] = (Subscribe[T] & Observable) | (`0`[T] & Observable) | (`1`[T] & Observable)
  
  trait Observer[T] extends StObject {
    
    def complete(): Unit
    
    def error(error: AnyError): Unit
    
    def next(value: T): Unit
  }
  object Observer {
    
    inline def apply[T](complete: () => Unit, error: AnyError => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: AnyError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  trait Options[Data] extends StObject {
    
    var initialValue: js.UndefOr[Data | js.Function0[Data]] = js.undefined
    
    var unstable_timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[Data](): Options[Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Data]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Data] (val x: Self & Options[Data]) extends AnyVal {
      
      inline def setInitialValue(value: Data | js.Function0[Data]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueFunction0(value: () => Data): Self = StObject.set(x, "initialValue", js.Any.fromFunction0(value))
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setUnstable_timeout(value: Double): Self = StObject.set(x, "unstable_timeout", value.asInstanceOf[js.Any])
      
      inline def setUnstable_timeoutUndefined: Self = StObject.set(x, "unstable_timeout", js.undefined)
    }
  }
  
  trait OptionsWithInitialValue[Data] extends StObject {
    
    var initialValue: Data | js.Function0[Data]
    
    var unstable_timeout: js.UndefOr[Double] = js.undefined
  }
  object OptionsWithInitialValue {
    
    inline def apply[Data](initialValue: Data | js.Function0[Data]): OptionsWithInitialValue[Data] = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithInitialValue[Data]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsWithInitialValue[?], Data] (val x: Self & OptionsWithInitialValue[Data]) extends AnyVal {
      
      inline def setInitialValue(value: Data | js.Function0[Data]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueFunction0(value: () => Data): Self = StObject.set(x, "initialValue", js.Any.fromFunction0(value))
      
      inline def setUnstable_timeout(value: Double): Self = StObject.set(x, "unstable_timeout", value.asInstanceOf[js.Any])
      
      inline def setUnstable_timeoutUndefined: Self = StObject.set(x, "unstable_timeout", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SubjectLike = jotai.jotai/vanilla/utils/atomWithObservable.ObservableLike<T> & jotai.jotai/vanilla/utils/atomWithObservable.Observer<T>
  }}}
  to avoid circular code involving: 
  - jotai.jotai/vanilla/utils/atomWithObservable.ObservableLike
  - jotai.jotai/vanilla/utils/atomWithObservable.SubjectLike
  */
  type SubjectLike[T] = Any & Observer[T]
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
