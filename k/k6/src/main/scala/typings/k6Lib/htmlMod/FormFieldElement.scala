package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "FormFieldElement")
@js.native
abstract class FormFieldElement () extends Element {
  def form(): js.UndefOr[FormElement] = js.native
  def formAction(): java.lang.String = js.native
  def formEnctype(): java.lang.String = js.native
  def formMethod(): java.lang.String = js.native
  def formNoValidate(): scala.Boolean = js.native
  def formTarget(): java.lang.String = js.native
  def labels(): js.Array[LabelElement] = js.native
  def name(): java.lang.String = js.native
}

