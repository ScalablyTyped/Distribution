package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TableSectionElement")
@js.native
abstract class TableSectionElement () extends Element {
  /** Contained <tr> elements. */
  def rows(): js.Array[Element] = js.native
}

