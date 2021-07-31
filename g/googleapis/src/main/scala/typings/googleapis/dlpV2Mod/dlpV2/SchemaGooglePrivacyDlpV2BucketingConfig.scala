package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait SchemaGooglePrivacyDlpV2BucketingConfig extends StObject {
  
  /**
    * Set of buckets. Ranges must be non-overlapping.
    */
  var buckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Bucket]] = js.undefined
}
object SchemaGooglePrivacyDlpV2BucketingConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BucketingConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BucketingConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2BucketingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaGooglePrivacyDlpV2Bucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: SchemaGooglePrivacyDlpV2Bucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
  }
}
