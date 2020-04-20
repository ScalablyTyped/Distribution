package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[V, E] extends js.Object {
  // Deprecated methods
  def emit(value: V): Boolean
  def emitEvent(event: Event[V, E]): Boolean
  def end(): Unit
  def error(e: E): Boolean
  def event(event: Event[V, E]): Boolean
  def value(value: V): Boolean
}

object Emitter {
  @scala.inline
  def apply[V, E](
    emit: V => Boolean,
    emitEvent: Event[V, E] => Boolean,
    end: () => Unit,
    error: E => Boolean,
    event: Event[V, E] => Boolean,
    value: V => Boolean
  ): Emitter[V, E] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), emitEvent = js.Any.fromFunction1(emitEvent), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), event = js.Any.fromFunction1(event), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Emitter[V, E]]
  }
}

