package typings.hapiTeamwork.mod

import typings.hapiTeamwork.mod.Events.Iterator
import typings.std.AsyncIterator
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/teamwork", "Events")
@js.native
class Events[T] () extends js.Object {
  
  /**
    * Emits an event to be consumed via the iterator.
    *
    * @param value
    */
  def emit(value: T): Unit = js.native
  
  /**
    * Informs the iterator that no new events will be emitted.
    */
  def end(): Unit = js.native
  
  /**
    * Returns a standard async iterator interface object.
    *
    * @returns async iterator interface object.
    */
  def iterator(): Iterator[T] = js.native
}
@JSImport("@hapi/teamwork", "Events")
@js.native
object Events extends js.Object {
  
  @js.native
  class Iterator[T] protected ()
    extends AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]] {
    def this(events: Events[T]) = this()
    
    def next(): js.Promise[IteratorResult[T, _]] = js.native
  }
}
