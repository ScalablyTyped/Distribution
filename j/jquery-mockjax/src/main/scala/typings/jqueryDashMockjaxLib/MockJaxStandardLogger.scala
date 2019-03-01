package typings
package jqueryDashMockjaxLib

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
    debug: MockJaxLoggingFunction = null,
    error: MockJaxLoggingFunction = null,
    info: MockJaxLoggingFunction = null,
    log: MockJaxLoggingFunction = null,
    warn: MockJaxLoggingFunction = null
  ): MockJaxStandardLogger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (log != null) __obj.updateDynamic("log")(log)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[MockJaxStandardLogger]
  }
}

