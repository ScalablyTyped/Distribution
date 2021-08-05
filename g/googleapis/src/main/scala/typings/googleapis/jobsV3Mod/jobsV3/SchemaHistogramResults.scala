package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Histogram results that match HistogramFacets specified in
  * SearchJobsRequest.
  */
trait SchemaHistogramResults extends StObject {
  
  /**
    * Specifies compensation field-based histogram results that match
    * HistogramFacets.compensation_histogram_requests.
    */
  var compensationHistogramResults: js.UndefOr[js.Array[SchemaCompensationHistogramResult]] = js.undefined
  
  /**
    * Specifies histogram results for custom attributes that match
    * HistogramFacets.custom_attribute_histogram_facets.
    */
  var customAttributeHistogramResults: js.UndefOr[js.Array[SchemaCustomAttributeHistogramResult]] = js.undefined
  
  /**
    * Specifies histogram results that matches
    * HistogramFacets.simple_histogram_facets.
    */
  var simpleHistogramResults: js.UndefOr[js.Array[SchemaHistogramResult]] = js.undefined
}
object SchemaHistogramResults {
  
  inline def apply(): SchemaHistogramResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResults]
  }
  
  extension [Self <: SchemaHistogramResults](x: Self) {
    
    inline def setCompensationHistogramResults(value: js.Array[SchemaCompensationHistogramResult]): Self = StObject.set(x, "compensationHistogramResults", value.asInstanceOf[js.Any])
    
    inline def setCompensationHistogramResultsUndefined: Self = StObject.set(x, "compensationHistogramResults", js.undefined)
    
    inline def setCompensationHistogramResultsVarargs(value: SchemaCompensationHistogramResult*): Self = StObject.set(x, "compensationHistogramResults", js.Array(value :_*))
    
    inline def setCustomAttributeHistogramResults(value: js.Array[SchemaCustomAttributeHistogramResult]): Self = StObject.set(x, "customAttributeHistogramResults", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributeHistogramResultsUndefined: Self = StObject.set(x, "customAttributeHistogramResults", js.undefined)
    
    inline def setCustomAttributeHistogramResultsVarargs(value: SchemaCustomAttributeHistogramResult*): Self = StObject.set(x, "customAttributeHistogramResults", js.Array(value :_*))
    
    inline def setSimpleHistogramResults(value: js.Array[SchemaHistogramResult]): Self = StObject.set(x, "simpleHistogramResults", value.asInstanceOf[js.Any])
    
    inline def setSimpleHistogramResultsUndefined: Self = StObject.set(x, "simpleHistogramResults", js.undefined)
    
    inline def setSimpleHistogramResultsVarargs(value: SchemaHistogramResult*): Self = StObject.set(x, "simpleHistogramResults", js.Array(value :_*))
  }
}
