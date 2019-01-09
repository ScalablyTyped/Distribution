package typings
package atMaterialDashUiCoreLib.radiogroupRadioGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/FormGroup.FormGroupProps, 'classes' | 'onChange'> ]: @material-ui/core.@material-ui/core/FormGroup.FormGroupProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/FormGroup.FormGroupProps, @material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupClassKey, 'onChange'>) */ trait RadioGroupProps
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

