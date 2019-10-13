package typings.atMaterialFormDashField

import typings.atMaterialFormDashField.adapterMod.MDCFormFieldAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class default ()
    extends typings.atMaterialBase.foundationMod.default[MDCFormFieldAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialFormDashField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typings.atMaterialFormDashField.constantsMod.strings = js.native
  }
  
  type MDCFormFieldFoundation = typings.atMaterialBase.foundationMod.default[MDCFormFieldAdapter]
}

