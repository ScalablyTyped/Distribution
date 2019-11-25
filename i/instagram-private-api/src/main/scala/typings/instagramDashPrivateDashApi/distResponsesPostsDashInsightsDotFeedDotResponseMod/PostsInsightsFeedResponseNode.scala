package typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod

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
  var inline_insights_node: js.UndefOr[PostsInsightsFeedResponseInline_insights_node] = js.undefined
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
    comment_count: Int | Double = null,
    creation_time: Int | Double = null,
    engagement: Int | Double = null,
    id: String = null,
    image: PostsInsightsFeedResponseImage = null,
    inline_insights_node: PostsInsightsFeedResponseInline_insights_node = null,
    instagram_media_id: String = null,
    instagram_media_type: String = null,
    like_count: Int | Double = null,
    name: String = null,
    save_count: Int | Double = null,
    shopping_outbound_click_count: Int | Double = null,
    shopping_product_click_count: Int | Double = null,
    value: Int | Double = null,
    video_view_count: Null = null
  ): PostsInsightsFeedResponseNode = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    if (comment_count != null) __obj.updateDynamic("comment_count")(comment_count.asInstanceOf[js.Any])
    if (creation_time != null) __obj.updateDynamic("creation_time")(creation_time.asInstanceOf[js.Any])
    if (engagement != null) __obj.updateDynamic("engagement")(engagement.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (inline_insights_node != null) __obj.updateDynamic("inline_insights_node")(inline_insights_node.asInstanceOf[js.Any])
    if (instagram_media_id != null) __obj.updateDynamic("instagram_media_id")(instagram_media_id.asInstanceOf[js.Any])
    if (instagram_media_type != null) __obj.updateDynamic("instagram_media_type")(instagram_media_type.asInstanceOf[js.Any])
    if (like_count != null) __obj.updateDynamic("like_count")(like_count.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (save_count != null) __obj.updateDynamic("save_count")(save_count.asInstanceOf[js.Any])
    if (shopping_outbound_click_count != null) __obj.updateDynamic("shopping_outbound_click_count")(shopping_outbound_click_count.asInstanceOf[js.Any])
    if (shopping_product_click_count != null) __obj.updateDynamic("shopping_product_click_count")(shopping_product_click_count.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (video_view_count != null) __obj.updateDynamic("video_view_count")(video_view_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseNode]
  }
}

