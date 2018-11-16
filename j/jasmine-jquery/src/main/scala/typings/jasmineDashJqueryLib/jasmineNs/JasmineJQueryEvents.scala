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

