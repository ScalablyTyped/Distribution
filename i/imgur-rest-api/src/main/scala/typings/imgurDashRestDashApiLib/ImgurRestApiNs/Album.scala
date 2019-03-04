package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Album extends js.Object {
  var account_id: js.UndefOr[scala.Double] = js.undefined
  var account_url: js.UndefOr[java.lang.String] = js.undefined
  var cover: java.lang.String
  var cover_height: scala.Double
  var cover_width: scala.Double
  var datetime: scala.Double
  var deletehash: js.UndefOr[java.lang.String] = js.undefined
  var description: java.lang.String
  var favorite: scala.Boolean
  var id: java.lang.String
  var images: js.Array[Image]
  var images_count: scala.Double
  var layout: java.lang.String
  var link: java.lang.String
  var nsfw: js.UndefOr[scala.Boolean] = js.undefined
  var order: scala.Double
  var privacy: java.lang.String
  var section: java.lang.String
  var title: java.lang.String
  var views: scala.Double
}

object Album {
  @scala.inline
  def apply(
    cover: java.lang.String,
    cover_height: scala.Double,
    cover_width: scala.Double,
    datetime: scala.Double,
    description: java.lang.String,
    favorite: scala.Boolean,
    id: java.lang.String,
    images: js.Array[Image],
    images_count: scala.Double,
    layout: java.lang.String,
    link: java.lang.String,
    order: scala.Double,
    privacy: java.lang.String,
    section: java.lang.String,
    title: java.lang.String,
    views: scala.Double,
    account_id: scala.Int | scala.Double = null,
    account_url: java.lang.String = null,
    deletehash: java.lang.String = null,
    nsfw: js.UndefOr[scala.Boolean] = js.undefined
  ): Album = {
    val __obj = js.Dynamic.literal(cover = cover, cover_height = cover_height, cover_width = cover_width, datetime = datetime, description = description, favorite = favorite, id = id, images = images, images_count = images_count, layout = layout, link = link, order = order, privacy = privacy, section = section, title = title, views = views)
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url)
    if (deletehash != null) __obj.updateDynamic("deletehash")(deletehash)
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw)
    __obj.asInstanceOf[Album]
  }
}

