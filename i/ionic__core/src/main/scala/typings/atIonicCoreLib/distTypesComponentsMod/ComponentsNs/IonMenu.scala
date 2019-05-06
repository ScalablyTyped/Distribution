package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenu extends js.Object {
  /**
    * The content's id the menu should use.
    */
  var contentId: js.UndefOr[java.lang.String] = js.native
  /**
    * If `true`, the menu is disabled.
    */
  var disabled: scala.Boolean = js.native
  /**
    * The edge threshold for dragging the menu open. If a drag/swipe happens over this value, the menu is not triggered.
    */
  var maxEdgeStart: scala.Double = js.native
  /**
    * An id for the menu.
    */
  var menuId: js.UndefOr[java.lang.String] = js.native
  /**
    * Which side of the view the menu should be placed.
    */
  var side: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Side */ js.Any = js.native
  /**
    * If `true`, swiping the menu is enabled.
    */
  var swipeGesture: scala.Boolean = js.native
  /**
    * The display type of the menu. Available options: `"overlay"`, `"reveal"`, `"push"`.
    */
  var `type`: js.UndefOr[java.lang.String] = js.native
  /**
    * Closes the menu. If the menu is already closed or it can't be closed, it returns `false`.
    */
  def close(): js.Promise[scala.Boolean] = js.native
  def close(animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Returns `true` is the menu is active.  A menu is active when it can be opened or closed, meaning it's enabled and it's not part of a `ion-split-pane`.
    */
  def isActive(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns `true` is the menu is open.
    */
  def isOpen(): js.Promise[scala.Boolean] = js.native
  /**
    * Opens the menu. If the menu is already open or it can't be opened, it returns `false`.
    */
  def open(): js.Promise[scala.Boolean] = js.native
  def open(animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Opens or closes the button. If the operation can't be completed successfully, it returns `false`.
    */
  def setOpen(shouldOpen: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def setOpen(shouldOpen: scala.Boolean, animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /**
    * Toggles the menu. If the menu is already open, it will try to close, otherwise it will try to open it. If the operation can't be completed successfully, it returns `false`.
    */
  def toggle(): js.Promise[scala.Boolean] = js.native
  def toggle(animated: scala.Boolean): js.Promise[scala.Boolean] = js.native
}

