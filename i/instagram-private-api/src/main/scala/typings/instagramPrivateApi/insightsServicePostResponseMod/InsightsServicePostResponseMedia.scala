package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseMedia extends js.Object {
  var ad_media: Null
  var comment_count: Double
  var creation_time: Double
  var display_url: String
  var has_product_tags: Boolean
  var id: String
  var image: InsightsServicePostResponseImage
  var inline_insights_node: InsightsServicePostResponseInlineInsightsNode
  var instagram_actor: InsightsServicePostResponseInstagramActor
  var instagram_media_id: String
  var instagram_media_owner_id: String
  var instagram_media_type: String
  var like_count: Double
  var organic_instagram_media_id: String
  var save_count: Double
  var shopping_outbound_click_count: Double
  var shopping_product_click_count: Double
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
}

