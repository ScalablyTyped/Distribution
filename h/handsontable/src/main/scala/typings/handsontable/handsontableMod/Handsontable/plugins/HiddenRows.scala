package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiddenRows extends BasePlugin {
  var hiddenRows: Boolean | js.Array[_] = js.native
  var lastSelectedRow: Double = js.native
  var settings: js.Object | Unit = js.native
  def hideRow(row: Double): Unit = js.native
  def hideRows(rows: js.Array[_]): Unit = js.native
  def isHidden(row: Double): Boolean = js.native
  def isHidden(row: Double, isLogicIndex: Boolean): Boolean = js.native
  def showRow(row: Double): Unit = js.native
  def showRows(rows: js.Array[_]): Unit = js.native
}

