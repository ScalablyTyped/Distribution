package typings
package atMaterialDashUiLabLib.speeddialiconSpeedDialIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLSpanElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLSpanElement>[P]} */ trait SpeedDialIconProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SpeedDialIconClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var openIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object SpeedDialIconProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SpeedDialIconClassKey]] = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    openIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): SpeedDialIconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SpeedDialIconProps]
  }
}

