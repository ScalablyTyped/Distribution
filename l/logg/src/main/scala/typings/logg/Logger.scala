package typings.logg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(var_args: js.Any*): Unit
  def fine(var_args: js.Any*): Unit
  def getLogLevel(): Double
  def getParent(): Logger
  def getWatchers(): js.Array[js.Function]
  def info(var_args: js.Any*): Unit
  def isLoggable(level: Double): Boolean
  def log(level: Double, var_args: js.Any*): Unit
  def registerWatcher(watcher: js.Function1[/* logRecord */ String, Unit]): Unit
  def setLogLevel(level: Double): Unit
  def setParent(logger: Logger): Unit
  def warn(var_args: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Unit,
    fine: /* repeated */ js.Any => Unit,
    getLogLevel: () => Double,
    getParent: () => Logger,
    getWatchers: () => js.Array[js.Function],
    info: /* repeated */ js.Any => Unit,
    isLoggable: Double => Boolean,
    log: (Double, /* repeated */ js.Any) => Unit,
    registerWatcher: js.Function1[/* logRecord */ String, Unit] => Unit,
    setLogLevel: Double => Unit,
    setParent: Logger => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fine = js.Any.fromFunction1(fine), getLogLevel = js.Any.fromFunction0(getLogLevel), getParent = js.Any.fromFunction0(getParent), getWatchers = js.Any.fromFunction0(getWatchers), info = js.Any.fromFunction1(info), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2(log), registerWatcher = js.Any.fromFunction1(registerWatcher), setLogLevel = js.Any.fromFunction1(setLogLevel), setParent = js.Any.fromFunction1(setParent), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
}

