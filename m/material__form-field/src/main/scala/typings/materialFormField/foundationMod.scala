package typings.materialFormField

import typings.materialFormField.adapterMod.MDCFormFieldAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class default ()
    extends typings.materialBase.foundationMod.default[MDCFormFieldAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typings.materialFormField.constantsMod.strings = js.native
  }
  
  type MDCFormFieldFoundation = typings.materialBase.foundationMod.default[MDCFormFieldAdapter]
}

