package typings
package handsontableLib.handsontableMod.HandsontableNs.mergeCellsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var col: scala.Double
  var colspan: scala.Double
  var row: scala.Double
  var rowspan: scala.Double
}

object Settings {
  @scala.inline
  def apply(col: scala.Double, colspan: scala.Double, row: scala.Double, rowspan: scala.Double): Settings = {
    val __obj = js.Dynamic.literal(col = col, colspan = colspan, row = row, rowspan = rowspan)
  
    __obj.asInstanceOf[Settings]
  }
}

