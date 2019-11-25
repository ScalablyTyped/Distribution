package typings.atMaterialDashUiCore

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ListItemAvatar.ListItemAvatarProps> */
trait PartialListItemAvatarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapListItemAvatarClassKey] = js.undefined
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialListItemAvatarProps {
  @scala.inline
  def apply(
    className: String = null,
    classes: PartialClassNameMapListItemAvatarClassKey = null,
    innerRef: Ref[_] | RefObject[_] = null,
    style: CSSProperties = null
  ): PartialListItemAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListItemAvatarProps]
  }
}

