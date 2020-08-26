package typings.intercomClient.tagMod

import typings.intercomClient.anon.Next
import typings.intercomClient.intercomClientStrings.tagDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List extends js.Object {
  var pages: Next = js.native
  var tags: js.Array[Tag] = js.native
  var total_count: Double = js.native
  var `type`: tagDotlist = js.native
}

object List {
  @scala.inline
  def apply(pages: Next, tags: js.Array[Tag], total_count: Double, `type`: tagDotlist): List = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setPages(value: Next): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: tagDotlist): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

