package typings
package atMaterialDashUiCoreLib.gridlisttileGridListTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLLIElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLLIElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLLIElement>, @material-ui/core.@material-ui/core/GridListTile/GridListTile.GridListTileClassKey, never>) */ trait GridListTileProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[GridListTileClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[GridListTileProps]] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object GridListTileProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[GridListTileClassKey]] = null,
    cols: scala.Int | scala.Double = null,
    component: reactLib.reactMod.ReactNs.ReactType[GridListTileProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    rows: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): GridListTileProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GridListTileProps]
  }
}

