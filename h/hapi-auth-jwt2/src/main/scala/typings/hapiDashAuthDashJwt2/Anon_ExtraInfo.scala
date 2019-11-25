package typings.hapiDashAuthDashJwt2

import typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Mod.ExtraInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtraInfo extends js.Object {
  var extraInfo: js.UndefOr[ExtraInfo] = js.undefined
  var isValid: Boolean
  var key: String
}

object Anon_ExtraInfo {
  @scala.inline
  def apply(isValid: Boolean, key: String, extraInfo: ExtraInfo = null): Anon_ExtraInfo = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (extraInfo != null) __obj.updateDynamic("extraInfo")(extraInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtraInfo]
  }
}

