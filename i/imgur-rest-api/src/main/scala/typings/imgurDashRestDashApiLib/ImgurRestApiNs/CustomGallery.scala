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
    val __obj = js.Dynamic.literal(account_url = account_url, item_count = item_count, items = items, link = link, tags = tags)
  
    __obj.asInstanceOf[CustomGallery]
  }
}

