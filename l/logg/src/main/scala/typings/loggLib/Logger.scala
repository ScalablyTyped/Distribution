package typings
package loggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(var_args: js.Any*): scala.Unit
  def fine(var_args: js.Any*): scala.Unit
  def getLogLevel(): scala.Double
  def getParent(): Logger
  def getWatchers(): js.Array[js.Function]
  def info(var_args: js.Any*): scala.Unit
  def isLoggable(level: scala.Double): scala.Boolean
  def log(level: scala.Double, var_args: js.Any*): scala.Unit
  def registerWatcher(watcher: js.Function1[/* logRecord */ java.lang.String, scala.Unit]): scala.Unit
  def setLogLevel(level: scala.Double): scala.Unit
  def setParent(logger: Logger): scala.Unit
  def warn(var_args: js.Any*): scala.Unit
}

