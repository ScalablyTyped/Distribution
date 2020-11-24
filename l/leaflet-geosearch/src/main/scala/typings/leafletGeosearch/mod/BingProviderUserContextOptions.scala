package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingProviderUserContextOptions extends js.Object {
  
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
  implicit class BingProviderUserContextOptionsOps[Self <: BingProviderUserContextOptions] (val x: Self) extends AnyVal {
    
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
