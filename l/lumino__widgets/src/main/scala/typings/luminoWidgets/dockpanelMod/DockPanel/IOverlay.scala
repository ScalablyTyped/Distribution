package typings.luminoWidgets.dockpanelMod.DockPanel

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which manages the overlay node for a dock panel.
  */
@js.native
trait IOverlay extends js.Object {
  /**
    * The DOM node for the overlay.
    */
  val node: HTMLDivElement = js.native
  /**
    * Hide the overlay node.
    *
    * @param delay - The delay (in ms) before hiding the overlay.
    *   A delay value <= 0 should hide the overlay immediately.
    *
    * #### Notes
    * This is called whenever the overlay node should been hidden.
    */
  def hide(delay: Double): Unit = js.native
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
  def show(geo: IOverlayGeometry): Unit = js.native
}

object IOverlay {
  @scala.inline
  def apply(hide: Double => Unit, node: HTMLDivElement, show: IOverlayGeometry => Unit): IOverlay = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), node = node.asInstanceOf[js.Any], show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IOverlay]
  }
  @scala.inline
  implicit class IOverlayOps[Self <: IOverlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHide(value: Double => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def setNode(value: HTMLDivElement): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: IOverlayGeometry => Unit): Self = this.set("show", js.Any.fromFunction1(value))
  }
  
}

