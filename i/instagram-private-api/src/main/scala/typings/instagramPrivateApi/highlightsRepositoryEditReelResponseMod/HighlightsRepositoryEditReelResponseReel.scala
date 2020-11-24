package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseReel extends js.Object {
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var contains_stitched_media_blocked_by_rm: Boolean = js.native
  
  var cover_media: HighlightsRepositoryEditReelResponseCoverMedia = js.native
  
  var created_at: Double = js.native
  
  var has_pride_media: Boolean = js.native
  
  var id: String = js.native
  
  var items: js.Array[HighlightsRepositoryEditReelResponseItemsItem] = js.native
  
  var latest_reel_media: Double = js.native
  
  var media_count: Double = js.native
  
  var prefetch_count: Double = js.native
  
  var ranked_position: Double = js.native
  
  var reel_type: String = js.native
  
  var seen: Null = js.native
  
  var seen_ranked_position: Double = js.native
  
  var title: String = js.native
  
  var user: HighlightsRepositoryEditReelResponseUser = js.native
}
object HighlightsRepositoryEditReelResponseReel {
  
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    contains_stitched_media_blocked_by_rm: Boolean,
    cover_media: HighlightsRepositoryEditReelResponseCoverMedia,
    created_at: Double,
    has_pride_media: Boolean,
    id: String,
    items: js.Array[HighlightsRepositoryEditReelResponseItemsItem],
    latest_reel_media: Double,
    media_count: Double,
    prefetch_count: Double,
    ranked_position: Double,
    reel_type: String,
    seen: Null,
    seen_ranked_position: Double,
    title: String,
    user: HighlightsRepositoryEditReelResponseUser
  ): HighlightsRepositoryEditReelResponseReel = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], contains_stitched_media_blocked_by_rm = contains_stitched_media_blocked_by_rm.asInstanceOf[js.Any], cover_media = cover_media.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseReel]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseReelOps[Self <: HighlightsRepositoryEditReelResponseReel] (val x: Self) extends AnyVal {
    
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
    def setContains_stitched_media_blocked_by_rm(value: Boolean): Self = this.set("contains_stitched_media_blocked_by_rm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_media(value: HighlightsRepositoryEditReelResponseCoverMedia): Self = this.set("cover_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_pride_media(value: Boolean): Self = this.set("has_pride_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: HighlightsRepositoryEditReelResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[HighlightsRepositoryEditReelResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = this.set("latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetch_count(value: Double): Self = this.set("prefetch_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanked_position(value: Double): Self = this.set("ranked_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_type(value: String): Self = this.set("reel_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen(value: Null): Self = this.set("seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_ranked_position(value: Double): Self = this.set("seen_ranked_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: HighlightsRepositoryEditReelResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
