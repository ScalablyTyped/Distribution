package typings.atMaterialDataDashTable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCDataTableRowSelectionChangedEventDetail extends js.Object {
  var rowId: String | Null
  var rowIndex: Double
  var selected: Boolean
}

object MDCDataTableRowSelectionChangedEventDetail {
  @scala.inline
  def apply(rowIndex: Double, selected: Boolean, rowId: String = null): MDCDataTableRowSelectionChangedEventDetail = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex, selected = selected)
    if (rowId != null) __obj.updateDynamic("rowId")(rowId)
    __obj.asInstanceOf[MDCDataTableRowSelectionChangedEventDetail]
  }
}

