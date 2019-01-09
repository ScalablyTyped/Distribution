package typings
package atMaterialDashUiCoreLib.backdropBackdropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade.FadeProps>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade.FadeProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade.FadeProps>, @material-ui/core.@material-ui/core/Backdrop/Backdrop.BackdropClassKey, never>) */ trait BackdropProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BackdropClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var invisible: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[js.Object]] = js.undefined
  var open: scala.Boolean
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
}

