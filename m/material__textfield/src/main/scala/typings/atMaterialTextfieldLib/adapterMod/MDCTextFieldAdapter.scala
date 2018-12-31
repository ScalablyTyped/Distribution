package typings
package atMaterialTextfieldLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldAdapter extends js.Object {
  /**
    * Activates the line ripple.
    */
  def activateLineRipple(): scala.Unit = js.native
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: java.lang.String): scala.Unit = js.native
  /**
    * Only implement if outline element exists.
    * Closes notch in outline element.
    */
  def closeOutline(): scala.Unit = js.native
  /**
    * Deactivates the line ripple.
    */
  def deactivateLineRipple(): scala.Unit = js.native
  /**
    * Deregisters an event listener on the native input element for a given event.
    */
  def deregisterInputInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Deregisters an event handler on the root element for a given event.
    */
  def deregisterTextFieldInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Disconnects a validation attribute observer on the input element.
    */
  def deregisterValidationAttributeChangeHandler(observer: stdLib.MutationObserver): scala.Unit = js.native
  /**
    * Only implement if label exists.
    * Floats the label above the input element if shouldFloat is true.
    */
  def floatLabel(shouldFloat: scala.Boolean): scala.Unit = js.native
  /**
    * Only implement if label exists.
    * Returns width of label in pixels.
    */
  def getLabelWidth(): scala.Double = js.native
  /**
    * Returns an object representing the native text input element, with a
    * similar API shape. The object returned should include the value, disabled
    * and badInput properties, as well as the checkValidity() function. We never
    * alter the value within our code, however we do update the disabled
    * property, so if you choose to duck-type the return value for this method
    * in your implementation it's important to keep this in mind. Also note that
    * this method can return null, which the foundation will handle gracefully.
    */
  def getNativeInput(): stdLib.Element | NativeInputType | scala.Null = js.native
  /**
    * Returns true if the root element contains the given class name.
    */
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if label element exists, false if it doesn't.
    */
  def hasLabel(): scala.Boolean = js.native
  /**
    * Returns true if outline element exists, false if it doesn't.
    */
  def hasOutline(): scala.Boolean = js.native
  /**
    * Returns true if the textfield is focused.
    * We achieve this via `document.activeElement === this.root_`.
    */
  def isFocused(): scala.Boolean = js.native
  /**
    * Returns true if the direction of the root element is set to RTL.
    */
  def isRtl(): scala.Boolean = js.native
  def notchOutline(labelWidth: scala.Double): scala.Unit = js.native
  /**
    * Only implement if outline element exists.
    * Updates SVG Path and outline element based on the
    * label element width and RTL context.
    */
  def notchOutline(labelWidth: scala.Double, isRtl: scala.Boolean): scala.Unit = js.native
  /**
    * Registers an event listener on the native input element for a given event.
    */
  def registerInputInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Registers an event handler on the root element for a given event.
    */
  def registerTextFieldInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Registers a validation attribute change listener on the input element.
    */
  def registerValidationAttributeChangeHandler(handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: java.lang.String): scala.Unit = js.native
  /**
    * Sets the transform origin of the line ripple.
    */
  def setLineRippleTransformOrigin(normalizedX: scala.Double): scala.Unit = js.native
  /**
    * Only implement if label exists.
    * Shakes label if shouldShake is true.
    */
  def shakeLabel(shouldShake: scala.Boolean): scala.Unit = js.native
}

