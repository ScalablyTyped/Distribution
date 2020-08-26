package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetSheetRowCellValidation extends js.Object {
  var allowNulls: js.UndefOr[Boolean] = js.native
  var comparerType: js.UndefOr[String] = js.native
  var dataType: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var messageTemplate: js.UndefOr[String] = js.native
  var showButton: js.UndefOr[Boolean] = js.native
  var titleTemplate: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SpreadsheetSheetRowCellValidation {
  @scala.inline
  def apply(): SpreadsheetSheetRowCellValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRowCellValidation]
  }
  @scala.inline
  implicit class SpreadsheetSheetRowCellValidationOps[Self <: SpreadsheetSheetRowCellValidation] (val x: Self) extends AnyVal {
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
    def setAllowNulls(value: Boolean): Self = this.set("allowNulls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNulls: Self = this.set("allowNulls", js.undefined)
    @scala.inline
    def setComparerType(value: String): Self = this.set("comparerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparerType: Self = this.set("comparerType", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTemplate: Self = this.set("messageTemplate", js.undefined)
    @scala.inline
    def setShowButton(value: Boolean): Self = this.set("showButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowButton: Self = this.set("showButton", js.undefined)
    @scala.inline
    def setTitleTemplate(value: String): Self = this.set("titleTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTemplate: Self = this.set("titleTemplate", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

