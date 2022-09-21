package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistogramFacets extends StObject {
  
  /**
    * Optional. Specifies compensation field-based histogram requests. Duplicate values of CompensationHistogramRequest.type are not allowed.
    */
  var compensationHistogramFacets: js.UndefOr[js.Array[SchemaCompensationHistogramRequest]] = js.undefined
  
  /**
    * Optional. Specifies the custom attributes histogram requests. Duplicate values of CustomAttributeHistogramRequest.key are not allowed.
    */
  var customAttributeHistogramFacets: js.UndefOr[js.Array[SchemaCustomAttributeHistogramRequest]] = js.undefined
  
  /**
    * Optional. Specifies the simple type of histogram facets, for example, `COMPANY_SIZE`, `EMPLOYMENT_TYPE` etc. This field is equivalent to GetHistogramRequest.
    */
  var simpleHistogramFacets: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaHistogramFacets {
  
  inline def apply(): SchemaHistogramFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramFacets]
  }
  
  extension [Self <: SchemaHistogramFacets](x: Self) {
    
    inline def setCompensationHistogramFacets(value: js.Array[SchemaCompensationHistogramRequest]): Self = StObject.set(x, "compensationHistogramFacets", value.asInstanceOf[js.Any])
    
    inline def setCompensationHistogramFacetsUndefined: Self = StObject.set(x, "compensationHistogramFacets", js.undefined)
    
    inline def setCompensationHistogramFacetsVarargs(value: SchemaCompensationHistogramRequest*): Self = StObject.set(x, "compensationHistogramFacets", js.Array(value*))
    
    inline def setCustomAttributeHistogramFacets(value: js.Array[SchemaCustomAttributeHistogramRequest]): Self = StObject.set(x, "customAttributeHistogramFacets", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributeHistogramFacetsUndefined: Self = StObject.set(x, "customAttributeHistogramFacets", js.undefined)
    
    inline def setCustomAttributeHistogramFacetsVarargs(value: SchemaCustomAttributeHistogramRequest*): Self = StObject.set(x, "customAttributeHistogramFacets", js.Array(value*))
    
    inline def setSimpleHistogramFacets(value: js.Array[String]): Self = StObject.set(x, "simpleHistogramFacets", value.asInstanceOf[js.Any])
    
    inline def setSimpleHistogramFacetsNull: Self = StObject.set(x, "simpleHistogramFacets", null)
    
    inline def setSimpleHistogramFacetsUndefined: Self = StObject.set(x, "simpleHistogramFacets", js.undefined)
    
    inline def setSimpleHistogramFacetsVarargs(value: String*): Self = StObject.set(x, "simpleHistogramFacets", js.Array(value*))
  }
}
