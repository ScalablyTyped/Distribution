package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiddenColumns extends Base {
  var hiddenColumns: Boolean | js.Array[_] = js.native
  var lastSelectedColumn: Double = js.native
  var settings: js.Object | Unit = js.native
  def hideColumn(column: Double): Unit = js.native
  def hideColumns(columns: js.Array[_]): Unit = js.native
  def isHidden(column: Double): Boolean = js.native
  def isHidden(column: Double, isLogicIndex: Boolean): Boolean = js.native
  def showColumn(column: Double): Unit = js.native
  def showColumns(columns: js.Array[_]): Unit = js.native
}

