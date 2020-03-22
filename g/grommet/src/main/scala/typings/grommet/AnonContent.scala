package typings.grommet

import typings.grommet.textMod.TextProps
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.RoundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var border: js.UndefOr[BorderType] = js.undefined
  var content: js.UndefOr[AnonPad] = js.undefined
  var disabled: js.UndefOr[Anon1] = js.undefined
  var error: js.UndefOr[AnonColorMargin] = js.undefined
  var help: js.UndefOr[AnonMarginMarginType] = js.undefined
  var label: js.UndefOr[TextProps] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var round: js.UndefOr[RoundType] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(
    border: BorderType = null,
    content: AnonPad = null,
    disabled: Anon1 = null,
    error: AnonColorMargin = null,
    help: AnonMarginMarginType = null,
    label: TextProps = null,
    margin: MarginType = null,
    round: RoundType = null
  ): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

