package typings.luminoWidgets.dockpanelMod.DockPanel

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which manages the overlay node for a dock panel.
  */
trait IOverlay extends js.Object {
  /**
    * The DOM node for the overlay.
    */
  val node: HTMLDivElement
  /**
    * Hide the overlay node.
    *
    * @param delay - The delay (in ms) before hiding the overlay.
    *   A delay value <= 0 should hide the overlay immediately.
    *
    * #### Notes
    * This is called whenever the overlay node should been hidden.
    */
  def hide(delay: Double): Unit
  /**
    * Show the overlay using the given overlay geometry.
    *
    * @param geo - The desired geometry for the overlay.
    *
    * #### Notes
    * The given geometry values assume the node will use absolute
    * positioning.
    *
    * This is called on every mouse move event during a drag in order
    * to update the position of the overlay. It should be efficient.
    */
  def show(geo: IOverlayGeometry): Unit
}

object IOverlay {
  @scala.inline
  def apply(hide: Double => Unit, node: HTMLDivElement, show: IOverlayGeometry => Unit): IOverlay = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), node = node.asInstanceOf[js.Any], show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IOverlay]
  }
}

