package typings
package atMaterialDashUiCoreLib.tablesortlabelTableSortLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, @material-ui/core.@material-ui/core/TableSortLabel/TableSortLabel.TableSortLabelClassKey, never>) */ trait TableSortLabelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableSortLabelClassKey] {
  var IconComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.svgiconSvgIconMod.SvgIconProps]
  ] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.asc | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.desc
  ] = js.undefined
  var hideSortIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TableSortLabelProps {
  @scala.inline
  def apply(
    IconComponent: reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.svgiconSvgIconMod.SvgIconProps] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TableSortLabelClassKey]] = null,
    direction: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.asc | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.desc = null,
    hideSortIcon: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TableSortLabelProps = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSortIcon)) __obj.updateDynamic("hideSortIcon")(hideSortIcon)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableSortLabelProps]
  }
}

