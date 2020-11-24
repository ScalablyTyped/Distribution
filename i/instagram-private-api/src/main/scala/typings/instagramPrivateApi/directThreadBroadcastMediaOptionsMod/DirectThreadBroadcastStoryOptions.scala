package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.once
import typings.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typings.instagramPrivateApi.instagramPrivateApiStrings.story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadBroadcastStoryOptions extends js.Object {
  
  var replyType: js.UndefOr[story | String] = js.native
  
  var uploadId: js.UndefOr[Double] = js.native
  
  var viewMode: js.UndefOr[replayable | once | String] = js.native
}
object DirectThreadBroadcastStoryOptions {
  
  @scala.inline
  def apply(): DirectThreadBroadcastStoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectThreadBroadcastStoryOptions]
  }
  
  @scala.inline
  implicit class DirectThreadBroadcastStoryOptionsOps[Self <: DirectThreadBroadcastStoryOptions] (val x: Self) extends AnyVal {
    
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
    def setReplyType(value: story | String): Self = this.set("replyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyType: Self = this.set("replyType", js.undefined)
    
    @scala.inline
    def setUploadId(value: Double): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
    
    @scala.inline
    def setViewMode(value: replayable | once | String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
