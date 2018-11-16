package typings
package log4javascriptLib.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", JSImport.Namespace)
@js.native
object log4javascriptModMembers extends js.Object {
  def addEventListener(eventType: java.lang.String, listener: log4javascriptLib.Anon_Sender): scala.Unit = js.native
  def dispatchEvent(eventType: java.lang.String, eventArgs: js.Any): scala.Unit = js.native
  def evalInScope(expr: java.lang.String): js.Any = js.native
  def getDefaultLogger(): Logger = js.native
  def getLogger(): Logger = js.native
  def getLogger(loggerName: java.lang.String): Logger = js.native
  def getNullLogger(): Logger = js.native
  def getRootLogger(): Logger = js.native
  def isEnabled(): scala.Boolean = js.native
  def removeEventListener(eventType: java.lang.String, listener: log4javascriptLib.Anon_Sender): scala.Unit = js.native
  def resetConfiguration(): scala.Unit = js.native
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setEventTypes(eventTypes: js.Array[java.lang.String]): scala.Unit = js.native
  def setShowStackTraces(show: scala.Boolean): scala.Unit = js.native
}

