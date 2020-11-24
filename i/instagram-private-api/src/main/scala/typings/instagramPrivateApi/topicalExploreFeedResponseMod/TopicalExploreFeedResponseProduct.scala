package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseProduct extends js.Object {
  
  var can_see_insights_for_viewer: Boolean = js.native
  
  var can_share_to_story: Boolean = js.native
  
  var checkout_style: String = js.native
  
  var compound_product_id: String = js.native
  
  var current_price: String = js.native
  
  var current_price_stripped: String = js.native
  
  var description: String = js.native
  
  var external_url: String = js.native
  
  var full_price: String = js.native
  
  var full_price_stripped: String = js.native
  
  var has_viewer_saved: Boolean = js.native
  
  var launch_information: js.UndefOr[TopicalExploreFeedResponseLaunchInformation] = js.native
  
  var main_image: TopicalExploreFeedResponseMainImage = js.native
  
  var merchant: TopicalExploreFeedResponseMerchant = js.native
  
  var name: String = js.native
  
  var price: String = js.native
  
  var product_id: String = js.native
  
  var retailer_id: String = js.native
  
  var review_status: String = js.native
  
  var rich_text_description: js.UndefOr[js.Array[TopicalExploreFeedResponseRichTextDescriptionItem]] = js.native
  
  var thumbnail_image: TopicalExploreFeedResponseThumbnailImage = js.native
}
object TopicalExploreFeedResponseProduct {
  
  @scala.inline
  def apply(
    can_see_insights_for_viewer: Boolean,
    can_share_to_story: Boolean,
    checkout_style: String,
    compound_product_id: String,
    current_price: String,
    current_price_stripped: String,
    description: String,
    external_url: String,
    full_price: String,
    full_price_stripped: String,
    has_viewer_saved: Boolean,
    main_image: TopicalExploreFeedResponseMainImage,
    merchant: TopicalExploreFeedResponseMerchant,
    name: String,
    price: String,
    product_id: String,
    retailer_id: String,
    review_status: String,
    thumbnail_image: TopicalExploreFeedResponseThumbnailImage
  ): TopicalExploreFeedResponseProduct = {
    val __obj = js.Dynamic.literal(can_see_insights_for_viewer = can_see_insights_for_viewer.asInstanceOf[js.Any], can_share_to_story = can_share_to_story.asInstanceOf[js.Any], checkout_style = checkout_style.asInstanceOf[js.Any], compound_product_id = compound_product_id.asInstanceOf[js.Any], current_price = current_price.asInstanceOf[js.Any], current_price_stripped = current_price_stripped.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], full_price = full_price.asInstanceOf[js.Any], full_price_stripped = full_price_stripped.asInstanceOf[js.Any], has_viewer_saved = has_viewer_saved.asInstanceOf[js.Any], main_image = main_image.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], retailer_id = retailer_id.asInstanceOf[js.Any], review_status = review_status.asInstanceOf[js.Any], thumbnail_image = thumbnail_image.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseProduct]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseProductOps[Self <: TopicalExploreFeedResponseProduct] (val x: Self) extends AnyVal {
    
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
    def setCan_see_insights_for_viewer(value: Boolean): Self = this.set("can_see_insights_for_viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_share_to_story(value: Boolean): Self = this.set("can_share_to_story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout_style(value: String): Self = this.set("checkout_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompound_product_id(value: String): Self = this.set("compound_product_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_price(value: String): Self = this.set("current_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_price_stripped(value: String): Self = this.set("current_price_stripped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_price(value: String): Self = this.set("full_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_price_stripped(value: String): Self = this.set("full_price_stripped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_viewer_saved(value: Boolean): Self = this.set("has_viewer_saved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain_image(value: TopicalExploreFeedResponseMainImage): Self = this.set("main_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchant(value: TopicalExploreFeedResponseMerchant): Self = this.set("merchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_id(value: String): Self = this.set("product_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetailer_id(value: String): Self = this.set("retailer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_status(value: String): Self = this.set("review_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_image(value: TopicalExploreFeedResponseThumbnailImage): Self = this.set("thumbnail_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch_information(value: TopicalExploreFeedResponseLaunchInformation): Self = this.set("launch_information", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunch_information: Self = this.set("launch_information", js.undefined)
    
    @scala.inline
    def setRich_text_descriptionVarargs(value: TopicalExploreFeedResponseRichTextDescriptionItem*): Self = this.set("rich_text_description", js.Array(value :_*))
    
    @scala.inline
    def setRich_text_description(value: js.Array[TopicalExploreFeedResponseRichTextDescriptionItem]): Self = this.set("rich_text_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRich_text_description: Self = this.set("rich_text_description", js.undefined)
  }
}
