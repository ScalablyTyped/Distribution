package typings.handsontable

import typings.handsontable.mod.Handsontable.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueCellValue extends js.Object {
  var value: CellValue
}

object AnonValueCellValue {
  @scala.inline
  def apply(value: CellValue): AnonValueCellValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueCellValue]
  }
}

