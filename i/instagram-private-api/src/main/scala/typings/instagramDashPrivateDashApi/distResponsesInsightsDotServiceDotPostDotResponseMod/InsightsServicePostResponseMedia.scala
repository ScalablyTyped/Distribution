package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

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
  var inline_insights_node: InsightsServicePostResponseInline_insights_node
  var instagram_actor: InsightsServicePostResponseInstagram_actor
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
    inline_insights_node: InsightsServicePostResponseInline_insights_node,
    instagram_actor: InsightsServicePostResponseInstagram_actor,
    instagram_media_id: String,
    instagram_media_owner_id: String,
    instagram_media_type: String,
    like_count: Double,
    organic_instagram_media_id: String,
    save_count: Double,
    shopping_outbound_click_count: Double,
    shopping_product_click_count: Double
  ): InsightsServicePostResponseMedia = {
    val __obj = js.Dynamic.literal(ad_media = ad_media, comment_count = comment_count, creation_time = creation_time, display_url = display_url, has_product_tags = has_product_tags, id = id, image = image, inline_insights_node = inline_insights_node, instagram_actor = instagram_actor, instagram_media_id = instagram_media_id, instagram_media_owner_id = instagram_media_owner_id, instagram_media_type = instagram_media_type, like_count = like_count, organic_instagram_media_id = organic_instagram_media_id, save_count = save_count, shopping_outbound_click_count = shopping_outbound_click_count, shopping_product_click_count = shopping_product_click_count)
  
    __obj.asInstanceOf[InsightsServicePostResponseMedia]
  }
}

