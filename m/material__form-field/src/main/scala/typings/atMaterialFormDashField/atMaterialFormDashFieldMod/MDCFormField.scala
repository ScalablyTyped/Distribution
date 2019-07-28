package typings.atMaterialFormDashField.atMaterialFormDashFieldMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialFormDashField.adapterMod.MDCFormFieldAdapter
import typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field", "MDCFormField")
@js.native
class MDCFormField ()
  extends default[MDCFormFieldAdapter, typings.atMaterialFormDashField.foundationMod.default] {
  var input: MDCSelectionControl = js.native
}

/* static members */
@JSImport("@material/form-field", "MDCFormField")
@js.native
object MDCFormField extends js.Object {
  def attachTo(root: Element): MDCFormField = js.native
}

