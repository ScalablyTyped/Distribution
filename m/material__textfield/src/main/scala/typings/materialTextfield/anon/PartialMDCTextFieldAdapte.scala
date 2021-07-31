package typings.materialTextfield.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import typings.std.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/adapter.MDCTextFieldAdapter> */
trait PartialMDCTextFieldAdapte extends StObject {
  
  var activateLineRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  
  var closeOutline: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var deactivateLineRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var deregisterInputInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var deregisterTextFieldInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var deregisterValidationAttributeChangeHandler: js.UndefOr[js.Function1[/* observer */ MutationObserver, Unit]] = js.undefined
  
  var floatLabel: js.UndefOr[js.Function1[/* shouldFloat */ Boolean, Unit]] = js.undefined
  
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var getNativeInput: js.UndefOr[js.Function0[MDCTextFieldNativeInputElement | Null]] = js.undefined
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  
  var hasLabel: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var hasOutline: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isFocused: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var notchOutline: js.UndefOr[js.Function1[/* labelWidth */ Double, Unit]] = js.undefined
  
  var registerInputInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var registerTextFieldInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var registerValidationAttributeChangeHandler: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[/* attributeNames */ js.Array[String], Unit], 
      MutationObserver
    ]
  ] = js.undefined
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  
  var removeInputAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.undefined
  
  var setInputAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
  
  var setLabelRequired: js.UndefOr[js.Function1[/* isRequired */ Boolean, Unit]] = js.undefined
  
  var setLineRippleTransformOrigin: js.UndefOr[js.Function1[/* normalizedX */ Double, Unit]] = js.undefined
  
  var shakeLabel: js.UndefOr[js.Function1[/* shouldShake */ Boolean, Unit]] = js.undefined
}
object PartialMDCTextFieldAdapte {
  
  @scala.inline
  def apply(): PartialMDCTextFieldAdapte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldAdapte]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldAdapteMutableBuilder[Self <: PartialMDCTextFieldAdapte] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateLineRipple(value: () => Unit): Self = StObject.set(x, "activateLineRipple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActivateLineRippleUndefined: Self = StObject.set(x, "activateLineRipple", js.undefined)
    
    @scala.inline
    def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    @scala.inline
    def setCloseOutline(value: () => Unit): Self = StObject.set(x, "closeOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseOutlineUndefined: Self = StObject.set(x, "closeOutline", js.undefined)
    
    @scala.inline
    def setDeactivateLineRipple(value: () => Unit): Self = StObject.set(x, "deactivateLineRipple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeactivateLineRippleUndefined: Self = StObject.set(x, "deactivateLineRipple", js.undefined)
    
    @scala.inline
    def setDeregisterInputInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInputInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeregisterInputInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInputInteractionHandler", js.undefined)
    
    @scala.inline
    def setDeregisterTextFieldInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterTextFieldInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeregisterTextFieldInteractionHandlerUndefined: Self = StObject.set(x, "deregisterTextFieldInteractionHandler", js.undefined)
    
    @scala.inline
    def setDeregisterValidationAttributeChangeHandler(value: /* observer */ MutationObserver => Unit): Self = StObject.set(x, "deregisterValidationAttributeChangeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeregisterValidationAttributeChangeHandlerUndefined: Self = StObject.set(x, "deregisterValidationAttributeChangeHandler", js.undefined)
    
    @scala.inline
    def setFloatLabel(value: /* shouldFloat */ Boolean => Unit): Self = StObject.set(x, "floatLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFloatLabelUndefined: Self = StObject.set(x, "floatLabel", js.undefined)
    
    @scala.inline
    def setGetLabelWidth(value: () => Double): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelWidthUndefined: Self = StObject.set(x, "getLabelWidth", js.undefined)
    
    @scala.inline
    def setGetNativeInput(value: () => MDCTextFieldNativeInputElement | Null): Self = StObject.set(x, "getNativeInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNativeInputUndefined: Self = StObject.set(x, "getNativeInput", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
    
    @scala.inline
    def setHasLabel(value: () => Boolean): Self = StObject.set(x, "hasLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLabelUndefined: Self = StObject.set(x, "hasLabel", js.undefined)
    
    @scala.inline
    def setHasOutline(value: () => Boolean): Self = StObject.set(x, "hasOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasOutlineUndefined: Self = StObject.set(x, "hasOutline", js.undefined)
    
    @scala.inline
    def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setNotchOutline(value: /* labelWidth */ Double => Unit): Self = StObject.set(x, "notchOutline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotchOutlineUndefined: Self = StObject.set(x, "notchOutline", js.undefined)
    
    @scala.inline
    def setRegisterInputInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInputInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterInputInteractionHandlerUndefined: Self = StObject.set(x, "registerInputInteractionHandler", js.undefined)
    
    @scala.inline
    def setRegisterTextFieldInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerTextFieldInteractionHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterTextFieldInteractionHandlerUndefined: Self = StObject.set(x, "registerTextFieldInteractionHandler", js.undefined)
    
    @scala.inline
    def setRegisterValidationAttributeChangeHandler(value: /* handler */ js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver): Self = StObject.set(x, "registerValidationAttributeChangeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterValidationAttributeChangeHandlerUndefined: Self = StObject.set(x, "registerValidationAttributeChangeHandler", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
    
    @scala.inline
    def setRemoveInputAttr(value: /* attr */ String => Unit): Self = StObject.set(x, "removeInputAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveInputAttrUndefined: Self = StObject.set(x, "removeInputAttr", js.undefined)
    
    @scala.inline
    def setSetInputAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setInputAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetInputAttrUndefined: Self = StObject.set(x, "setInputAttr", js.undefined)
    
    @scala.inline
    def setSetLabelRequired(value: /* isRequired */ Boolean => Unit): Self = StObject.set(x, "setLabelRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabelRequiredUndefined: Self = StObject.set(x, "setLabelRequired", js.undefined)
    
    @scala.inline
    def setSetLineRippleTransformOrigin(value: /* normalizedX */ Double => Unit): Self = StObject.set(x, "setLineRippleTransformOrigin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLineRippleTransformOriginUndefined: Self = StObject.set(x, "setLineRippleTransformOrigin", js.undefined)
    
    @scala.inline
    def setShakeLabel(value: /* shouldShake */ Boolean => Unit): Self = StObject.set(x, "shakeLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShakeLabelUndefined: Self = StObject.set(x, "shakeLabel", js.undefined)
  }
}
