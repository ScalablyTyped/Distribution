package typings.instagramPrivateApi.insightsServiceStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceStoryResponseMedia extends js.Object {
  
  var creation_time: Double = js.native
  
  var id: String = js.native
  
  var inline_insights_node: InsightsServiceStoryResponseInlineInsightsNode = js.native
  
  var instagram_actor: InsightsServiceStoryResponseInstagramActor = js.native
  
  var instagram_media_id: String = js.native
  
  var instagram_media_owner_id: String = js.native
  
  var shopping_outbound_click_count: Double = js.native
  
  var taps_back_count: Double = js.native
  
  var taps_forward_count: Double = js.native
}
object InsightsServiceStoryResponseMedia {
  
  @scala.inline
  def apply(
    creation_time: Double,
    id: String,
    inline_insights_node: InsightsServiceStoryResponseInlineInsightsNode,
    instagram_actor: InsightsServiceStoryResponseInstagramActor,
    instagram_media_id: String,
    instagram_media_owner_id: String,
    shopping_outbound_click_count: Double,
    taps_back_count: Double,
    taps_forward_count: Double
  ): InsightsServiceStoryResponseMedia = {
    val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inline_insights_node = inline_insights_node.asInstanceOf[js.Any], instagram_actor = instagram_actor.asInstanceOf[js.Any], instagram_media_id = instagram_media_id.asInstanceOf[js.Any], instagram_media_owner_id = instagram_media_owner_id.asInstanceOf[js.Any], shopping_outbound_click_count = shopping_outbound_click_count.asInstanceOf[js.Any], taps_back_count = taps_back_count.asInstanceOf[js.Any], taps_forward_count = taps_forward_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceStoryResponseMedia]
  }
  
  @scala.inline
  implicit class InsightsServiceStoryResponseMediaOps[Self <: InsightsServiceStoryResponseMedia] (val x: Self) extends AnyVal {
    
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
    def setCreation_time(value: Double): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_insights_node(value: InsightsServiceStoryResponseInlineInsightsNode): Self = this.set("inline_insights_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_actor(value: InsightsServiceStoryResponseInstagramActor): Self = this.set("instagram_actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_media_id(value: String): Self = this.set("instagram_media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_media_owner_id(value: String): Self = this.set("instagram_media_owner_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShopping_outbound_click_count(value: Double): Self = this.set("shopping_outbound_click_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaps_back_count(value: Double): Self = this.set("taps_back_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaps_forward_count(value: Double): Self = this.set("taps_forward_count", value.asInstanceOf[js.Any])
  }
}
