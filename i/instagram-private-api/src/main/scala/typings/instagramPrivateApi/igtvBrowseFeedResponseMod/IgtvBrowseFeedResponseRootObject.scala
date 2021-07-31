package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseRootObject extends StObject {
  
  var badging: IgtvBrowseFeedResponseBadging
  
  var banner_token: String
  
  var browse_items: js.Array[IgtvBrowseFeedResponseBrowseItemsItem]
  
  var channels: js.Array[IgtvBrowseFeedResponseChannelsItem]
  
  var composer: IgtvBrowseFeedResponseComposer
  
  var max_id: String
  
  var more_available: Boolean
  
  var my_channel: IgtvBrowseFeedResponseMyChannel
  
  var seen_state: IgtvBrowseFeedResponseSeenState
  
  var status: String
}
object IgtvBrowseFeedResponseRootObject {
  
  @scala.inline
  def apply(
    badging: IgtvBrowseFeedResponseBadging,
    banner_token: String,
    browse_items: js.Array[IgtvBrowseFeedResponseBrowseItemsItem],
    channels: js.Array[IgtvBrowseFeedResponseChannelsItem],
    composer: IgtvBrowseFeedResponseComposer,
    max_id: String,
    more_available: Boolean,
    my_channel: IgtvBrowseFeedResponseMyChannel,
    seen_state: IgtvBrowseFeedResponseSeenState,
    status: String
  ): IgtvBrowseFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(badging = badging.asInstanceOf[js.Any], banner_token = banner_token.asInstanceOf[js.Any], browse_items = browse_items.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], my_channel = my_channel.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseRootObjectMutableBuilder[Self <: IgtvBrowseFeedResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadging(value: IgtvBrowseFeedResponseBadging): Self = StObject.set(x, "badging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBanner_token(value: String): Self = StObject.set(x, "banner_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowse_items(value: js.Array[IgtvBrowseFeedResponseBrowseItemsItem]): Self = StObject.set(x, "browse_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowse_itemsVarargs(value: IgtvBrowseFeedResponseBrowseItemsItem*): Self = StObject.set(x, "browse_items", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[IgtvBrowseFeedResponseChannelsItem]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: IgtvBrowseFeedResponseChannelsItem*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setComposer(value: IgtvBrowseFeedResponseComposer): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id(value: String): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMy_channel(value: IgtvBrowseFeedResponseMyChannel): Self = StObject.set(x, "my_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_state(value: IgtvBrowseFeedResponseSeenState): Self = StObject.set(x, "seen_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
