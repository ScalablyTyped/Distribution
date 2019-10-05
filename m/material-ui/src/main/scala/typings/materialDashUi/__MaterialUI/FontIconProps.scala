package typings.materialDashUi.__MaterialUI

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
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
    color: String = null,
    hoverColor: String = null,
    key: Key = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    ref: LegacyRef[FontIcon] = null,
    style: CSSProperties = null
  ): FontIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FontIconProps]
  }
}

