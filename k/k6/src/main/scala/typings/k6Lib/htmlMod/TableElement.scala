package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TableElement")
@js.native
abstract class TableElement () extends Element {
  def caption(): js.UndefOr[Element] = js.native
  def rows(): js.Array[Element] = js.native
  def tBodies(): js.Array[Element] = js.native
  def tFoot(): js.UndefOr[Element] = js.native
  def tHead(): js.UndefOr[Element] = js.native
}

