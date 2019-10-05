package typings.atMaterialTextfield

import typings.atMaterialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typings.atMaterialTextfield.iconFoundationMod.default
import typings.atMaterialTextfield.iconMod.MDCTextFieldIcon
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/icon", JSImport.Namespace)
@js.native
object iconMod extends js.Object {
  @js.native
  class MDCTextFieldIcon ()
    extends typings.atMaterialBase.componentMod.default[MDCTextFieldIconAdapter, default] {
    val foundation: default = js.native
  }
  
  @js.native
  class MDCTextFieldIconFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: Element): MDCTextFieldIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    val defaultAdapter: MDCTextFieldIconAdapter = js.native
    val strings: typings.atMaterialTextfield.iconConstantsMod.strings = js.native
  }
  
}

