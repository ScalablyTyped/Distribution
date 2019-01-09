package typings
package atMaterialDashUiCoreLib.inputlabelInputLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/FormLabel.FormLabelProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/FormLabel.FormLabelProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/FormLabel.FormLabelProps, @material-ui/core.@material-ui/core/InputLabel/InputLabel.InputLabelClassKey, never>) */ trait InputLabelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputLabelClassKey] {
  var FormLabelClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.formlabelFormLabelMod.FormLabelClassKey]
    ]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var shrink: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

