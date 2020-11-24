package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRepositoryStoryResponseStory extends js.Object {
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var expiring_at: Double = js.native
  
  var has_pride_media: Boolean = js.native
  
  var id: String = js.native
  
  var items: js.Array[LocationRepositoryStoryResponseItemsItem] = js.native
  
  var latest_reel_media: Double = js.native
  
  var location: LocationRepositoryStoryResponseLocation = js.native
  
  var owner: LocationRepositoryStoryResponseOwner = js.native
  
  var prefetch_count: Double = js.native
  
  var reel_type: String = js.native
  
  var seen: Double = js.native
  
  var unique_integer_reel_id: String = js.native
}
object LocationRepositoryStoryResponseStory {
  
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    has_pride_media: Boolean,
    id: String,
    items: js.Array[LocationRepositoryStoryResponseItemsItem],
    latest_reel_media: Double,
    location: LocationRepositoryStoryResponseLocation,
    owner: LocationRepositoryStoryResponseOwner,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    unique_integer_reel_id: String
  ): LocationRepositoryStoryResponseStory = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], unique_integer_reel_id = unique_integer_reel_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseStory]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseStoryOps[Self <: LocationRepositoryStoryResponseStory] (val x: Self) extends AnyVal {
    
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
    def setHas_pride_media(value: Boolean): Self = this.set("has_pride_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: LocationRepositoryStoryResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[LocationRepositoryStoryResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = this.set("latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRepositoryStoryResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: LocationRepositoryStoryResponseOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetch_count(value: Double): Self = this.set("prefetch_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_type(value: String): Self = this.set("reel_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen(value: Double): Self = this.set("seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique_integer_reel_id(value: String): Self = this.set("unique_integer_reel_id", value.asInstanceOf[js.Any])
  }
}
