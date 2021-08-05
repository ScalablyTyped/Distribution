package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvChannelFeedResponseRootObject extends StObject {
  
  var approx_total_videos: Null
  
  var cover_photo_url: Null
  
  var description: Null
  
  var id: String
  
  var items: js.Array[IgtvChannelFeedResponseItemsItem]
  
  var max_id: String
  
  var more_available: Boolean
  
  var seen_state: IgtvChannelFeedResponseSeenState
  
  var status: String
  
  var title: String
  
  var `type`: String
  
  var user_dict: IgtvChannelFeedResponseUserDict
}
object IgtvChannelFeedResponseRootObject {
  
  inline def apply(
    approx_total_videos: Null,
    cover_photo_url: Null,
    description: Null,
    id: String,
    items: js.Array[IgtvChannelFeedResponseItemsItem],
    max_id: String,
    more_available: Boolean,
    seen_state: IgtvChannelFeedResponseSeenState,
    status: String,
    title: String,
    `type`: String,
    user_dict: IgtvChannelFeedResponseUserDict
  ): IgtvChannelFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(approx_total_videos = approx_total_videos.asInstanceOf[js.Any], cover_photo_url = cover_photo_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseRootObject]
  }
  
  extension [Self <: IgtvChannelFeedResponseRootObject](x: Self) {
    
    inline def setApprox_total_videos(value: Null): Self = StObject.set(x, "approx_total_videos", value.asInstanceOf[js.Any])
    
    inline def setCover_photo_url(value: Null): Self = StObject.set(x, "cover_photo_url", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[IgtvChannelFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IgtvChannelFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setMax_id(value: String): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    inline def setSeen_state(value: IgtvChannelFeedResponseSeenState): Self = StObject.set(x, "seen_state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_dict(value: IgtvChannelFeedResponseUserDict): Self = StObject.set(x, "user_dict", value.asInstanceOf[js.Any])
  }
}
