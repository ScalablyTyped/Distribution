package typings.handsontable.handsontableMod.HandsontableNs.mergeCellsNs

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
    val __obj = js.Dynamic.literal(col = col, colspan = colspan, row = row, rowspan = rowspan)
  
    __obj.asInstanceOf[Settings]
  }
}

