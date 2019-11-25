package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryItem extends js.Object {
  var account_id: js.UndefOr[Double] = js.undefined
  var account_url: js.UndefOr[String] = js.undefined
  var comment_count: Double
  var datetime: Double
  var description: String
  var downs: Double
  var favorite: Boolean
  var id: String
  var is_album: Boolean
  var link: String
  var nsfw: js.UndefOr[Boolean] = js.undefined
  var score: Double
  var title: String
  var topic: String
  var topic_id: Double
  var ups: Double
  var views: Double
  var vote: js.UndefOr[String] = js.undefined
}

object GalleryItem {
  @scala.inline
  def apply(
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    title: String,
    topic: String,
    topic_id: Double,
    ups: Double,
    views: Double,
    account_id: Int | Double = null,
    account_url: String = null,
    nsfw: js.UndefOr[Boolean] = js.undefined,
    vote: String = null
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url.asInstanceOf[js.Any])
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw.asInstanceOf[js.Any])
    if (vote != null) __obj.updateDynamic("vote")(vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryItem]
  }
}

