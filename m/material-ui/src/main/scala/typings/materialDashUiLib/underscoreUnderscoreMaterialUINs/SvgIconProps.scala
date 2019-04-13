package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.Props because var conflicts: children. Inlined key, ref */ trait SvgIconProps
  extends reactLib.reactMod.SVGAttributes[js.Object] {
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.LegacyRef[SvgIcon]] = js.undefined
}

object SvgIconProps {
  @scala.inline
  def apply(
    Props: reactLib.reactMod.Props[SvgIcon] = null,
    SVGAttributes: reactLib.reactMod.SVGAttributes[js.Object] = null,
    color: java.lang.String = null,
    hoverColor: java.lang.String = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    style: reactLib.reactMod.CSSProperties = null,
    viewBox: java.lang.String = null
  ): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Props)
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (style != null) __obj.updateDynamic("style")(style)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIconProps]
  }
}

