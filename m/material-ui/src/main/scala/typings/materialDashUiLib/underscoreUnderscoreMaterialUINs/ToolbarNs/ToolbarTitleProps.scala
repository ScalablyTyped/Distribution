package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.ToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.Props because var conflicts: children. Inlined key, ref */ trait ToolbarTitleProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] {
  var key: js.UndefOr[reactLib.reactMod.ReactNs.Key] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.ReactNs.LegacyRef[ToolbarTitle]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ToolbarTitleProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] = null,
    Props: reactLib.reactMod.ReactNs.Props[ToolbarTitle] = null,
    className: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    text: java.lang.String = null
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

