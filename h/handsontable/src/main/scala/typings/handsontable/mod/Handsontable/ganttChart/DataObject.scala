package typings.handsontable.mod.Handsontable.ganttChart

import typings.handsontable.anon.Quantity
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  var additionalData: Quantity = js.native
  var endDate: String | Double | Date = js.native
  var startDate: String | Double | Date = js.native
}

object DataObject {
  @scala.inline
  def apply(additionalData: Quantity, endDate: String | Double | Date, startDate: String | Double | Date): DataObject = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
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
    def setAdditionalData(value: Quantity): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: String | Double | Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: String | Double | Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
  }
  
}

