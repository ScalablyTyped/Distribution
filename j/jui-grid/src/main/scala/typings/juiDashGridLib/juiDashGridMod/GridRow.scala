package typings
package juiDashGridLib.juiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRow extends js.Object {
  /** List of child rows. */
  var children: js.Array[_] = js.native
  /** Data of a specified row. */
  var data: js.Array[_] = js.native
  /**
    * The depth of the current row in the case of a tree structure.
    * @default 0
    */
  var depth: scala.Double = js.native
  /** TR element of a specified row. */
  var element: js.Any = js.native
  /** Index of a specified row. In the case of a tree structure, a depth is given. */
  var index: scala.Double | java.lang.String = js.native
  /** List of TD elements of a specified row. */
  var list: js.Array[_] = js.native
  /** Variable that refers to the parent row. */
  var parent: js.UndefOr[GridRow] = js.native
  /** The unique number of a child row under the specified parent row if a parent row exists. */
  var rownum: js.UndefOr[scala.Double] = js.native
  /** Data of a sequence. */
  var seq: scala.Double = js.native
  /**
    * State value that indicates whether a child row is shown or hidden.
    */
  var tpl: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * State value that indicates whether a child row is shown or hidden.
    * @default "fold"
    */
  var `type`: juiDashGridLib.juiDashGridLibStrings.open | juiDashGridLib.juiDashGridLibStrings.fold = js.native
  def appendChild(row: GridRow): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def fold(): scala.Unit = js.native
  def hideCell(index: scala.Double): scala.Unit = js.native
  def insertChild(rownum: scala.Double, row: GridRow): scala.Unit = js.native
  def insertChild(rownum: scala.Double, row: GridRow, isReload: js.Any): scala.Unit = js.native
  def isLeaf(): scala.Boolean = js.native
  def lastChild(): GridRow = js.native
  def lastChildLeaf(lastRow: GridRow): GridRow | js.Any = js.native
  def open(): scala.Unit = js.native
  def reload(columns: js.Array[GridColumn], seq: js.Any, xssFilter: js.Any): scala.Unit = js.native
  def removeChild(index: java.lang.String): scala.Unit = js.native
  def removeChild(index: scala.Double): scala.Unit = js.native
  def setIndex(rownum: java.lang.String): scala.Unit = js.native
  def setIndex(rownum: scala.Double): scala.Unit = js.native
  def showCell(index: scala.Double): scala.Unit = js.native
}

