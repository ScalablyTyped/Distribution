package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryImage extends GalleryItem {
  var animated: Boolean
  var bandwidth: Double
  var deletehash: js.UndefOr[String] = js.undefined
  var gifv: js.UndefOr[String] = js.undefined
  var height: Double
  var looping: js.UndefOr[Boolean] = js.undefined
  var mp4: js.UndefOr[String] = js.undefined
  var section: String
  var size: Double
  var `type`: String
  var webm: js.UndefOr[String] = js.undefined
  var width: Double
}

object GalleryImage {
  @scala.inline
  def apply(
    animated: Boolean,
    bandwidth: Double,
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    height: Double,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    section: String,
    size: Double,
    title: String,
    topic: String,
    topic_id: Double,
    `type`: String,
    ups: Double,
    views: Double,
    width: Double,
    account_id: Int | Double = null,
    account_url: String = null,
    deletehash: String = null,
    gifv: String = null,
    looping: js.UndefOr[Boolean] = js.undefined,
    mp4: String = null,
    nsfw: js.UndefOr[Boolean] = js.undefined,
    vote: String = null,
    webm: String = null
  ): GalleryImage = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url.asInstanceOf[js.Any])
    if (deletehash != null) __obj.updateDynamic("deletehash")(deletehash.asInstanceOf[js.Any])
    if (gifv != null) __obj.updateDynamic("gifv")(gifv.asInstanceOf[js.Any])
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    if (mp4 != null) __obj.updateDynamic("mp4")(mp4.asInstanceOf[js.Any])
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw.asInstanceOf[js.Any])
    if (vote != null) __obj.updateDynamic("vote")(vote.asInstanceOf[js.Any])
    if (webm != null) __obj.updateDynamic("webm")(webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryImage]
  }
}

