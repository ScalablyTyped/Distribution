package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ListItemAvatar.ListItemAvatarProps> */
trait PartialListItemAvatarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.listItemAvatarListItemAvatarMod.ListItemAvatarClassKey]
    ]
  ] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PartialListItemAvatarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.listItemAvatarListItemAvatarMod.ListItemAvatarClassKey]
    ] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): PartialListItemAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PartialListItemAvatarProps]
  }
}

