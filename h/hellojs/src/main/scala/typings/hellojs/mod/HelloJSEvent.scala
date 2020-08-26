package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSEvent extends js.Object {
  def emit(event: String, data: js.Any): HelloJSStatic = js.native
  def emitAfter(): HelloJSStatic = js.native
  def findEvents(event: String, callback: js.Function2[/* name */ String, /* index */ Double, Unit]): Unit = js.native
  def off(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic = js.native
  def on(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic = js.native
}

object HelloJSEvent {
  @scala.inline
  def apply(
    emit: (String, js.Any) => HelloJSStatic,
    emitAfter: () => HelloJSStatic,
    findEvents: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit,
    off: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic,
    on: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic
  ): HelloJSEvent = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), emitAfter = js.Any.fromFunction0(emitAfter), findEvents = js.Any.fromFunction2(findEvents), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[HelloJSEvent]
  }
  @scala.inline
  implicit class HelloJSEventOps[Self <: HelloJSEvent] (val x: Self) extends AnyVal {
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
    def setEmit(value: (String, js.Any) => HelloJSStatic): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setEmitAfter(value: () => HelloJSStatic): Self = this.set("emitAfter", js.Any.fromFunction0(value))
    @scala.inline
    def setFindEvents(value: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit): Self = this.set("findEvents", js.Any.fromFunction2(value))
    @scala.inline
    def setOff(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = this.set("on", js.Any.fromFunction2(value))
  }
  
}

