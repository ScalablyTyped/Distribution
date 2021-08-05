package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseStory extends StObject {
  
  var can_reply: Boolean
  
  var can_reshare: Boolean
  
  var expiring_at: Double
  
  var id: String
  
  var items: js.Array[TagFeedResponseItemsItem]
  
  var latest_reel_media: Double
  
  var muted: Boolean
  
  var owner: TagFeedResponseOwner
  
  var prefetch_count: Double
  
  var reel_type: String
  
  var seen: Double
  
  var unique_integer_reel_id: String
}
object TagFeedResponseStory {
  
  inline def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    id: String,
    items: js.Array[TagFeedResponseItemsItem],
    latest_reel_media: Double,
    muted: Boolean,
    owner: TagFeedResponseOwner,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    unique_integer_reel_id: String
  ): TagFeedResponseStory = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], unique_integer_reel_id = unique_integer_reel_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseStory]
  }
  
  extension [Self <: TagFeedResponseStory](x: Self) {
    
    inline def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
    
    inline def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
    
    inline def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[TagFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: TagFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: TagFeedResponseOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPrefetch_count(value: Double): Self = StObject.set(x, "prefetch_count", value.asInstanceOf[js.Any])
    
    inline def setReel_type(value: String): Self = StObject.set(x, "reel_type", value.asInstanceOf[js.Any])
    
    inline def setSeen(value: Double): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    
    inline def setUnique_integer_reel_id(value: String): Self = StObject.set(x, "unique_integer_reel_id", value.asInstanceOf[js.Any])
  }
}
