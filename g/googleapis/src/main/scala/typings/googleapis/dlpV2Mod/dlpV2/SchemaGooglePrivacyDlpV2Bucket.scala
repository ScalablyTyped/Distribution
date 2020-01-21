package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bucket is represented as a range, along with replacement values.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Bucket extends js.Object {
  /**
    * Upper bound of the range, exclusive; type must match min.
    */
  var max: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * Replacement value for this bucket. If not provided the default behavior
    * will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}

object SchemaGooglePrivacyDlpV2Bucket {
  @scala.inline
  def apply(
    max: SchemaGooglePrivacyDlpV2Value = null,
    min: SchemaGooglePrivacyDlpV2Value = null,
    replacementValue: SchemaGooglePrivacyDlpV2Value = null
  ): SchemaGooglePrivacyDlpV2Bucket = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (replacementValue != null) __obj.updateDynamic("replacementValue")(replacementValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Bucket]
  }
}

