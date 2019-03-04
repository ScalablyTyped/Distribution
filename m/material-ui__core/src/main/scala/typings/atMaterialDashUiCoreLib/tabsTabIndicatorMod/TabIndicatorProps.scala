package typings
package atMaterialDashUiCoreLib.tabsTabIndicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/Tabs/TabIndicator.TabIndicatorClassKey, never>) */ trait TabIndicatorProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TabIndicatorClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | java.lang.String
  var style: js.UndefOr[atMaterialDashUiCoreLib.Anon_Left with reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TabIndicatorProps {
  @scala.inline
  def apply(
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | java.lang.String,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TabIndicatorClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: atMaterialDashUiCoreLib.Anon_Left with reactLib.reactMod.ReactNs.CSSProperties = null
  ): TabIndicatorProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TabIndicatorProps]
  }
}

