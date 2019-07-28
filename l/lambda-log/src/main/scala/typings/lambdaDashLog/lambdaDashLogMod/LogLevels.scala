package typings.lambdaDashLog.lambdaDashLogMod

import org.scalablytyped.runtime.StringDictionary
import typings.lambdaDashLog.lambdaDashLogNumbers.`false`
import typings.lambdaDashLog.lambdaDashLogStrings.error
import typings.lambdaDashLog.lambdaDashLogStrings.info
import typings.lambdaDashLog.lambdaDashLogStrings.log
import typings.lambdaDashLog.lambdaDashLogStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  var debug: log | `false`
  var error: typings.lambdaDashLog.lambdaDashLogStrings.error
  var info: typings.lambdaDashLog.lambdaDashLogStrings.info
  var warn: typings.lambdaDashLog.lambdaDashLogStrings.warn
}

object LogLevels {
  @scala.inline
  def apply(
    debug: log | `false`,
    error: error,
    info: info,
    warn: warn,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error, info = info, warn = warn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevels]
  }
}

