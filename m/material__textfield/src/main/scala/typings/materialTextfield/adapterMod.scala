package typings.materialTextfield

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import typings.std.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTextFieldAdapter
    extends StObject
       with MDCTextFieldRootAdapter
       with MDCTextFieldInputAdapter
       with MDCTextFieldLabelAdapter
       with MDCTextFieldLineRippleAdapter
       with MDCTextFieldOutlineAdapter
  object MDCTextFieldAdapter {
    
    inline def apply(
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
  
  trait MDCTextFieldInputAdapter extends StObject {
    
    /**
      * Deregisters an event listener on the native input element for a given event.
      */
    def deregisterInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * @return The native `<input>` element, or an object with the same shape.
      * Note that this method can return null, which the foundation will handle gracefully.
      */
    def getNativeInput(): MDCTextFieldNativeInputElement | Null
    
    /**
      * @return true if the textfield is focused. We achieve this via `document.activeElement === this.root`.
      */
    def isFocused(): Boolean
    
    /**
      * Registers an event listener on the native input element for a given event.
      */
    def registerInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes the specified attribute from the input element.
      */
    def removeInputAttr(attr: String): Unit
    
    /**
      * Sets the specified attribute to the specified value on the input element.
      */
    def setInputAttr(attr: String, value: String): Unit
  }
  object MDCTextFieldInputAdapter {
    
    inline def apply(
      deregisterInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      getNativeInput: () => MDCTextFieldNativeInputElement | Null,
      isFocused: () => Boolean,
      registerInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      removeInputAttr: String => Unit,
      setInputAttr: (String, String) => Unit
    ): MDCTextFieldInputAdapter = {
      val __obj = js.Dynamic.literal(deregisterInputInteractionHandler = js.Any.fromFunction2(deregisterInputInteractionHandler), getNativeInput = js.Any.fromFunction0(getNativeInput), isFocused = js.Any.fromFunction0(isFocused), registerInputInteractionHandler = js.Any.fromFunction2(registerInputInteractionHandler), removeInputAttr = js.Any.fromFunction1(removeInputAttr), setInputAttr = js.Any.fromFunction2(setInputAttr))
      __obj.asInstanceOf[MDCTextFieldInputAdapter]
    }
    
    extension [Self <: MDCTextFieldInputAdapter](x: Self) {
      
      inline def setDeregisterInputInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterInputInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setGetNativeInput(value: () => MDCTextFieldNativeInputElement | Null): Self = StObject.set(x, "getNativeInput", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setRegisterInputInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerInputInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRemoveInputAttr(value: String => Unit): Self = StObject.set(x, "removeInputAttr", js.Any.fromFunction1(value))
      
      inline def setSetInputAttr(value: (String, String) => Unit): Self = StObject.set(x, "setInputAttr", js.Any.fromFunction2(value))
    }
  }
  
  trait MDCTextFieldLabelAdapter extends StObject {
    
    /**
      * Only implement if label exists.
      * Floats the label above the input element if shouldFloat is true.
      */
    def floatLabel(shouldFloat: Boolean): Unit
    
    /**
      * Only implement if label exists.
      * @return width of label in pixels.
      */
    def getLabelWidth(): Double
    
    /**
      * @return true if label element exists, false if it doesn't.
      */
    def hasLabel(): Boolean
    
    /**
      * Only implement if label exists.
      * Styles the label as required.
      */
    def setLabelRequired(isRequired: Boolean): Unit
    
    /**
      * Only implement if label exists.
      * Shakes label if shouldShake is true.
      */
    def shakeLabel(shouldShake: Boolean): Unit
  }
  object MDCTextFieldLabelAdapter {
    
    inline def apply(
      floatLabel: Boolean => Unit,
      getLabelWidth: () => Double,
      hasLabel: () => Boolean,
      setLabelRequired: Boolean => Unit,
      shakeLabel: Boolean => Unit
    ): MDCTextFieldLabelAdapter = {
      val __obj = js.Dynamic.literal(floatLabel = js.Any.fromFunction1(floatLabel), getLabelWidth = js.Any.fromFunction0(getLabelWidth), hasLabel = js.Any.fromFunction0(hasLabel), setLabelRequired = js.Any.fromFunction1(setLabelRequired), shakeLabel = js.Any.fromFunction1(shakeLabel))
      __obj.asInstanceOf[MDCTextFieldLabelAdapter]
    }
    
    extension [Self <: MDCTextFieldLabelAdapter](x: Self) {
      
      inline def setFloatLabel(value: Boolean => Unit): Self = StObject.set(x, "floatLabel", js.Any.fromFunction1(value))
      
      inline def setGetLabelWidth(value: () => Double): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
      
      inline def setHasLabel(value: () => Boolean): Self = StObject.set(x, "hasLabel", js.Any.fromFunction0(value))
      
      inline def setSetLabelRequired(value: Boolean => Unit): Self = StObject.set(x, "setLabelRequired", js.Any.fromFunction1(value))
      
      inline def setShakeLabel(value: Boolean => Unit): Self = StObject.set(x, "shakeLabel", js.Any.fromFunction1(value))
    }
  }
  
  trait MDCTextFieldLineRippleAdapter extends StObject {
    
    /**
      * Activates the line ripple.
      */
    def activateLineRipple(): Unit
    
    /**
      * Deactivates the line ripple.
      */
    def deactivateLineRipple(): Unit
    
    /**
      * Sets the transform origin of the line ripple.
      */
    def setLineRippleTransformOrigin(normalizedX: Double): Unit
  }
  object MDCTextFieldLineRippleAdapter {
    
    inline def apply(
      activateLineRipple: () => Unit,
      deactivateLineRipple: () => Unit,
      setLineRippleTransformOrigin: Double => Unit
    ): MDCTextFieldLineRippleAdapter = {
      val __obj = js.Dynamic.literal(activateLineRipple = js.Any.fromFunction0(activateLineRipple), deactivateLineRipple = js.Any.fromFunction0(deactivateLineRipple), setLineRippleTransformOrigin = js.Any.fromFunction1(setLineRippleTransformOrigin))
      __obj.asInstanceOf[MDCTextFieldLineRippleAdapter]
    }
    
    extension [Self <: MDCTextFieldLineRippleAdapter](x: Self) {
      
      inline def setActivateLineRipple(value: () => Unit): Self = StObject.set(x, "activateLineRipple", js.Any.fromFunction0(value))
      
      inline def setDeactivateLineRipple(value: () => Unit): Self = StObject.set(x, "deactivateLineRipple", js.Any.fromFunction0(value))
      
      inline def setSetLineRippleTransformOrigin(value: Double => Unit): Self = StObject.set(x, "setLineRippleTransformOrigin", js.Any.fromFunction1(value))
    }
  }
  
  trait MDCTextFieldOutlineAdapter extends StObject {
    
    /**
      * Only implement if outline element exists.
      * Closes notch in outline element.
      */
    def closeOutline(): Unit
    
    /**
      * @return true if outline element exists, false if it doesn't.
      */
    def hasOutline(): Boolean
    
    /**
      * Only implement if outline element exists.
      */
    def notchOutline(labelWidth: Double): Unit
  }
  object MDCTextFieldOutlineAdapter {
    
    inline def apply(closeOutline: () => Unit, hasOutline: () => Boolean, notchOutline: Double => Unit): MDCTextFieldOutlineAdapter = {
      val __obj = js.Dynamic.literal(closeOutline = js.Any.fromFunction0(closeOutline), hasOutline = js.Any.fromFunction0(hasOutline), notchOutline = js.Any.fromFunction1(notchOutline))
      __obj.asInstanceOf[MDCTextFieldOutlineAdapter]
    }
    
    extension [Self <: MDCTextFieldOutlineAdapter](x: Self) {
      
      inline def setCloseOutline(value: () => Unit): Self = StObject.set(x, "closeOutline", js.Any.fromFunction0(value))
      
      inline def setHasOutline(value: () => Boolean): Self = StObject.set(x, "hasOutline", js.Any.fromFunction0(value))
      
      inline def setNotchOutline(value: Double => Unit): Self = StObject.set(x, "notchOutline", js.Any.fromFunction1(value))
    }
  }
  
  trait MDCTextFieldRootAdapter extends StObject {
    
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit
    
    /**
      * Deregisters an event handler on the root element for a given event.
      */
    def deregisterTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Disconnects a validation attribute observer on the input element.
      */
    def deregisterValidationAttributeChangeHandler(observer: MutationObserver): Unit
    
    /**
      * @return true if the root element contains the given class name.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Registers an event handler on the root element for a given event.
      */
    def registerTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers a validation attribute change listener on the input element.
      * Handler accepts list of attribute names.
      */
    def registerValidationAttributeChangeHandler(handler: js.Function1[/* attributeNames */ js.Array[String], Unit]): MutationObserver
    
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit
  }
  object MDCTextFieldRootAdapter {
    
    inline def apply(
      addClass: String => Unit,
      deregisterTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      deregisterValidationAttributeChangeHandler: MutationObserver => Unit,
      hasClass: String => Boolean,
      registerTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      registerValidationAttributeChangeHandler: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver,
      removeClass: String => Unit
    ): MDCTextFieldRootAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterTextFieldInteractionHandler = js.Any.fromFunction2(deregisterTextFieldInteractionHandler), deregisterValidationAttributeChangeHandler = js.Any.fromFunction1(deregisterValidationAttributeChangeHandler), hasClass = js.Any.fromFunction1(hasClass), registerTextFieldInteractionHandler = js.Any.fromFunction2(registerTextFieldInteractionHandler), registerValidationAttributeChangeHandler = js.Any.fromFunction1(registerValidationAttributeChangeHandler), removeClass = js.Any.fromFunction1(removeClass))
      __obj.asInstanceOf[MDCTextFieldRootAdapter]
    }
    
    extension [Self <: MDCTextFieldRootAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setDeregisterTextFieldInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterTextFieldInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setDeregisterValidationAttributeChangeHandler(value: MutationObserver => Unit): Self = StObject.set(x, "deregisterValidationAttributeChangeHandler", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRegisterTextFieldInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerTextFieldInteractionHandler", js.Any.fromFunction2(value))
      
      inline def setRegisterValidationAttributeChangeHandler(value: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver): Self = StObject.set(x, "registerValidationAttributeChangeHandler", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    }
  }
}
