package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditModeValidationErrorEventUIParam extends js.Object {
  /**
    * Get or set the [action](ig.spreadsheet.SpreadsheetEditModeValidationErrorAction)  to take in response to the failed validation.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Get a boolean indicating whether the cell is allowed to stay in edit mode.
    */
  var canStayInEditMode: js.UndefOr[Boolean] = js.native
  /**
    * Gets the cell for which the control is in edit mode.
    */
  var cell: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Get the [rule](ig.excel.DataValidationRule) which failed validation.
    */
  var validationRule: js.UndefOr[String] = js.native
}

object EditModeValidationErrorEventUIParam {
  @scala.inline
  def apply(): EditModeValidationErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeValidationErrorEventUIParam]
  }
  @scala.inline
  implicit class EditModeValidationErrorEventUIParamOps[Self <: EditModeValidationErrorEventUIParam] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setCanStayInEditMode(value: Boolean): Self = this.set("canStayInEditMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanStayInEditMode: Self = this.set("canStayInEditMode", js.undefined)
    @scala.inline
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setValidationRule(value: String): Self = this.set("validationRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRule: Self = this.set("validationRule", js.undefined)
  }
  
}

