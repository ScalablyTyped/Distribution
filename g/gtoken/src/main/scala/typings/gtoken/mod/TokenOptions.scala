package typings.gtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var additionalClaims: js.UndefOr[js.Object] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var iss: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keyFile: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var sub: js.UndefOr[String] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(
    additionalClaims: js.Object = null,
    email: String = null,
    iss: String = null,
    key: String = null,
    keyFile: String = null,
    scope: String | js.Array[String] = null,
    sub: String = null
  ): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalClaims != null) __obj.updateDynamic("additionalClaims")(additionalClaims.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (iss != null) __obj.updateDynamic("iss")(iss.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenOptions]
  }
}

