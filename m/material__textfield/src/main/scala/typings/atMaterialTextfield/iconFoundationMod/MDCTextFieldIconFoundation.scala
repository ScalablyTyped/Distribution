package typings.atMaterialTextfield.iconFoundationMod

import typings.atMaterialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

