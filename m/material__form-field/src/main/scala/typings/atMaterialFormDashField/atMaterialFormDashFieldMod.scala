package typings.atMaterialFormDashField

import typings.atMaterialFormDashField.adapterMod.MDCFormFieldAdapter
import typings.atMaterialFormDashField.atMaterialFormDashFieldMod.MDCFormField
import typings.atMaterialFormDashField.foundationMod.default
import typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field", JSImport.Namespace)
@js.native
object atMaterialFormDashFieldMod extends js.Object {
  @js.native
  class MDCFormField ()
    extends typings.atMaterialBase.componentMod.default[MDCFormFieldAdapter, default] {
    var input: MDCSelectionControl = js.native
  }
  
  @js.native
  class MDCFormFieldFoundation () extends default
  
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    def attachTo(root: Element): MDCFormField = js.native
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    val cssClasses: typings.atMaterialFormDashField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typings.atMaterialFormDashField.constantsMod.strings = js.native
  }
  
}

