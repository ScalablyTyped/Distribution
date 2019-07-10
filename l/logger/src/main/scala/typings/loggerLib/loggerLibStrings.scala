package typings
package loggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object loggerLibStrings {
  @js.native
  sealed trait debug
    extends loggerLib.loggerMod.LogLevel
  
  @js.native
  sealed trait error
    extends loggerLib.loggerMod.LogLevel
  
  @js.native
  sealed trait fatal
    extends loggerLib.loggerMod.LogLevel
  
  @js.native
  sealed trait info
    extends loggerLib.loggerMod.LogLevel
  
  @js.native
  sealed trait warn
    extends loggerLib.loggerMod.LogLevel
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

