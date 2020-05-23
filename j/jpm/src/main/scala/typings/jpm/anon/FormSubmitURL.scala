package typings.jpm.anon

import typings.jpm.FFAddonSDK.NSIException
import typings.jpm.passwordsMod.Credential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSubmitURL extends js.Object {
  var formSubmitURL: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, _]] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var passwordField: js.UndefOr[String] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
  def onComplete(credentials: js.Array[Credential]): js.Any
}

object FormSubmitURL {
  @scala.inline
  def apply(
    onComplete: js.Array[Credential] => js.Any,
    formSubmitURL: String = null,
    onError: /* error */ NSIException => _ = null,
    password: String = null,
    passwordField: String = null,
    realm: String = null,
    url: String = null,
    username: String = null,
    usernameField: String = null
  ): FormSubmitURL = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    if (formSubmitURL != null) __obj.updateDynamic("formSubmitURL")(formSubmitURL.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSubmitURL]
  }
}

