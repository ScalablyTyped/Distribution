package typings.materialTextfield.adapterMod

import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import typings.std.MutationObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTextFieldAdapter
  extends MDCTextFieldRootAdapter
     with MDCTextFieldInputAdapter
     with MDCTextFieldLabelAdapter
     with MDCTextFieldLineRippleAdapter
     with MDCTextFieldOutlineAdapter
object MDCTextFieldAdapter {
  
  @scala.inline
  def apply(
    activateLineRipple: () => Unit,
    addClass: String => Unit,
    closeOutline: () => Unit,
    deactivateLineRipple: () => Unit,
    deregisterInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterValidationAttributeChangeHandler: MutationObserver => Unit,
    floatLabel: Boolean => Unit,
    getLabelWidth: () => Double,
    getNativeInput: () => MDCTextFieldNativeInputElement | Null,
    hasClass: String => Boolean,
    hasLabel: () => Boolean,
    hasOutline: () => Boolean,
    isFocused: () => Boolean,
    notchOutline: Double => Unit,
    registerInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerValidationAttributeChangeHandler: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver,
    removeClass: String => Unit,
    removeInputAttr: String => Unit,
    setInputAttr: (String, String) => Unit,
    setLabelRequired: Boolean => Unit,
    setLineRippleTransformOrigin: Double => Unit,
    shakeLabel: Boolean => Unit
  ): MDCTextFieldAdapter = {
    val __obj = js.Dynamic.literal(activateLineRipple = js.Any.fromFunction0(activateLineRipple), addClass = js.Any.fromFunction1(addClass), closeOutline = js.Any.fromFunction0(closeOutline), deactivateLineRipple = js.Any.fromFunction0(deactivateLineRipple), deregisterInputInteractionHandler = js.Any.fromFunction2(deregisterInputInteractionHandler), deregisterTextFieldInteractionHandler = js.Any.fromFunction2(deregisterTextFieldInteractionHandler), deregisterValidationAttributeChangeHandler = js.Any.fromFunction1(deregisterValidationAttributeChangeHandler), floatLabel = js.Any.fromFunction1(floatLabel), getLabelWidth = js.Any.fromFunction0(getLabelWidth), getNativeInput = js.Any.fromFunction0(getNativeInput), hasClass = js.Any.fromFunction1(hasClass), hasLabel = js.Any.fromFunction0(hasLabel), hasOutline = js.Any.fromFunction0(hasOutline), isFocused = js.Any.fromFunction0(isFocused), notchOutline = js.Any.fromFunction1(notchOutline), registerInputInteractionHandler = js.Any.fromFunction2(registerInputInteractionHandler), registerTextFieldInteractionHandler = js.Any.fromFunction2(registerTextFieldInteractionHandler), registerValidationAttributeChangeHandler = js.Any.fromFunction1(registerValidationAttributeChangeHandler), removeClass = js.Any.fromFunction1(removeClass), removeInputAttr = js.Any.fromFunction1(removeInputAttr), setInputAttr = js.Any.fromFunction2(setInputAttr), setLabelRequired = js.Any.fromFunction1(setLabelRequired), setLineRippleTransformOrigin = js.Any.fromFunction1(setLineRippleTransformOrigin), shakeLabel = js.Any.fromFunction1(shakeLabel))
    __obj.asInstanceOf[MDCTextFieldAdapter]
  }
}
