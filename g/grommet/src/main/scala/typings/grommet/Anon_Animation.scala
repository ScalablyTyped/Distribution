package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: js.UndefOr[Anon_DurationNumber] = js.undefined
  var disabled: js.UndefOr[Anon_Icons] = js.undefined
  var icons: js.UndefOr[Anon_ColorCurrent] = js.undefined
}

object Anon_Animation {
  @scala.inline
  def apply(
    animation: Anon_DurationNumber = null,
    disabled: Anon_Icons = null,
    icons: Anon_ColorCurrent = null
  ): Anon_Animation = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    __obj.asInstanceOf[Anon_Animation]
  }
}

