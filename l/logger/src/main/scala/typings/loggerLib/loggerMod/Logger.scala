package typings
package loggerLib.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logger", "Logger")
@js.native
class Logger () extends js.Object {
  def this(logFilePath: java.lang.String) = this()
  @JSName("debug")
  var debug_Original: Args = js.native
  @JSName("error")
  var error_Original: Args = js.native
  @JSName("fatal")
  var fatal_Original: Args = js.native
  @JSName("info")
  var info_Original: Args = js.native
  @JSName("warn")
  var warn_Original: Args = js.native
  def debug(args: java.lang.String*): java.lang.String | loggerLib.loggerLibNumbers.`false` = js.native
  def error(args: java.lang.String*): java.lang.String | loggerLib.loggerLibNumbers.`false` = js.native
  def fatal(args: java.lang.String*): java.lang.String | loggerLib.loggerLibNumbers.`false` = js.native
  def format(level: LogLevel, data: java.lang.String, message: java.lang.String): java.lang.String = js.native
  def info(args: java.lang.String*): java.lang.String | loggerLib.loggerLibNumbers.`false` = js.native
  def log(level: LogLevel, args: java.lang.String*): java.lang.String | loggerLib.loggerLibNumbers.`false` = js.native
  def setLevel(level: LogLevel): scala.Double | loggerLib.loggerLibNumbers.`false` = js.native
  def warn(args: java.lang.String*): java.lang.String | loggerLib.loggerLibNumbers.`false` = js.native
}

