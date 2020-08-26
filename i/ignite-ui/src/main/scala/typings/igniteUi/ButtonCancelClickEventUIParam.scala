package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonCancelClickEventUIParam extends js.Object {
  /**
    * Gets a reference to the igGridModalDialog element.
    */
  var modalDialog: js.UndefOr[String] = js.native
  /**
    * Gets the reference to the igGridModalDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ButtonCancelClickEventUIParam {
  @scala.inline
  def apply(): ButtonCancelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonCancelClickEventUIParam]
  }
  @scala.inline
  implicit class ButtonCancelClickEventUIParamOps[Self <: ButtonCancelClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setModalDialog(value: String): Self = this.set("modalDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialog: Self = this.set("modalDialog", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

