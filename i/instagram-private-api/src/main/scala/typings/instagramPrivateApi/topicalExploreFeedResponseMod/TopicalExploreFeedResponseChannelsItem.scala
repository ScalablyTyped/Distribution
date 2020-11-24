package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseChannelsItem extends js.Object {
  
  var approx_total_videos: Null = js.native
  
  var cover_photo_url: Null = js.native
  
  var description: Null = js.native
  
  var destination_client_configs: Null = js.native
  
  var id: String = js.native
  
  var items: js.Array[TopicalExploreFeedResponseItemsItem] = js.native
  
  var max_id: String = js.native
  
  var more_available: Boolean = js.native
  
  var seen_state: TopicalExploreFeedResponseSeenState = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
  
  var user_dict: Null = js.native
}
object TopicalExploreFeedResponseChannelsItem {
  
  @scala.inline
  def apply(
    approx_total_videos: Null,
    cover_photo_url: Null,
    description: Null,
    destination_client_configs: Null,
    id: String,
    items: js.Array[TopicalExploreFeedResponseItemsItem],
    max_id: String,
    more_available: Boolean,
    seen_state: TopicalExploreFeedResponseSeenState,
    title: String,
    `type`: String,
    user_dict: Null
  ): TopicalExploreFeedResponseChannelsItem = {
    val __obj = js.Dynamic.literal(approx_total_videos = approx_total_videos.asInstanceOf[js.Any], cover_photo_url = cover_photo_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], destination_client_configs = destination_client_configs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseChannelsItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseChannelsItemOps[Self <: TopicalExploreFeedResponseChannelsItem] (val x: Self) extends AnyVal {
    
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
    def setApprox_total_videos(value: Null): Self = this.set("approx_total_videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_photo_url(value: Null): Self = this.set("cover_photo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Null): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_client_configs(value: Null): Self = this.set("destination_client_configs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: TopicalExploreFeedResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TopicalExploreFeedResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id(value: String): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_state(value: TopicalExploreFeedResponseSeenState): Self = this.set("seen_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_dict(value: Null): Self = this.set("user_dict", value.asInstanceOf[js.Any])
  }
}
