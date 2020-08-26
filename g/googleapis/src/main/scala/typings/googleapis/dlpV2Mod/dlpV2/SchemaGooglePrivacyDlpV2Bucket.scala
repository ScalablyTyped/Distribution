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
  def apply(): SchemaGooglePrivacyDlpV2Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Bucket]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BucketOps[Self <: SchemaGooglePrivacyDlpV2Bucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMax(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setReplacementValue(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("replacementValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacementValue: Self = this.set("replacementValue", js.undefined)
  }
  
}

