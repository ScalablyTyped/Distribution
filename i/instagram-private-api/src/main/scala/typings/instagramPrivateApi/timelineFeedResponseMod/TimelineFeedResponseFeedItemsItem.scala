package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseFeedItemsItem extends StObject {
  
  var media_or_ad: TimelineFeedResponseMediaOrAd
  
  var stories_netego: js.UndefOr[TimelineFeedResponseStoriesNetego] = js.undefined
}
object TimelineFeedResponseFeedItemsItem {
  
  inline def apply(media_or_ad: TimelineFeedResponseMediaOrAd): TimelineFeedResponseFeedItemsItem = {
    val __obj = js.Dynamic.literal(media_or_ad = media_or_ad.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseFeedItemsItem]
  }
  
  extension [Self <: TimelineFeedResponseFeedItemsItem](x: Self) {
    
    inline def setMedia_or_ad(value: TimelineFeedResponseMediaOrAd): Self = StObject.set(x, "media_or_ad", value.asInstanceOf[js.Any])
    
    inline def setStories_netego(value: TimelineFeedResponseStoriesNetego): Self = StObject.set(x, "stories_netego", value.asInstanceOf[js.Any])
    
    inline def setStories_netegoUndefined: Self = StObject.set(x, "stories_netego", js.undefined)
  }
}
