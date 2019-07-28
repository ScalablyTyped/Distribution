package typings.juiDashGrid.juiDashGridMod

import typings.juiDashGrid.juiDashGridStrings.fold
import typings.juiDashGrid.juiDashGridStrings.open
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
  var depth: Double = js.native
  /** TR element of a specified row. */
  var element: js.Any = js.native
  /** Index of a specified row. In the case of a tree structure, a depth is given. */
  var index: Double | String = js.native
  /** List of TD elements of a specified row. */
  var list: js.Array[_] = js.native
  /** Variable that refers to the parent row. */
  var parent: js.UndefOr[GridRow] = js.native
  /** The unique number of a child row under the specified parent row if a parent row exists. */
  var rownum: js.UndefOr[Double] = js.native
  /** Data of a sequence. */
  var seq: Double = js.native
  /**
    * State value that indicates whether a child row is shown or hidden.
    */
  var tpl: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * State value that indicates whether a child row is shown or hidden.
    * @default "fold"
    */
  var `type`: open | fold = js.native
  def appendChild(row: GridRow): Unit = js.native
  def destroy(): Unit = js.native
  def fold(): Unit = js.native
  def hideCell(index: Double): Unit = js.native
  def insertChild(rownum: Double, row: GridRow): Unit = js.native
  def insertChild(rownum: Double, row: GridRow, isReload: js.Any): Unit = js.native
  def isLeaf(): Boolean = js.native
  def lastChild(): GridRow = js.native
  def lastChildLeaf(lastRow: GridRow): GridRow | js.Any = js.native
  def open(): Unit = js.native
  def reload(columns: js.Array[GridColumn], seq: js.Any, xssFilter: js.Any): Unit = js.native
  def removeChild(index: String): Unit = js.native
  def removeChild(index: Double): Unit = js.native
  def setIndex(rownum: String): Unit = js.native
  def setIndex(rownum: Double): Unit = js.native
  def showCell(index: Double): Unit = js.native
}

