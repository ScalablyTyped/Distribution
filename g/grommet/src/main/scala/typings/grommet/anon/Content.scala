package typings.grommet.anon

import typings.grommet.textMod.TextProps
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.RoundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var border: js.UndefOr[BorderType] = js.undefined
  var content: js.UndefOr[Pad] = js.undefined
  var disabled: js.UndefOr[BackgroundBorder] = js.undefined
  var error: js.UndefOr[ColorMargin] = js.undefined
  var focus: js.UndefOr[BackgroundBackgroundTypeBorder1] = js.undefined
  var help: js.UndefOr[MarginMarginType] = js.undefined
  var info: js.UndefOr[MarginMarginType] = js.undefined
  var label: js.UndefOr[TextProps] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var round: js.UndefOr[RoundType] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    border: BorderType = null,
    content: Pad = null,
    disabled: BackgroundBorder = null,
    error: ColorMargin = null,
    focus: BackgroundBackgroundTypeBorder1 = null,
    help: MarginMarginType = null,
    info: MarginMarginType = null,
    label: TextProps = null,
    margin: MarginType = null,
    round: RoundType = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

