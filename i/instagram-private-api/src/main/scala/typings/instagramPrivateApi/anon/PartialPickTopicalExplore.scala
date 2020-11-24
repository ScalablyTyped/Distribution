package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<instagram-private-api.instagram-private-api/dist/feeds.TopicalExploreFeed, 'sessionId' | 'clusterId' | 'lat' | 'lng' | 'module'>> */
@js.native
trait PartialPickTopicalExplore extends js.Object {
  
  var clusterId: js.UndefOr[String] = js.native
  
  var lat: js.UndefOr[String | Double] = js.native
  
  var lng: js.UndefOr[String | Double] = js.native
  
  var module: js.UndefOr[IgAppModule] = js.native
  
  var sessionId: js.UndefOr[String] = js.native
}
object PartialPickTopicalExplore {
  
  @scala.inline
  def apply(): PartialPickTopicalExplore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickTopicalExplore]
  }
  
  @scala.inline
  implicit class PartialPickTopicalExploreOps[Self <: PartialPickTopicalExplore] (val x: Self) extends AnyVal {
    
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
    def setClusterId(value: String): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    
    @scala.inline
    def setLat(value: String | Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    
    @scala.inline
    def setLng(value: String | Double): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    
    @scala.inline
    def setModule(value: IgAppModule): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
  }
}
