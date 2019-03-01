package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomGallery extends js.Object {
  var account_url: java.lang.String
  var item_count: scala.Double
  var items: js.Array[GalleryItem]
  var link: java.lang.String
  var tags: js.Array[java.lang.String]
}

object CustomGallery {
  @scala.inline
  def apply(
    account_url: java.lang.String,
    item_count: scala.Double,
    items: js.Array[GalleryItem],
    link: java.lang.String,
    tags: js.Array[java.lang.String]
  ): CustomGallery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_url")(account_url)
    __obj.updateDynamic("item_count")(item_count)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CustomGallery]
  }
}

