package typings.ink.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  val bold: js.UndefOr[Boolean] = js.undefined
  val italic: js.UndefOr[Boolean] = js.undefined
  val strikethrough: js.UndefOr[Boolean] = js.undefined
  val underline: js.UndefOr[Boolean] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[TextProps]
  }
}

