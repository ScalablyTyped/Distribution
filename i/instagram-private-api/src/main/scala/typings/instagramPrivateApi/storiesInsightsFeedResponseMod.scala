package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesInsightsFeedResponseMod {
  
  trait StoriesInsightsFeedResponseBusinessManager extends StObject {
    
    var stories_unit: StoriesInsightsFeedResponseStoriesUnit
  }
  object StoriesInsightsFeedResponseBusinessManager {
    
    inline def apply(stories_unit: StoriesInsightsFeedResponseStoriesUnit): StoriesInsightsFeedResponseBusinessManager = {
      val __obj = js.Dynamic.literal(stories_unit = stories_unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseBusinessManager]
    }
    
    extension [Self <: StoriesInsightsFeedResponseBusinessManager](x: Self) {
      
      inline def setStories_unit(value: StoriesInsightsFeedResponseStoriesUnit): Self = StObject.set(x, "stories_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseData extends StObject {
    
    var user: StoriesInsightsFeedResponseUser
  }
  object StoriesInsightsFeedResponseData {
    
    inline def apply(user: StoriesInsightsFeedResponseUser): StoriesInsightsFeedResponseData = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseData]
    }
    
    extension [Self <: StoriesInsightsFeedResponseData](x: Self) {
      
      inline def setUser(value: StoriesInsightsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseEdgesItem extends StObject {
    
    var cursor: Null
    
    var node: StoriesInsightsFeedResponseNode
  }
  object StoriesInsightsFeedResponseEdgesItem {
    
    inline def apply(cursor: Null, node: StoriesInsightsFeedResponseNode): StoriesInsightsFeedResponseEdgesItem = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseEdgesItem]
    }
    
    extension [Self <: StoriesInsightsFeedResponseEdgesItem](x: Self) {
      
      inline def setCursor(value: Null): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setNode(value: StoriesInsightsFeedResponseNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseInlineInsightsNode extends StObject {
    
    var metrics: Null
    
    var state: String
  }
  object StoriesInsightsFeedResponseInlineInsightsNode {
    
    inline def apply(metrics: Null, state: String): StoriesInsightsFeedResponseInlineInsightsNode = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseInlineInsightsNode]
    }
    
    extension [Self <: StoriesInsightsFeedResponseInlineInsightsNode](x: Self) {
      
      inline def setMetrics(value: Null): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseNode extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: StoriesInsightsFeedResponseNode](x: Self) {
      
      inline def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
      
      inline def setExits_count(value: Double): Self = StObject.set(x, "exits_count", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImpression_count(value: Double): Self = StObject.set(x, "impression_count", value.asInstanceOf[js.Any])
      
      inline def setInline_insights_node(value: StoriesInsightsFeedResponseInlineInsightsNode): Self = StObject.set(x, "inline_insights_node", value.asInstanceOf[js.Any])
      
      inline def setInstagram_media_id(value: String): Self = StObject.set(x, "instagram_media_id", value.asInstanceOf[js.Any])
      
      inline def setReach_count(value: Double): Self = StObject.set(x, "reach_count", value.asInstanceOf[js.Any])
      
      inline def setReplies_count(value: Double): Self = StObject.set(x, "replies_count", value.asInstanceOf[js.Any])
      
      inline def setStory_swipe_away_count(value: Double): Self = StObject.set(x, "story_swipe_away_count", value.asInstanceOf[js.Any])
      
      inline def setTaps_back_count(value: Double): Self = StObject.set(x, "taps_back_count", value.asInstanceOf[js.Any])
      
      inline def setTaps_forward_count(value: Double): Self = StObject.set(x, "taps_forward_count", value.asInstanceOf[js.Any])
      
      inline def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponsePageInfo extends StObject {
    
    var end_cursor: String
    
    var has_next_page: Boolean
  }
  object StoriesInsightsFeedResponsePageInfo {
    
    inline def apply(end_cursor: String, has_next_page: Boolean): StoriesInsightsFeedResponsePageInfo = {
      val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponsePageInfo]
    }
    
    extension [Self <: StoriesInsightsFeedResponsePageInfo](x: Self) {
      
      inline def setEnd_cursor(value: String): Self = StObject.set(x, "end_cursor", value.asInstanceOf[js.Any])
      
      inline def setHas_next_page(value: Boolean): Self = StObject.set(x, "has_next_page", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseRootObject extends StObject {
    
    var data: StoriesInsightsFeedResponseData
  }
  object StoriesInsightsFeedResponseRootObject {
    
    inline def apply(data: StoriesInsightsFeedResponseData): StoriesInsightsFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseRootObject]
    }
    
    extension [Self <: StoriesInsightsFeedResponseRootObject](x: Self) {
      
      inline def setData(value: StoriesInsightsFeedResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseStories extends StObject {
    
    var edges: js.Array[StoriesInsightsFeedResponseEdgesItem]
    
    var page_info: StoriesInsightsFeedResponsePageInfo
  }
  object StoriesInsightsFeedResponseStories {
    
    inline def apply(
      edges: js.Array[StoriesInsightsFeedResponseEdgesItem],
      page_info: StoriesInsightsFeedResponsePageInfo
    ): StoriesInsightsFeedResponseStories = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseStories]
    }
    
    extension [Self <: StoriesInsightsFeedResponseStories](x: Self) {
      
      inline def setEdges(value: js.Array[StoriesInsightsFeedResponseEdgesItem]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: StoriesInsightsFeedResponseEdgesItem*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      inline def setPage_info(value: StoriesInsightsFeedResponsePageInfo): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseStoriesUnit extends StObject {
    
    var stories: StoriesInsightsFeedResponseStories
  }
  object StoriesInsightsFeedResponseStoriesUnit {
    
    inline def apply(stories: StoriesInsightsFeedResponseStories): StoriesInsightsFeedResponseStoriesUnit = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseStoriesUnit]
    }
    
    extension [Self <: StoriesInsightsFeedResponseStoriesUnit](x: Self) {
      
      inline def setStories(value: StoriesInsightsFeedResponseStories): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoriesInsightsFeedResponseUser extends StObject {
    
    var business_manager: StoriesInsightsFeedResponseBusinessManager
    
    var id: String
  }
  object StoriesInsightsFeedResponseUser {
    
    inline def apply(business_manager: StoriesInsightsFeedResponseBusinessManager, id: String): StoriesInsightsFeedResponseUser = {
      val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseUser]
    }
    
    extension [Self <: StoriesInsightsFeedResponseUser](x: Self) {
      
      inline def setBusiness_manager(value: StoriesInsightsFeedResponseBusinessManager): Self = StObject.set(x, "business_manager", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
