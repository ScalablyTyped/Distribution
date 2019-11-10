package typings.grommet

import typings.grommet.componentsListMod.BorderType
import typings.grommet.componentsListMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorder extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[BorderType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object Anon_BackgroundBorder {
  @scala.inline
  def apply(background: String = null, border: BorderType = null, pad: PadType = null): Anon_BackgroundBorder = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundBorder]
  }
}

