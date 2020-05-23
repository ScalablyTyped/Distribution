package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseNode extends js.Object {
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
  @scala.inline
  def apply(
    __typename: String,
    comment_count: js.UndefOr[Double] = js.undefined,
    creation_time: js.UndefOr[Double] = js.undefined,
    engagement: js.UndefOr[Double] = js.undefined,
    id: String = null,
    image: PostsInsightsFeedResponseImage = null,
    inline_insights_node: PostsInsightsFeedResponseInlineInsightsNode = null,
    instagram_media_id: String = null,
    instagram_media_type: String = null,
    like_count: js.UndefOr[Double] = js.undefined,
    name: String = null,
    save_count: js.UndefOr[Double] = js.undefined,
    shopping_outbound_click_count: js.UndefOr[Double] = js.undefined,
    shopping_product_click_count: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): PostsInsightsFeedResponseNode = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_count)) __obj.updateDynamic("comment_count")(comment_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creation_time)) __obj.updateDynamic("creation_time")(creation_time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(engagement)) __obj.updateDynamic("engagement")(engagement.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (inline_insights_node != null) __obj.updateDynamic("inline_insights_node")(inline_insights_node.asInstanceOf[js.Any])
    if (instagram_media_id != null) __obj.updateDynamic("instagram_media_id")(instagram_media_id.asInstanceOf[js.Any])
    if (instagram_media_type != null) __obj.updateDynamic("instagram_media_type")(instagram_media_type.asInstanceOf[js.Any])
    if (!js.isUndefined(like_count)) __obj.updateDynamic("like_count")(like_count.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(save_count)) __obj.updateDynamic("save_count")(save_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shopping_outbound_click_count)) __obj.updateDynamic("shopping_outbound_click_count")(shopping_outbound_click_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shopping_product_click_count)) __obj.updateDynamic("shopping_product_click_count")(shopping_product_click_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseNode]
  }
}

