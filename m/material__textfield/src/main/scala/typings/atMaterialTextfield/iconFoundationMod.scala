package typings.atMaterialTextfield

import typings.atMaterialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typings.atMaterialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/icon/foundation", JSImport.Namespace)
@js.native
object iconFoundationMod extends js.Object {
  @js.native
  trait MDCTextFieldIconFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCTextFieldIconAdapter] {
    /**
      * Handles an interaction event
      */
    def handleInteraction(evt: Event): Unit = js.native
    /**
      * Sets the content of the helper text field.
      */
    def setDisabled(disabled: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val defaultAdapter: MDCTextFieldIconAdapter = js.native
    val strings: typings.atMaterialTextfield.iconConstantsMod.strings = js.native
  }
  
}

