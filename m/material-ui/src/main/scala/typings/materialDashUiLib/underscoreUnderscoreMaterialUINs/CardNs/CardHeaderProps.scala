package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps extends js.Object {
  var actAsExpander: js.UndefOr[scala.Boolean] = js.undefined
  var avatar: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var openIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var showExpandableButton: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var subtitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var subtitleColor: js.UndefOr[java.lang.String] = js.undefined
  var subtitleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var textStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
  var titleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[scala.Boolean] = js.undefined,
    avatar: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    closeIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    openIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    showExpandableButton: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    subtitle: reactLib.reactMod.ReactNs.ReactNode = null,
    subtitleColor: java.lang.String = null,
    subtitleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    textStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    titleColor: java.lang.String = null,
    titleStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor)
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[CardHeaderProps]
  }
}

