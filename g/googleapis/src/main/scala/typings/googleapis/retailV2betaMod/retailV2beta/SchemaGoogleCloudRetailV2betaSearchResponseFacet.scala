package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaSearchResponseFacet extends StObject {
  
  /**
    * Whether the facet is dynamically generated.
    */
  var dynamicFacet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The key for this facet. E.g., "colorFamilies" or "price" or "attributes.attr1".
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The facet values for this field.
    */
  var values: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaSearchResponseFacet {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaSearchResponseFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaSearchResponseFacet]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaSearchResponseFacet](x: Self) {
    
    inline def setDynamicFacet(value: Boolean): Self = StObject.set(x, "dynamicFacet", value.asInstanceOf[js.Any])
    
    inline def setDynamicFacetNull: Self = StObject.set(x, "dynamicFacet", null)
    
    inline def setDynamicFacetUndefined: Self = StObject.set(x, "dynamicFacet", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: js.Array[SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
