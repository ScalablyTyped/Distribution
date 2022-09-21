package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSearchResponseFacet extends StObject {
  
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
  var values: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaSearchResponseFacetFacetValue]] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSearchResponseFacet {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSearchResponseFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSearchResponseFacet]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSearchResponseFacet](x: Self) {
    
    inline def setDynamicFacet(value: Boolean): Self = StObject.set(x, "dynamicFacet", value.asInstanceOf[js.Any])
    
    inline def setDynamicFacetNull: Self = StObject.set(x, "dynamicFacet", null)
    
    inline def setDynamicFacetUndefined: Self = StObject.set(x, "dynamicFacet", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: js.Array[SchemaGoogleCloudRetailV2alphaSearchResponseFacetFacetValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaGoogleCloudRetailV2alphaSearchResponseFacetFacetValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
