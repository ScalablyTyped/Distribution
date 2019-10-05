package typings.materialDashUi.__MaterialUI.Card

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardActionsProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var showExpandableButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CardActionsProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): CardActionsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardActionsProps]
  }
}

