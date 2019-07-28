package typings.jasmineDashJquery.jasmineNs

import typings.jasmine.jasmineNs.Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineJQueryEvents extends js.Object {
  def args(selector: String, eventName: String): js.Any
  def cleanUp(): Unit
  def spyOn(selector: String, eventName: String): JQueryEventSpy
  def wasPrevented(selector: String, eventName: String): Boolean
  def wasStopped(selector: String, eventName: String): Boolean
  def wasTriggered(selector: String, eventName: String): Boolean
  def wasTriggeredWith(selector: String, eventName: String, expectedArgs: js.Any, env: Env): Boolean
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
}

