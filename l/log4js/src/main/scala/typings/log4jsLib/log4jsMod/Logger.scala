package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4js", "Logger")
@js.native
class Logger ()
  extends ScalablyTyped.runtime.Instantiable2[/* dispatch */ js.Function, /* name */ java.lang.String, Logger] {
  var level: java.lang.String = js.native
  def _log(level: java.lang.String, data: js.Any): scala.Unit = js.native
  def addContext(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def clearContext(): scala.Unit = js.native
  def debug(message: js.Any, args: js.Any*): scala.Unit = js.native
  def error(message: js.Any, args: js.Any*): scala.Unit = js.native
  def fatal(message: js.Any, args: js.Any*): scala.Unit = js.native
  def info(message: js.Any, args: js.Any*): scala.Unit = js.native
  def isDebugEnabled(): scala.Boolean = js.native
  def isErrorEnabled(): scala.Boolean = js.native
  def isFatalEnabled(): scala.Boolean = js.native
  def isInfoEnabled(): scala.Boolean = js.native
  def isLevelEnabled(): scala.Boolean = js.native
  def isLevelEnabled(level: java.lang.String): scala.Boolean = js.native
  def isTraceEnabled(): scala.Boolean = js.native
  def isWarnEnabled(): scala.Boolean = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def removeContext(key: java.lang.String): scala.Unit = js.native
  def trace(message: js.Any, args: js.Any*): scala.Unit = js.native
  def warn(message: js.Any, args: js.Any*): scala.Unit = js.native
}

