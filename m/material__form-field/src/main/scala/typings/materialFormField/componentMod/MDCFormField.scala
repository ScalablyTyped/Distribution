package typings.materialFormField.componentMod

import typings.materialBase.componentMod.MDCComponent
import typings.materialFormField.foundationMod.MDCFormFieldFoundation
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field/component", "MDCFormField")
@js.native
class MDCFormField () extends MDCComponent[MDCFormFieldFoundation] {
  var input: js.UndefOr[MDCFormFieldInput] = js.native
}

/* static members */
@JSImport("@material/form-field/component", "MDCFormField")
@js.native
object MDCFormField extends js.Object {
  def attachTo(root: HTMLElement): MDCFormField = js.native
}

