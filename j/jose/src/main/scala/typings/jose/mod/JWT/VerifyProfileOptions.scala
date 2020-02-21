package typings.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyProfileOptions[profile] extends js.Object {
  var audience: String | js.Array[String]
  var issuer: String
  var profile: js.UndefOr[profile] = js.undefined
}

object VerifyProfileOptions {
  @scala.inline
  def apply[profile](audience: String | js.Array[String], issuer: String, profile: profile = null): VerifyProfileOptions[profile] = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyProfileOptions[profile]]
  }
}

