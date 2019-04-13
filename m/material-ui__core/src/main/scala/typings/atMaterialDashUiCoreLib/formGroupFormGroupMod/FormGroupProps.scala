package typings
package atMaterialDashUiCoreLib.formGroupFormGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HtmlHTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.HtmlHTMLAttributes<std.HTMLDivElement>[P]} */ trait FormGroupProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[FormGroupClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var row: js.UndefOr[scala.Boolean] = js.undefined
}

object FormGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[FormGroupClassKey]] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    row: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
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

