package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`-1`
import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  key :string,   adminDistrict :string | undefined,   includeNeighborhood :-1 | 0 | 1 | undefined,   inclnb :-1 | 0 | 1 | undefined,   include :string | undefined,   incl :string | undefined,   maxResults :number | undefined} & leaflet-geosearch.leaflet-geosearch.BingProviderCultureOptions & leaflet-geosearch.leaflet-geosearch.BingProviderUserContextOptions */
@js.native
trait BingProviderOptions extends StObject {
  
  var adminDistrict: js.UndefOr[String] = js.native
  
  var c: js.UndefOr[String] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var incl: js.UndefOr[String] = js.native
  
  var inclnb: js.UndefOr[`-1` | `0` | `1`] = js.native
  
  var include: js.UndefOr[String] = js.native
  
  var includeNeighborhood: js.UndefOr[`-1` | `0` | `1`] = js.native
  
  var key: String = js.native
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var ul: js.UndefOr[String] = js.native
  
  var umv: js.UndefOr[String] = js.native
  
  var ur: js.UndefOr[String] = js.native
  
  var userIp: js.UndefOr[String] = js.native
  
  var userLocation: js.UndefOr[String] = js.native
  
  var userMapView: js.UndefOr[String] = js.native
  
  var userRegion: js.UndefOr[String] = js.native
}
object BingProviderOptions {
  
  @scala.inline
  def apply(key: String): BingProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderOptions]
  }
  
  @scala.inline
  implicit class BingProviderOptionsMutableBuilder[Self <: BingProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminDistrict(value: String): Self = StObject.set(x, "adminDistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminDistrictUndefined: Self = StObject.set(x, "adminDistrict", js.undefined)
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setIncl(value: String): Self = StObject.set(x, "incl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclUndefined: Self = StObject.set(x, "incl", js.undefined)
    
    @scala.inline
    def setInclnb(value: `-1` | `0` | `1`): Self = StObject.set(x, "inclnb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclnbUndefined: Self = StObject.set(x, "inclnb", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNeighborhood(value: `-1` | `0` | `1`): Self = StObject.set(x, "includeNeighborhood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNeighborhoodUndefined: Self = StObject.set(x, "includeNeighborhood", js.undefined)
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
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
