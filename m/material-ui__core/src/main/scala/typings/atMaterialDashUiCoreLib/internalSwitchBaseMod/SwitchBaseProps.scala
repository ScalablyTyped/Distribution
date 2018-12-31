package typings
package atMaterialDashUiCoreLib.internalSwitchBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<@material-ui/core.@material-ui/core/IconButton.IconButtonProps, std.Exclude<keyof @material-ui/core.@material-ui/core/IconButton.IconButtonProps, 'classes' | 'onChange' | 'value'>>, @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/IconButton.IconButtonProps, @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseClassKey, 'onChange' | 'value'>) */ trait SwitchBaseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SwitchBaseClassKey] {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var checked: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var checkedIcon: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var disableRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: reactLib.reactMod.ReactNs.ReactNode
  var inputProps: js.UndefOr[reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement]] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement], 
      /* checked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
}

