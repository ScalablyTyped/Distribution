package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generalization function that buckets values based on ranges. The ranges and
  * replacement values are dynamically provided by the user for custom
  * behavior, such as 1-30 -&gt; LOW 31-65 -&gt; MEDIUM 66-100 -&gt; HIGH This
  * can be used on data of type: number, long, string, timestamp. If the bound
  * `Value` type differs from the type of data being transformed, we will first
  * attempt converting the type of the data to be transformed to match the type
  * of the bound before comparing. See
  * https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BucketingConfig extends js.Object {
  
  /**
    * Set of buckets. Ranges must be non-overlapping.
    */
  var buckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Bucket]] = js.native
}
object SchemaGooglePrivacyDlpV2BucketingConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BucketingConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BucketingConfigOps[Self <: SchemaGooglePrivacyDlpV2BucketingConfig] (val x: Self) extends AnyVal {
    
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
    def setBucketsVarargs(value: SchemaGooglePrivacyDlpV2Bucket*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaGooglePrivacyDlpV2Bucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
  }
}
