package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`-1`
import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  key :string,   adminDistrict :string | undefined,   includeNeighborhood :-1 | 0 | 1 | undefined,   inclnb :-1 | 0 | 1 | undefined,   include :string | undefined,   incl :string | undefined,   maxResults :number | undefined} & leaflet-geosearch.leaflet-geosearch.BingProviderCultureOptions & leaflet-geosearch.leaflet-geosearch.BingProviderUserContextOptions */
@js.native
trait BingProviderOptions extends js.Object {
  
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
  implicit class BingProviderOptionsOps[Self <: BingProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminDistrict(value: String): Self = this.set("adminDistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminDistrict: Self = this.set("adminDistrict", js.undefined)
    
    @scala.inline
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setIncl(value: String): Self = this.set("incl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncl: Self = this.set("incl", js.undefined)
    
    @scala.inline
    def setInclnb(value: `-1` | `0` | `1`): Self = this.set("inclnb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclnb: Self = this.set("inclnb", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setIncludeNeighborhood(value: `-1` | `0` | `1`): Self = this.set("includeNeighborhood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNeighborhood: Self = this.set("includeNeighborhood", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setUl(value: String): Self = this.set("ul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUl: Self = this.set("ul", js.undefined)
    
    @scala.inline
    def setUmv(value: String): Self = this.set("umv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUmv: Self = this.set("umv", js.undefined)
    
    @scala.inline
    def setUr(value: String): Self = this.set("ur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUr: Self = this.set("ur", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
    
    @scala.inline
    def setUserLocation(value: String): Self = this.set("userLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLocation: Self = this.set("userLocation", js.undefined)
    
    @scala.inline
    def setUserMapView(value: String): Self = this.set("userMapView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMapView: Self = this.set("userMapView", js.undefined)
    
    @scala.inline
    def setUserRegion(value: String): Self = this.set("userRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRegion: Self = this.set("userRegion", js.undefined)
  }
}
