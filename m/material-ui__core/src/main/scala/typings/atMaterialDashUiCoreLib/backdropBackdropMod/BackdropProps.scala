package typings
package atMaterialDashUiCoreLib.backdropBackdropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade.FadeProps>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade.FadeProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade.FadeProps>, @material-ui/core.@material-ui/core/Backdrop/Backdrop.BackdropClassKey, never>) */ trait BackdropProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BackdropClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var invisible: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[js.Object]] = js.undefined
  var open: scala.Boolean
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
}

object BackdropProps {
  @scala.inline
  def apply(
    open: scala.Boolean,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[BackdropClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    invisible: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.ReactNs.ReactEventHandler[js.Object] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionDuration: js.Any = null
  ): BackdropProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration)
    __obj.asInstanceOf[BackdropProps]
  }
}

