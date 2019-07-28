package typings.log4javascript.log4javascriptMod

import typings.log4javascript.Fn_EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addEventListener(eventType: String, listener: Fn_EventArgs): Unit = js.native
  def dispatchEvent(eventType: String, eventArgs: js.Any): Unit = js.native
  def evalInScope(expr: String): js.Any = js.native
  def getDefaultLogger(): Logger = js.native
  def getLogger(): Logger = js.native
  def getLogger(loggerName: String): Logger = js.native
  def getNullLogger(): Logger = js.native
  def getRootLogger(): Logger = js.native
  def isEnabled(): Boolean = js.native
  def removeEventListener(eventType: String, listener: Fn_EventArgs): Unit = js.native
  def resetConfiguration(): Unit = js.native
  def setEnabled(enabled: Boolean): Unit = js.native
  def setEventTypes(eventTypes: js.Array[String]): Unit = js.native
  def setShowStackTraces(show: Boolean): Unit = js.native
}

