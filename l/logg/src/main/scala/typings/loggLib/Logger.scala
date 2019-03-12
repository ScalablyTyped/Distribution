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

object Logger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => scala.Unit,
    fine: /* repeated */ js.Any => scala.Unit,
    getLogLevel: () => scala.Double,
    getParent: () => Logger,
    getWatchers: () => js.Array[js.Function],
    info: /* repeated */ js.Any => scala.Unit,
    isLoggable: scala.Double => scala.Boolean,
    log: (scala.Double, /* repeated */ js.Any) => scala.Unit,
    registerWatcher: js.Function1[/* logRecord */ java.lang.String, scala.Unit] => scala.Unit,
    setLogLevel: scala.Double => scala.Unit,
    setParent: Logger => scala.Unit,
    warn: /* repeated */ js.Any => scala.Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fine = js.Any.fromFunction1(fine), getLogLevel = js.Any.fromFunction0(getLogLevel), getParent = js.Any.fromFunction0(getParent), getWatchers = js.Any.fromFunction0(getWatchers), info = js.Any.fromFunction1(info), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2(log), registerWatcher = js.Any.fromFunction1(registerWatcher), setLogLevel = js.Any.fromFunction1(setLogLevel), setParent = js.Any.fromFunction1(setParent), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}

