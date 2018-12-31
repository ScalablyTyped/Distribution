package typings
package atMaterialDashUiCoreLib.radiogroupRadioGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<@material-ui/core.@material-ui/core/FormGroup.FormGroupProps, std.Exclude<keyof @material-ui/core.@material-ui/core/FormGroup.FormGroupProps, 'classes' | 'onChange'>>, @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/FormGroup.FormGroupProps, @material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupClassKey, 'onChange'>) */ trait RadioGroupProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[RadioGroupClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

