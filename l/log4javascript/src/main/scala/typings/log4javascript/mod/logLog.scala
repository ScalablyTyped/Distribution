package typings.log4javascript.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4javascript", "logLog")
@js.native
object logLog extends js.Object {
  
  def debug(message: String): Unit = js.native
  def debug(message: String, exception: Error): Unit = js.native
  
  def displayDebug(): Unit = js.native
  
  def error(message: String): Unit = js.native
  def error(message: String, exception: Error): Unit = js.native
  
  def setAlertAllErrors(alertAllErrors: Boolean): Unit = js.native
  
  def setQuietMode(quietMode: Boolean): Unit = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, exception: Error): Unit = js.native
}
