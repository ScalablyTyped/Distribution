package typings.materialUi.MaterialUI.GridList

import typings.materialUi.materialUiStrings.bottom
import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.materialUi.materialUiStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
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
    cols: js.UndefOr[Double] = js.undefined,
    containerElement: String | ReactElement | (ComponentClass[_, ComponentState]) = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    rows: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    subtitle: ReactNode = null,
    subtitleStyle: CSSProperties = null,
    title: ReactNode = null,
    titleBackground: String = null,
    titlePosition: top | bottom = null,
    titleStyle: CSSProperties = null
  ): GridTileProps = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleBackground != null) __obj.updateDynamic("titleBackground")(titleBackground.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTileProps]
  }
}

