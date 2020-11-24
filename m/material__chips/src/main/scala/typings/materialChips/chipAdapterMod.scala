package typings.materialChips

import typings.materialChips.chipConstantsMod.EventSource
import typings.std.ClientRect
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/chip/adapter", JSImport.Namespace)
@js.native
object chipAdapterMod extends js.Object {
  
  @js.native
  trait MDCChipAdapter extends js.Object {
    
    /**
      * Adds a class to the root element.
      */
    def addClass(className: String): Unit = js.native
    
    /**
      * Adds a class to the leading icon element.
      */
    def addClassToLeadingIcon(className: String): Unit = js.native
    
    def eventTargetHasClass(target: Null, className: String): Boolean = js.native
    /**
      * @return true if target has className, false otherwise.
      */
    def eventTargetHasClass(target: EventTarget, className: String): Boolean = js.native
    
    /**
      * Gives focus to the primary action.
      */
    def focusPrimaryAction(): Unit = js.native
    
    /**
      * Sets focus to the trailing action.
      */
    def focusTrailingAction(): Unit = js.native
    
    /**
      * @return the attribute string value if present, otherwise null
      */
    def getAttribute(attr: String): String | Null = js.native
    
    /**
      * @return The bounding client rect of the checkmark element or null if it doesn't exist.
      */
    def getCheckmarkBoundingClientRect(): ClientRect | Null = js.native
    
    /**
      * @return The computed property value of the given style property on the root element.
      */
    def getComputedStyleValue(propertyName: String): String = js.native
    
    /**
      * @return The bounding client rect of the root element.
      */
    def getRootBoundingClientRect(): ClientRect = js.native
    
    /**
      * @return true if the root element contains the given class.
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * @return Whether the chip has a leading icon.
      */
    def hasLeadingIcon(): Boolean = js.native
    
    /**
      * @return true if the text direction is right-to-left.
      */
    def isRTL(): Boolean = js.native
    
    /**
      * Returns true if the trailing action is navigable.
      * Should return the value of MDCChipTrailingAction#isNavigable() or false.
      */
    def isTrailingActionNavigable(): Boolean = js.native
    
    /**
      * Emits when editing finishes.
      */
    def notifyEditFinish(): Unit = js.native
    
    /**
      * Emits when editing starts.
      */
    def notifyEditStart(): Unit = js.native
    
    /**
      * Emits a custom "MDCChip:interaction" event denoting the chip has been
      * interacted with (typically on click or keydown).
      */
    def notifyInteraction(): Unit = js.native
    
    /**
      * Emits a custom event "MDCChip:navigation" denoting a focus navigation event.
      */
    def notifyNavigation(key: String, source: EventSource): Unit = js.native
    
    /**
      * Emits a custom event "MDCChip:removal" denoting the chip will be removed.
      */
    def notifyRemoval(): Unit = js.native
    def notifyRemoval(removedAnnouncement: String): Unit = js.native
    
    /**
      * Emits a custom "MDCChip:selection" event denoting the chip has been selected or deselected.
      */
    def notifySelection(selected: Boolean, chipSetShouldIgnore: Boolean): Unit = js.native
    
    /**
      * Emits a custom "MDCChip:trailingIconInteraction" event denoting the trailing icon has been
      * interacted with (typically on click or keydown).
      */
    def notifyTrailingIconInteraction(): Unit = js.native
    
    /**
      * Removes a class from the root element.
      */
    def removeClass(className: String): Unit = js.native
    
    /**
      * Removes a class from the leading icon element.
      */
    def removeClassFromLeadingIcon(className: String): Unit = js.native
    
    /**
      * Removes focus from the trailing action.
      */
    def removeTrailingActionFocus(): Unit = js.native
    
    /**
      * Sets the value of the attribute on the primary action content.
      */
    def setPrimaryActionAttr(attr: String, value: String): Unit = js.native
    
    /**
      * Sets the property value of the given style property on the root element.
      */
    def setStyleProperty(propertyName: String, value: String): Unit = js.native
  }
}
