package typings
package handsontableLib.handsontableMod.HandsontableNs.ganttChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var additionalData: handsontableLib.Anon_LabelQuantity
  var endDate: java.lang.String | scala.Double | stdLib.Date
  var startDate: java.lang.String | scala.Double | stdLib.Date
}

object DataObject {
  @scala.inline
  def apply(
    additionalData: handsontableLib.Anon_LabelQuantity,
    endDate: java.lang.String | scala.Double | stdLib.Date,
    startDate: java.lang.String | scala.Double | stdLib.Date
  ): DataObject = {
    val __obj = js.Dynamic.literal(additionalData = additionalData, endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataObject]
  }
}

