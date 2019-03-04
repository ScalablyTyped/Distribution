package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryAlbum extends GalleryItem {
  var cover: java.lang.String
  var cover_height: scala.Double
  var cover_width: scala.Double
  var images: js.Array[Image]
  var images_count: scala.Double
  var layout: java.lang.String
  var privacy: java.lang.String
}

object GalleryAlbum {
  @scala.inline
  def apply(
    comment_count: scala.Double,
    cover: java.lang.String,
    cover_height: scala.Double,
    cover_width: scala.Double,
    datetime: scala.Double,
    description: java.lang.String,
    downs: scala.Double,
    favorite: scala.Boolean,
    id: java.lang.String,
    images: js.Array[Image],
    images_count: scala.Double,
    is_album: scala.Boolean,
    layout: java.lang.String,
    link: java.lang.String,
    privacy: java.lang.String,
    score: scala.Double,
    title: java.lang.String,
    topic: java.lang.String,
    topic_id: scala.Double,
    ups: scala.Double,
    views: scala.Double,
    account_id: scala.Int | scala.Double = null,
    account_url: java.lang.String = null,
    nsfw: js.UndefOr[scala.Boolean] = js.undefined,
    vote: java.lang.String = null
  ): GalleryAlbum = {
    val __obj = js.Dynamic.literal(comment_count = comment_count, cover = cover, cover_height = cover_height, cover_width = cover_width, datetime = datetime, description = description, downs = downs, favorite = favorite, id = id, images = images, images_count = images_count, is_album = is_album, layout = layout, link = link, privacy = privacy, score = score, title = title, topic = topic, topic_id = topic_id, ups = ups, views = views)
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url)
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[GalleryAlbum]
  }
}

