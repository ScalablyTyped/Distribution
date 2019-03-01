package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var activate: js.UndefOr[js.Function1[/* e */ PopupActivateEvent, scala.Unit]] = js.undefined
  var adjustSize: js.UndefOr[js.Any] = js.undefined
  var anchor: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var animation: js.UndefOr[scala.Boolean | PopupAnimation] = js.undefined
  var appendTo: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ PopupCloseEvent, scala.Unit]] = js.undefined
  var collision: js.UndefOr[java.lang.String] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ PopupDeactivateEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ PopupOpenEvent, scala.Unit]] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    activate: js.Function1[/* e */ PopupActivateEvent, scala.Unit] = null,
    adjustSize: js.Any = null,
    anchor: java.lang.String | kendoDashUiLib.JQuery = null,
    animation: scala.Boolean | PopupAnimation = null,
    appendTo: java.lang.String | kendoDashUiLib.JQuery = null,
    close: js.Function1[/* e */ PopupCloseEvent, scala.Unit] = null,
    collision: java.lang.String = null,
    deactivate: js.Function1[/* e */ PopupDeactivateEvent, scala.Unit] = null,
    name: java.lang.String = null,
    open: js.Function1[/* e */ PopupOpenEvent, scala.Unit] = null,
    origin: java.lang.String = null,
    position: java.lang.String = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (adjustSize != null) __obj.updateDynamic("adjustSize")(adjustSize)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close)
    if (collision != null) __obj.updateDynamic("collision")(collision)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(open)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PopupOptions]
  }
}

