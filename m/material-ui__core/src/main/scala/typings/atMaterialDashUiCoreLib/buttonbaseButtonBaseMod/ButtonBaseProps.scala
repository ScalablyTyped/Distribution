package typings
package atMaterialDashUiCoreLib.buttonbaseButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<react.react.AnchorHTMLAttributes<react.HTMLElement> & react.react.ButtonHTMLAttributes<react.HTMLElement>, std.Exclude<keyof react.react.AnchorHTMLAttributes<react.HTMLElement> & react.react.ButtonHTMLAttributes<react.HTMLElement>, 'classes' | never>>, @material-ui/core.@material-ui/core.StandardProps<react.react.AnchorHTMLAttributes<react.HTMLElement> & react.react.ButtonHTMLAttributes<react.HTMLElement>, @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseClassKey, never>) */ trait ButtonBaseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ButtonBaseClassKey] {
  var TouchRippleProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.buttonbaseTouchRippleMod.TouchRippleProps]
  ] = js.undefined
  var action: js.UndefOr[js.Function1[/* actions */ ButtonBaseActions, scala.Unit]] = js.undefined
  var buttonRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[ButtonBaseProps]] = js.undefined
  var disableRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var focusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var focusVisibleClassName: js.UndefOr[java.lang.String] = js.undefined
  var onFocusVisible: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

