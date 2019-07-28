package typings.igniteDashUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridFeatureChooserPopoverMethods extends js.Object {
  /**
  	 * Returns the container for the popover contents
  	 */
  def container(): js.Object = js.native
  def destroy(): Unit = js.native
  /**
  	 * Gets the currently set content for the popover container
  	 */
  def getContent(): String = js.native
  /**
  	 * Gets the current coordinates of the popover
  	 */
  def getCoordinates(): js.Object = js.native
  /**
  	 * Hides the popover for the specified target
  	 */
  def hide(): Unit = js.native
  /**
  	 * Returns the ID of the element the popover is attached to
  	 */
  def id(): String = js.native
  def isShown(): Unit = js.native
  def registerElements(elements: js.Object): Unit = js.native
  /**
  	 * Sets the content for the popover container
  	 *
  	 * @param newCnt The popover content to set.
  	 */
  def setContent(newCnt: String): Unit = js.native
  /**
  	 * Sets the popover to specific coordinates.
  	 *
  	 * @param pos The popover coordinates in pixels.
  	 */
  def setCoordinates(pos: js.Object): Unit = js.native
  /**
  	 * Shows the popover for the specified target
  	 *
  	 * @param trg The element to show popover for.
  	 * @param content The string to set for the popover to show.
  	 */
  def show(): Unit = js.native
  def show(trg: Element): Unit = js.native
  def show(trg: Element, content: String): Unit = js.native
  /**
  	 * Gets the popover current target
  	 */
  def target(): js.Object = js.native
}

