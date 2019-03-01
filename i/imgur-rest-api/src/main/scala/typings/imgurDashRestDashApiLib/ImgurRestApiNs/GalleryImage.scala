package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryImage extends GalleryItem {
  var animated: scala.Boolean
  var bandwidth: scala.Double
  var deletehash: js.UndefOr[java.lang.String] = js.undefined
  var gifv: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var looping: js.UndefOr[scala.Boolean] = js.undefined
  var mp4: js.UndefOr[java.lang.String] = js.undefined
  var section: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  var webm: js.UndefOr[java.lang.String] = js.undefined
  var width: scala.Double
}

object GalleryImage {
  @scala.inline
  def apply(
    animated: scala.Boolean,
    bandwidth: scala.Double,
    comment_count: scala.Double,
    datetime: scala.Double,
    description: java.lang.String,
    downs: scala.Double,
    favorite: scala.Boolean,
    height: scala.Double,
    id: java.lang.String,
    is_album: scala.Boolean,
    link: java.lang.String,
    score: scala.Double,
    section: java.lang.String,
    size: scala.Double,
    title: java.lang.String,
    topic: java.lang.String,
    topic_id: scala.Double,
    `type`: java.lang.String,
    ups: scala.Double,
    views: scala.Double,
    width: scala.Double,
    account_id: scala.Int | scala.Double = null,
    account_url: java.lang.String = null,
    deletehash: java.lang.String = null,
    gifv: java.lang.String = null,
    looping: js.UndefOr[scala.Boolean] = js.undefined,
    mp4: java.lang.String = null,
    nsfw: js.UndefOr[scala.Boolean] = js.undefined,
    vote: java.lang.String = null,
    webm: java.lang.String = null
  ): GalleryImage = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("animated")(animated)
    __obj.updateDynamic("bandwidth")(bandwidth)
    __obj.updateDynamic("comment_count")(comment_count)
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("downs")(downs)
    __obj.updateDynamic("favorite")(favorite)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("is_album")(is_album)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("score")(score)
    __obj.updateDynamic("section")(section)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("topic")(topic)
    __obj.updateDynamic("topic_id")(topic_id)
    __obj.updateDynamic("ups")(ups)
    __obj.updateDynamic("views")(views)
    __obj.updateDynamic("width")(width)
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

