package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var animation: js.UndefOr[DurationNumber] = js.undefined
  var disabled: js.UndefOr[Icons1] = js.undefined
  var icons: js.UndefOr[Current] = js.undefined
}

object Animation {
  @scala.inline
  def apply(animation: DurationNumber = null, disabled: Icons1 = null, icons: Current = null): Animation = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

