package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insightsServiceStoryResponseMod {
  
  trait InsightsServiceStoryResponseData extends StObject {
    
    var media: InsightsServiceStoryResponseMedia
  }
  object InsightsServiceStoryResponseData {
    
    inline def apply(media: InsightsServiceStoryResponseMedia): InsightsServiceStoryResponseData = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseData]
    }
    
    extension [Self <: InsightsServiceStoryResponseData](x: Self) {
      
      inline def setMedia(value: InsightsServiceStoryResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsightsServiceStoryResponseInlineInsightsNode extends StObject {
    
    var metrics: Null
    
    var state: String
  }
  object InsightsServiceStoryResponseInlineInsightsNode {
    
    inline def apply(metrics: Null, state: String): InsightsServiceStoryResponseInlineInsightsNode = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseInlineInsightsNode]
    }
    
    extension [Self <: InsightsServiceStoryResponseInlineInsightsNode](x: Self) {
      
      inline def setMetrics(value: Null): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsightsServiceStoryResponseInstagramActor extends StObject {
    
    var id: String
    
    var instagram_actor_id: String
  }
  object InsightsServiceStoryResponseInstagramActor {
    
    inline def apply(id: String, instagram_actor_id: String): InsightsServiceStoryResponseInstagramActor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instagram_actor_id = instagram_actor_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseInstagramActor]
    }
    
    extension [Self <: InsightsServiceStoryResponseInstagramActor](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstagram_actor_id(value: String): Self = StObject.set(x, "instagram_actor_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsightsServiceStoryResponseMedia extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: InsightsServiceStoryResponseMedia](x: Self) {
      
      inline def setCreation_time(value: Double): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInline_insights_node(value: InsightsServiceStoryResponseInlineInsightsNode): Self = StObject.set(x, "inline_insights_node", value.asInstanceOf[js.Any])
      
      inline def setInstagram_actor(value: InsightsServiceStoryResponseInstagramActor): Self = StObject.set(x, "instagram_actor", value.asInstanceOf[js.Any])
      
      inline def setInstagram_media_id(value: String): Self = StObject.set(x, "instagram_media_id", value.asInstanceOf[js.Any])
      
      inline def setInstagram_media_owner_id(value: String): Self = StObject.set(x, "instagram_media_owner_id", value.asInstanceOf[js.Any])
      
      inline def setShopping_outbound_click_count(value: Double): Self = StObject.set(x, "shopping_outbound_click_count", value.asInstanceOf[js.Any])
      
      inline def setTaps_back_count(value: Double): Self = StObject.set(x, "taps_back_count", value.asInstanceOf[js.Any])
      
      inline def setTaps_forward_count(value: Double): Self = StObject.set(x, "taps_forward_count", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsightsServiceStoryResponseRootObject extends StObject {
    
    var data: InsightsServiceStoryResponseData
  }
  object InsightsServiceStoryResponseRootObject {
    
    inline def apply(data: InsightsServiceStoryResponseData): InsightsServiceStoryResponseRootObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseRootObject]
    }
    
    extension [Self <: InsightsServiceStoryResponseRootObject](x: Self) {
      
      inline def setData(value: InsightsServiceStoryResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
