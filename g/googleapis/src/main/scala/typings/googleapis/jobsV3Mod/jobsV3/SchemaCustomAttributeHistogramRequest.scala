package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomAttributeHistogramRequest extends StObject {
  
  /**
    * Required. Specifies the custom field key to perform a histogram on. If specified without `long_value_histogram_bucketing_option`, histogram on string values of the given `key` is triggered, otherwise histogram is performed on long values.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies buckets used to perform a range histogram on Job's filterable long custom field values, or min/max value requirements.
    */
  var longValueHistogramBucketingOption: js.UndefOr[SchemaNumericBucketingOption] = js.undefined
  
  /**
    * Optional. If set to true, the response includes the histogram value for each key as a string.
    */
  var stringValueHistogram: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCustomAttributeHistogramRequest {
  
  inline def apply(): SchemaCustomAttributeHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttributeHistogramRequest]
  }
  
  extension [Self <: SchemaCustomAttributeHistogramRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLongValueHistogramBucketingOption(value: SchemaNumericBucketingOption): Self = StObject.set(x, "longValueHistogramBucketingOption", value.asInstanceOf[js.Any])
    
    inline def setLongValueHistogramBucketingOptionUndefined: Self = StObject.set(x, "longValueHistogramBucketingOption", js.undefined)
    
    inline def setStringValueHistogram(value: Boolean): Self = StObject.set(x, "stringValueHistogram", value.asInstanceOf[js.Any])
    
    inline def setStringValueHistogramNull: Self = StObject.set(x, "stringValueHistogram", null)
    
    inline def setStringValueHistogramUndefined: Self = StObject.set(x, "stringValueHistogram", js.undefined)
  }
}
