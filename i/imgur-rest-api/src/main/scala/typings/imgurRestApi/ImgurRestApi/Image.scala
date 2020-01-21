package typings.imgurRestApi.ImgurRestApi

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
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url.asInstanceOf[js.Any])
    if (deletehash != null) __obj.updateDynamic("deletehash")(deletehash.asInstanceOf[js.Any])
    if (gifv != null) __obj.updateDynamic("gifv")(gifv.asInstanceOf[js.Any])
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    if (mp4 != null) __obj.updateDynamic("mp4")(mp4.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw.asInstanceOf[js.Any])
    if (vote != null) __obj.updateDynamic("vote")(vote.asInstanceOf[js.Any])
    if (webm != null) __obj.updateDynamic("webm")(webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

