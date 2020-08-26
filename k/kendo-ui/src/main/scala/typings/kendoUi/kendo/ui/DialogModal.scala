package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogModal extends js.Object {
  var preventScroll: js.UndefOr[String] = js.native
}

object DialogModal {
  @scala.inline
  def apply(): DialogModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogModal]
  }
  @scala.inline
  implicit class DialogModalOps[Self <: DialogModal] (val x: Self) extends AnyVal {
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
    def setPreventScroll(value: String): Self = this.set("preventScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventScroll: Self = this.set("preventScroll", js.undefined)
  }
  
}

