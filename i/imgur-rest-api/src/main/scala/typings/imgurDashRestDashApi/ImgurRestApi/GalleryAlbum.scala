package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryAlbum extends GalleryItem {
  var cover: String
  var cover_height: Double
  var cover_width: Double
  var images: js.Array[Image]
  var images_count: Double
  var layout: String
  var privacy: String
}

object GalleryAlbum {
  @scala.inline
  def apply(
    comment_count: Double,
    cover: String,
    cover_height: Double,
    cover_width: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    images: js.Array[Image],
    images_count: Double,
    is_album: Boolean,
    layout: String,
    link: String,
    privacy: String,
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
  ): GalleryAlbum = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], cover_height = cover_height.asInstanceOf[js.Any], cover_width = cover_width.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], images_count = images_count.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url.asInstanceOf[js.Any])
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw.asInstanceOf[js.Any])
    if (vote != null) __obj.updateDynamic("vote")(vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryAlbum]
  }
}

