package typings.instagramPrivateApi.insightsServiceStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceStoryResponseMedia extends js.Object {
  var creation_time: Double
  var id: String
  var inline_insights_node: InsightsServiceStoryResponseInlineInsightsNode
  var instagram_actor: InsightsServiceStoryResponseInstagramActor
  var instagram_media_id: String
  var instagram_media_owner_id: String
  var shopping_outbound_click_count: Double
  var taps_back_count: Double
  var taps_forward_count: Double
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
}

