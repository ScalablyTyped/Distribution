package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverOptions extends js.Object {
  var close: js.UndefOr[js.Function1[/* e */ PopOverCloseEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ PopOverOpenEvent, scala.Unit]] = js.undefined
  var pane: js.UndefOr[PopOverPane] = js.undefined
  var popup: js.UndefOr[PopOverPopup] = js.undefined
}

object PopOverOptions {
  @scala.inline
  def apply(
    close: /* e */ PopOverCloseEvent => scala.Unit = null,
    name: java.lang.String = null,
    open: /* e */ PopOverOpenEvent => scala.Unit = null,
    pane: PopOverPane = null,
    popup: PopOverPopup = null
  ): PopOverOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    __obj.asInstanceOf[PopOverOptions]
  }
}

