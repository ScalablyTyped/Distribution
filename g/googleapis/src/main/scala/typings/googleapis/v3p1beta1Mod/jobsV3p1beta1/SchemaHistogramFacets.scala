package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Histogram facets to be specified in SearchJobsRequest.
  */
trait SchemaHistogramFacets extends StObject {
  
  /**
    * Optional.  Specifies compensation field-based histogram requests.
    * Duplicate values of CompensationHistogramRequest.type are not allowed.
    */
  var compensationHistogramFacets: js.UndefOr[js.Array[SchemaCompensationHistogramRequest]] = js.undefined
  
  /**
    * Optional.  Specifies the custom attributes histogram requests. Duplicate
    * values of CustomAttributeHistogramRequest.key are not allowed.
    */
  var customAttributeHistogramFacets: js.UndefOr[js.Array[SchemaCustomAttributeHistogramRequest]] = js.undefined
  
  /**
    * Optional.  Specifies the simple type of histogram facets, for example,
    * `COMPANY_SIZE`, `EMPLOYMENT_TYPE` etc.
    */
  var simpleHistogramFacets: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaHistogramFacets {
  
  @scala.inline
  def apply(): SchemaHistogramFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramFacets]
  }
  
  @scala.inline
  implicit class SchemaHistogramFacetsMutableBuilder[Self <: SchemaHistogramFacets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompensationHistogramFacets(value: js.Array[SchemaCompensationHistogramRequest]): Self = StObject.set(x, "compensationHistogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationHistogramFacetsUndefined: Self = StObject.set(x, "compensationHistogramFacets", js.undefined)
    
    @scala.inline
    def setCompensationHistogramFacetsVarargs(value: SchemaCompensationHistogramRequest*): Self = StObject.set(x, "compensationHistogramFacets", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttributeHistogramFacets(value: js.Array[SchemaCustomAttributeHistogramRequest]): Self = StObject.set(x, "customAttributeHistogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributeHistogramFacetsUndefined: Self = StObject.set(x, "customAttributeHistogramFacets", js.undefined)
    
    @scala.inline
    def setCustomAttributeHistogramFacetsVarargs(value: SchemaCustomAttributeHistogramRequest*): Self = StObject.set(x, "customAttributeHistogramFacets", js.Array(value :_*))
    
    @scala.inline
    def setSimpleHistogramFacets(value: js.Array[String]): Self = StObject.set(x, "simpleHistogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleHistogramFacetsUndefined: Self = StObject.set(x, "simpleHistogramFacets", js.undefined)
    
    @scala.inline
    def setSimpleHistogramFacetsVarargs(value: String*): Self = StObject.set(x, "simpleHistogramFacets", js.Array(value :_*))
  }
}
