package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialogClosingEventUIParam extends js.Object {
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.native
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ModalDialogClosingEventUIParam {
  @scala.inline
  def apply(): ModalDialogClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogClosingEventUIParam]
  }
  @scala.inline
  implicit class ModalDialogClosingEventUIParamOps[Self <: ModalDialogClosingEventUIParam] (val x: Self) extends AnyVal {
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
    def setModalDialogElement(value: String): Self = this.set("modalDialogElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogElement: Self = this.set("modalDialogElement", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

