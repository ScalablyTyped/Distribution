package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridFeatureChooserPopoverMethods extends js.Object {
  /**
  	 * Returns the container for the popover contents
  	 */
  def container(): js.Object = js.native
  def destroy(): scala.Unit = js.native
  /**
  	 * Gets the currently set content for the popover container
  	 */
  def getContent(): java.lang.String = js.native
  /**
  	 * Gets the current coordinates of the popover
  	 */
  def getCoordinates(): js.Object = js.native
  /**
  	 * Hides the popover for the specified target
  	 */
  def hide(): scala.Unit = js.native
  /**
  	 * Returns the ID of the element the popover is attached to
  	 */
  def id(): java.lang.String = js.native
  def isShown(): scala.Unit = js.native
  def registerElements(elements: js.Object): scala.Unit = js.native
  /**
  	 * Sets the content for the popover container
  	 *
  	 * @param newCnt The popover content to set.
  	 */
  def setContent(newCnt: java.lang.String): scala.Unit = js.native
  /**
  	 * Sets the popover to specific coordinates.
  	 *
  	 * @param pos The popover coordinates in pixels.
  	 */
  def setCoordinates(pos: js.Object): scala.Unit = js.native
  /**
  	 * Shows the popover for the specified target
  	 *
  	 * @param trg The element to show popover for.
  	 * @param content The string to set for the popover to show.
  	 */
  def show(): scala.Unit = js.native
  def show(trg: stdLib.Element): scala.Unit = js.native
  def show(trg: stdLib.Element, content: java.lang.String): scala.Unit = js.native
  /**
  	 * Gets the popover current target
  	 */
  def target(): js.Object = js.native
}

