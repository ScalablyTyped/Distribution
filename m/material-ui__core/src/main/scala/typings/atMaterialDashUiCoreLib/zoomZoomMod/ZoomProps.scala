package typings
package atMaterialDashUiCoreLib.zoomZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomProps
  extends atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps {
  var theme: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme] = js.undefined
}

object ZoomProps {
  @scala.inline
  def apply(
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme = null
  ): ZoomProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ZoomProps]
  }
}

