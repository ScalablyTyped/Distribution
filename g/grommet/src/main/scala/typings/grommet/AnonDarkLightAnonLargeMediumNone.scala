package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDarkLightAnonLargeMediumNone extends js.Object {
  var dark: js.UndefOr[AnonLargeMediumNone] = js.undefined
  var light: js.UndefOr[AnonLargeMediumNone] = js.undefined
}

object AnonDarkLightAnonLargeMediumNone {
  @scala.inline
  def apply(dark: AnonLargeMediumNone = null, light: AnonLargeMediumNone = null): AnonDarkLightAnonLargeMediumNone = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDarkLightAnonLargeMediumNone]
  }
}

