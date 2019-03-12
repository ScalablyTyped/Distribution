package typings
package jasmineDashJqueryLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineJQueryEvents extends js.Object {
  def args(selector: java.lang.String, eventName: java.lang.String): js.Any
  def cleanUp(): scala.Unit
  def spyOn(selector: java.lang.String, eventName: java.lang.String): JQueryEventSpy
  def wasPrevented(selector: java.lang.String, eventName: java.lang.String): scala.Boolean
  def wasStopped(selector: java.lang.String, eventName: java.lang.String): scala.Boolean
  def wasTriggered(selector: java.lang.String, eventName: java.lang.String): scala.Boolean
  def wasTriggeredWith(
    selector: java.lang.String,
    eventName: java.lang.String,
    expectedArgs: js.Any,
    env: jasmineLib.jasmineNs.Env
  ): scala.Boolean
}

object JasmineJQueryEvents {
  @scala.inline
  def apply(
    args: (java.lang.String, java.lang.String) => js.Any,
    cleanUp: () => scala.Unit,
    spyOn: (java.lang.String, java.lang.String) => JQueryEventSpy,
    wasPrevented: (java.lang.String, java.lang.String) => scala.Boolean,
    wasStopped: (java.lang.String, java.lang.String) => scala.Boolean,
    wasTriggered: (java.lang.String, java.lang.String) => scala.Boolean,
    wasTriggeredWith: (java.lang.String, java.lang.String, js.Any, jasmineLib.jasmineNs.Env) => scala.Boolean
  ): JasmineJQueryEvents = {
    val __obj = js.Dynamic.literal(args = js.Any.fromFunction2(args), cleanUp = js.Any.fromFunction0(cleanUp), spyOn = js.Any.fromFunction2(spyOn), wasPrevented = js.Any.fromFunction2(wasPrevented), wasStopped = js.Any.fromFunction2(wasStopped), wasTriggered = js.Any.fromFunction2(wasTriggered), wasTriggeredWith = js.Any.fromFunction4(wasTriggeredWith))
  
    __obj.asInstanceOf[JasmineJQueryEvents]
  }
}

