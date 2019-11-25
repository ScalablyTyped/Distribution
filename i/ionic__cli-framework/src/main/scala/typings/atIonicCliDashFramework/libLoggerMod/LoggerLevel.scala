package typings.atIonicCliDashFramework.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.DEBUG
  - typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.INFO
  - typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.WARN
  - typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.ERROR
*/
trait LoggerLevel extends js.Object

object LoggerLevel {
  @scala.inline
  def DEBUG: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARN: typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.WARN = this.cast("WARN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

