package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TableElement")
@js.native
abstract class TableElement () extends Element {
  /** First child <caption> element. */
  def caption(): js.UndefOr[Element] = js.native
  /** Contained <tr> elements. */
  def rows(): js.Array[Element] = js.native
  /** Contained <tbody> elements. */
  def tBodies(): js.Array[Element] = js.native
  /** First child <tfoot> element. */
  def tFoot(): js.UndefOr[Element] = js.native
  /** First child <thead> element. */
  def tHead(): js.UndefOr[Element] = js.native
}

