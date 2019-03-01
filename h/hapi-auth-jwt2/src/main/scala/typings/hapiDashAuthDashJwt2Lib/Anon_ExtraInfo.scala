package typings
package hapiDashAuthDashJwt2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtraInfo extends js.Object {
  var extraInfo: js.UndefOr[hapiDashAuthDashJwt2Lib.hapiDashAuthDashJwt2Mod.hapiAuthJwt2Ns.ExtraInfo] = js.undefined
  var isValid: scala.Boolean
  var key: java.lang.String
}

object Anon_ExtraInfo {
  @scala.inline
  def apply(
    isValid: scala.Boolean,
    key: java.lang.String,
    extraInfo: hapiDashAuthDashJwt2Lib.hapiDashAuthDashJwt2Mod.hapiAuthJwt2Ns.ExtraInfo = null
  ): Anon_ExtraInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("key")(key)
    if (extraInfo != null) __obj.updateDynamic("extraInfo")(extraInfo)
    __obj.asInstanceOf[Anon_ExtraInfo]
  }
}

