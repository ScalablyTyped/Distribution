package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFeedRequest extends js.Object {
  
  /**
    * Required. The feed details. The field `name` must be empty and it will be generated in the format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id
    * organizations/organization_number/feeds/feed_id
    */
  var feed: js.UndefOr[Feed] = js.native
  
  /** Required. This is the client-assigned asset feed identifier and it needs to be unique under a specific parent project/folder/organization. */
  var feedId: js.UndefOr[String] = js.native
}
object CreateFeedRequest {
  
  @scala.inline
  def apply(): CreateFeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFeedRequest]
  }
  
  @scala.inline
  implicit class CreateFeedRequestOps[Self <: CreateFeedRequest] (val x: Self) extends AnyVal {
    
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
    def setFeedId(value: String): Self = this.set("feedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedId: Self = this.set("feedId", js.undefined)
  }
}
