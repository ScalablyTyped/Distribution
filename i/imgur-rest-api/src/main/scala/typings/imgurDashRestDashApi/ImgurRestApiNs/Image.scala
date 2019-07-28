package typings.imgurDashRestDashApi.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var account_id: js.UndefOr[Double] = js.undefined
  var account_url: js.UndefOr[String] = js.undefined
  var animated: Boolean
  var bandwidth: Double
  var datetime: Double
  var deletehash: js.UndefOr[String] = js.undefined
  var description: String
  var favorite: Boolean
  var gifv: js.UndefOr[String] = js.undefined
  var height: Double
  var id: String
  var link: String
  var looping: js.UndefOr[Boolean] = js.undefined
  var mp4: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nsfw: js.UndefOr[Boolean] = js.undefined
  var section: String
  var size: Double
  var title: String
  var `type`: String
  var views: Double
  var vote: js.UndefOr[String] = js.undefined
  var webm: js.UndefOr[String] = js.undefined
  var width: Double
}

object Image {
  @scala.inline
  def apply(
    animated: Boolean,
    bandwidth: Double,
    datetime: Double,
    description: String,
    favorite: Boolean,
    height: Double,
    id: String,
    link: String,
    section: String,
    size: Double,
    title: String,
    `type`: String,
    views: Double,
    width: Double,
    account_id: Int | Double = null,
    account_url: String = null,
    deletehash: String = null,
    gifv: String = null,
    looping: js.UndefOr[Boolean] = js.undefined,
    mp4: String = null,
    name: String = null,
    nsfw: js.UndefOr[Boolean] = js.undefined,
    vote: String = null,
    webm: String = null
  ): Image = {
    val __obj = js.Dynamic.literal(animated = animated, bandwidth = bandwidth, datetime = datetime, description = description, favorite = favorite, height = height, id = id, link = link, section = section, size = size, title = title, views = views, width = width)
    __obj.updateDynamic("type")(`type`)
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url)
    if (deletehash != null) __obj.updateDynamic("deletehash")(deletehash)
    if (gifv != null) __obj.updateDynamic("gifv")(gifv)
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping)
    if (mp4 != null) __obj.updateDynamic("mp4")(mp4)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    if (webm != null) __obj.updateDynamic("webm")(webm)
    __obj.asInstanceOf[Image]
  }
}

