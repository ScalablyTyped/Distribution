package typings
package atMaterialDashUiCoreLib.tableFooterTableFooterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TableFooter/TableFooter.TableFooterBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/TableFooter/TableFooter.TableFooterBaseProps[P]} */ trait TableFooterProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableFooterClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactType[TableFooterBaseProps]] = js.undefined
}

object TableFooterProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TableFooterClassKey]] = null,
    component: reactLib.reactMod.ReactType[TableFooterBaseProps] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): TableFooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableFooterProps]
  }
}

