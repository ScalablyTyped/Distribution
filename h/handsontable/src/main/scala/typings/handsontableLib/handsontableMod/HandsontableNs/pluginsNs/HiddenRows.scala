package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiddenRows extends Base {
  var hiddenRows: scala.Boolean | js.Array[_] = js.native
  var lastSelectedRow: scala.Double = js.native
  var settings: js.Object | scala.Unit = js.native
  def hideRow(row: scala.Double): scala.Unit = js.native
  def hideRows(rows: js.Array[_]): scala.Unit = js.native
  def isHidden(row: scala.Double): scala.Boolean = js.native
  def isHidden(row: scala.Double, isLogicIndex: scala.Boolean): scala.Boolean = js.native
  def showRow(row: scala.Double): scala.Unit = js.native
  def showRows(rows: js.Array[_]): scala.Unit = js.native
}

