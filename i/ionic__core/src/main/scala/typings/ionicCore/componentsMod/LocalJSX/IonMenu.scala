package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Side
import typings.std.CustomEvent
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
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The edge threshold for dragging the menu open. If a drag/swipe happens over this value, the menu is not triggered.
    */
  var maxEdgeStart: js.UndefOr[Double] = js.native
  /**
    * An id for the menu.
    */
  var menuId: js.UndefOr[String] = js.native
  /**
    * Emitted when the menu is closed.
    */
  var onIonDidClose: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the menu is open.
    */
  var onIonDidOpen: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the menu is about to be closed.
    */
  var onIonWillClose: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted when the menu is about to be opened.
    */
  var onIonWillOpen: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Which side of the view the menu should be placed.
    */
  var side: js.UndefOr[Side] = js.native
  /**
    * If `true`, swiping the menu is enabled.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.native
  /**
    * The display type of the menu. Available options: `"overlay"`, `"reveal"`, `"push"`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object IonMenu {
  @scala.inline
  def apply(): IonMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonMenu]
  }
  @scala.inline
  implicit class IonMenuOps[Self <: IonMenu] (val x: Self) extends AnyVal {
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
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMaxEdgeStart(value: Double): Self = this.set("maxEdgeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEdgeStart: Self = this.set("maxEdgeStart", js.undefined)
    @scala.inline
    def setMenuId(value: String): Self = this.set("menuId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuId: Self = this.set("menuId", js.undefined)
    @scala.inline
    def setOnIonDidClose(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonDidClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonDidClose: Self = this.set("onIonDidClose", js.undefined)
    @scala.inline
    def setOnIonDidOpen(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonDidOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonDidOpen: Self = this.set("onIonDidOpen", js.undefined)
    @scala.inline
    def setOnIonWillClose(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonWillClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonWillClose: Self = this.set("onIonWillClose", js.undefined)
    @scala.inline
    def setOnIonWillOpen(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonWillOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonWillOpen: Self = this.set("onIonWillOpen", js.undefined)
    @scala.inline
    def setSide(value: Side): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setSwipeGesture(value: Boolean): Self = this.set("swipeGesture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeGesture: Self = this.set("swipeGesture", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

