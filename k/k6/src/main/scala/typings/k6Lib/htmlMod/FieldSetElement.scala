package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "FieldSetElement")
@js.native
abstract class FieldSetElement () extends Element {
  def elements(): js.Array[Element] = js.native
  def form(): js.UndefOr[FormElement] = js.native
  def `type`(): java.lang.String = js.native
  def validity(): js.UndefOr[scala.Nothing] = js.native
}

