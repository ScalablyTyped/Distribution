package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStreetMapProviderOptionsResultLimitation extends StObject {
  
  var bounded: js.UndefOr[`0` | `1`] = js.undefined
  
  var countrycodes: js.UndefOr[String] = js.undefined
  
  var exclude_place_ids: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var viewbox: js.UndefOr[String] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object OpenStreetMapProviderOptionsResultLimitation {
  
  inline def apply(): OpenStreetMapProviderOptionsResultLimitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLimitation]
  }
  
  extension [Self <: OpenStreetMapProviderOptionsResultLimitation](x: Self) {
    
    inline def setBounded(value: `0` | `1`): Self = StObject.set(x, "bounded", value.asInstanceOf[js.Any])
    
    inline def setBoundedUndefined: Self = StObject.set(x, "bounded", js.undefined)
    
    inline def setCountrycodes(value: String): Self = StObject.set(x, "countrycodes", value.asInstanceOf[js.Any])
    
    inline def setCountrycodesUndefined: Self = StObject.set(x, "countrycodes", js.undefined)
    
    inline def setExclude_place_ids(value: String): Self = StObject.set(x, "exclude_place_ids", value.asInstanceOf[js.Any])
    
    inline def setExclude_place_idsUndefined: Self = StObject.set(x, "exclude_place_ids", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setViewbox(value: String): Self = StObject.set(x, "viewbox", value.asInstanceOf[js.Any])
    
    inline def setViewboxUndefined: Self = StObject.set(x, "viewbox", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
