package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseTrayItem extends StObject {
  
  var can_reply: Boolean
  
  var can_reshare: Boolean
  
  var expiring_at: Double
  
  var has_besties_media: Boolean
  
  var has_pride_media: Boolean
  
  var hide_from_feed_unit: js.UndefOr[Boolean] = js.undefined
  
  var id: Double
  
  var items: js.UndefOr[js.Array[ReelsTrayFeedResponseItemsItem]] = js.undefined
  
  var latest_reel_media: Double
  
  var media_count: Double
  
  var media_ids: js.Array[String]
  
  var muted: Boolean
  
  var prefetch_count: Double
  
  var ranked_position: Double
  
  var reel_type: String
  
  var seen: Double
  
  var seen_ranked_position: Double
  
  var user: ReelsTrayFeedResponseUser
}
object ReelsTrayFeedResponseTrayItem {
  
  inline def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    has_besties_media: Boolean,
    has_pride_media: Boolean,
    id: Double,
    latest_reel_media: Double,
    media_count: Double,
    media_ids: js.Array[String],
    muted: Boolean,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Double,
    seen_ranked_position: Double,
    user: ReelsTrayFeedResponseUser
  ): ReelsTrayFeedResponseTrayItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], has_besties_media = has_besties_media.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseTrayItem]
  }
  
  extension [Self <: ReelsTrayFeedResponseTrayItem](x: Self) {
    
    inline def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
    
    inline def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
    
    inline def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    inline def setHas_besties_media(value: Boolean): Self = StObject.set(x, "has_besties_media", value.asInstanceOf[js.Any])
    
    inline def setHas_pride_media(value: Boolean): Self = StObject.set(x, "has_pride_media", value.asInstanceOf[js.Any])
    
    inline def setHide_from_feed_unit(value: Boolean): Self = StObject.set(x, "hide_from_feed_unit", value.asInstanceOf[js.Any])
    
    inline def setHide_from_feed_unitUndefined: Self = StObject.set(x, "hide_from_feed_unit", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[ReelsTrayFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ReelsTrayFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
    
    inline def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
    
    inline def setMedia_ids(value: js.Array[String]): Self = StObject.set(x, "media_ids", value.asInstanceOf[js.Any])
    
    inline def setMedia_idsVarargs(value: String*): Self = StObject.set(x, "media_ids", js.Array(value :_*))
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setPrefetch_count(value: Double): Self = StObject.set(x, "prefetch_count", value.asInstanceOf[js.Any])
    
    inline def setRanked_position(value: Double): Self = StObject.set(x, "ranked_position", value.asInstanceOf[js.Any])
    
    inline def setReel_type(value: String): Self = StObject.set(x, "reel_type", value.asInstanceOf[js.Any])
    
    inline def setSeen(value: Double): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    
    inline def setSeen_ranked_position(value: Double): Self = StObject.set(x, "seen_ranked_position", value.asInstanceOf[js.Any])
    
    inline def setUser(value: ReelsTrayFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
