package typings
package atMaterialDashUiCoreLib.stylesWithThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @material-ui/core.@material-ui/core/styles/withTheme.WithTheme ]:? @material-ui/core.@material-ui/core/styles/withTheme.WithTheme[P]} */ trait ThemedComponentProps extends js.Object {
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
}

object ThemedComponentProps {
  @scala.inline
  def apply(innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedComponentProps]
  }
}

