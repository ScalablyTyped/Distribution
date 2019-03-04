package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var followers: scala.Double
  var following: js.UndefOr[scala.Boolean] = js.undefined
  var items: js.Array[GalleryItem]
  var name: java.lang.String
  var total_items: scala.Double
}

object Tag {
  @scala.inline
  def apply(
    followers: scala.Double,
    items: js.Array[GalleryItem],
    name: java.lang.String,
    total_items: scala.Double,
    following: js.UndefOr[scala.Boolean] = js.undefined
  ): Tag = {
    val __obj = js.Dynamic.literal(followers = followers, items = items, name = name, total_items = total_items)
    if (!js.isUndefined(following)) __obj.updateDynamic("following")(following)
    __obj.asInstanceOf[Tag]
  }
}

