package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "OptionElement")
@js.native
abstract class OptionElement () extends Element {
  /** Whether disabled. */
  def disabled(): scala.Boolean = js.native
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  /** Index in containing options list. */
  def index(): scala.Double = js.native
  /** `label` attribute value. */
  def label(): java.lang.String = js.native
  /** Text content. */
  def text(): java.lang.String = js.native
  /** `value` attribute value. */
  def value(): java.lang.String = js.native
}

