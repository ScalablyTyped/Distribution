package typings.instagramPrivateApi.postingAlbumOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostingAlbumItem extends js.Object {
  
  var uploadId: js.UndefOr[String] = js.native
  
  var usertags: js.UndefOr[PostingUsertags] = js.native
}
object PostingAlbumItem {
  
  @scala.inline
  def apply(): PostingAlbumItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostingAlbumItem]
  }
  
  @scala.inline
  implicit class PostingAlbumItemOps[Self <: PostingAlbumItem] (val x: Self) extends AnyVal {
    
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
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
    
    @scala.inline
    def setUsertags(value: PostingUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
  }
}
