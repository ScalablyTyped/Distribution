package typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.undefined
  var avatar: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var openIcon: js.UndefOr[ReactNode] = js.undefined
  var showExpandableButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  var subtitleColor: js.UndefOr[String] = js.undefined
  var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
  var textStyle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    avatar: ReactNode = null,
    className: String = null,
    closeIcon: ReactNode = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    openIcon: ReactNode = null,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    subtitle: ReactNode = null,
    subtitleColor: String = null,
    subtitleStyle: CSSProperties = null,
    textStyle: CSSProperties = null,
    title: ReactNode = null,
    titleColor: String = null,
    titleStyle: CSSProperties = null
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

