package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoriesInsightsFeedResponseNode extends js.Object {
  
  var __typename: String = js.native
  
  var display_url: String = js.native
  
  var exits_count: Double = js.native
  
  var id: String = js.native
  
  var impression_count: Double = js.native
  
  var inline_insights_node: StoriesInsightsFeedResponseInlineInsightsNode = js.native
  
  var instagram_media_id: String = js.native
  
  var reach_count: Double = js.native
  
  var replies_count: Double = js.native
  
  var story_swipe_away_count: Double = js.native
  
  var taps_back_count: Double = js.native
  
  var taps_forward_count: Double = js.native
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
  
  @scala.inline
  implicit class StoriesInsightsFeedResponseNodeOps[Self <: StoriesInsightsFeedResponseNode] (val x: Self) extends AnyVal {
    
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
    def set__typename(value: String): Self = this.set("__typename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_url(value: String): Self = this.set("display_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExits_count(value: Double): Self = this.set("exits_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpression_count(value: Double): Self = this.set("impression_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_insights_node(value: StoriesInsightsFeedResponseInlineInsightsNode): Self = this.set("inline_insights_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_media_id(value: String): Self = this.set("instagram_media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach_count(value: Double): Self = this.set("reach_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplies_count(value: Double): Self = this.set("replies_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_swipe_away_count(value: Double): Self = this.set("story_swipe_away_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaps_back_count(value: Double): Self = this.set("taps_back_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaps_forward_count(value: Double): Self = this.set("taps_forward_count", value.asInstanceOf[js.Any])
  }
}
