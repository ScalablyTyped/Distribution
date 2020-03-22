package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimation extends js.Object {
  var animation: js.UndefOr[AnonDurationNumber] = js.undefined
  var disabled: js.UndefOr[AnonIconsAnon0] = js.undefined
  var icons: js.UndefOr[AnonCurrent] = js.undefined
}

object AnonAnimation {
  @scala.inline
  def apply(animation: AnonDurationNumber = null, disabled: AnonIconsAnon0 = null, icons: AnonCurrent = null): AnonAnimation = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimation]
  }
}

