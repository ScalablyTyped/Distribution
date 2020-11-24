package typings.heremaps.H.ui

import typings.heremaps.H.util.EventTarget
import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This namespace contains basic UI elements from which the UI controls are built.
  */
@JSGlobal("H.ui.base")
@js.native
object base extends js.Object {
  
  @js.native
  trait Container extends EventTarget {
    
    /**
      * Adds a child element to be rendered within the container element.
      * @param child {H.ui.base.Element} - the child element to be added
      * @returns {H.ui.base.Container} - this container instance
      */
    def addChild(child: Element): Container = js.native
    
    /**
      * This method adds a CSS class to this UI element (if it is not already present).
      * @param className {string} - the CSS class name to add
      * @returns {H.ui.base.Element} - this UI element instance
      */
    def addClass(className: String): Element = js.native
    
    /**
      * Returns the child collection of this container.
      * @returns {Array<H.ui.base.Element>} - Returns the child collection of this container.
      */
    def getChildren(): js.Array[Element] = js.native
    
    /**
      * This method returns a previously stored arbitrary data from this element.
      * @returns {*} - the previously stored data object or null if not data was stored.
      */
    def getData(): js.Any = js.native
    
    /**
      * This method returns the HTML element this UI element renders.
      *
      * Note: Before the UI element was rendered the method returns null.
      * @returns {?HTMLElement} - the element
      */
    def getElement(): HTMLElement = js.native
    
    /**
      * Returns the visibility of this element.
      * @returns {boolean} - visibility
      */
    def getVisibility(): Boolean = js.native
    
    /**
      * This method returns this UI element's disabled state as a boolean value.
      * @returns {boolean} - true if the element is disabled, false otherwise
      */
    def isDisabled(): Boolean = js.native
    
    /**
      * Removes a child element from this container's child collection.
      * @param child {H.ui.base.Element} - the child element to be removed
      */
    def removeChild(child: Element): Unit = js.native
    
    /**
      * This method removes a CSS class from this UI element (if it is present).
      * @param className {string} - the CSS class name to remove
      * @returns {H.ui.base.Element} - this UI element instance
      */
    def removeClass(className: String): Element = js.native
    
    /**
      * This method is the concrete implementation of the UI element. This method receives the pre-rendered HTML element which may be modified by deriving classes.
      * @param element {Element} - this UI element's HTML representation
      * @param doc {Document} - the HTML document into which the element is currently being rendered
      */
    def renderInternal(element: ES6Element, doc: Document): Unit = js.native
    
    /**
      * This method stores arbitrary data with this UI element.
      * @param data {*} - the data to be stored
      */
    def setData(data: js.Any): Unit = js.native
    
    /**
      * This method set's the disabled state of this UI element.
      * @param disabled {boolean} - true to disable the element, false to enable it
      * @param opt_force {boolean=} - an optional boolean flag indicating that the value should be set and propagated even if it is the same as the current state
      * @returns {H.ui.base.Element} - this element instance
      */
    def setDisabled(disabled: Boolean): ES6Element = js.native
    def setDisabled(disabled: Boolean, opt_force: Boolean): ES6Element = js.native
    
    /**
      * Sets the visibility of this element.
      * @param visibility {boolean} - visibility
      */
    def setVisibility(visibility: Boolean): Unit = js.native
  }
  
  @js.native
  trait Element extends EventTarget {
    
    /**
      * This method adds a CSS class to this UI element (if it is not already present).
      * @param className {string} - the CSS class name to add
      * @returns {H.ui.base.Element} - this UI element instance
      */
    def addClass(className: String): Element = js.native
    
    /**
      * This method returns a previously stored arbitrary data from this element.
      * @returns {*} - the previously stored data object or null if not data was stored.
      */
    def getData(): js.Any = js.native
    
    /**
      * This method returns the HTML element this UI element renders.
      *
      * Note: Before the UI element was rendered the method returns null.
      * @returns {?HTMLElement} - the element
      */
    def getElement(): HTMLElement = js.native
    
    /**
      * Returns the visibility of this element.
      * @returns {boolean} - visibility
      */
    def getVisibility(): Boolean = js.native
    
    /**
      * This method returns this UI element's disabled state as a boolean value.
      * @returns {boolean} - true if the element is disabled, false otherwise
      */
    def isDisabled(): Boolean = js.native
    
    /**
      * This method removes a CSS class from this UI element (if it is present).
      * @param className {string} - the CSS class name to remove
      * @returns {H.ui.base.Element} - this UI element instance
      */
    def removeClass(className: String): Element = js.native
    
    /**
      * This method is the concrete implementation of the UI element. This method receives the pre-rendered HTML element which may be modified by deriving classes.
      * @param element {Element} - this UI element's HTML representation
      * @param doc {Document} - the HTML document into which the element is currently being rendered
      */
    def renderInternal(element: ES6Element, doc: Document): Unit = js.native
    
    /**
      * This method stores arbitrary data with this UI element.
      * @param data {*} - the data to be stored
      */
    def setData(data: js.Any): Unit = js.native
    
    /**
      * This method set's the disabled state of this UI element.
      * @param disabled {boolean} - true to disable the element, false to enable it
      * @param opt_force {boolean=} - an optional boolean flag indicating that the value should be set and propagated even if it is the same as the current state
      * @returns {H.ui.base.Element} - this element instance
      */
    def setDisabled(disabled: Boolean): ES6Element = js.native
    def setDisabled(disabled: Boolean, opt_force: Boolean): ES6Element = js.native
    
    /**
      * Sets the visibility of this element.
      * @param visibility {boolean} - visibility
      */
    def setVisibility(visibility: Boolean): Unit = js.native
  }
}
