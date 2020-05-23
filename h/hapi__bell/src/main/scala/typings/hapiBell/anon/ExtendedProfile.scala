package typings.hapiBell.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedProfile extends js.Object {
  var extendedProfile: js.UndefOr[Boolean] = js.undefined
  var getMethod: js.UndefOr[String] = js.undefined
}

object ExtendedProfile {
  @scala.inline
  def apply(extendedProfile: js.UndefOr[Boolean] = js.undefined, getMethod: String = null): ExtendedProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extendedProfile)) __obj.updateDynamic("extendedProfile")(extendedProfile.get.asInstanceOf[js.Any])
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedProfile]
  }
}

