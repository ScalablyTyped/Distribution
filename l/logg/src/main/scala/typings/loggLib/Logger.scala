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
    error: js.Function1[/* repeated */ js.Any, scala.Unit],
    fine: js.Function1[/* repeated */ js.Any, scala.Unit],
    getLogLevel: js.Function0[scala.Double],
    getParent: js.Function0[Logger],
    getWatchers: js.Function0[js.Array[js.Function]],
    info: js.Function1[/* repeated */ js.Any, scala.Unit],
    isLoggable: js.Function1[scala.Double, scala.Boolean],
    log: js.Function2[scala.Double, /* repeated */ js.Any, scala.Unit],
    registerWatcher: js.Function1[js.Function1[/* logRecord */ java.lang.String, scala.Unit], scala.Unit],
    setLogLevel: js.Function1[scala.Double, scala.Unit],
    setParent: js.Function1[Logger, scala.Unit],
    warn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fine")(fine)
    __obj.updateDynamic("getLogLevel")(getLogLevel)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getWatchers")(getWatchers)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("isLoggable")(isLoggable)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("registerWatcher")(registerWatcher)
    __obj.updateDynamic("setLogLevel")(setLogLevel)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Logger]
  }
}

