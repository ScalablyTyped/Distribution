package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFeedRequest extends js.Object {
  
  /**
    * Required. The new values of feed details. It must match an existing feed and the field `name` must be in the format of: projects/project_number/feeds/feed_id or
    * folders/folder_number/feeds/feed_id or organizations/organization_number/feeds/feed_id.
    */
  var feed: js.UndefOr[Feed] = js.native
  
  /** Required. Only updates the `feed` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateFeedRequest {
  
  @scala.inline
  def apply(): UpdateFeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFeedRequest]
  }
  
  @scala.inline
  implicit class UpdateFeedRequestOps[Self <: UpdateFeedRequest] (val x: Self) extends AnyVal {
    
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
    def setFeed(value: Feed): Self = this.set("feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeed: Self = this.set("feed", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
