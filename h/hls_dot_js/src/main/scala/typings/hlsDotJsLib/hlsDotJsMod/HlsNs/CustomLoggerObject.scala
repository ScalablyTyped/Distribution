package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

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
    debug: CustomLogger = null,
    error: CustomLogger = null,
    info: CustomLogger = null,
    log: CustomLogger = null,
    warn: CustomLogger = null
  ): CustomLoggerObject = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (log != null) __obj.updateDynamic("log")(log)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[CustomLoggerObject]
  }
}

