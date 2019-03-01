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
    args: js.Function2[java.lang.String, java.lang.String, js.Any],
    cleanUp: js.Function0[scala.Unit],
    spyOn: js.Function2[java.lang.String, java.lang.String, JQueryEventSpy],
    wasPrevented: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    wasStopped: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    wasTriggered: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    wasTriggeredWith: js.Function4[java.lang.String, java.lang.String, js.Any, jasmineLib.jasmineNs.Env, scala.Boolean]
  ): JasmineJQueryEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("cleanUp")(cleanUp)
    __obj.updateDynamic("spyOn")(spyOn)
    __obj.updateDynamic("wasPrevented")(wasPrevented)
    __obj.updateDynamic("wasStopped")(wasStopped)
    __obj.updateDynamic("wasTriggered")(wasTriggered)
    __obj.updateDynamic("wasTriggeredWith")(wasTriggeredWith)
    __obj.asInstanceOf[JasmineJQueryEvents]
  }
}

