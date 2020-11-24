package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseTrayItem extends js.Object {
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var expiring_at: Double = js.native
  
  var has_besties_media: Boolean = js.native
  
  var has_pride_media: Boolean = js.native
  
  var hide_from_feed_unit: js.UndefOr[Boolean] = js.native
  
  var id: Double = js.native
  
  var items: js.UndefOr[js.Array[ReelsTrayFeedResponseItemsItem]] = js.native
  
  var latest_reel_media: Double = js.native
  
  var media_count: Double = js.native
  
  var media_ids: js.Array[String] = js.native
  
  var muted: Boolean = js.native
  
  var prefetch_count: Double = js.native
  
  var ranked_position: Double = js.native
  
  var reel_type: String = js.native
  
  var seen: Double = js.native
  
  var seen_ranked_position: Double = js.native
  
  var user: ReelsTrayFeedResponseUser = js.native
}
object ReelsTrayFeedResponseTrayItem {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ReelsTrayFeedResponseTrayItemOps[Self <: ReelsTrayFeedResponseTrayItem] (val x: Self) extends AnyVal {
    
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
    def setCan_reply(value: Boolean): Self = this.set("can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = this.set("can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_at(value: Double): Self = this.set("expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_besties_media(value: Boolean): Self = this.set("has_besties_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_pride_media(value: Boolean): Self = this.set("has_pride_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = this.set("latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_idsVarargs(value: String*): Self = this.set("media_ids", js.Array(value :_*))
    
    @scala.inline
    def setMedia_ids(value: js.Array[String]): Self = this.set("media_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetch_count(value: Double): Self = this.set("prefetch_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanked_position(value: Double): Self = this.set("ranked_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_type(value: String): Self = this.set("reel_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen(value: Double): Self = this.set("seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_ranked_position(value: Double): Self = this.set("seen_ranked_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ReelsTrayFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_from_feed_unit(value: Boolean): Self = this.set("hide_from_feed_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide_from_feed_unit: Self = this.set("hide_from_feed_unit", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ReelsTrayFeedResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ReelsTrayFeedResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
