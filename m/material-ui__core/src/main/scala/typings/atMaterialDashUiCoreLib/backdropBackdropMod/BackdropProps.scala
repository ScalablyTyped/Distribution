package typings
package atMaterialDashUiCoreLib.backdropBackdropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade/Fade.FadeProps>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/Fade/Fade.FadeProps>[P]} */ trait BackdropProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BackdropClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var invisible: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactEventHandler[js.Object]] = js.undefined
  var open: scala.Boolean
  var transitionDuration: js.UndefOr[scala.Nothing] = js.undefined
}

object BackdropProps {
  @scala.inline
  def apply(
    open: scala.Boolean,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[BackdropClassKey]] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    invisible: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.ReactEventHandler[js.Object] = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionDuration: js.UndefOr[scala.Nothing] = js.undefined
  ): BackdropProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration)
    __obj.asInstanceOf[BackdropProps]
  }
}

