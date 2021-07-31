package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseChannelsItem extends StObject {
  
  var approx_total_videos: Null
  
  var cover_photo_url: Null
  
  var description: Null
  
  var destination_client_configs: Null
  
  var id: String
  
  var items: js.Array[TopicalExploreFeedResponseItemsItem]
  
  var max_id: String
  
  var more_available: Boolean
  
  var seen_state: TopicalExploreFeedResponseSeenState
  
  var title: String
  
  var `type`: String
  
  var user_dict: Null
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
  implicit class TopicalExploreFeedResponseChannelsItemMutableBuilder[Self <: TopicalExploreFeedResponseChannelsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprox_total_videos(value: Null): Self = StObject.set(x, "approx_total_videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_photo_url(value: Null): Self = StObject.set(x, "cover_photo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_client_configs(value: Null): Self = StObject.set(x, "destination_client_configs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[TopicalExploreFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: TopicalExploreFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMax_id(value: String): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_state(value: TopicalExploreFeedResponseSeenState): Self = StObject.set(x, "seen_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_dict(value: Null): Self = StObject.set(x, "user_dict", value.asInstanceOf[js.Any])
  }
}
