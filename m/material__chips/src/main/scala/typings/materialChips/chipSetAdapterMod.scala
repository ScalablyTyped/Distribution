package typings.materialChips

import typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typings.materialChips.actionConstantsMod.MDCChipActionType
import typings.materialChips.chipConstantsMod.MDCChipAnimation
import typings.materialChips.chipSetConstantsMod.MDCChipSetAttributes
import typings.materialChips.chipSetConstantsMod.MDCChipSetEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetAdapterMod {
  
  trait MDCChipSetAdapter extends StObject {
    
    /** Announces the message via an aria-live region */
    def announceMessage(message: String): Unit
    
    /** Emits the given event with the given detail. */
    def emitEvent[D /* <: js.Object */](eventName: MDCChipSetEvents, eventDetail: D): Unit
    
    /** Returns the value for the given attribute, if it exists. */
    def getAttribute(attrName: MDCChipSetAttributes): String | Null
    
    /** Returns the actions provided by the child chip at the given index. */
    def getChipActionsAtIndex(index: Double): js.Array[MDCChipActionType]
    
    /** Returns the number of child chips. */
    def getChipCount(): Double
    
    /** Returns the ID of the chip at the given index. */
    def getChipIdAtIndex(index: Double): String
    
    /** Returns the index of the child chip with the matching ID. */
    def getChipIndexById(chipID: String): Double
    
    /** Proxies to the MDCChip#isActionFocusable method. */
    def isChipFocusableAtIndex(index: Double, actionType: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChip#isActionSelectable method. */
    def isChipSelectableAtIndex(index: Double, actionType: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChip#isActionSelected method. */
    def isChipSelectedAtIndex(index: Double, actionType: MDCChipActionType): Boolean
    
    /** Removes the chip at the given index. */
    def removeChipAtIndex(index: Double): Unit
    
    /** Proxies to the MDCChip#setActionFocus method. */
    def setChipFocusAtIndex(index: Double, action: MDCChipActionType, focus: MDCChipActionFocusBehavior): Unit
    
    /** Proxies to the MDCChip#setActionSelected method. */
    def setChipSelectedAtIndex(index: Double, actionType: MDCChipActionType, isSelected: Boolean): Unit
    
    /** Starts the chip animation at the given index. */
    def startChipAnimationAtIndex(index: Double, animation: MDCChipAnimation): Unit
  }
  object MDCChipSetAdapter {
    
    inline def apply(
      announceMessage: String => Unit,
      emitEvent: (MDCChipSetEvents, Any) => Unit,
      getAttribute: MDCChipSetAttributes => String | Null,
      getChipActionsAtIndex: Double => js.Array[MDCChipActionType],
      getChipCount: () => Double,
      getChipIdAtIndex: Double => String,
      getChipIndexById: String => Double,
      isChipFocusableAtIndex: (Double, MDCChipActionType) => Boolean,
      isChipSelectableAtIndex: (Double, MDCChipActionType) => Boolean,
      isChipSelectedAtIndex: (Double, MDCChipActionType) => Boolean,
      removeChipAtIndex: Double => Unit,
      setChipFocusAtIndex: (Double, MDCChipActionType, MDCChipActionFocusBehavior) => Unit,
      setChipSelectedAtIndex: (Double, MDCChipActionType, Boolean) => Unit,
      startChipAnimationAtIndex: (Double, MDCChipAnimation) => Unit
    ): MDCChipSetAdapter = {
      val __obj = js.Dynamic.literal(announceMessage = js.Any.fromFunction1(announceMessage), emitEvent = js.Any.fromFunction2(emitEvent), getAttribute = js.Any.fromFunction1(getAttribute), getChipActionsAtIndex = js.Any.fromFunction1(getChipActionsAtIndex), getChipCount = js.Any.fromFunction0(getChipCount), getChipIdAtIndex = js.Any.fromFunction1(getChipIdAtIndex), getChipIndexById = js.Any.fromFunction1(getChipIndexById), isChipFocusableAtIndex = js.Any.fromFunction2(isChipFocusableAtIndex), isChipSelectableAtIndex = js.Any.fromFunction2(isChipSelectableAtIndex), isChipSelectedAtIndex = js.Any.fromFunction2(isChipSelectedAtIndex), removeChipAtIndex = js.Any.fromFunction1(removeChipAtIndex), setChipFocusAtIndex = js.Any.fromFunction3(setChipFocusAtIndex), setChipSelectedAtIndex = js.Any.fromFunction3(setChipSelectedAtIndex), startChipAnimationAtIndex = js.Any.fromFunction2(startChipAnimationAtIndex))
      __obj.asInstanceOf[MDCChipSetAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCChipSetAdapter] (val x: Self) extends AnyVal {
      
      inline def setAnnounceMessage(value: String => Unit): Self = StObject.set(x, "announceMessage", js.Any.fromFunction1(value))
      
      inline def setEmitEvent(value: (MDCChipSetEvents, Any) => Unit): Self = StObject.set(x, "emitEvent", js.Any.fromFunction2(value))
      
      inline def setGetAttribute(value: MDCChipSetAttributes => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetChipActionsAtIndex(value: Double => js.Array[MDCChipActionType]): Self = StObject.set(x, "getChipActionsAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetChipCount(value: () => Double): Self = StObject.set(x, "getChipCount", js.Any.fromFunction0(value))
      
      inline def setGetChipIdAtIndex(value: Double => String): Self = StObject.set(x, "getChipIdAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetChipIndexById(value: String => Double): Self = StObject.set(x, "getChipIndexById", js.Any.fromFunction1(value))
      
      inline def setIsChipFocusableAtIndex(value: (Double, MDCChipActionType) => Boolean): Self = StObject.set(x, "isChipFocusableAtIndex", js.Any.fromFunction2(value))
      
      inline def setIsChipSelectableAtIndex(value: (Double, MDCChipActionType) => Boolean): Self = StObject.set(x, "isChipSelectableAtIndex", js.Any.fromFunction2(value))
      
      inline def setIsChipSelectedAtIndex(value: (Double, MDCChipActionType) => Boolean): Self = StObject.set(x, "isChipSelectedAtIndex", js.Any.fromFunction2(value))
      
      inline def setRemoveChipAtIndex(value: Double => Unit): Self = StObject.set(x, "removeChipAtIndex", js.Any.fromFunction1(value))
      
      inline def setSetChipFocusAtIndex(value: (Double, MDCChipActionType, MDCChipActionFocusBehavior) => Unit): Self = StObject.set(x, "setChipFocusAtIndex", js.Any.fromFunction3(value))
      
      inline def setSetChipSelectedAtIndex(value: (Double, MDCChipActionType, Boolean) => Unit): Self = StObject.set(x, "setChipSelectedAtIndex", js.Any.fromFunction3(value))
      
      inline def setStartChipAnimationAtIndex(value: (Double, MDCChipAnimation) => Unit): Self = StObject.set(x, "startChipAnimationAtIndex", js.Any.fromFunction2(value))
    }
  }
}
