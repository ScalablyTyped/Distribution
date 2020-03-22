package typings.handsontable.mod.Handsontable.ganttChart

import typings.handsontable.AnonQuantity
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var additionalData: AnonQuantity
  var endDate: String | Double | Date
  var startDate: String | Double | Date
}

object DataObject {
  @scala.inline
  def apply(additionalData: AnonQuantity, endDate: String | Double | Date, startDate: String | Double | Date): DataObject = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataObject]
  }
}

