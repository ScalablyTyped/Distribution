package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.Props
import typings.react.reactMod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait SvgIconProps
  extends SVGAttributes[js.Object] {
  var hoverColor: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var ref: js.UndefOr[LegacyRef[SvgIcon]] = js.undefined
}

object SvgIconProps {
  @scala.inline
  def apply(
    Props: Props[SvgIcon] = null,
    SVGAttributes: SVGAttributes[js.Object] = null,
    color: String = null,
    hoverColor: String = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null,
    viewBox: String = null
  ): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Props)
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (style != null) __obj.updateDynamic("style")(style)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIconProps]
  }
}

