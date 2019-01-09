package typings
package atMaterialDashUiCoreLib.nativeselectNativeSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Input.InputProps, 'classes' | 'value' | 'onChange'> ]: @material-ui/core.@material-ui/core/Input.InputProps[P]}
- Dropped {[ P in 'onChange' ]: @material-ui/core.@material-ui/core/NativeSelect/NativeSelectInput.NativeSelectInputProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Input.InputProps, @material-ui/core.@material-ui/core/NativeSelect/NativeSelect.NativeSelectClassKey, 'value' | 'onChange'>) */ trait NativeSelectProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[NativeSelectClassKey] {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean
  ] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

