package typings.jqueryMockjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockJaxStandardLogger extends js.Object {
  var debug: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var error: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var info: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var log: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  var warn: js.UndefOr[MockJaxLoggingFunction] = js.undefined
}

object MockJaxStandardLogger {
  @scala.inline
  def apply(
    debug: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null,
    error: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null,
    info: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null,
    log: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null,
    warn: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit = null
  ): MockJaxStandardLogger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2(debug))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction2(info))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2(warn))
    __obj.asInstanceOf[MockJaxStandardLogger]
  }
}

