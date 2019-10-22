package typings.grommet

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorMargin extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object Anon_ColorMargin {
  @scala.inline
  def apply(color: ColorType = null, margin: MarginType = null): Anon_ColorMargin = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorMargin]
  }
}

