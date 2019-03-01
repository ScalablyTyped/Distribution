package typings
package javascriptDashObfuscatorLib.javascriptDashObfuscatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends /* id */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var debugProtection: js.UndefOr[scala.Boolean] = js.undefined
  var debugProtectionInterval: js.UndefOr[scala.Boolean] = js.undefined
  var disableConsoleOutput: js.UndefOr[scala.Boolean] = js.undefined
  var encodeUnicodeLiterals: js.UndefOr[scala.Boolean] = js.undefined
  var reservedNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var rotateUnicodeArray: js.UndefOr[scala.Boolean] = js.undefined
  var selfDefending: js.UndefOr[scala.Boolean] = js.undefined
  var unicodeArray: js.UndefOr[scala.Boolean] = js.undefined
  var unicodeArrayThreshold: js.UndefOr[scala.Double] = js.undefined
  var wrapUnicodeArrayCalls: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    StringDictionary: /* id */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    debugProtection: js.UndefOr[scala.Boolean] = js.undefined,
    debugProtectionInterval: js.UndefOr[scala.Boolean] = js.undefined,
    disableConsoleOutput: js.UndefOr[scala.Boolean] = js.undefined,
    encodeUnicodeLiterals: js.UndefOr[scala.Boolean] = js.undefined,
    reservedNames: js.Array[java.lang.String] = null,
    rotateUnicodeArray: js.UndefOr[scala.Boolean] = js.undefined,
    selfDefending: js.UndefOr[scala.Boolean] = js.undefined,
    unicodeArray: js.UndefOr[scala.Boolean] = js.undefined,
    unicodeArrayThreshold: scala.Int | scala.Double = null,
    wrapUnicodeArrayCalls: js.UndefOr[scala.Boolean] = js.undefined
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

