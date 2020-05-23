package typings.jpm.anon

import typings.jpm.FFAddonSDK.NSIException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jpm.sdk/passwords.Credential & {onComplete ? (): any, onError ? (error : jpm.FFAddonSDK.NSIException): any} */
trait CredentialonCompleteanyon extends js.Object {
  var formSubmitURL: js.UndefOr[String] = js.undefined
  var onComplete: js.UndefOr[js.Function0[_]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, _]] = js.undefined
  var password: String
  var passwordField: js.UndefOr[String] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var username: String
  var usernameField: js.UndefOr[String] = js.undefined
}

object CredentialonCompleteanyon {
  @scala.inline
  def apply(
    password: String,
    username: String,
    formSubmitURL: String = null,
    onComplete: () => _ = null,
    onError: /* error */ NSIException => _ = null,
    passwordField: String = null,
    realm: String = null,
    url: String = null,
    usernameField: String = null
  ): CredentialonCompleteanyon = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (formSubmitURL != null) __obj.updateDynamic("formSubmitURL")(formSubmitURL.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialonCompleteanyon]
  }
}

