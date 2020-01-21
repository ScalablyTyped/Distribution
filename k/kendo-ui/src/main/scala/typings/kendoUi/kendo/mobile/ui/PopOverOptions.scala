package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverOptions extends js.Object {
  var close: js.UndefOr[js.Function1[/* e */ PopOverCloseEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ PopOverOpenEvent, Unit]] = js.undefined
  var pane: js.UndefOr[PopOverPane] = js.undefined
  var popup: js.UndefOr[PopOverPopup] = js.undefined
}

object PopOverOptions {
  @scala.inline
  def apply(
    close: /* e */ PopOverCloseEvent => Unit = null,
    name: String = null,
    open: /* e */ PopOverOpenEvent => Unit = null,
    pane: PopOverPane = null,
    popup: PopOverPopup = null
  ): PopOverOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopOverOptions]
  }
}

