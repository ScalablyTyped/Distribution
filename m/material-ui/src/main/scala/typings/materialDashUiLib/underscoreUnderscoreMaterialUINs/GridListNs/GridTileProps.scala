package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.GridListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTileProps extends js.Object {
  var actionIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var actionPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right
  ] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var containerElement: js.UndefOr[
    java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState])
  ] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var subtitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var subtitleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var titleBackground: js.UndefOr[java.lang.String] = js.undefined
  var titlePosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.top | materialDashUiLib.materialDashUiLibStrings.bottom
  ] = js.undefined
  var titleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object GridTileProps {
  @scala.inline
  def apply(
    actionIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    actionPosition: materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right = null,
    cols: scala.Int | scala.Double = null,
    containerElement: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    rows: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    subtitle: reactLib.reactMod.ReactNs.ReactNode = null,
    subtitleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    titleBackground: java.lang.String = null,
    titlePosition: materialDashUiLib.materialDashUiLibStrings.top | materialDashUiLib.materialDashUiLibStrings.bottom = null,
    titleStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): GridTileProps = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon)
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleBackground != null) __obj.updateDynamic("titleBackground")(titleBackground)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[GridTileProps]
  }
}

