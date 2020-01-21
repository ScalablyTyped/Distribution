package typings.jqueryPayment.JQueryPayment

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardInfo extends js.Object {
  /**
    * Array of valid card CVC lengths.
    */
  var cvcLength: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Regex used to format the card number. Each match is joined with a space.
    */
  var format: js.UndefOr[RegExp] = js.undefined
  /**
    * Array of valid card number lengths.
    */
  var length: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Boolean indicating whether a valid card number should satisfy the Luhn check.
    */
  var luhn: js.UndefOr[Boolean] = js.undefined
  /**
    * Regex used to identify the card type. For the best experience, this should be
    * the shortest pattern that can guarantee the card is of a particular type.
    */
  var pattern: js.UndefOr[RegExp] = js.undefined
  /**
    * Array of prefixes used to identify the card type.
    */
  var patterns: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Card type
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CardInfo {
  @scala.inline
  def apply(
    cvcLength: js.Array[Double] = null,
    format: RegExp = null,
    length: js.Array[Double] = null,
    luhn: js.UndefOr[Boolean] = js.undefined,
    pattern: RegExp = null,
    patterns: js.Array[Double] = null,
    `type`: String = null
  ): CardInfo = {
    val __obj = js.Dynamic.literal()
    if (cvcLength != null) __obj.updateDynamic("cvcLength")(cvcLength.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(luhn)) __obj.updateDynamic("luhn")(luhn.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patterns != null) __obj.updateDynamic("patterns")(patterns.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardInfo]
  }
}

