package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingProviderUserContextOptions extends StObject {
  
  var ul: js.UndefOr[String] = js.native
  
  var umv: js.UndefOr[String] = js.native
  
  var ur: js.UndefOr[String] = js.native
  
  var userIp: js.UndefOr[String] = js.native
  
  var userLocation: js.UndefOr[String] = js.native
  
  var userMapView: js.UndefOr[String] = js.native
  
  var userRegion: js.UndefOr[String] = js.native
}
object BingProviderUserContextOptions {
  
  @scala.inline
  def apply(): BingProviderUserContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingProviderUserContextOptions]
  }
  
  @scala.inline
  implicit class BingProviderUserContextOptionsMutableBuilder[Self <: BingProviderUserContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUl(value: String): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    
    @scala.inline
    def setUmv(value: String): Self = StObject.set(x, "umv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUmvUndefined: Self = StObject.set(x, "umv", js.undefined)
    
    @scala.inline
    def setUr(value: String): Self = StObject.set(x, "ur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrUndefined: Self = StObject.set(x, "ur", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    @scala.inline
    def setUserLocation(value: String): Self = StObject.set(x, "userLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLocationUndefined: Self = StObject.set(x, "userLocation", js.undefined)
    
    @scala.inline
    def setUserMapView(value: String): Self = StObject.set(x, "userMapView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMapViewUndefined: Self = StObject.set(x, "userMapView", js.undefined)
    
    @scala.inline
    def setUserRegion(value: String): Self = StObject.set(x, "userRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRegionUndefined: Self = StObject.set(x, "userRegion", js.undefined)
  }
}
