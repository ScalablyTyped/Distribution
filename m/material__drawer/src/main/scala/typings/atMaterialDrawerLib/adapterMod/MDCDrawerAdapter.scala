package typings
package atMaterialDrawerLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/adapter", "MDCDrawerAdapter")
@js.native
class MDCDrawerAdapter () extends js.Object {
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: java.lang.String): scala.Unit = js.native
  def elementHasClass(element: stdLib.Element, className: java.lang.String): scala.Unit = js.native
  /**
    * Focuses the active / selected navigation item.
    */
  def focusActiveNavigationItem(): scala.Unit = js.native
  /**
    * Returns true if the root Element contains the given class.
    */
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  /**
    * Emits a custom event "MDCDrawer:closed" denoting the drawer has closed.
    */
  def notifyClose(): scala.Unit = js.native
  /**
    * Emits a custom event "MDCDrawer:opened" denoting the drawer has opened.
    */
  def notifyOpen(): scala.Unit = js.native
  /**
    * Releases focus trap from root element which was set by `trapFocus`
    * and restores focus to where it was prior to calling `trapFocus`.
    */
  def releaseFocus(): scala.Unit = js.native
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: java.lang.String): scala.Unit = js.native
  /**
    * Restores focus to element previously saved with 'saveFocus'.
    */
  def restoreFocus(): scala.Unit = js.native
  /**
    * Saves the focus of currently active element.
    */
  def saveFocus(): scala.Unit = js.native
  /**
    * Traps focus on root element and focuses the active navigation element.
    */
  def trapFocus(): scala.Unit = js.native
}

