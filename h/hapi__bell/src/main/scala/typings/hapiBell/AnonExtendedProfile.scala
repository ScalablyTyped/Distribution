package typings.hapiBell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendedProfile extends js.Object {
  var extendedProfile: js.UndefOr[Boolean] = js.undefined
  var getMethod: js.UndefOr[String] = js.undefined
}

object AnonExtendedProfile {
  @scala.inline
  def apply(extendedProfile: js.UndefOr[Boolean] = js.undefined, getMethod: String = null): AnonExtendedProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extendedProfile)) __obj.updateDynamic("extendedProfile")(extendedProfile.asInstanceOf[js.Any])
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendedProfile]
  }
}

