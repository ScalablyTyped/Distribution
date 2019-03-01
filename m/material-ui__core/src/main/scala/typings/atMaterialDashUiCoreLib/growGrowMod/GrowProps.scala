package typings
package atMaterialDashUiCoreLib.growGrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/transitions/transition.TransitionProps, 'timeout'> ]: @material-ui/core.@material-ui/core/transitions/transition.TransitionProps[P]} */ trait GrowProps extends js.Object {
  var theme: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme] = js.undefined
  var timeout: js.UndefOr[js.Any | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
}

object GrowProps {
  @scala.inline
  def apply(
    theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme = null,
    timeout: js.Any | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null
  ): GrowProps = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrowProps]
  }
}

