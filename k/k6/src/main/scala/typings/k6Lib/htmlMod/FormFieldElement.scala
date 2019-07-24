package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "FormFieldElement")
@js.native
abstract class FormFieldElement () extends Element {
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  /** Form submission action URI. */
  def formAction(): java.lang.String = js.native
  /** Form submission encoding. */
  def formEnctype(): java.lang.String = js.native
  /** Form submission HTTP method. */
  def formMethod(): java.lang.String = js.native
  /** Whether form submits without validation. */
  def formNoValidate(): scala.Boolean = js.native
  /** Form submission response display location. */
  def formTarget(): java.lang.String = js.native
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  /** Form field name. */
  def name(): java.lang.String = js.native
}

