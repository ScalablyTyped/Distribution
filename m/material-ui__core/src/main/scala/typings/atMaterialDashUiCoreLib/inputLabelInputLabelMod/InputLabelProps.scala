package typings
package atMaterialDashUiCoreLib.inputLabelInputLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps[P]} */ trait InputLabelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputLabelClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var FormLabelClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.formLabelFormLabelMod.FormLabelClassKey]
    ]
  ] = js.undefined
  var disableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var shrink: js.UndefOr[scala.Boolean] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object InputLabelProps {
  @scala.inline
  def apply(
    FormLabelClasses: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.formLabelFormLabelMod.FormLabelClassKey]
    ] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[InputLabelClassKey]] = null,
    disableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    shrink: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): InputLabelProps = {
    val __obj = js.Dynamic.literal()
    if (FormLabelClasses != null) __obj.updateDynamic("FormLabelClasses")(FormLabelClasses)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink)
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLabelProps]
  }
}

