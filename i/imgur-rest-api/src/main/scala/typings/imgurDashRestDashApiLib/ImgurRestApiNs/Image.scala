package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var account_id: js.UndefOr[scala.Double] = js.undefined
  var account_url: js.UndefOr[java.lang.String] = js.undefined
  var animated: scala.Boolean
  var bandwidth: scala.Double
  var datetime: scala.Double
  var deletehash: js.UndefOr[java.lang.String] = js.undefined
  var description: java.lang.String
  var favorite: scala.Boolean
  var gifv: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var id: java.lang.String
  var link: java.lang.String
  var looping: js.UndefOr[scala.Boolean] = js.undefined
  var mp4: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nsfw: js.UndefOr[scala.Boolean] = js.undefined
  var section: java.lang.String
  var size: scala.Double
  var title: java.lang.String
  var `type`: java.lang.String
  var views: scala.Double
  var vote: js.UndefOr[java.lang.String] = js.undefined
  var webm: js.UndefOr[java.lang.String] = js.undefined
  var width: scala.Double
}

object Image {
  @scala.inline
  def apply(
    animated: scala.Boolean,
    bandwidth: scala.Double,
    datetime: scala.Double,
    description: java.lang.String,
    favorite: scala.Boolean,
    height: scala.Double,
    id: java.lang.String,
    link: java.lang.String,
    section: java.lang.String,
    size: scala.Double,
    title: java.lang.String,
    `type`: java.lang.String,
    views: scala.Double,
    width: scala.Double,
    account_id: scala.Int | scala.Double = null,
    account_url: java.lang.String = null,
    deletehash: java.lang.String = null,
    gifv: java.lang.String = null,
    looping: js.UndefOr[scala.Boolean] = js.undefined,
    mp4: java.lang.String = null,
    name: java.lang.String = null,
    nsfw: js.UndefOr[scala.Boolean] = js.undefined,
    vote: java.lang.String = null,
    webm: java.lang.String = null
  ): Image = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("animated")(animated)
    __obj.updateDynamic("bandwidth")(bandwidth)
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("favorite")(favorite)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("section")(section)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("views")(views)
    __obj.updateDynamic("width")(width)
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

