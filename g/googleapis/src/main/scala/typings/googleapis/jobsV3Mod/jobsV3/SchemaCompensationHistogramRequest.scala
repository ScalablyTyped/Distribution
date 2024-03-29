package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompensationHistogramRequest extends StObject {
  
  /**
    * Required. Numeric histogram options, like buckets, whether include min or max value.
    */
  var bucketingOption: js.UndefOr[SchemaNumericBucketingOption] = js.undefined
  
  /**
    * Required. Type of the request, representing which field the histogramming should be performed over. A single request can only specify one histogram of each `CompensationHistogramRequestType`.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCompensationHistogramRequest {
  
  inline def apply(): SchemaCompensationHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationHistogramRequest]
  }
  
  extension [Self <: SchemaCompensationHistogramRequest](x: Self) {
    
    inline def setBucketingOption(value: SchemaNumericBucketingOption): Self = StObject.set(x, "bucketingOption", value.asInstanceOf[js.Any])
    
    inline def setBucketingOptionUndefined: Self = StObject.set(x, "bucketingOption", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
