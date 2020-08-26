package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  var followers: Double = js.native
  var following: js.UndefOr[Boolean] = js.native
  var items: js.Array[GalleryItem] = js.native
  var name: String = js.native
  var total_items: Double = js.native
}

object Tag {
  @scala.inline
  def apply(followers: Double, items: js.Array[GalleryItem], name: String, total_items: Double): Tag = {
    val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total_items = total_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setFollowers(value: Double): Self = this.set("followers", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: GalleryItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GalleryItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_items(value: Double): Self = this.set("total_items", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowing(value: Boolean): Self = this.set("following", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowing: Self = this.set("following", js.undefined)
  }
  
}

