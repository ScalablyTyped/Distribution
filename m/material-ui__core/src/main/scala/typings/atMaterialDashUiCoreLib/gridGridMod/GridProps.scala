package typings
package atMaterialDashUiCoreLib.gridGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement> & std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoint, boolean | @material-ui/core.@material-ui/core/Grid/Grid.GridSize>>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLElement> & std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoint, boolean | @material-ui/core.@material-ui/core/Grid/Grid.GridSize>>[P]} */ trait GridProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[GridClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var alignContent: js.UndefOr[GridContentAlignment] = js.undefined
  var alignItems: js.UndefOr[GridItemsAlignment] = js.undefined
  var component: js.UndefOr[
    java.lang.String | (reactLib.reactMod.ComponentType[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.Omit[GridProps, StrippedProps]])
  ] = js.undefined
  var container: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[GridDirection] = js.undefined
  var item: js.UndefOr[scala.Boolean] = js.undefined
  var justify: js.UndefOr[GridJustification] = js.undefined
  var spacing: js.UndefOr[GridSpacing] = js.undefined
  var wrap: js.UndefOr[GridWrap] = js.undefined
  var zeroMinWidth: js.UndefOr[scala.Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    alignContent: GridContentAlignment = null,
    alignItems: GridItemsAlignment = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[GridClassKey]] = null,
    component: java.lang.String | (reactLib.reactMod.ComponentType[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.Omit[GridProps, StrippedProps]]) = null,
    container: js.UndefOr[scala.Boolean] = js.undefined,
    direction: GridDirection = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    item: js.UndefOr[scala.Boolean] = js.undefined,
    justify: GridJustification = null,
    spacing: GridSpacing = null,
    style: reactLib.reactMod.CSSProperties = null,
    wrap: GridWrap = null,
    zeroMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item)
    if (justify != null) __obj.updateDynamic("justify")(justify)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    if (!js.isUndefined(zeroMinWidth)) __obj.updateDynamic("zeroMinWidth")(zeroMinWidth)
    __obj.asInstanceOf[GridProps]
  }
}

