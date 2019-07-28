package typings.imgurDashRestDashApi.ImgurRestApiNs

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
    val __obj = js.Dynamic.literal(comment_count = comment_count, cover = cover, cover_height = cover_height, cover_width = cover_width, datetime = datetime, description = description, downs = downs, favorite = favorite, id = id, images = images, images_count = images_count, is_album = is_album, layout = layout, link = link, privacy = privacy, score = score, title = title, topic = topic, topic_id = topic_id, ups = ups, views = views)
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url)
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[GalleryAlbum]
  }
}

