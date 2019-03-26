package typings
package atMaterialDashUiCoreLib.inputAdornmentInputAdornmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait InputAdornmentProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputAdornmentClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[InputAdornmentProps]] = js.undefined
  var disablePointerEvents: js.UndefOr[scala.Boolean] = js.undefined
  var disableTypography: js.UndefOr[scala.Boolean] = js.undefined
  var position: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.start | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.end
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object InputAdornmentProps {
  @scala.inline
  def apply(
    position: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.start | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.end,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[InputAdornmentClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[InputAdornmentProps] = null,
    disablePointerEvents: js.UndefOr[scala.Boolean] = js.undefined,
    disableTypography: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): InputAdornmentProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePointerEvents)) __obj.updateDynamic("disablePointerEvents")(disablePointerEvents)
    if (!js.isUndefined(disableTypography)) __obj.updateDynamic("disableTypography")(disableTypography)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAdornmentProps]
  }
}

