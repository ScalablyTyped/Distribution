package typings.grommet

import typings.grommet.componentsTextMod.TextProps
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderContent extends js.Object {
  var border: js.UndefOr[BorderType] = js.undefined
  var content: js.UndefOr[Anon_Pad] = js.undefined
  var error: js.UndefOr[Anon_ColorMargin] = js.undefined
  var help: js.UndefOr[Anon_ColorMargin] = js.undefined
  var label: js.UndefOr[TextProps] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object Anon_BorderContent {
  @scala.inline
  def apply(
    border: BorderType = null,
    content: Anon_Pad = null,
    error: Anon_ColorMargin = null,
    help: Anon_ColorMargin = null,
    label: TextProps = null,
    margin: MarginType = null
  ): Anon_BorderContent = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderContent]
  }
}

