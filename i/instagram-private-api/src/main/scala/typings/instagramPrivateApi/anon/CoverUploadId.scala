package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverUploadId extends js.Object {
  
  var broadcastId: String = js.native
  
  var coverUploadId: String = js.native
  
  var description: String = js.native
  
  var igtvSharePreviewToFeed: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object CoverUploadId {
  
  @scala.inline
  def apply(broadcastId: String, coverUploadId: String, description: String, title: String): CoverUploadId = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any], coverUploadId = coverUploadId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverUploadId]
  }
  
  @scala.inline
  implicit class CoverUploadIdOps[Self <: CoverUploadId] (val x: Self) extends AnyVal {
    
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
    def setBroadcastId(value: String): Self = this.set("broadcastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverUploadId(value: String): Self = this.set("coverUploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgtvSharePreviewToFeed(value: Boolean): Self = this.set("igtvSharePreviewToFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgtvSharePreviewToFeed: Self = this.set("igtvSharePreviewToFeed", js.undefined)
  }
}
