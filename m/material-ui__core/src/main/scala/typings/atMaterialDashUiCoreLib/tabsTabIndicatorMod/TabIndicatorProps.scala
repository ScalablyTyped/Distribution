package typings
package atMaterialDashUiCoreLib.tabsTabIndicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]} */ trait TabIndicatorProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TabIndicatorClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | java.lang.String
  @JSName("style")
  var style_TabIndicatorProps: atMaterialDashUiCoreLib.Anon_Left
}

object TabIndicatorProps {
  @scala.inline
  def apply(
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | java.lang.String,
    style: atMaterialDashUiCoreLib.Anon_Left,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TabIndicatorClassKey]] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null
  ): TabIndicatorProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIndicatorProps]
  }
}

