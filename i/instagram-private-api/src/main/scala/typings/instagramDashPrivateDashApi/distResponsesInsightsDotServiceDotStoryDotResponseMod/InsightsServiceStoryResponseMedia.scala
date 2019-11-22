package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotStoryDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceStoryResponseMedia extends js.Object {
  var creation_time: Double
  var id: String
  var inline_insights_node: InsightsServiceStoryResponseInline_insights_node
  var instagram_actor: InsightsServiceStoryResponseInstagram_actor
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
    inline_insights_node: InsightsServiceStoryResponseInline_insights_node,
    instagram_actor: InsightsServiceStoryResponseInstagram_actor,
    instagram_media_id: String,
    instagram_media_owner_id: String,
    shopping_outbound_click_count: Double,
    taps_back_count: Double,
    taps_forward_count: Double
  ): InsightsServiceStoryResponseMedia = {
    val __obj = js.Dynamic.literal(creation_time = creation_time, id = id, inline_insights_node = inline_insights_node, instagram_actor = instagram_actor, instagram_media_id = instagram_media_id, instagram_media_owner_id = instagram_media_owner_id, shopping_outbound_click_count = shopping_outbound_click_count, taps_back_count = taps_back_count, taps_forward_count = taps_forward_count)
  
    __obj.asInstanceOf[InsightsServiceStoryResponseMedia]
  }
}

