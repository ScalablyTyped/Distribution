package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2BucketingConfig extends StObject {
  
  /**
    * Set of buckets. Ranges must be non-overlapping.
    */
  var buckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Bucket]] = js.undefined
}
object SchemaGooglePrivacyDlpV2BucketingConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2BucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BucketingConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2BucketingConfig](x: Self) {
    
    inline def setBuckets(value: js.Array[SchemaGooglePrivacyDlpV2Bucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: SchemaGooglePrivacyDlpV2Bucket*): Self = StObject.set(x, "buckets", js.Array(value*))
  }
}
