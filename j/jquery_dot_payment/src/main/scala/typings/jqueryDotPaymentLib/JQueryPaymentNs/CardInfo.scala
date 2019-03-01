package typings
package jqueryDotPaymentLib.JQueryPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardInfo extends js.Object {
  /**
    * Array of valid card CVC lengths.
    */
  var cvcLength: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Regex used to format the card number. Each match is joined with a space.
    */
  var format: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Array of valid card number lengths.
    */
  var length: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Boolean indicating whether a valid card number should satisfy the Luhn check.
    */
  var luhn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Regex used to identify the card type. For the best experience, this should be
    * the shortest pattern that can guarantee the card is of a particular type.
    */
  var pattern: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Array of prefixes used to identify the card type.
    */
  var patterns: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Card type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CardInfo {
  @scala.inline
  def apply(
    cvcLength: js.Array[scala.Double] = null,
    format: stdLib.RegExp = null,
    length: js.Array[scala.Double] = null,
    luhn: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: stdLib.RegExp = null,
    patterns: js.Array[scala.Double] = null,
    `type`: java.lang.String = null
  ): CardInfo = {
    val __obj = js.Dynamic.literal()
    if (cvcLength != null) __obj.updateDynamic("cvcLength")(cvcLength)
    if (format != null) __obj.updateDynamic("format")(format)
    if (length != null) __obj.updateDynamic("length")(length)
    if (!js.isUndefined(luhn)) __obj.updateDynamic("luhn")(luhn)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (patterns != null) __obj.updateDynamic("patterns")(patterns)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CardInfo]
  }
}

