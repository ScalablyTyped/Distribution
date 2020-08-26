package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomGallery extends js.Object {
  var account_url: String = js.native
  var item_count: Double = js.native
  var items: js.Array[GalleryItem] = js.native
  var link: String = js.native
  var tags: js.Array[String] = js.native
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
  @scala.inline
  implicit class CustomGalleryOps[Self <: CustomGallery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount_url(value: String): Self = this.set("account_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_count(value: Double): Self = this.set("item_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: GalleryItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GalleryItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

