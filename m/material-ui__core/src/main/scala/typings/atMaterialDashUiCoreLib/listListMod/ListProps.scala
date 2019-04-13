package typings
package atMaterialDashUiCoreLib.listListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLUListElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLUListElement>[P]} */ trait ListProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ListClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactType[ListProps]] = js.undefined
  var dense: js.UndefOr[scala.Boolean] = js.undefined
  var disablePadding: js.UndefOr[scala.Boolean] = js.undefined
  var subheader: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ListClassKey]] = null,
    component: reactLib.reactMod.ReactType[ListProps] = null,
    dense: js.UndefOr[scala.Boolean] = js.undefined,
    disablePadding: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null,
    subheader: reactLib.reactMod.ReactElement[_] = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense)
    if (!js.isUndefined(disablePadding)) __obj.updateDynamic("disablePadding")(disablePadding)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subheader != null) __obj.updateDynamic("subheader")(subheader)
    __obj.asInstanceOf[ListProps]
  }
}

