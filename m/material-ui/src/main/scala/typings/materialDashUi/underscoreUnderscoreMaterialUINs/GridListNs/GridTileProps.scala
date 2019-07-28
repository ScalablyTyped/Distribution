package typings.materialDashUi.underscoreUnderscoreMaterialUINs.GridListNs

import typings.materialDashUi.materialDashUiStrings.bottom
import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.materialDashUi.materialDashUiStrings.top
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTileProps extends js.Object {
  var actionIcon: js.UndefOr[ReactElement] = js.undefined
  var actionPosition: js.UndefOr[left | right] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var containerElement: js.UndefOr[String | ReactElement | (ComponentClass[_, ComponentState])] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var titleBackground: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[top | bottom] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object GridTileProps {
  @scala.inline
  def apply(
    actionIcon: ReactElement = null,
    actionPosition: left | right = null,
    cols: Int | Double = null,
    containerElement: String | ReactElement | (ComponentClass[_, ComponentState]) = null,
    onClick: MouseEventHandler[js.Object] = null,
    rows: Int | Double = null,
    style: CSSProperties = null,
    subtitle: ReactNode = null,
    subtitleStyle: CSSProperties = null,
    title: ReactNode = null,
    titleBackground: String = null,
    titlePosition: top | bottom = null,
    titleStyle: CSSProperties = null
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

