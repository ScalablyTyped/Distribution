package typings.ltijs.gradeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradeFilters extends js.Object {
  var limit: js.UndefOr[Double] = js.native
  var resourceLinkId: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[Boolean] = js.native
  var userId: js.UndefOr[Boolean] = js.native
}

object GradeFilters {
  @scala.inline
  def apply(): GradeFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradeFilters]
  }
  @scala.inline
  implicit class GradeFiltersOps[Self <: GradeFilters] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setResourceLinkId(value: Boolean): Self = this.set("resourceLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceLinkId: Self = this.set("resourceLinkId", js.undefined)
    @scala.inline
    def setTag(value: Boolean): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setUserId(value: Boolean): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

