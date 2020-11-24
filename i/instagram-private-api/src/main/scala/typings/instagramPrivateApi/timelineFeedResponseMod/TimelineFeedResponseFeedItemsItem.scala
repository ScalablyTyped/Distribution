package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseFeedItemsItem extends js.Object {
  
  var media_or_ad: TimelineFeedResponseMediaOrAd = js.native
  
  var stories_netego: js.UndefOr[TimelineFeedResponseStoriesNetego] = js.native
}
object TimelineFeedResponseFeedItemsItem {
  
  @scala.inline
  def apply(media_or_ad: TimelineFeedResponseMediaOrAd): TimelineFeedResponseFeedItemsItem = {
    val __obj = js.Dynamic.literal(media_or_ad = media_or_ad.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseFeedItemsItem]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseFeedItemsItemOps[Self <: TimelineFeedResponseFeedItemsItem] (val x: Self) extends AnyVal {
    
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
    def setMedia_or_ad(value: TimelineFeedResponseMediaOrAd): Self = this.set("media_or_ad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories_netego(value: TimelineFeedResponseStoriesNetego): Self = this.set("stories_netego", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStories_netego: Self = this.set("stories_netego", js.undefined)
  }
}
