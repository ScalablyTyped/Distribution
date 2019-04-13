package typings
package atMaterialDashUiCoreLib.expansionPanelSummaryExpansionPanelSummaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseProps[P]} */ trait ExpansionPanelSummaryProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ExpansionPanelSummaryClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var IconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconButtonIconButtonMod.IconButtonProps]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var expandIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[reactLib.reactMod.ReactEventHandler[js.Object]] = js.undefined
}

object ExpansionPanelSummaryProps {
  @scala.inline
  def apply(
    IconButtonProps: stdLib.Partial[atMaterialDashUiCoreLib.iconButtonIconButtonMod.IconButtonProps] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ExpansionPanelSummaryClassKey]
    ] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    expandIcon: reactLib.reactMod.ReactNode = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    onChange: reactLib.reactMod.ReactEventHandler[js.Object] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ExpansionPanelSummaryProps = {
    val __obj = js.Dynamic.literal()
    if (IconButtonProps != null) __obj.updateDynamic("IconButtonProps")(IconButtonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ExpansionPanelSummaryProps]
  }
}

