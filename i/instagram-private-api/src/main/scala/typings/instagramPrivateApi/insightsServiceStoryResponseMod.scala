package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insightsServiceStoryResponseMod {
  
  @js.native
  trait InsightsServiceStoryResponseData extends StObject {
    
    var media: InsightsServiceStoryResponseMedia = js.native
  }
  object InsightsServiceStoryResponseData {
    
    @scala.inline
    def apply(media: InsightsServiceStoryResponseMedia): InsightsServiceStoryResponseData = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseData]
    }
    
    @scala.inline
    implicit class InsightsServiceStoryResponseDataMutableBuilder[Self <: InsightsServiceStoryResponseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMedia(value: InsightsServiceStoryResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InsightsServiceStoryResponseInlineInsightsNode extends StObject {
    
    var metrics: Null = js.native
    
    var state: String = js.native
  }
  object InsightsServiceStoryResponseInlineInsightsNode {
    
    @scala.inline
    def apply(metrics: Null, state: String): InsightsServiceStoryResponseInlineInsightsNode = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseInlineInsightsNode]
    }
    
    @scala.inline
    implicit class InsightsServiceStoryResponseInlineInsightsNodeMutableBuilder[Self <: InsightsServiceStoryResponseInlineInsightsNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetrics(value: Null): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InsightsServiceStoryResponseInstagramActor extends StObject {
    
    var id: String = js.native
    
    var instagram_actor_id: String = js.native
  }
  object InsightsServiceStoryResponseInstagramActor {
    
    @scala.inline
    def apply(id: String, instagram_actor_id: String): InsightsServiceStoryResponseInstagramActor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instagram_actor_id = instagram_actor_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseInstagramActor]
    }
    
    @scala.inline
    implicit class InsightsServiceStoryResponseInstagramActorMutableBuilder[Self <: InsightsServiceStoryResponseInstagramActor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstagram_actor_id(value: String): Self = StObject.set(x, "instagram_actor_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InsightsServiceStoryResponseMedia extends StObject {
    
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
    implicit class InsightsServiceStoryResponseMediaMutableBuilder[Self <: InsightsServiceStoryResponseMedia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreation_time(value: Double): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_insights_node(value: InsightsServiceStoryResponseInlineInsightsNode): Self = StObject.set(x, "inline_insights_node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstagram_actor(value: InsightsServiceStoryResponseInstagramActor): Self = StObject.set(x, "instagram_actor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstagram_media_id(value: String): Self = StObject.set(x, "instagram_media_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstagram_media_owner_id(value: String): Self = StObject.set(x, "instagram_media_owner_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShopping_outbound_click_count(value: Double): Self = StObject.set(x, "shopping_outbound_click_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaps_back_count(value: Double): Self = StObject.set(x, "taps_back_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaps_forward_count(value: Double): Self = StObject.set(x, "taps_forward_count", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InsightsServiceStoryResponseRootObject extends StObject {
    
    var data: InsightsServiceStoryResponseData = js.native
  }
  object InsightsServiceStoryResponseRootObject {
    
    @scala.inline
    def apply(data: InsightsServiceStoryResponseData): InsightsServiceStoryResponseRootObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsServiceStoryResponseRootObject]
    }
    
    @scala.inline
    implicit class InsightsServiceStoryResponseRootObjectMutableBuilder[Self <: InsightsServiceStoryResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: InsightsServiceStoryResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
