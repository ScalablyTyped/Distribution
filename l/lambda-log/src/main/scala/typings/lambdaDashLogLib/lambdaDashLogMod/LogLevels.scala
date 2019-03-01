package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var debug: lambdaDashLogLib.lambdaDashLogLibStrings.log | lambdaDashLogLib.lambdaDashLogLibNumbers.`false`
  var error: lambdaDashLogLib.lambdaDashLogLibStrings.error
  var info: lambdaDashLogLib.lambdaDashLogLibStrings.info
  var warn: lambdaDashLogLib.lambdaDashLogLibStrings.warn
}

object LogLevels {
  @scala.inline
  def apply(
    debug: lambdaDashLogLib.lambdaDashLogLibStrings.log | lambdaDashLogLib.lambdaDashLogLibNumbers.`false`,
    error: lambdaDashLogLib.lambdaDashLogLibStrings.error,
    info: lambdaDashLogLib.lambdaDashLogLibStrings.info,
    warn: lambdaDashLogLib.lambdaDashLogLibStrings.warn,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): LogLevels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("warn")(warn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevels]
  }
}

