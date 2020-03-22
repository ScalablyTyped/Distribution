package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDarkAnonSmall extends js.Object {
  var dark: js.UndefOr[AnonSmall] = js.undefined
  var light: js.UndefOr[AnonSmall] = js.undefined
}

object AnonDarkAnonSmall {
  @scala.inline
  def apply(dark: AnonSmall = null, light: AnonSmall = null): AnonDarkAnonSmall = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDarkAnonSmall]
  }
}

