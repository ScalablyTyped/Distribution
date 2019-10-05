package typings.handsontable.handsontableMod.Handsontable.ganttChart

import typings.handsontable.Anon_LabelQuantity
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var additionalData: Anon_LabelQuantity
  var endDate: String | Double | Date
  var startDate: String | Double | Date
}

object DataObject {
  @scala.inline
  def apply(
    additionalData: Anon_LabelQuantity,
    endDate: String | Double | Date,
    startDate: String | Double | Date
  ): DataObject = {
    val __obj = js.Dynamic.literal(additionalData = additionalData, endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataObject]
  }
}

