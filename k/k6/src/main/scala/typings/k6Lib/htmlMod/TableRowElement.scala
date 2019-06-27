package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TableRowElement")
@js.native
abstract class TableRowElement () extends Element {
  def cells(): js.Array[TableCellElement] = js.native
  def rowIndex(): scala.Double = js.native
  def sectionRowIndex(): scala.Double = js.native
}

