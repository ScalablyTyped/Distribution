package typings.materialSwitch

import typings.materialSwitch.constantsMod.CssClasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCSwitchAdapter extends StObject {
    
    /**
      * The state of the component.
      */
    var state: MDCSwitchState
  }
  object MDCSwitchAdapter {
    
    inline def apply(state: MDCSwitchState): MDCSwitchAdapter = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSwitchAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCSwitchAdapter] (val x: Self) extends AnyVal {
      
      inline def setState(value: MDCSwitchState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCSwitchRenderAdapter
    extends StObject
       with MDCSwitchAdapter {
    
    /**
      * Adds a class to the root element.
      * @param className The class to add.
      */
    def addClass(className: CssClasses): Unit
    
    /**
      * Returns whether or not the root element has a class.
      * @param className The class to check.
      * @return true if the root element has the class, or false if not.
      */
    def hasClass(className: CssClasses): Boolean
    
    /**
      * Checks if the root element is disabled.
      * @return true if the root element is disabled, or false if not.
      */
    def isDisabled(): Boolean
    
    /**
      * Removes a class from the root element.
      * @param className The class to remove.
      */
    def removeClass(className: CssClasses): Unit
    
    /**
      * Sets the `aria-checked` attribute of the root element.
      * @param ariaChecked The value of the attribute to set.
      */
    def setAriaChecked(ariaChecked: String): Unit
    
    /**
      * Disables or enables the root element.
      * @param disabled True to disable the root element, or false to enable.
      */
    def setDisabled(disabled: Boolean): Unit
  }
  object MDCSwitchRenderAdapter {
    
    inline def apply(
      addClass: CssClasses => Unit,
      hasClass: CssClasses => Boolean,
      isDisabled: () => Boolean,
      removeClass: CssClasses => Unit,
      setAriaChecked: String => Unit,
      setDisabled: Boolean => Unit,
      state: MDCSwitchState
    ): MDCSwitchRenderAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), hasClass = js.Any.fromFunction1(hasClass), isDisabled = js.Any.fromFunction0(isDisabled), removeClass = js.Any.fromFunction1(removeClass), setAriaChecked = js.Any.fromFunction1(setAriaChecked), setDisabled = js.Any.fromFunction1(setDisabled), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSwitchRenderAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCSwitchRenderAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: CssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: CssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetAriaChecked(value: String => Unit): Self = StObject.set(x, "setAriaChecked", js.Any.fromFunction1(value))
      
      inline def setSetDisabled(value: Boolean => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    }
  }
  
  trait MDCSwitchState extends StObject {
    
    /**
      * Indicates whether or not the switch is disabled.
      */
    var disabled: Boolean
    
    /**
      * Indicates whether or not the switch is processing and showing a loading
      * indicator. A disabled switch cannot be processing.
      */
    var processing: Boolean
    
    /**
      * If true, the switch is on. If false, the switch is off.
      */
    var selected: Boolean
  }
  object MDCSwitchState {
    
    inline def apply(disabled: Boolean, processing: Boolean, selected: Boolean): MDCSwitchState = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSwitchState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCSwitchState] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setProcessing(value: Boolean): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
