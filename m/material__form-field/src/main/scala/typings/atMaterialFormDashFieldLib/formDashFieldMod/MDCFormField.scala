package typings
package atMaterialFormDashFieldLib.formDashFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field", "MDCFormField")
@js.native
class MDCFormField ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialFormDashFieldLib.adapterMod.MDCFormFieldAdapter, 
      atMaterialFormDashFieldLib.foundationMod.default
    ] {
  var input: atMaterialSelectionDashControlLib.selectionDashControlMod.MDCSelectionControl = js.native
}

@JSImport("@material/form-field", "MDCFormField")
@js.native
object MDCFormField extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialFormDashFieldLib.formDashFieldMod.MDCFormField = js.native
}

