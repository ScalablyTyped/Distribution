package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingProviderUserContextOptions extends StObject {
  
  var ul: js.UndefOr[String] = js.undefined
  
  var umv: js.UndefOr[String] = js.undefined
  
  var ur: js.UndefOr[String] = js.undefined
  
  var userIp: js.UndefOr[String] = js.undefined
  
  var userLocation: js.UndefOr[String] = js.undefined
  
  var userMapView: js.UndefOr[String] = js.undefined
  
  var userRegion: js.UndefOr[String] = js.undefined
}
object BingProviderUserContextOptions {
  
  inline def apply(): BingProviderUserContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingProviderUserContextOptions]
  }
  
  extension [Self <: BingProviderUserContextOptions](x: Self) {
    
    inline def setUl(value: String): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    
    inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    
    inline def setUmv(value: String): Self = StObject.set(x, "umv", value.asInstanceOf[js.Any])
    
    inline def setUmvUndefined: Self = StObject.set(x, "umv", js.undefined)
    
    inline def setUr(value: String): Self = StObject.set(x, "ur", value.asInstanceOf[js.Any])
    
    inline def setUrUndefined: Self = StObject.set(x, "ur", js.undefined)
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    inline def setUserLocation(value: String): Self = StObject.set(x, "userLocation", value.asInstanceOf[js.Any])
    
    inline def setUserLocationUndefined: Self = StObject.set(x, "userLocation", js.undefined)
    
    inline def setUserMapView(value: String): Self = StObject.set(x, "userMapView", value.asInstanceOf[js.Any])
    
    inline def setUserMapViewUndefined: Self = StObject.set(x, "userMapView", js.undefined)
    
    inline def setUserRegion(value: String): Self = StObject.set(x, "userRegion", value.asInstanceOf[js.Any])
    
    inline def setUserRegionUndefined: Self = StObject.set(x, "userRegion", js.undefined)
  }
}
