package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TableRowElement")
@js.native
abstract class TableRowElement () extends Element {
  /** Contained table cell elements. */
  def cells(): js.Array[TableCellElement] = js.native
  /** Index in containing table. */
  def rowIndex(): scala.Double = js.native
  /** Index in containing table section. */
  def sectionRowIndex(): scala.Double = js.native
}

