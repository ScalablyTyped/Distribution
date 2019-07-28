package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsivePanelOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var breakpoint: js.UndefOr[Double] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var toggleButton: js.UndefOr[String] = js.undefined
}

object ResponsivePanelOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    breakpoint: Int | Double = null,
    close: /* e */ ResponsivePanelEvent => Unit = null,
    name: String = null,
    open: /* e */ ResponsivePanelEvent => Unit = null,
    orientation: String = null,
    toggleButton: String = null
  ): ResponsivePanelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton)
    __obj.asInstanceOf[ResponsivePanelOptions]
  }
}

