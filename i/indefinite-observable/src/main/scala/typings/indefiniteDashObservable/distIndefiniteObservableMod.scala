package typings.indefiniteDashObservable

import typings.indefiniteDashObservable.distIndefiniteObservableMod.IndefiniteObservable
import typings.indefiniteDashObservable.distTypesMod.Connect
import typings.indefiniteDashObservable.distTypesMod.Observable
import typings.indefiniteDashObservable.distTypesMod.ObserverOrNext
import typings.indefiniteDashObservable.distTypesMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable/dist/IndefiniteObservable", JSImport.Namespace)
@js.native
object distIndefiniteObservableMod extends js.Object {
  @js.native
  class IndefiniteObservable[T] protected () extends Observable[T] {
    /**
      * The provided function should receive an observer and connect that
      * observer's `next` method to an event source (for instance,
      * `element.addEventListener('click', observer.next)`).
      *
      * It must return a function that will disconnect the observer from the event
      * source.
      */
    def this(connect: Connect[T]) = this()
    var _connect: js.Any = js.native
    /* CompleteClass */
    override def subscribe(observerOrNext: ObserverOrNext[T]): Subscription = js.native
  }
  
  @js.native
  class default[T] protected () extends IndefiniteObservable[T] {
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
  
}

