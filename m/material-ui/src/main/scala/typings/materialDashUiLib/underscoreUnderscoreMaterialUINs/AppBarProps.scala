package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppBarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var iconClassNameLeft: js.UndefOr[java.lang.String] = js.undefined
  var iconClassNameRight: js.UndefOr[java.lang.String] = js.undefined
  var iconElementLeft: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var iconElementRight: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var iconStyleLeft: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var iconStyleRight: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onLeftIconButtonClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onRightIconButtonClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onTitleClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var showMenuIconButton: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var titleStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object AppBarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    iconClassNameLeft: java.lang.String = null,
    iconClassNameRight: java.lang.String = null,
    iconElementLeft: reactLib.reactMod.ReactElement[_] = null,
    iconElementRight: reactLib.reactMod.ReactElement[_] = null,
    iconStyleLeft: reactLib.reactMod.CSSProperties = null,
    iconStyleRight: reactLib.reactMod.CSSProperties = null,
    onLeftIconButtonClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onRightIconButtonClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onTitleClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    showMenuIconButton: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null,
    titleStyle: reactLib.reactMod.CSSProperties = null,
    zDepth: scala.Int | scala.Double = null
  ): AppBarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (iconClassNameLeft != null) __obj.updateDynamic("iconClassNameLeft")(iconClassNameLeft)
    if (iconClassNameRight != null) __obj.updateDynamic("iconClassNameRight")(iconClassNameRight)
    if (iconElementLeft != null) __obj.updateDynamic("iconElementLeft")(iconElementLeft)
    if (iconElementRight != null) __obj.updateDynamic("iconElementRight")(iconElementRight)
    if (iconStyleLeft != null) __obj.updateDynamic("iconStyleLeft")(iconStyleLeft)
    if (iconStyleRight != null) __obj.updateDynamic("iconStyleRight")(iconStyleRight)
    if (onLeftIconButtonClick != null) __obj.updateDynamic("onLeftIconButtonClick")(onLeftIconButtonClick)
    if (onRightIconButtonClick != null) __obj.updateDynamic("onRightIconButtonClick")(onRightIconButtonClick)
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(onTitleClick)
    if (!js.isUndefined(showMenuIconButton)) __obj.updateDynamic("showMenuIconButton")(showMenuIconButton)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBarProps]
  }
}

