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
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsResultLimitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLimitation]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsResultLimitationMutableBuilder[Self <: OpenStreetMapProviderOptionsResultLimitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounded(value: `0` | `1`): Self = StObject.set(x, "bounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundedUndefined: Self = StObject.set(x, "bounded", js.undefined)
    
    @scala.inline
    def setCountrycodes(value: String): Self = StObject.set(x, "countrycodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountrycodesUndefined: Self = StObject.set(x, "countrycodes", js.undefined)
    
    @scala.inline
    def setExclude_place_ids(value: String): Self = StObject.set(x, "exclude_place_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_place_idsUndefined: Self = StObject.set(x, "exclude_place_ids", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setViewbox(value: String): Self = StObject.set(x, "viewbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewboxUndefined: Self = StObject.set(x, "viewbox", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
