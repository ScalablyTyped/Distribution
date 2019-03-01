package typings
package jpmLib.sdkPasswordsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  var formSubmitURL: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var passwordField: js.UndefOr[java.lang.String] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
}

object Credential {
  @scala.inline
  def apply(
    password: java.lang.String,
    username: java.lang.String,
    formSubmitURL: java.lang.String = null,
    passwordField: java.lang.String = null,
    realm: java.lang.String = null,
    url: java.lang.String = null,
    usernameField: java.lang.String = null
  ): Credential = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    if (formSubmitURL != null) __obj.updateDynamic("formSubmitURL")(formSubmitURL)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (url != null) __obj.updateDynamic("url")(url)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[Credential]
  }
}

