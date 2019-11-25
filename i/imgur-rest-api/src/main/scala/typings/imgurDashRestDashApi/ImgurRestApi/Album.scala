package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Album extends js.Object {
  var account_id: js.UndefOr[Double] = js.undefined
  var account_url: js.UndefOr[String] = js.undefined
  var cover: String
  var cover_height: Double
  var cover_width: Double
  var datetime: Double
  var deletehash: js.UndefOr[String] = js.undefined
  var description: String
  var favorite: Boolean
  var id: String
  var images: js.Array[Image]
  var images_count: Double
  var layout: String
  var link: String
  var nsfw: js.UndefOr[Boolean] = js.undefined
  var order: Double
  var privacy: String
  var section: String
  var title: String
  var views: Double
}

object Album {
  @scala.inline
  def apply(
    cover: String,
    cover_height: Double,
    cover_width: Double,
    datetime: Double,
    description: String,
    favorite: Boolean,
    id: String,
    images: js.Array[Image],
    images_count: Double,
    layout: String,
    link: String,
    order: Double,
    privacy: String,
    section: String,
    title: String,
    views: Double,
    account_id: Int | Double = null,
    account_url: String = null,
    deletehash: String = null,
    nsfw: js.UndefOr[Boolean] = js.undefined
  ): Album = {
    val __obj = js.Dynamic.literal(cover = cover.asInstanceOf[js.Any], cover_height = cover_height.asInstanceOf[js.Any], cover_width = cover_width.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], images_count = images_count.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url.asInstanceOf[js.Any])
    if (deletehash != null) __obj.updateDynamic("deletehash")(deletehash.asInstanceOf[js.Any])
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
}

