package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter[V, E] extends js.Object {
  // Deprecated methods
  def emit(value: V): Boolean = js.native
  def emitEvent(event: Event[V, E]): Boolean = js.native
  def end(): Unit = js.native
  def error(e: E): Boolean = js.native
  def event(event: Event[V, E]): Boolean = js.native
  def value(value: V): Boolean = js.native
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
  @scala.inline
  implicit class EmitterOps[Self <: Emitter[_, _], V, E] (val x: Self with (Emitter[V, E])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmit(value: V => Boolean): Self = this.set("emit", js.Any.fromFunction1(value))
    @scala.inline
    def setEmitEvent(value: Event[V, E] => Boolean): Self = this.set("emitEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setError(value: E => Boolean): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setEvent(value: Event[V, E] => Boolean): Self = this.set("event", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: V => Boolean): Self = this.set("value", js.Any.fromFunction1(value))
  }
  
}

