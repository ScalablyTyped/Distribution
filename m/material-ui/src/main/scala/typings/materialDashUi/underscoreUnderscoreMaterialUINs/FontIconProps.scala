package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait FontIconProps
  extends HTMLAttributes[js.Object] {
  var hoverColor: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var ref: js.UndefOr[LegacyRef[FontIcon]] = js.undefined
}

object FontIconProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[js.Object] = null,
    Props: Props[FontIcon] = null,
    color: String = null,
    hoverColor: String = null,
    onMouseEnter: MouseEventHandler[js.Object] = null,
    onMouseLeave: MouseEventHandler[js.Object] = null,
    style: CSSProperties = null
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

