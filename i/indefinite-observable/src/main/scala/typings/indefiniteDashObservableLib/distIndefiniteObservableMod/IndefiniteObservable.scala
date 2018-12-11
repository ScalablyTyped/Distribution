package typings
package indefiniteDashObservableLib.distIndefiniteObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable/dist/IndefiniteObservable", "IndefiniteObservable")
@js.native
class IndefiniteObservable[T] protected ()
  extends indefiniteDashObservableLib.distTypesMod.Observable[T] {
  /**
       * The provided function should receive an observer and connect that
       * observer's `next` method to an event source (for instance,
       * `element.addEventListener('click', observer.next)`).
       *
       * It must return a function that will disconnect the observer from the event
       * source.
       */
  def this(connect: indefiniteDashObservableLib.distTypesMod.Connect[T]) = this()
  var _connect: js.Any = js.native
  /* CompleteClass */
  override def subscribe(observerOrNext: indefiniteDashObservableLib.distTypesMod.ObserverOrNext[T]): indefiniteDashObservableLib.distTypesMod.Subscription = js.native
}

