package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Histogram results that matches HistogramFacets specified in
  * SearchJobsRequest.
  */
trait SchemaHistogramResults extends StObject {
  
  /**
    * Specifies compensation field-based histogram results that matches
    * HistogramFacets.compensation_histogram_requests.
    */
  var compensationHistogramResults: js.UndefOr[js.Array[SchemaCompensationHistogramResult]] = js.undefined
  
  /**
    * Specifies histogram results for custom attributes that matches
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
  
  @scala.inline
  def apply(): SchemaHistogramResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResults]
  }
  
  @scala.inline
  implicit class SchemaHistogramResultsMutableBuilder[Self <: SchemaHistogramResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompensationHistogramResults(value: js.Array[SchemaCompensationHistogramResult]): Self = StObject.set(x, "compensationHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationHistogramResultsUndefined: Self = StObject.set(x, "compensationHistogramResults", js.undefined)
    
    @scala.inline
    def setCompensationHistogramResultsVarargs(value: SchemaCompensationHistogramResult*): Self = StObject.set(x, "compensationHistogramResults", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttributeHistogramResults(value: js.Array[SchemaCustomAttributeHistogramResult]): Self = StObject.set(x, "customAttributeHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributeHistogramResultsUndefined: Self = StObject.set(x, "customAttributeHistogramResults", js.undefined)
    
    @scala.inline
    def setCustomAttributeHistogramResultsVarargs(value: SchemaCustomAttributeHistogramResult*): Self = StObject.set(x, "customAttributeHistogramResults", js.Array(value :_*))
    
    @scala.inline
    def setSimpleHistogramResults(value: js.Array[SchemaHistogramResult]): Self = StObject.set(x, "simpleHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleHistogramResultsUndefined: Self = StObject.set(x, "simpleHistogramResults", js.undefined)
    
    @scala.inline
    def setSimpleHistogramResultsVarargs(value: SchemaHistogramResult*): Self = StObject.set(x, "simpleHistogramResults", js.Array(value :_*))
  }
}
