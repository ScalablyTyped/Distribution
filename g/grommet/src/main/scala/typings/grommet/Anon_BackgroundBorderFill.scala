package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorderFill extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[Anon_Side] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object Anon_BackgroundBorderFill {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: Anon_Side = null,
    fill: String = null,
    pad: PadType = null
  ): Anon_BackgroundBorderFill = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundBorderFill]
  }
}

