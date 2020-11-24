package typings.instagramPrivateApi.postingAlbumOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingAlbumOptions extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem] = js.native
  
  var location: js.UndefOr[PostingLocation] = js.native
}
object PostingAlbumOptions {
  
  @scala.inline
  def apply(items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): PostingAlbumOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumOptions]
  }
  
  @scala.inline
  implicit class PostingAlbumOptionsOps[Self <: PostingAlbumOptions] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: (PostingAlbumPhotoItem | PostingAlbumVideoItem)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setLocation(value: PostingLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
