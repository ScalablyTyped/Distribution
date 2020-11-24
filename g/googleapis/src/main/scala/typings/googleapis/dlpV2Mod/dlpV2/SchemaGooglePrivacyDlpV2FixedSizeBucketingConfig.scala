package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Buckets values based on fixed size ranges. The Bucketing transformation can
  * provide all of this functionality, but requires more configuration. This
  * message is provided as a convenience to the user for simple bucketing
  * strategies.  The transformed value will be a hyphenated string of
  * &lt;lower_bound&gt;-&lt;upper_bound&gt;, i.e if lower_bound = 10 and
  * upper_bound = 20 all values that are within this bucket will be replaced
  * with &quot;10-20&quot;.  This can be used on data of type: double, long. If
  * the bound Value type differs from the type of data being transformed, we
  * will first attempt converting the type of the data to be transformed to
  * match the type of the bound before comparing.  See
  * https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig extends js.Object {
  
  /**
    * Size of each bucket (except for minimum and maximum buckets). So if
    * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
    * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
    * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
    */
  var bucketSize: js.UndefOr[Double] = js.native
  
  /**
    * Lower bound value of buckets. All values less than `lower_bound` are
    * grouped together into a single bucket; for example if `lower_bound` = 10,
    * then all values less than 10 are replaced with the value “-10”.
    * [Required].
    */
  var lowerBound: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  
  /**
    * Upper bound value of buckets. All values greater than upper_bound are
    * grouped together into a single bucket; for example if `upper_bound` = 89,
    * then all values greater than 89 are replaced with the value “89+”.
    * [Required].
    */
  var upperBound: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}
object SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FixedSizeBucketingConfigOps[Self <: SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig] (val x: Self) extends AnyVal {
    
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
    def setBucketSize(value: Double): Self = this.set("bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketSize: Self = this.set("bucketSize", js.undefined)
    
    @scala.inline
    def setLowerBound(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerBound: Self = this.set("lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpperBound: Self = this.set("upperBound", js.undefined)
  }
}
