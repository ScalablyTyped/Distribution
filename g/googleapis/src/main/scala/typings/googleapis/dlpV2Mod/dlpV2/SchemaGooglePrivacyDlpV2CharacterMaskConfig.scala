package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Partially mask a string by replacing a given number of characters with a
  * fixed character. Masking can start from the beginning or end of the string.
  * This can be used on data of any type (numbers, longs, and so on) and when
  * de-identifying structured data we&#39;ll attempt to preserve the original
  * data&#39;s type. (This allows you to take a long like 123 and modify it to
  * a string like **3.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CharacterMaskConfig extends js.Object {
  /**
    * When masking a string, items in this list will be skipped when replacing.
    * For example, if your string is 555-555-5555 and you ask us to skip `-`
    * and mask 5 chars with * we would produce ***-*55-5555.
    */
  var charactersToIgnore: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2CharsToIgnore]] = js.native
  /**
    * Character to mask the sensitive values&amp;mdash;for example,
    * &quot;*&quot; for an alphabetic string such as name, or &quot;0&quot; for
    * a numeric string such as ZIP code or credit card number. String must have
    * length 1. If not supplied, we will default to &quot;*&quot; for strings,
    * 0 for digits.
    */
  var maskingCharacter: js.UndefOr[String] = js.native
  /**
    * Number of characters to mask. If not set, all matching chars will be
    * masked. Skipped characters do not count towards this tally.
    */
  var numberToMask: js.UndefOr[Double] = js.native
  /**
    * Mask characters in reverse order. For example, if `masking_character` is
    * &#39;0&#39;, number_to_mask is 14, and `reverse_order` is false, then
    * 1234-5678-9012-3456 -&gt; 00000000000000-3456 If `masking_character` is
    * &#39;*&#39;, `number_to_mask` is 3, and `reverse_order` is true, then
    * 12345 -&gt; 12***
    */
  var reverseOrder: js.UndefOr[Boolean] = js.native
}

object SchemaGooglePrivacyDlpV2CharacterMaskConfig {
  @scala.inline
  def apply(
    charactersToIgnore: js.Array[SchemaGooglePrivacyDlpV2CharsToIgnore] = null,
    maskingCharacter: String = null,
    numberToMask: Int | Double = null,
    reverseOrder: js.UndefOr[Boolean] = js.undefined
  ): SchemaGooglePrivacyDlpV2CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    if (charactersToIgnore != null) __obj.updateDynamic("charactersToIgnore")(charactersToIgnore.asInstanceOf[js.Any])
    if (maskingCharacter != null) __obj.updateDynamic("maskingCharacter")(maskingCharacter.asInstanceOf[js.Any])
    if (numberToMask != null) __obj.updateDynamic("numberToMask")(numberToMask.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CharacterMaskConfig]
  }
}

