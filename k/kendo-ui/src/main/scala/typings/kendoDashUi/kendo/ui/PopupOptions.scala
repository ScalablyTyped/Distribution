package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PopupActivateEvent, Unit]] = js.undefined
  var adjustSize: js.UndefOr[js.Any] = js.undefined
  var anchor: js.UndefOr[String | JQuery] = js.undefined
  var animation: js.UndefOr[Boolean | PopupAnimation] = js.undefined
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ PopupCloseEvent, Unit]] = js.undefined
  var collision: js.UndefOr[String] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ PopupDeactivateEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ PopupOpenEvent, Unit]] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    activate: /* e */ PopupActivateEvent => Unit = null,
    adjustSize: js.Any = null,
    anchor: String | JQuery = null,
    animation: Boolean | PopupAnimation = null,
    appendTo: String | JQuery = null,
    close: /* e */ PopupCloseEvent => Unit = null,
    collision: String = null,
    deactivate: /* e */ PopupDeactivateEvent => Unit = null,
    name: String = null,
    open: /* e */ PopupOpenEvent => Unit = null,
    origin: String = null,
    position: String = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (adjustSize != null) __obj.updateDynamic("adjustSize")(adjustSize)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (collision != null) __obj.updateDynamic("collision")(collision)
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction1(deactivate))
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PopupOptions]
  }
}

