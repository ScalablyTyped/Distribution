package typings
package handsontableLib.handsontableMod.HandsontableNs.collapsibleColumnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var col: scala.Double
  var collapsible: scala.Boolean
  var row: scala.Double
}

object Settings {
  @scala.inline
  def apply(col: scala.Double, collapsible: scala.Boolean, row: scala.Double): Settings = {
    val __obj = js.Dynamic.literal(col = col, collapsible = collapsible, row = row)
  
    __obj.asInstanceOf[Settings]
  }
}

