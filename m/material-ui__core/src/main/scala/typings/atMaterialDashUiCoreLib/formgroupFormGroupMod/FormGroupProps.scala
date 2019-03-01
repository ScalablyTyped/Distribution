package typings
package atMaterialDashUiCoreLib.formgroupFormGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HtmlHTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HtmlHTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HtmlHTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/FormGroup/FormGroup.FormGroupClassKey, never>) */ trait FormGroupProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[FormGroupClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var row: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object FormGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[FormGroupClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    row: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): FormGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FormGroupProps]
  }
}

