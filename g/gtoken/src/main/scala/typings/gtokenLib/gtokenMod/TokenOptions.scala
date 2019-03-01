package typings
package gtokenLib.gtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var additionalClaims: js.UndefOr[js.Object] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var iss: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keyFile: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var sub: js.UndefOr[java.lang.String] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(
    additionalClaims: js.Object = null,
    email: java.lang.String = null,
    iss: java.lang.String = null,
    key: java.lang.String = null,
    keyFile: java.lang.String = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    sub: java.lang.String = null
  ): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalClaims != null) __obj.updateDynamic("additionalClaims")(additionalClaims)
    if (email != null) __obj.updateDynamic("email")(email)
    if (iss != null) __obj.updateDynamic("iss")(iss)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub)
    __obj.asInstanceOf[TokenOptions]
  }
}

