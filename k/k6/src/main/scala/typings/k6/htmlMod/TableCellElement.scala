package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TableCellElement")
@js.native
abstract class TableCellElement () extends Element {
  /** Index in containing row. */
  def cellIndex(): Double = js.native
}

