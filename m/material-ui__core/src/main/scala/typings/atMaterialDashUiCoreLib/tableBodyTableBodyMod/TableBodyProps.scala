package typings
package atMaterialDashUiCoreLib.tableBodyTableBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyBaseProps[P]} */ trait TableBodyProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableBodyClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactType[TableBodyBaseProps]] = js.undefined
}

object TableBodyProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TableBodyClassKey]] = null,
    component: reactLib.reactMod.ReactType[TableBodyBaseProps] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null
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

