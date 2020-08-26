package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetSheetFilterColumn extends js.Object {
  var criteria: js.UndefOr[js.Array[SpreadsheetSheetFilterColumnCriteriaItem]] = js.native
  var filter: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  var logic: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double | String | Date] = js.native
  var values: js.UndefOr[js.Any] = js.native
}

object SpreadsheetSheetFilterColumn {
  @scala.inline
  def apply(): SpreadsheetSheetFilterColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetFilterColumn]
  }
  @scala.inline
  implicit class SpreadsheetSheetFilterColumnOps[Self <: SpreadsheetSheetFilterColumn] (val x: Self) extends AnyVal {
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
    def setCriteriaVarargs(value: SpreadsheetSheetFilterColumnCriteriaItem*): Self = this.set("criteria", js.Array(value :_*))
    @scala.inline
    def setCriteria(value: js.Array[SpreadsheetSheetFilterColumnCriteriaItem]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLogic(value: String): Self = this.set("logic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogic: Self = this.set("logic", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double | String | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

