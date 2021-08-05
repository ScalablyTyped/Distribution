package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseNode extends StObject {
  
  var __typename: String
  
  var comment_count: js.UndefOr[Double] = js.undefined
  
  var creation_time: js.UndefOr[Double] = js.undefined
  
  var engagement: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[PostsInsightsFeedResponseImage] = js.undefined
  
  var inline_insights_node: js.UndefOr[PostsInsightsFeedResponseInlineInsightsNode] = js.undefined
  
  var instagram_media_id: js.UndefOr[String] = js.undefined
  
  var instagram_media_type: js.UndefOr[String] = js.undefined
  
  var like_count: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var save_count: js.UndefOr[Double] = js.undefined
  
  var shopping_outbound_click_count: js.UndefOr[Double] = js.undefined
  
  var shopping_product_click_count: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var video_view_count: js.UndefOr[Null] = js.undefined
}
object PostsInsightsFeedResponseNode {
  
  inline def apply(__typename: String): PostsInsightsFeedResponseNode = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseNode]
  }
  
  extension [Self <: PostsInsightsFeedResponseNode](x: Self) {
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setComment_countUndefined: Self = StObject.set(x, "comment_count", js.undefined)
    
    inline def setCreation_time(value: Double): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    inline def setEngagement(value: Double): Self = StObject.set(x, "engagement", value.asInstanceOf[js.Any])
    
    inline def setEngagementUndefined: Self = StObject.set(x, "engagement", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: PostsInsightsFeedResponseImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInline_insights_node(value: PostsInsightsFeedResponseInlineInsightsNode): Self = StObject.set(x, "inline_insights_node", value.asInstanceOf[js.Any])
    
    inline def setInline_insights_nodeUndefined: Self = StObject.set(x, "inline_insights_node", js.undefined)
    
    inline def setInstagram_media_id(value: String): Self = StObject.set(x, "instagram_media_id", value.asInstanceOf[js.Any])
    
    inline def setInstagram_media_idUndefined: Self = StObject.set(x, "instagram_media_id", js.undefined)
    
    inline def setInstagram_media_type(value: String): Self = StObject.set(x, "instagram_media_type", value.asInstanceOf[js.Any])
    
    inline def setInstagram_media_typeUndefined: Self = StObject.set(x, "instagram_media_type", js.undefined)
    
    inline def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
    
    inline def setLike_countUndefined: Self = StObject.set(x, "like_count", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSave_count(value: Double): Self = StObject.set(x, "save_count", value.asInstanceOf[js.Any])
    
    inline def setSave_countUndefined: Self = StObject.set(x, "save_count", js.undefined)
    
    inline def setShopping_outbound_click_count(value: Double): Self = StObject.set(x, "shopping_outbound_click_count", value.asInstanceOf[js.Any])
    
    inline def setShopping_outbound_click_countUndefined: Self = StObject.set(x, "shopping_outbound_click_count", js.undefined)
    
    inline def setShopping_product_click_count(value: Double): Self = StObject.set(x, "shopping_product_click_count", value.asInstanceOf[js.Any])
    
    inline def setShopping_product_click_countUndefined: Self = StObject.set(x, "shopping_product_click_count", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
  }
}
