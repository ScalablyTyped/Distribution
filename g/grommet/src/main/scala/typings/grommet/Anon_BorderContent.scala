package typings.grommet

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderContent extends js.Object {
  var border: js.UndefOr[Anon_ColorError] = js.undefined
  var content: js.UndefOr[Anon_Pad] = js.undefined
  var error: js.UndefOr[Anon_ColorMargin] = js.undefined
  var help: js.UndefOr[Anon_ColorMargin] = js.undefined
  var label: js.UndefOr[Anon_Margin] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object Anon_BorderContent {
  @scala.inline
  def apply(
    border: Anon_ColorError = null,
    content: Anon_Pad = null,
    error: Anon_ColorMargin = null,
    help: Anon_ColorMargin = null,
    label: Anon_Margin = null,
    margin: MarginType = null
  ): Anon_BorderContent = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (content != null) __obj.updateDynamic("content")(content)
    if (error != null) __obj.updateDynamic("error")(error)
    if (help != null) __obj.updateDynamic("help")(help)
    if (label != null) __obj.updateDynamic("label")(label)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderContent]
  }
}

