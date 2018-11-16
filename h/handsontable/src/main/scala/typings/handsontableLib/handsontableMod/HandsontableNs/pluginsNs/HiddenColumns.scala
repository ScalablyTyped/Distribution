package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiddenColumns extends Base {
  var hiddenColumns: scala.Boolean | js.Array[_] = js.native
  var lastSelectedColumn: scala.Double = js.native
  var settings: js.Object | scala.Unit = js.native
  def hideColumn(column: scala.Double): scala.Unit = js.native
  def hideColumns(columns: js.Array[_]): scala.Unit = js.native
  def isHidden(column: scala.Double): scala.Boolean = js.native
  def isHidden(column: scala.Double, isLogicIndex: scala.Boolean): scala.Boolean = js.native
  def showColumn(column: scala.Double): scala.Unit = js.native
  def showColumns(columns: js.Array[_]): scala.Unit = js.native
}

