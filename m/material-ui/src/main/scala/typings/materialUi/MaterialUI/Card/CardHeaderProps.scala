package typings.materialUi.MaterialUI.Card

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
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
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.get.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.get.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderProps]
  }
}

