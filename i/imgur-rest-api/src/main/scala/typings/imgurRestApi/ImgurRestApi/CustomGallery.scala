package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomGallery extends js.Object {
  var account_url: String
  var item_count: Double
  var items: js.Array[GalleryItem]
  var link: String
  var tags: js.Array[String]
}

object CustomGallery {
  @scala.inline
  def apply(
    account_url: String,
    item_count: Double,
    items: js.Array[GalleryItem],
    link: String,
    tags: js.Array[String]
  ): CustomGallery = {
    val __obj = js.Dynamic.literal(account_url = account_url.asInstanceOf[js.Any], item_count = item_count.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomGallery]
  }
}

