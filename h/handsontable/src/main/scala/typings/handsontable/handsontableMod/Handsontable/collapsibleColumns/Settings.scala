package typings.handsontable.handsontableMod.Handsontable.collapsibleColumns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var col: Double
  var collapsible: Boolean
  var row: Double
}

object Settings {
  @scala.inline
  def apply(col: Double, collapsible: Boolean, row: Double): Settings = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

