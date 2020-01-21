package typings.lambdaLog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lambdaLog.lambdaLogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  var debug: typings.lambdaLog.lambdaLogStrings.log | `false`
  var error: typings.lambdaLog.lambdaLogStrings.error
  var info: typings.lambdaLog.lambdaLogStrings.info
  var warn: typings.lambdaLog.lambdaLogStrings.warn
}

object LogLevels {
  @scala.inline
  def apply(
    debug: typings.lambdaLog.lambdaLogStrings.log | `false`,
    error: typings.lambdaLog.lambdaLogStrings.error,
    info: typings.lambdaLog.lambdaLogStrings.info,
    warn: typings.lambdaLog.lambdaLogStrings.warn,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevels]
  }
}

