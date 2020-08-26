package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditModeEnteringEventUIParam extends js.Object {
  /**
    * Gets the cell for which the control is going into edit mode.
    */
  var cell: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object EditModeEnteringEventUIParam {
  @scala.inline
  def apply(): EditModeEnteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeEnteringEventUIParam]
  }
  @scala.inline
  implicit class EditModeEnteringEventUIParamOps[Self <: EditModeEnteringEventUIParam] (val x: Self) extends AnyVal {
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
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

