package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerMessagesDialogsDeleteConfirm extends js.Object {
  var cancel: js.UndefOr[String] = js.native
  var close: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var okText: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object FileManagerMessagesDialogsDeleteConfirm {
  @scala.inline
  def apply(): FileManagerMessagesDialogsDeleteConfirm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesDialogsDeleteConfirm]
  }
  @scala.inline
  implicit class FileManagerMessagesDialogsDeleteConfirmOps[Self <: FileManagerMessagesDialogsDeleteConfirm] (val x: Self) extends AnyVal {
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

