package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveWhereFilters extends js.Object {
  var removeWhereFilters: js.UndefOr[Boolean] = js.native
}

object RemoveWhereFilters {
  @scala.inline
  def apply(): RemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveWhereFilters]
  }
  @scala.inline
  implicit class RemoveWhereFiltersOps[Self <: RemoveWhereFilters] (val x: Self) extends AnyVal {
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
    def setRemoveWhereFilters(value: Boolean): Self = this.set("removeWhereFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveWhereFilters: Self = this.set("removeWhereFilters", js.undefined)
  }
  
}

