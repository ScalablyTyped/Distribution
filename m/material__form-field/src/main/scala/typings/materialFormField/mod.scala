package typings.materialFormField

import typings.materialFormField.adapterMod.MDCFormFieldAdapter
import typings.materialFormField.foundationMod.default
import typings.materialSelectionControl.mod.MDCSelectionControl
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCFormField ()
    extends typings.materialBase.componentMod.default[MDCFormFieldAdapter, default] {
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
    val cssClasses: typings.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typings.materialFormField.constantsMod.strings = js.native
  }
  
}

