package typings.imgurDashRestDashApi.ImgurRestApi

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
    val __obj = js.Dynamic.literal(animated = animated, bandwidth = bandwidth, comment_count = comment_count, datetime = datetime, description = description, downs = downs, favorite = favorite, height = height, id = id, is_album = is_album, link = link, score = score, section = section, size = size, title = title, topic = topic, topic_id = topic_id, ups = ups, views = views, width = width)
    __obj.updateDynamic("type")(`type`)
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url)
    if (deletehash != null) __obj.updateDynamic("deletehash")(deletehash)
    if (gifv != null) __obj.updateDynamic("gifv")(gifv)
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping)
    if (mp4 != null) __obj.updateDynamic("mp4")(mp4)
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    if (webm != null) __obj.updateDynamic("webm")(webm)
    __obj.asInstanceOf[GalleryImage]
  }
}

