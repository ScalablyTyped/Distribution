package typings.ionicCliFramework.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCliFramework.ionicCliFrameworkStrings.DEBUG
  - typings.ionicCliFramework.ionicCliFrameworkStrings.INFO
  - typings.ionicCliFramework.ionicCliFrameworkStrings.WARN
  - typings.ionicCliFramework.ionicCliFrameworkStrings.ERROR
*/
trait LoggerLevel extends js.Object

object LoggerLevel {
  @scala.inline
  def DEBUG: typings.ionicCliFramework.ionicCliFrameworkStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typings.ionicCliFramework.ionicCliFrameworkStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typings.ionicCliFramework.ionicCliFrameworkStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARN: typings.ionicCliFramework.ionicCliFrameworkStrings.WARN = this.cast("WARN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

