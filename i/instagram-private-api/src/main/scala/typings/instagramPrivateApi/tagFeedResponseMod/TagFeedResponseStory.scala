package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseStory extends StObject {
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var expiring_at: Double = js.native
  
  var id: String = js.native
  
  var items: js.Array[TagFeedResponseItemsItem] = js.native
  
  var latest_reel_media: Double = js.native
  
  var muted: Boolean = js.native
  
  var owner: TagFeedResponseOwner = js.native
  
  var prefetch_count: Double = js.native
  
  var reel_type: String = js.native
  
  var seen: Double = js.native
  
  var unique_integer_reel_id: String = js.native
}
object TagFeedResponseStory {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TagFeedResponseStoryMutableBuilder[Self <: TagFeedResponseStory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[TagFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: TagFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: TagFeedResponseOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetch_count(value: Double): Self = StObject.set(x, "prefetch_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_type(value: String): Self = StObject.set(x, "reel_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen(value: Double): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique_integer_reel_id(value: String): Self = StObject.set(x, "unique_integer_reel_id", value.asInstanceOf[js.Any])
  }
}
