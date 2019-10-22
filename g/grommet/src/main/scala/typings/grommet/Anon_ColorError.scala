package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorError extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var error: js.UndefOr[Anon_ColorColorType] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var side: js.UndefOr[String] = js.undefined
}

object Anon_ColorError {
  @scala.inline
  def apply(
    color: ColorType = null,
    error: Anon_ColorColorType = null,
    position: String = null,
    side: String = null
  ): Anon_ColorError = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (position != null) __obj.updateDynamic("position")(position)
    if (side != null) __obj.updateDynamic("side")(side)
    __obj.asInstanceOf[Anon_ColorError]
  }
}

