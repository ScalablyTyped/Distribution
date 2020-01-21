package typings.materialDrawer

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/adapter", JSImport.Namespace)
@js.native
object adapterMod extends js.Object {
  @js.native
  class MDCDrawerAdapter () extends js.Object {
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit = js.native
    def elementHasClass(element: Element, className: String): Unit = js.native
    /**
      * Focuses the active / selected navigation item.
      */
    def focusActiveNavigationItem(): Unit = js.native
    /**
      * Returns true if the root Element contains the given class.
      */
    def hasClass(className: String): Boolean = js.native
    /**
      * Emits a custom event "MDCDrawer:closed" denoting the drawer has closed.
      */
    def notifyClose(): Unit = js.native
    /**
      * Emits a custom event "MDCDrawer:opened" denoting the drawer has opened.
      */
    def notifyOpen(): Unit = js.native
    /**
      * Releases focus trap from root element which was set by `trapFocus`
      * and restores focus to where it was prior to calling `trapFocus`.
      */
    def releaseFocus(): Unit = js.native
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit = js.native
    /**
      * Restores focus to element previously saved with 'saveFocus'.
      */
    def restoreFocus(): Unit = js.native
    /**
      * Saves the focus of currently active element.
      */
    def saveFocus(): Unit = js.native
    /**
      * Traps focus on root element and focuses the active navigation element.
      */
    def trapFocus(): Unit = js.native
  }
  
}

