package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsivePanelOptions extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var breakpoint: js.UndefOr[scala.Double] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, scala.Unit]] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var toggleButton: js.UndefOr[java.lang.String] = js.undefined
}

object ResponsivePanelOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    breakpoint: scala.Int | scala.Double = null,
    close: js.Function1[/* e */ ResponsivePanelEvent, scala.Unit] = null,
    name: java.lang.String = null,
    open: js.Function1[/* e */ ResponsivePanelEvent, scala.Unit] = null,
    orientation: java.lang.String = null,
    toggleButton: java.lang.String = null
  ): ResponsivePanelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close)
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(open)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton)
    __obj.asInstanceOf[ResponsivePanelOptions]
  }
}

