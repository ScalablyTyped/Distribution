package typings.handsontable.anon

import typings.handsontable.mod.Handsontable.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueCellValue extends js.Object {
  var value: CellValue
}

object ValueCellValue {
  @scala.inline
  def apply(value: CellValue): ValueCellValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCellValue]
  }
}

