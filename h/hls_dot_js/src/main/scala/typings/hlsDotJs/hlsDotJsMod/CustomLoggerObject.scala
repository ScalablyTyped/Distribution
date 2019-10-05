package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLoggerObject extends js.Object {
  var debug: js.UndefOr[CustomLogger] = js.undefined
  var error: js.UndefOr[CustomLogger] = js.undefined
  var info: js.UndefOr[CustomLogger] = js.undefined
  var log: js.UndefOr[CustomLogger] = js.undefined
  var warn: js.UndefOr[CustomLogger] = js.undefined
}

object CustomLoggerObject {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit = null,
    error: /* repeated */ js.Any => Unit = null,
    info: /* repeated */ js.Any => Unit = null,
    log: /* repeated */ js.Any => Unit = null,
    warn: /* repeated */ js.Any => Unit = null
  ): CustomLoggerObject = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1(warn))
    __obj.asInstanceOf[CustomLoggerObject]
  }
}

