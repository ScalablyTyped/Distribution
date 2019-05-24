package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/GridListTileBar.GridListTileBarProps> */
trait PartialGridListTileBarProps extends js.Object {
  var actionIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var actionPosition: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[
        atMaterialDashUiCoreLib.gridListTileBarGridListTileBarMod.GridListTileBarClassKey
      ]
    ]
  ] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var subtitle: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var titlePosition: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom
  ] = js.undefined
}

object PartialGridListTileBarProps {
  @scala.inline
  def apply(
    actionIcon: reactLib.reactMod.ReactNode = null,
    actionPosition: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[
        atMaterialDashUiCoreLib.gridListTileBarGridListTileBarMod.GridListTileBarClassKey
      ]
    ] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null,
    subtitle: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null,
    titlePosition: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom = null
  ): PartialGridListTileBarProps = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGridListTileBarProps]
  }
}

