package typings.handsontable.handsontableMod.Handsontable.mergeCells

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var col: Double
  var colspan: Double
  var row: Double
  var rowspan: Double
}

object Settings {
  @scala.inline
  def apply(col: Double, colspan: Double, row: Double, rowspan: Double): Settings = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], colspan = colspan.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

