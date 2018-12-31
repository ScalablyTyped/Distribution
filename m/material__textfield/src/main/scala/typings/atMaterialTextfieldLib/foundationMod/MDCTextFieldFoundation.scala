package typings
package atMaterialTextfieldLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialTextfieldLib.adapterMod.MDCTextFieldAdapter] {
  val shouldFloat: scala.Boolean = js.native
  val shouldShake: scala.Boolean = js.native
  /**
    * Activates the text field focus state.
    */
  def activateFocus(): scala.Unit = js.native
  /**
    * Activates the Text Field's focus state in cases when the input value
    * changes without user input (e.g. programatically).
    */
  def autoCompleteFocus(): scala.Unit = js.native
  def deactivateFocus(): scala.Unit = js.native
  def getValue(): java.lang.String = js.native
  /**
    * Handles user interactions with the Text Field.
    */
  def handleTextFieldInteraction(): scala.Unit = js.native
  def isDisabled(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  /**
    * Opens/closes the notched outline.
    */
  def notchOutline(openNotch: scala.Boolean): scala.Unit = js.native
  def setDisabled(disabled: scala.Boolean): scala.Unit = js.native
  def setHelperTextContent(content: java.lang.String): scala.Unit = js.native
  /**
    * Sets the line ripple's transform origin, so that the line ripple activate
    * animation will animate out from the user's click location.
    */
  def setTransformOrigin(evt: stdLib.Event): scala.Unit = js.native
  def setValid(isValid: scala.Boolean): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
}

