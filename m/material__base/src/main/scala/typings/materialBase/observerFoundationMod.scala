package typings.materialBase

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialBase.observerMod.Observer
import typings.materialBase.observerMod.ObserverRecord
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerFoundationMod {
  
  @JSImport("@material/base/observer-foundation", "MDCObserverFoundation")
  @js.native
  open class MDCObserverFoundation[Adapter] protected () extends MDCFoundation[Adapter] {
    def this(adapter: Adapter) = this()
    
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
    /* protected */ def observe[T /* <: js.Object */](target: T, observers: ObserverRecord[T, this.type]): js.Function0[Unit] = js.native
    
    /**
      * Observe a target's property for changes. When a property changes, the
      * provided `Observer` function will be invoked with the properties current
      * and previous values.
      *
      * The returned cleanup function will stop listening to changes for the
      * provided `Observer`.
      *
      * @template T The observed target type.
      * @template K The observed property.
      * @param target - The target to observe.
      * @param property - The property of the target to observe.
      * @param observer - An observer function to invoke each time the property
      *     changes.
      * @return A cleanup function that will stop observing changes for the
      *     provided `Observer`.
      */
    /* protected */ def observeProperty[T /* <: js.Object */, K /* <: /* keyof T */ String */](target: T, property: K, observer: Observer[T, K, Any]): js.Function0[Unit] = js.native
    
    /**
      * Enables or disables all observers for the provided target. Disabling
      * observers will prevent them from being called until they are re-enabled.
      *
      * @param target - The target to enable or disable observers for.
      * @param enabled - Whether or not observers should be called.
      */
    /* protected */ def setObserversEnabled(target: js.Object, enabled: Boolean): Unit = js.native
    
    /**
      * Clean up all observers and stop listening for property changes.
      */
    /* protected */ def unobserve(): Unit = js.native
    
    /** A set of cleanup functions to unobserve changes. */
    /* protected */ var unobserves: Set[js.Function] = js.native
  }
}
