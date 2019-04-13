package typings
package atMaterialDashUiCoreLib.listItemIconListItemIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]} */ trait ListItemIconProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ListItemIconClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var children: reactLib.reactMod.ReactElement[_]
}

object ListItemIconProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement[_],
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ListItemIconClassKey]] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ListItemIconProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListItemIconProps]
  }
}

