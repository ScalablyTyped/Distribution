package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseRootObject extends js.Object {
  
  var badging: IgtvBrowseFeedResponseBadging = js.native
  
  var banner_token: String = js.native
  
  var browse_items: js.Array[IgtvBrowseFeedResponseBrowseItemsItem] = js.native
  
  var channels: js.Array[IgtvBrowseFeedResponseChannelsItem] = js.native
  
  var composer: IgtvBrowseFeedResponseComposer = js.native
  
  var max_id: String = js.native
  
  var more_available: Boolean = js.native
  
  var my_channel: IgtvBrowseFeedResponseMyChannel = js.native
  
  var seen_state: IgtvBrowseFeedResponseSeenState = js.native
  
  var status: String = js.native
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
  implicit class IgtvBrowseFeedResponseRootObjectOps[Self <: IgtvBrowseFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setBadging(value: IgtvBrowseFeedResponseBadging): Self = this.set("badging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBanner_token(value: String): Self = this.set("banner_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowse_itemsVarargs(value: IgtvBrowseFeedResponseBrowseItemsItem*): Self = this.set("browse_items", js.Array(value :_*))
    
    @scala.inline
    def setBrowse_items(value: js.Array[IgtvBrowseFeedResponseBrowseItemsItem]): Self = this.set("browse_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: IgtvBrowseFeedResponseChannelsItem*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[IgtvBrowseFeedResponseChannelsItem]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposer(value: IgtvBrowseFeedResponseComposer): Self = this.set("composer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id(value: String): Self = this.set("max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMy_channel(value: IgtvBrowseFeedResponseMyChannel): Self = this.set("my_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_state(value: IgtvBrowseFeedResponseSeenState): Self = this.set("seen_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
