package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleProps extends js.Object {
  var actAsExpander: js.UndefOr[scala.Boolean] = js.undefined
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  var showExpandableButton: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var subtitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var subtitleColor: js.UndefOr[java.lang.String] = js.undefined
  var subtitleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
  var titleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CardTitleProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[scala.Boolean] = js.undefined,
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    showExpandableButton: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    subtitle: reactLib.reactMod.ReactNs.ReactNode = null,
    subtitleColor: java.lang.String = null,
    subtitleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    titleColor: java.lang.String = null,
    titleStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CardTitleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor)
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[CardTitleProps]
  }
}

