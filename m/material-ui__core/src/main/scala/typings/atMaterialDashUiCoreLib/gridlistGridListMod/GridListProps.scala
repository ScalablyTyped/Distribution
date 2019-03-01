package typings
package atMaterialDashUiCoreLib.gridlistGridListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLUListElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLUListElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLUListElement>, @material-ui/core.@material-ui/core/GridList/GridList.GridListClassKey, never>) */ trait GridListProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[GridListClassKey] {
  var cellHeight: js.UndefOr[scala.Double | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[GridListProps]] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object GridListProps {
  @scala.inline
  def apply(
    cellHeight: scala.Double | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[GridListClassKey]] = null,
    cols: scala.Int | scala.Double = null,
    component: reactLib.reactMod.ReactNs.ReactType[GridListProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    spacing: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): GridListProps = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GridListProps]
  }
}

