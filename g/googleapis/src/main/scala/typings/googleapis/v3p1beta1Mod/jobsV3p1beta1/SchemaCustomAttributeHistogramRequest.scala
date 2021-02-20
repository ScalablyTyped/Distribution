package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom attributes histogram request. An error is thrown if neither
  * string_value_histogram or long_value_histogram_bucketing_option has been
  * defined.
  */
@js.native
trait SchemaCustomAttributeHistogramRequest extends StObject {
  
  /**
    * Required.  Specifies the custom field key to perform a histogram on. If
    * specified without `long_value_histogram_bucketing_option`, histogram on
    * string values of the given `key` is triggered, otherwise histogram is
    * performed on long values.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Optional.  Specifies buckets used to perform a range histogram on
    * Job&#39;s filterable long custom field values, or min/max value
    * requirements.
    */
  var longValueHistogramBucketingOption: js.UndefOr[SchemaNumericBucketingOption] = js.native
  
  /**
    * Optional. If set to true, the response includes the histogram value for
    * each key as a string.
    */
  var stringValueHistogram: js.UndefOr[Boolean] = js.native
}
object SchemaCustomAttributeHistogramRequest {
  
  @scala.inline
  def apply(): SchemaCustomAttributeHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttributeHistogramRequest]
  }
  
  @scala.inline
  implicit class SchemaCustomAttributeHistogramRequestMutableBuilder[Self <: SchemaCustomAttributeHistogramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLongValueHistogramBucketingOption(value: SchemaNumericBucketingOption): Self = StObject.set(x, "longValueHistogramBucketingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueHistogramBucketingOptionUndefined: Self = StObject.set(x, "longValueHistogramBucketingOption", js.undefined)
    
    @scala.inline
    def setStringValueHistogram(value: Boolean): Self = StObject.set(x, "stringValueHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueHistogramUndefined: Self = StObject.set(x, "stringValueHistogram", js.undefined)
  }
}
