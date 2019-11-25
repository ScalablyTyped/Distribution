package typings.materialDashUi.__MaterialUI

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppBarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var iconClassNameLeft: js.UndefOr[String] = js.undefined
  var iconClassNameRight: js.UndefOr[String] = js.undefined
  var iconElementLeft: js.UndefOr[ReactElement] = js.undefined
  var iconElementRight: js.UndefOr[ReactElement] = js.undefined
  var iconStyleLeft: js.UndefOr[CSSProperties] = js.undefined
  var iconStyleRight: js.UndefOr[CSSProperties] = js.undefined
  var onLeftIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onRightIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onTitleClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var showMenuIconButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object AppBarProps {
  @scala.inline
  def apply(
    className: String = null,
    iconClassNameLeft: String = null,
    iconClassNameRight: String = null,
    iconElementLeft: ReactElement = null,
    iconElementRight: ReactElement = null,
    iconStyleLeft: CSSProperties = null,
    iconStyleRight: CSSProperties = null,
    onLeftIconButtonClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onRightIconButtonClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onTitleClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    showMenuIconButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: ReactNode = null,
    titleStyle: CSSProperties = null,
    zDepth: Int | Double = null
  ): AppBarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (iconClassNameLeft != null) __obj.updateDynamic("iconClassNameLeft")(iconClassNameLeft.asInstanceOf[js.Any])
    if (iconClassNameRight != null) __obj.updateDynamic("iconClassNameRight")(iconClassNameRight.asInstanceOf[js.Any])
    if (iconElementLeft != null) __obj.updateDynamic("iconElementLeft")(iconElementLeft.asInstanceOf[js.Any])
    if (iconElementRight != null) __obj.updateDynamic("iconElementRight")(iconElementRight.asInstanceOf[js.Any])
    if (iconStyleLeft != null) __obj.updateDynamic("iconStyleLeft")(iconStyleLeft.asInstanceOf[js.Any])
    if (iconStyleRight != null) __obj.updateDynamic("iconStyleRight")(iconStyleRight.asInstanceOf[js.Any])
    if (onLeftIconButtonClick != null) __obj.updateDynamic("onLeftIconButtonClick")(js.Any.fromFunction1(onLeftIconButtonClick))
    if (onRightIconButtonClick != null) __obj.updateDynamic("onRightIconButtonClick")(js.Any.fromFunction1(onRightIconButtonClick))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (!js.isUndefined(showMenuIconButton)) __obj.updateDynamic("showMenuIconButton")(showMenuIconButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBarProps]
  }
}

