package typings.jpm.sdkPasswordsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  var formSubmitURL: js.UndefOr[String] = js.undefined
  var password: String
  var passwordField: js.UndefOr[String] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var username: String
  var usernameField: js.UndefOr[String] = js.undefined
}

object Credential {
  @scala.inline
  def apply(
    password: String,
    username: String,
    formSubmitURL: String = null,
    passwordField: String = null,
    realm: String = null,
    url: String = null,
    usernameField: String = null
  ): Credential = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (formSubmitURL != null) __obj.updateDynamic("formSubmitURL")(formSubmitURL)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (url != null) __obj.updateDynamic("url")(url)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[Credential]
  }
}

