package typings.javascriptDashObfuscator.javascriptDashObfuscatorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends /* id */ StringDictionary[js.Any] {
  var compact: js.UndefOr[Boolean] = js.undefined
  var debugProtection: js.UndefOr[Boolean] = js.undefined
  var debugProtectionInterval: js.UndefOr[Boolean] = js.undefined
  var disableConsoleOutput: js.UndefOr[Boolean] = js.undefined
  var encodeUnicodeLiterals: js.UndefOr[Boolean] = js.undefined
  var reservedNames: js.UndefOr[js.Array[String]] = js.undefined
  var rotateUnicodeArray: js.UndefOr[Boolean] = js.undefined
  var selfDefending: js.UndefOr[Boolean] = js.undefined
  var unicodeArray: js.UndefOr[Boolean] = js.undefined
  var unicodeArrayThreshold: js.UndefOr[Double] = js.undefined
  var wrapUnicodeArrayCalls: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    StringDictionary: /* id */ StringDictionary[js.Any] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    debugProtection: js.UndefOr[Boolean] = js.undefined,
    debugProtectionInterval: js.UndefOr[Boolean] = js.undefined,
    disableConsoleOutput: js.UndefOr[Boolean] = js.undefined,
    encodeUnicodeLiterals: js.UndefOr[Boolean] = js.undefined,
    reservedNames: js.Array[String] = null,
    rotateUnicodeArray: js.UndefOr[Boolean] = js.undefined,
    selfDefending: js.UndefOr[Boolean] = js.undefined,
    unicodeArray: js.UndefOr[Boolean] = js.undefined,
    unicodeArrayThreshold: Int | Double = null,
    wrapUnicodeArrayCalls: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(debugProtection)) __obj.updateDynamic("debugProtection")(debugProtection)
    if (!js.isUndefined(debugProtectionInterval)) __obj.updateDynamic("debugProtectionInterval")(debugProtectionInterval)
    if (!js.isUndefined(disableConsoleOutput)) __obj.updateDynamic("disableConsoleOutput")(disableConsoleOutput)
    if (!js.isUndefined(encodeUnicodeLiterals)) __obj.updateDynamic("encodeUnicodeLiterals")(encodeUnicodeLiterals)
    if (reservedNames != null) __obj.updateDynamic("reservedNames")(reservedNames)
    if (!js.isUndefined(rotateUnicodeArray)) __obj.updateDynamic("rotateUnicodeArray")(rotateUnicodeArray)
    if (!js.isUndefined(selfDefending)) __obj.updateDynamic("selfDefending")(selfDefending)
    if (!js.isUndefined(unicodeArray)) __obj.updateDynamic("unicodeArray")(unicodeArray)
    if (unicodeArrayThreshold != null) __obj.updateDynamic("unicodeArrayThreshold")(unicodeArrayThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapUnicodeArrayCalls)) __obj.updateDynamic("wrapUnicodeArrayCalls")(wrapUnicodeArrayCalls)
    __obj.asInstanceOf[IOptions]
  }
}

