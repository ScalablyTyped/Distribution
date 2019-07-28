package typings.materialDashUi.underscoreUnderscoreMaterialUINs.ToolbarNs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait ToolbarTitleProps
  extends HTMLAttributes[js.Object] {
  var key: js.UndefOr[Key] = js.undefined
  var ref: js.UndefOr[LegacyRef[ToolbarTitle]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ToolbarTitleProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[js.Object] = null,
    Props: Props[ToolbarTitle] = null,
    className: String = null,
    style: CSSProperties = null,
    text: String = null
  ): ToolbarTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ToolbarTitleProps]
  }
}

