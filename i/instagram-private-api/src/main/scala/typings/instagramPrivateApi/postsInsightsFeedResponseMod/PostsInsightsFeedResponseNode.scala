package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseNode extends js.Object {
  
  var __typename: String = js.native
  
  var comment_count: js.UndefOr[Double] = js.native
  
  var creation_time: js.UndefOr[Double] = js.native
  
  var engagement: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var image: js.UndefOr[PostsInsightsFeedResponseImage] = js.native
  
  var inline_insights_node: js.UndefOr[PostsInsightsFeedResponseInlineInsightsNode] = js.native
  
  var instagram_media_id: js.UndefOr[String] = js.native
  
  var instagram_media_type: js.UndefOr[String] = js.native
  
  var like_count: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var save_count: js.UndefOr[Double] = js.native
  
  var shopping_outbound_click_count: js.UndefOr[Double] = js.native
  
  var shopping_product_click_count: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var video_view_count: js.UndefOr[Null] = js.native
}
object PostsInsightsFeedResponseNode {
  
  @scala.inline
  def apply(__typename: String): PostsInsightsFeedResponseNode = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseNode]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseNodeOps[Self <: PostsInsightsFeedResponseNode] (val x: Self) extends AnyVal {
    
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
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_count: Self = this.set("comment_count", js.undefined)
    
    @scala.inline
    def setCreation_time(value: Double): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation_time: Self = this.set("creation_time", js.undefined)
    
    @scala.inline
    def setEngagement(value: Double): Self = this.set("engagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngagement: Self = this.set("engagement", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImage(value: PostsInsightsFeedResponseImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setInline_insights_node(value: PostsInsightsFeedResponseInlineInsightsNode): Self = this.set("inline_insights_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_insights_node: Self = this.set("inline_insights_node", js.undefined)
    
    @scala.inline
    def setInstagram_media_id(value: String): Self = this.set("instagram_media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstagram_media_id: Self = this.set("instagram_media_id", js.undefined)
    
    @scala.inline
    def setInstagram_media_type(value: String): Self = this.set("instagram_media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstagram_media_type: Self = this.set("instagram_media_type", js.undefined)
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLike_count: Self = this.set("like_count", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSave_count(value: Double): Self = this.set("save_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave_count: Self = this.set("save_count", js.undefined)
    
    @scala.inline
    def setShopping_outbound_click_count(value: Double): Self = this.set("shopping_outbound_click_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShopping_outbound_click_count: Self = this.set("shopping_outbound_click_count", js.undefined)
    
    @scala.inline
    def setShopping_product_click_count(value: Double): Self = this.set("shopping_product_click_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShopping_product_click_count: Self = this.set("shopping_product_click_count", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
