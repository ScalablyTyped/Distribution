package typings.imgurDashRestDashApi.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var followers: Double
  var following: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[GalleryItem]
  var name: String
  var total_items: Double
}

object Tag {
  @scala.inline
  def apply(
    followers: Double,
    items: js.Array[GalleryItem],
    name: String,
    total_items: Double,
    following: js.UndefOr[Boolean] = js.undefined
  ): Tag = {
    val __obj = js.Dynamic.literal(followers = followers, items = items, name = name, total_items = total_items)
    if (!js.isUndefined(following)) __obj.updateDynamic("following")(following)
    __obj.asInstanceOf[Tag]
  }
}

