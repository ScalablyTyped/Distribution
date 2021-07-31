package typings.materialTab

import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCTabAdapter extends StObject {
    
    /**
      * Activates the indicator element.
      * @param previousIndicatorClientRect The client rect of the previously activated indicator
      */
    def activateIndicator(): Unit = js.native
    def activateIndicator(previousIndicatorClientRect: ClientRect): Unit = js.native
    
    /**
      * Adds the given className to the root element.
      * @param className The className to add
      */
    def addClass(className: String): Unit = js.native
    
    /** Deactivates the indicator. */
    def deactivateIndicator(): Unit = js.native
    
    /**
      * Applies focus to the root element
      */
    def focus(): Unit = js.native
    
    /**
      * Returns the offsetLeft of the content element.
      */
    def getContentOffsetLeft(): Double = js.native
    
    /**
      * Returns the offsetWidth of the content element.
      */
    def getContentOffsetWidth(): Double = js.native
    
    /**
      * Returns the offsetLeft value of the root element.
      */
    def getOffsetLeft(): Double = js.native
    
    /**
      * Returns the offsetWidth value of the root element.
      */
    def getOffsetWidth(): Double = js.native
    
    /**
      * Returns whether the root element has the given className.
      * @param className The className to remove
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * Emits the MDCTab:interacted event for use by parent components
      */
    def notifyInteracted(): Unit = js.native
    
    /**
      * Removes the given className from the root element.
      * @param className The className to remove
      */
    def removeClass(className: String): Unit = js.native
    
    /**
      * Sets the given attrName of the root element to the given value.
      * @param attr The attribute name to set
      * @param value The value so give the attribute
      */
    def setAttr(attr: String, value: String): Unit = js.native
  }
}
