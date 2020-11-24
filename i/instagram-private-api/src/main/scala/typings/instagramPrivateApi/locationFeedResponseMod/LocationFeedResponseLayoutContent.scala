package typings.instagramPrivateApi.locationFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationFeedResponseLayoutContent extends js.Object {
  
  var medias: js.Array[LocationFeedResponseMediasItem] = js.native
}
object LocationFeedResponseLayoutContent {
  
  @scala.inline
  def apply(medias: js.Array[LocationFeedResponseMediasItem]): LocationFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseLayoutContent]
  }
  
  @scala.inline
  implicit class LocationFeedResponseLayoutContentOps[Self <: LocationFeedResponseLayoutContent] (val x: Self) extends AnyVal {
    
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
    def setMediasVarargs(value: LocationFeedResponseMediasItem*): Self = this.set("medias", js.Array(value :_*))
    
    @scala.inline
    def setMedias(value: js.Array[LocationFeedResponseMediasItem]): Self = this.set("medias", value.asInstanceOf[js.Any])
  }
}
