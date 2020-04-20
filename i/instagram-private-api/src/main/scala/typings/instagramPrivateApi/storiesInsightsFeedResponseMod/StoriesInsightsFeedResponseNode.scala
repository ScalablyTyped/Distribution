package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponseNode extends js.Object {
  var __typename: String
  var display_url: String
  var exits_count: Double
  var id: String
  var impression_count: Double
  var inline_insights_node: StoriesInsightsFeedResponseInlineInsightsNode
  var instagram_media_id: String
  var reach_count: Double
  var replies_count: Double
  var story_swipe_away_count: Double
  var taps_back_count: Double
  var taps_forward_count: Double
}

object StoriesInsightsFeedResponseNode {
  @scala.inline
  def apply(
    __typename: String,
    display_url: String,
    exits_count: Double,
    id: String,
    impression_count: Double,
    inline_insights_node: StoriesInsightsFeedResponseInlineInsightsNode,
    instagram_media_id: String,
    reach_count: Double,
    replies_count: Double,
    story_swipe_away_count: Double,
    taps_back_count: Double,
    taps_forward_count: Double
  ): StoriesInsightsFeedResponseNode = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], display_url = display_url.asInstanceOf[js.Any], exits_count = exits_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], inline_insights_node = inline_insights_node.asInstanceOf[js.Any], instagram_media_id = instagram_media_id.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], replies_count = replies_count.asInstanceOf[js.Any], story_swipe_away_count = story_swipe_away_count.asInstanceOf[js.Any], taps_back_count = taps_back_count.asInstanceOf[js.Any], taps_forward_count = taps_forward_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseNode]
  }
}

