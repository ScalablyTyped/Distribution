package typings.materialBase

import typings.materialBase.typesMod.Constructor
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("@material/base/observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDescriptor[T /* <: js.Object */, K /* <: /* keyof T */ String */](target: T, property: K): js.UndefOr[
    TypedPropertyDescriptor[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptor")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    TypedPropertyDescriptor[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ]]
  
  inline def mdcObserver(): Constructor[MDCObserver_] = ^.asInstanceOf[js.Dynamic].applyDynamic("mdcObserver")().asInstanceOf[Constructor[MDCObserver_]]
  inline def mdcObserver[T, C /* <: Constructor[T] */](baseClass: C): Constructor[MDCObserver_] & Constructor[T] & C = ^.asInstanceOf[js.Dynamic].applyDynamic("mdcObserver")(baseClass.asInstanceOf[js.Any]).asInstanceOf[Constructor[MDCObserver_] & Constructor[T] & C]
  
  inline def observeProperty[T /* <: js.Object */, K /* <: /* keyof T */ String */](target: T, property: K, observer: Observer[T, K, Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def setObserversEnabled[T /* <: js.Object */](target: T, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setObserversEnabled")(target.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MDCObserver_ extends StObject {
    
    /**
      * Observe a target's properties for changes using the provided map of
      * property names and observer functions.
      *
      * @template T The target type.
      * @param target - The target to observe.
      * @param observers - An object whose keys are target properties and values
      *     are observer functions that are called when the associated property
      *     changes.
      * @return A cleanup function that can be called to unobserve the
      *     target.
      */
    def observe[T /* <: js.Object */](target: T, observers: ObserverRecord[T, this.type]): js.Function0[Unit]
    
    /**
      * Enables or disables all observers for the provided target. Disabling
      * observers will prevent them from being called until they are re-enabled.
      *
      * @param target - The target to enable or disable observers for.
      * @param enabled - Whether or not observers should be called.
      */
    def setObserversEnabled(target: js.Object, enabled: Boolean): Unit
    
    /**
      * Clean up all observers and stop listening for property changes.
      */
    def unobserve(): Unit
  }
  object MDCObserver_ {
    
    inline def apply(
      observe: (Any, ObserverRecord[Any, MDCObserver_]) => js.Function0[Unit],
      setObserversEnabled: (js.Object, Boolean) => Unit,
      unobserve: () => Unit
    ): MDCObserver_ = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction2(observe), setObserversEnabled = js.Any.fromFunction2(setObserversEnabled), unobserve = js.Any.fromFunction0(unobserve))
      __obj.asInstanceOf[MDCObserver_]
    }
    
    extension [Self <: MDCObserver_](x: Self) {
      
      inline def setObserve(value: (Any, ObserverRecord[Any, MDCObserver_]) => js.Function0[Unit]): Self = StObject.set(x, "observe", js.Any.fromFunction2(value))
      
      inline def setSetObserversEnabled(value: (js.Object, Boolean) => Unit): Self = StObject.set(x, "setObserversEnabled", js.Any.fromFunction2(value))
      
      inline def setUnobserve(value: () => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction0(value))
    }
  }
  
  type Observer[T /* <: js.Object */, K /* <: /* keyof T */ String */, This] = js.ThisFunction2[
    /* this */ This, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* current */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* previous */ js.Any, 
    Unit
  ]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]:? @material/base.@material/base/observer.Observer<T, K, This>}
    }}}
    */
  @js.native
  trait ObserverRecord[T /* <: js.Object */, This] extends StObject
}
