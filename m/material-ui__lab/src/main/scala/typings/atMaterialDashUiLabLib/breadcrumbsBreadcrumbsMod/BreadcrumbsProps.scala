package typings
package atMaterialDashUiLabLib.breadcrumbsBreadcrumbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLElement>[P]} */ trait BreadcrumbsProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BreadcrumbsClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var itemsAfterCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var itemsBeforeCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var separator: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[BreadcrumbsClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    itemsAfterCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    itemsBeforeCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    maxItems: scala.Int | scala.Double = null,
    separator: reactLib.reactMod.ReactNs.ReactNode = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsAfterCollapse)) __obj.updateDynamic("itemsAfterCollapse")(itemsAfterCollapse)
    if (!js.isUndefined(itemsBeforeCollapse)) __obj.updateDynamic("itemsBeforeCollapse")(itemsBeforeCollapse)
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

