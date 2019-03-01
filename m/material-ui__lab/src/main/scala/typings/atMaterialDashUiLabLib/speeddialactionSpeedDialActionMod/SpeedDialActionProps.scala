package typings
package atMaterialDashUiLabLib.speeddialactionSpeedDialActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof std.Partial<@material-ui/core.@material-ui/core/Tooltip.TooltipProps>, 'classes' | never> ]: std.Partial<@material-ui/core.@material-ui/core/Tooltip.TooltipProps>[P]} */ trait SpeedDialActionProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SpeedDialActionClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var ButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.buttonButtonMod.ButtonProps]] = js.undefined
  var TooltipClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.tooltipTooltipMod.TooltipClassKey]
    ]
  ] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var icon: reactLib.reactMod.ReactNs.ReactNode
  var tooltipOpen: js.UndefOr[scala.Boolean] = js.undefined
  var tooltipPlacement: js.UndefOr[
    atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`bottom-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`bottom-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.bottom | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`left-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`left-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.left | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`right-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`right-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.right | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`top-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`top-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.top
  ] = js.undefined
  var tooltipTitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object SpeedDialActionProps {
  @scala.inline
  def apply(
    icon: reactLib.reactMod.ReactNs.ReactNode,
    ButtonProps: stdLib.Partial[atMaterialDashUiCoreLib.buttonButtonMod.ButtonProps] = null,
    TooltipClasses: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.tooltipTooltipMod.TooltipClassKey]
    ] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SpeedDialActionClassKey]
    ] = null,
    delay: scala.Int | scala.Double = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltipOpen: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipPlacement: atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`bottom-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`bottom-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.bottom | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`left-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`left-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.left | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`right-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`right-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.right | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`top-end` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.`top-start` | atMaterialDashUiLabLib.atMaterialDashUiLabLibStrings.top = null,
    tooltipTitle: reactLib.reactMod.ReactNs.ReactNode = null
  ): SpeedDialActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (ButtonProps != null) __obj.updateDynamic("ButtonProps")(ButtonProps)
    if (TooltipClasses != null) __obj.updateDynamic("TooltipClasses")(TooltipClasses)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tooltipOpen)) __obj.updateDynamic("tooltipOpen")(tooltipOpen)
    if (tooltipPlacement != null) __obj.updateDynamic("tooltipPlacement")(tooltipPlacement.asInstanceOf[js.Any])
    if (tooltipTitle != null) __obj.updateDynamic("tooltipTitle")(tooltipTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedDialActionProps]
  }
}

