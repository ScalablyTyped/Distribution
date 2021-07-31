package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Custom attribute histogram result.
  */
trait SchemaCustomAttributeHistogramResult extends StObject {
  
  /**
    * Stores the key of custom attribute the histogram is performed on.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Stores bucketed histogram counting result or min/max values for custom
    * attribute long values associated with `key`.
    */
  var longValueHistogramResult: js.UndefOr[SchemaNumericBucketingResult] = js.undefined
  
  /**
    * Stores a map from the values of string custom field associated with `key`
    * to the number of jobs with that value in this histogram result.
    */
  var stringValueHistogramResult: js.UndefOr[StringDictionary[Double]] = js.undefined
}
object SchemaCustomAttributeHistogramResult {
  
  @scala.inline
  def apply(): SchemaCustomAttributeHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttributeHistogramResult]
  }
  
  @scala.inline
  implicit class SchemaCustomAttributeHistogramResultMutableBuilder[Self <: SchemaCustomAttributeHistogramResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLongValueHistogramResult(value: SchemaNumericBucketingResult): Self = StObject.set(x, "longValueHistogramResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueHistogramResultUndefined: Self = StObject.set(x, "longValueHistogramResult", js.undefined)
    
    @scala.inline
    def setStringValueHistogramResult(value: StringDictionary[Double]): Self = StObject.set(x, "stringValueHistogramResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueHistogramResultUndefined: Self = StObject.set(x, "stringValueHistogramResult", js.undefined)
  }
}
