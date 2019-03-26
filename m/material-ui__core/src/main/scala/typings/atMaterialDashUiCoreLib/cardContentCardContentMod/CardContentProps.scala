package typings
package atMaterialDashUiCoreLib.cardContentCardContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait CardContentProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[CardContentClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[CardContentProps]] = js.undefined
}

object CardContentProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CardContentClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[CardContentProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CardContentProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardContentProps]
  }
}

