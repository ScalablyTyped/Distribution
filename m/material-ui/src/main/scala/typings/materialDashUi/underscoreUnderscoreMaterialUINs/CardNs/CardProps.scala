package typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var initiallyExpanded: js.UndefOr[Boolean] = js.undefined
  var onExpandChange: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.undefined
  var showExpandableButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    containerStyle: CSSProperties = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    initiallyExpanded: js.UndefOr[Boolean] = js.undefined,
    onExpandChange: /* isExpanded */ Boolean => Unit = null,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (!js.isUndefined(initiallyExpanded)) __obj.updateDynamic("initiallyExpanded")(initiallyExpanded)
    if (onExpandChange != null) __obj.updateDynamic("onExpandChange")(js.Any.fromFunction1(onExpandChange))
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardProps]
  }
}

