package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialogMovingEventUIParam extends js.Object {
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.native
  /**
    * Gets the original position of the GroupBy Dialog div as { top, left } object, relative to the page.
    */
  var originalPosition: js.UndefOr[js.Any] = js.native
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the current position of the GroupBy Dialog div as { top, left } object, relative to the page.
    */
  var position: js.UndefOr[js.Any] = js.native
}

object ModalDialogMovingEventUIParam {
  @scala.inline
  def apply(): ModalDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogMovingEventUIParam]
  }
  @scala.inline
  implicit class ModalDialogMovingEventUIParamOps[Self <: ModalDialogMovingEventUIParam] (val x: Self) extends AnyVal {
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
    def setOriginalPosition(value: js.Any): Self = this.set("originalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalPosition: Self = this.set("originalPosition", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

