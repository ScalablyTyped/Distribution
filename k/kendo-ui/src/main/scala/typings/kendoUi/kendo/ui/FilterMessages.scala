package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterMessages extends js.Object {
  var and: js.UndefOr[String] = js.native
  @JSName("apply")
  var apply: js.UndefOr[String] = js.native
  var or: js.UndefOr[String] = js.native
}

object FilterMessages {
  @scala.inline
  def apply(): FilterMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMessages]
  }
  @scala.inline
  implicit class FilterMessagesOps[Self <: FilterMessages] (val x: Self) extends AnyVal {
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
    def setAnd(value: String): Self = this.set("and", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
    @scala.inline
    def setApply(value: String): Self = this.set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setOr(value: String): Self = this.set("or", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
  }
  
}

