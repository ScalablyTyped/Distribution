package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.Props because var conflicts: children. Inlined key, ref */ trait FontIconProps
  extends reactLib.reactMod.HTMLAttributes[js.Object] {
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.LegacyRef[FontIcon]] = js.undefined
}

object FontIconProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[js.Object] = null,
    Props: reactLib.reactMod.Props[FontIcon] = null,
    color: java.lang.String = null,
    hoverColor: java.lang.String = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): FontIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (color != null) __obj.updateDynamic("color")(color)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FontIconProps]
  }
}

