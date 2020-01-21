package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenu extends js.Object {
  /**
    * The content's id the menu should use.
    */
  var contentId: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the menu is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The edge threshold for dragging the menu open. If a drag/swipe happens over this value, the menu is not triggered.
    */
  var maxEdgeStart: js.UndefOr[Double] = js.undefined
  /**
    * An id for the menu.
    */
  var menuId: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the menu is closed.
    */
  var onIonDidClose: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the menu is open.
    */
  var onIonDidOpen: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the menu is about to be closed.
    */
  var onIonWillClose: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Emitted when the menu is about to be opened.
    */
  var onIonWillOpen: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  /**
    * Which side of the view the menu should be placed.
    */
  var side: js.UndefOr[Side] = js.undefined
  /**
    * If `true`, swiping the menu is enabled.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.undefined
  /**
    * The display type of the menu. Available options: `"overlay"`, `"reveal"`, `"push"`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IonMenu {
  @scala.inline
  def apply(
    contentId: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maxEdgeStart: Int | Double = null,
    menuId: String = null,
    onIonDidClose: /* event */ CustomEvent[Unit] => Unit = null,
    onIonDidOpen: /* event */ CustomEvent[Unit] => Unit = null,
    onIonWillClose: /* event */ CustomEvent[Unit] => Unit = null,
    onIonWillOpen: /* event */ CustomEvent[Unit] => Unit = null,
    side: Side = null,
    swipeGesture: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): IonMenu = {
    val __obj = js.Dynamic.literal()
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maxEdgeStart != null) __obj.updateDynamic("maxEdgeStart")(maxEdgeStart.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (onIonDidClose != null) __obj.updateDynamic("onIonDidClose")(js.Any.fromFunction1(onIonDidClose))
    if (onIonDidOpen != null) __obj.updateDynamic("onIonDidOpen")(js.Any.fromFunction1(onIonDidOpen))
    if (onIonWillClose != null) __obj.updateDynamic("onIonWillClose")(js.Any.fromFunction1(onIonWillClose))
    if (onIonWillOpen != null) __obj.updateDynamic("onIonWillOpen")(js.Any.fromFunction1(onIonWillOpen))
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeGesture)) __obj.updateDynamic("swipeGesture")(swipeGesture.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenu]
  }
}

