package typings.indefiniteDashObservable

import typings.indefiniteDashObservable.distIndefiniteObservableMod.default
import typings.indefiniteDashObservable.distTypesMod.Connect
import typings.indefiniteDashObservable.distTypesMod.Observer
import typings.indefiniteDashObservable.distTypesMod.ObserverOrNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable", JSImport.Namespace)
@js.native
object indefiniteDashObservableMod extends js.Object {
  @js.native
  class IndefiniteObservable[T] protected () extends default[T] {
    /**
      * The provided function should receive an observer and connect that
      * observer's `next` method to an event source (for instance,
      * `element.addEventListener('click', observer.next)`).
      *
      * It must return a function that will disconnect the observer from the event
      * source.
      */
    def this(connect: Connect[T]) = this()
  }
  
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = js.native
}

