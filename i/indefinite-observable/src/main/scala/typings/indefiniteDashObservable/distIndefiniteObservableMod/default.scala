package typings.indefiniteDashObservable.distIndefiniteObservableMod

import typings.indefiniteDashObservable.distTypesMod.Connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable/dist/IndefiniteObservable", JSImport.Default)
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

