package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDarkAnonMedium extends js.Object {
  var dark: js.UndefOr[AnonMedium] = js.undefined
  var light: js.UndefOr[AnonMedium] = js.undefined
}

object AnonDarkAnonMedium {
  @scala.inline
  def apply(dark: AnonMedium = null, light: AnonMedium = null): AnonDarkAnonMedium = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDarkAnonMedium]
  }
}

