package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue extends StObject {
  
  /**
    * Number of items that have this facet value.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Interval value for a facet, such as [10, 20) for facet "price".
    */
  var interval: js.UndefOr[SchemaGoogleCloudRetailV2betaInterval] = js.undefined
  
  /**
    * The maximum value in the FacetValue.interval. Only supported on numerical facets and returned if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
    */
  var maxValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum value in the FacetValue.interval. Only supported on numerical facets and returned if SearchRequest.FacetSpec.FacetKey.return_min_max is true.
    */
  var minValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Text value of a facet, such as "Black" for facet "colorFamilies".
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaSearchResponseFacetFacetValue](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setInterval(value: SchemaGoogleCloudRetailV2betaInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
