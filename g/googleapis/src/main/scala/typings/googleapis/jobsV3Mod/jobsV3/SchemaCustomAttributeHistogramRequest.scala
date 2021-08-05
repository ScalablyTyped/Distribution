package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom attributes histogram request. An error is thrown if neither
  * string_value_histogram or long_value_histogram_bucketing_option has been
  * defined.
  */
trait SchemaCustomAttributeHistogramRequest extends StObject {
  
  /**
    * Required.  Specifies the custom field key to perform a histogram on. If
    * specified without `long_value_histogram_bucketing_option`, histogram on
    * string values of the given `key` is triggered, otherwise histogram is
    * performed on long values.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  Specifies buckets used to perform a range histogram on
    * Job&#39;s filterable long custom field values, or min/max value
    * requirements.
    */
  var longValueHistogramBucketingOption: js.UndefOr[SchemaNumericBucketingOption] = js.undefined
  
  /**
    * Optional. If set to true, the response includes the histogram value for
    * each key as a string.
    */
  var stringValueHistogram: js.UndefOr[Boolean] = js.undefined
}
object SchemaCustomAttributeHistogramRequest {
  
  inline def apply(): SchemaCustomAttributeHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttributeHistogramRequest]
  }
  
  extension [Self <: SchemaCustomAttributeHistogramRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLongValueHistogramBucketingOption(value: SchemaNumericBucketingOption): Self = StObject.set(x, "longValueHistogramBucketingOption", value.asInstanceOf[js.Any])
    
    inline def setLongValueHistogramBucketingOptionUndefined: Self = StObject.set(x, "longValueHistogramBucketingOption", js.undefined)
    
    inline def setStringValueHistogram(value: Boolean): Self = StObject.set(x, "stringValueHistogram", value.asInstanceOf[js.Any])
    
    inline def setStringValueHistogramUndefined: Self = StObject.set(x, "stringValueHistogram", js.undefined)
  }
}
