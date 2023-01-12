package typings.materialChips

import typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typings.materialChips.actionConstantsMod.MDCChipActionType
import typings.materialChips.chipConstantsMod.MDCChipAttributes
import typings.materialChips.chipConstantsMod.MDCChipCssClasses
import typings.materialChips.chipConstantsMod.MDCChipEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipAdapterMod {
  
  trait MDCChipAdapter extends StObject {
    
    /** Adds the given class to the root element. */
    def addClass(className: MDCChipCssClasses): Unit
    
    /** Emits the given event with the given detail. */
    def emitEvent[D /* <: js.Object */](eventName: MDCChipEvents, eventDetail: D): Unit
    
    /** Returns the child actions provided by the chip. */
    def getActions(): js.Array[MDCChipActionType]
    
    /** Returns the value for the given attribute, if it exists. */
    def getAttribute(attrName: MDCChipAttributes): String | Null
    
    /** Returns the ID of the root element. */
    def getElementID(): String
    
    /** Returns the offset width of the root element. */
    def getOffsetWidth(): Double
    
    /** Returns true if the root element has the given class. */
    def hasClass(className: MDCChipCssClasses): Boolean
    
    /** Proxies to the MDCChipAction#isDisabled method. */
    def isActionDisabled(action: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChipAction#isFocusable method. */
    def isActionFocusable(action: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChipAction#isSelectable method. */
    def isActionSelectable(action: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChipAction#isSelected method. */
    def isActionSelected(action: MDCChipActionType): Boolean
    
    /** Returns true if the text direction is right-to-left. */
    def isRTL(): Boolean
    
    /** Removes the given class from the root element. */
    def removeClass(className: MDCChipCssClasses): Unit
    
    /** Proxies to the MDCChipAction#setDisabled method. */
    def setActionDisabled(action: MDCChipActionType, isDisabled: Boolean): Unit
    
    /** Proxies to the MDCChipAction#setFocus method. */
    def setActionFocus(action: MDCChipActionType, behavior: MDCChipActionFocusBehavior): Unit
    
    /** Proxies to the MDCChipAction#setSelected method. */
    def setActionSelected(action: MDCChipActionType, isSelected: Boolean): Unit
    
    /** Sets the style property to the given value. */
    def setStyleProperty(property: String, value: String): Unit
  }
  object MDCChipAdapter {
    
    inline def apply(
      addClass: MDCChipCssClasses => Unit,
      emitEvent: (MDCChipEvents, Any) => Unit,
      getActions: () => js.Array[MDCChipActionType],
      getAttribute: MDCChipAttributes => String | Null,
      getElementID: () => String,
      getOffsetWidth: () => Double,
      hasClass: MDCChipCssClasses => Boolean,
      isActionDisabled: MDCChipActionType => Boolean,
      isActionFocusable: MDCChipActionType => Boolean,
      isActionSelectable: MDCChipActionType => Boolean,
      isActionSelected: MDCChipActionType => Boolean,
      isRTL: () => Boolean,
      removeClass: MDCChipCssClasses => Unit,
      setActionDisabled: (MDCChipActionType, Boolean) => Unit,
      setActionFocus: (MDCChipActionType, MDCChipActionFocusBehavior) => Unit,
      setActionSelected: (MDCChipActionType, Boolean) => Unit,
      setStyleProperty: (String, String) => Unit
    ): MDCChipAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), emitEvent = js.Any.fromFunction2(emitEvent), getActions = js.Any.fromFunction0(getActions), getAttribute = js.Any.fromFunction1(getAttribute), getElementID = js.Any.fromFunction0(getElementID), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), hasClass = js.Any.fromFunction1(hasClass), isActionDisabled = js.Any.fromFunction1(isActionDisabled), isActionFocusable = js.Any.fromFunction1(isActionFocusable), isActionSelectable = js.Any.fromFunction1(isActionSelectable), isActionSelected = js.Any.fromFunction1(isActionSelected), isRTL = js.Any.fromFunction0(isRTL), removeClass = js.Any.fromFunction1(removeClass), setActionDisabled = js.Any.fromFunction2(setActionDisabled), setActionFocus = js.Any.fromFunction2(setActionFocus), setActionSelected = js.Any.fromFunction2(setActionSelected), setStyleProperty = js.Any.fromFunction2(setStyleProperty))
      __obj.asInstanceOf[MDCChipAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCChipAdapter] (val x: Self) extends AnyVal {
      
      inline def setAddClass(value: MDCChipCssClasses => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setEmitEvent(value: (MDCChipEvents, Any) => Unit): Self = StObject.set(x, "emitEvent", js.Any.fromFunction2(value))
      
      inline def setGetActions(value: () => js.Array[MDCChipActionType]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setGetAttribute(value: MDCChipAttributes => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetElementID(value: () => String): Self = StObject.set(x, "getElementID", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: MDCChipCssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsActionDisabled(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionDisabled", js.Any.fromFunction1(value))
      
      inline def setIsActionFocusable(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionFocusable", js.Any.fromFunction1(value))
      
      inline def setIsActionSelectable(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionSelectable", js.Any.fromFunction1(value))
      
      inline def setIsActionSelected(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionSelected", js.Any.fromFunction1(value))
      
      inline def setIsRTL(value: () => Boolean): Self = StObject.set(x, "isRTL", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: MDCChipCssClasses => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetActionDisabled(value: (MDCChipActionType, Boolean) => Unit): Self = StObject.set(x, "setActionDisabled", js.Any.fromFunction2(value))
      
      inline def setSetActionFocus(value: (MDCChipActionType, MDCChipActionFocusBehavior) => Unit): Self = StObject.set(x, "setActionFocus", js.Any.fromFunction2(value))
      
      inline def setSetActionSelected(value: (MDCChipActionType, Boolean) => Unit): Self = StObject.set(x, "setActionSelected", js.Any.fromFunction2(value))
      
      inline def setSetStyleProperty(value: (String, String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
    }
  }
}
