package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownTreeMessages extends js.Object {
  var clear: js.UndefOr[String] = js.native
  var deleteTag: js.UndefOr[String] = js.native
  var singleTag: js.UndefOr[String] = js.native
}

object DropDownTreeMessages {
  @scala.inline
  def apply(): DropDownTreeMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeMessages]
  }
  @scala.inline
  implicit class DropDownTreeMessagesOps[Self <: DropDownTreeMessages] (val x: Self) extends AnyVal {
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
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setDeleteTag(value: String): Self = this.set("deleteTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTag: Self = this.set("deleteTag", js.undefined)
    @scala.inline
    def setSingleTag(value: String): Self = this.set("singleTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleTag: Self = this.set("singleTag", js.undefined)
  }
  
}

