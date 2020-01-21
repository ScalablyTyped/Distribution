package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeType extends js.Object {
  var endCol: Double
  var endRow: Double
  var startCol: Double
  var startRow: Double
}

object RangeType {
  @scala.inline
  def apply(endCol: Double, endRow: Double, startCol: Double, startRow: Double): RangeType = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeType]
  }
}

