package typings
package atMaterialDashUiCoreLib.tablebodyTableBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyBaseProps, @material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyClassKey, never>) */ trait TableBodyProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableBodyClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TableBodyBaseProps]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TableBodyProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TableBodyClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[TableBodyBaseProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableBodyProps]
  }
}

