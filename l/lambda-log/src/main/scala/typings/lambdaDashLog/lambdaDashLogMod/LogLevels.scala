package typings.lambdaDashLog.lambdaDashLogMod

import org.scalablytyped.runtime.StringDictionary
import typings.lambdaDashLog.lambdaDashLogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  var debug: typings.lambdaDashLog.lambdaDashLogStrings.log | `false`
  var error: typings.lambdaDashLog.lambdaDashLogStrings.error
  var info: typings.lambdaDashLog.lambdaDashLogStrings.info
  var warn: typings.lambdaDashLog.lambdaDashLogStrings.warn
}

object LogLevels {
  @scala.inline
  def apply(
    debug: typings.lambdaDashLog.lambdaDashLogStrings.log | `false`,
    error: typings.lambdaDashLog.lambdaDashLogStrings.error,
    info: typings.lambdaDashLog.lambdaDashLogStrings.info,
    warn: typings.lambdaDashLog.lambdaDashLogStrings.warn,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevels]
  }
}

