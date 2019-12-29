package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var col: Double
  var data: CellValue
  var row: Double
}

object SearchResult {
  @scala.inline
  def apply(col: Double, data: CellValue, row: Double): SearchResult = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

