package typings
package atMaterialDashUiCoreLib.tableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Table/Table.TableBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/Table/Table.TableBaseProps[P]} */ trait TableProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TableBaseProps]] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TableClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[TableBaseProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    padding: Padding = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableProps]
  }
}

