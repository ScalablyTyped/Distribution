package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseMedia extends js.Object {
  
  var ad_media: Null = js.native
  
  var comment_count: Double = js.native
  
  var creation_time: Double = js.native
  
  var display_url: String = js.native
  
  var has_product_tags: Boolean = js.native
  
  var id: String = js.native
  
  var image: InsightsServicePostResponseImage = js.native
  
  var inline_insights_node: InsightsServicePostResponseInlineInsightsNode = js.native
  
  var instagram_actor: InsightsServicePostResponseInstagramActor = js.native
  
  var instagram_media_id: String = js.native
  
  var instagram_media_owner_id: String = js.native
  
  var instagram_media_type: String = js.native
  
  var like_count: Double = js.native
  
  var organic_instagram_media_id: String = js.native
  
  var save_count: Double = js.native
  
  var shopping_outbound_click_count: Double = js.native
  
  var shopping_product_click_count: Double = js.native
}
object InsightsServicePostResponseMedia {
  
  @scala.inline
  def apply(
    ad_media: Null,
    comment_count: Double,
    creation_time: Double,
    display_url: String,
    has_product_tags: Boolean,
    id: String,
    image: InsightsServicePostResponseImage,
    inline_insights_node: InsightsServicePostResponseInlineInsightsNode,
    instagram_actor: InsightsServicePostResponseInstagramActor,
    instagram_media_id: String,
    instagram_media_owner_id: String,
    instagram_media_type: String,
    like_count: Double,
    organic_instagram_media_id: String,
    save_count: Double,
    shopping_outbound_click_count: Double,
    shopping_product_click_count: Double
  ): InsightsServicePostResponseMedia = {
    val __obj = js.Dynamic.literal(ad_media = ad_media.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], creation_time = creation_time.asInstanceOf[js.Any], display_url = display_url.asInstanceOf[js.Any], has_product_tags = has_product_tags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inline_insights_node = inline_insights_node.asInstanceOf[js.Any], instagram_actor = instagram_actor.asInstanceOf[js.Any], instagram_media_id = instagram_media_id.asInstanceOf[js.Any], instagram_media_owner_id = instagram_media_owner_id.asInstanceOf[js.Any], instagram_media_type = instagram_media_type.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], organic_instagram_media_id = organic_instagram_media_id.asInstanceOf[js.Any], save_count = save_count.asInstanceOf[js.Any], shopping_outbound_click_count = shopping_outbound_click_count.asInstanceOf[js.Any], shopping_product_click_count = shopping_product_click_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseMedia]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseMediaOps[Self <: InsightsServicePostResponseMedia] (val x: Self) extends AnyVal {
    
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
    def setAd_media(value: Null): Self = this.set("ad_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_time(value: Double): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_url(value: String): Self = this.set("display_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_product_tags(value: Boolean): Self = this.set("has_product_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: InsightsServicePostResponseImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_insights_node(value: InsightsServicePostResponseInlineInsightsNode): Self = this.set("inline_insights_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_actor(value: InsightsServicePostResponseInstagramActor): Self = this.set("instagram_actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_media_id(value: String): Self = this.set("instagram_media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_media_owner_id(value: String): Self = this.set("instagram_media_owner_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_media_type(value: String): Self = this.set("instagram_media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_instagram_media_id(value: String): Self = this.set("organic_instagram_media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave_count(value: Double): Self = this.set("save_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShopping_outbound_click_count(value: Double): Self = this.set("shopping_outbound_click_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShopping_product_click_count(value: Double): Self = this.set("shopping_product_click_count", value.asInstanceOf[js.Any])
  }
}
