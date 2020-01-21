package typings.ionicCore.componentsMod.Components

import typings.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenu extends js.Object {
  /**
    * The content's id the menu should use.
    */
  var contentId: js.UndefOr[String] = js.native
  /**
    * If `true`, the menu is disabled.
    */
  var disabled: Boolean = js.native
  /**
    * The edge threshold for dragging the menu open. If a drag/swipe happens over this value, the menu is not triggered.
    */
  var maxEdgeStart: Double = js.native
  /**
    * An id for the menu.
    */
  var menuId: js.UndefOr[String] = js.native
  /**
    * Which side of the view the menu should be placed.
    */
  var side: Side = js.native
  /**
    * If `true`, swiping the menu is enabled.
    */
  var swipeGesture: Boolean = js.native
  /**
    * The display type of the menu. Available options: `"overlay"`, `"reveal"`, `"push"`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Closes the menu. If the menu is already closed or it can't be closed, it returns `false`.
    */
  def close(): js.Promise[Boolean] = js.native
  def close(animated: Boolean): js.Promise[Boolean] = js.native
  /**
    * Returns `true` is the menu is active.  A menu is active when it can be opened or closed, meaning it's enabled and it's not part of a `ion-split-pane`.
    */
  def isActive(): js.Promise[Boolean] = js.native
  /**
    * Returns `true` is the menu is open.
    */
  def isOpen(): js.Promise[Boolean] = js.native
  /**
    * Opens the menu. If the menu is already open or it can't be opened, it returns `false`.
    */
  def open(): js.Promise[Boolean] = js.native
  def open(animated: Boolean): js.Promise[Boolean] = js.native
  /**
    * Opens or closes the button. If the operation can't be completed successfully, it returns `false`.
    */
  def setOpen(shouldOpen: Boolean): js.Promise[Boolean] = js.native
  def setOpen(shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
  /**
    * Toggles the menu. If the menu is already open, it will try to close, otherwise it will try to open it. If the operation can't be completed successfully, it returns `false`.
    */
  def toggle(): js.Promise[Boolean] = js.native
  def toggle(animated: Boolean): js.Promise[Boolean] = js.native
}

