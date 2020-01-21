package typings.materialComponentsWeb.mod

import typings.materialFormField.adapterMod.MDCFormFieldAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "formField")
@js.native
object formField extends js.Object {
  @js.native
  class MDCFormField ()
    extends typings.materialFormField.mod.MDCFormField
  
  @js.native
  class MDCFormFieldFoundation ()
    extends typings.materialFormField.mod.MDCFormFieldFoundation
  
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    def attachTo(root: Element): typings.materialFormField.mod.MDCFormField = js.native
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    val cssClasses: typings.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typings.materialFormField.constantsMod.strings = js.native
  }
  
}

