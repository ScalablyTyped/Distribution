package typings.jasmineJquery.jasmine

import typings.jasmine.jasmine.Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineJQueryEvents extends js.Object {
  def args(selector: String, eventName: String): js.Any = js.native
  def cleanUp(): Unit = js.native
  def spyOn(selector: String, eventName: String): JQueryEventSpy = js.native
  def wasPrevented(selector: String, eventName: String): Boolean = js.native
  def wasStopped(selector: String, eventName: String): Boolean = js.native
  def wasTriggered(selector: String, eventName: String): Boolean = js.native
  def wasTriggeredWith(selector: String, eventName: String, expectedArgs: js.Any, env: Env): Boolean = js.native
}

object JasmineJQueryEvents {
  @scala.inline
  def apply(
    args: (String, String) => js.Any,
    cleanUp: () => Unit,
    spyOn: (String, String) => JQueryEventSpy,
    wasPrevented: (String, String) => Boolean,
    wasStopped: (String, String) => Boolean,
    wasTriggered: (String, String) => Boolean,
    wasTriggeredWith: (String, String, js.Any, Env) => Boolean
  ): JasmineJQueryEvents = {
    val __obj = js.Dynamic.literal(args = js.Any.fromFunction2(args), cleanUp = js.Any.fromFunction0(cleanUp), spyOn = js.Any.fromFunction2(spyOn), wasPrevented = js.Any.fromFunction2(wasPrevented), wasStopped = js.Any.fromFunction2(wasStopped), wasTriggered = js.Any.fromFunction2(wasTriggered), wasTriggeredWith = js.Any.fromFunction4(wasTriggeredWith))
    __obj.asInstanceOf[JasmineJQueryEvents]
  }
  @scala.inline
  implicit class JasmineJQueryEventsOps[Self <: JasmineJQueryEvents] (val x: Self) extends AnyVal {
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
    def setArgs(value: (String, String) => js.Any): Self = this.set("args", js.Any.fromFunction2(value))
    @scala.inline
    def setCleanUp(value: () => Unit): Self = this.set("cleanUp", js.Any.fromFunction0(value))
    @scala.inline
    def setSpyOn(value: (String, String) => JQueryEventSpy): Self = this.set("spyOn", js.Any.fromFunction2(value))
    @scala.inline
    def setWasPrevented(value: (String, String) => Boolean): Self = this.set("wasPrevented", js.Any.fromFunction2(value))
    @scala.inline
    def setWasStopped(value: (String, String) => Boolean): Self = this.set("wasStopped", js.Any.fromFunction2(value))
    @scala.inline
    def setWasTriggered(value: (String, String) => Boolean): Self = this.set("wasTriggered", js.Any.fromFunction2(value))
    @scala.inline
    def setWasTriggeredWith(value: (String, String, js.Any, Env) => Boolean): Self = this.set("wasTriggeredWith", js.Any.fromFunction4(value))
  }
  
}

