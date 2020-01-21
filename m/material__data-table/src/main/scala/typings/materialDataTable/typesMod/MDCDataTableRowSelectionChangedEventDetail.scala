package typings.materialDataTable.typesMod

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
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCDataTableRowSelectionChangedEventDetail]
  }
}

