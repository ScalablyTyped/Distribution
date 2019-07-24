package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "FieldSetElement")
@js.native
abstract class FieldSetElement () extends Element {
  /** Grouped elements. */
  def elements(): js.Array[Element] = js.native
  /** Containing <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  /** Field set type. Always `fieldset`. */
  def `type`(): java.lang.String = js.native
  /** Validity states. Unimplemented. Always `undefined`. */
  def validity(): js.UndefOr[scala.Nothing] = js.native
}

