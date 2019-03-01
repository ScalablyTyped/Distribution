package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Credentials extends js.Object {
  var formSubmitURL: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ jpmLib.FFAddonSDKNs.NSIException, _]] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var passwordField: js.UndefOr[java.lang.String] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
  def onComplete(credentials: js.Array[jpmLib.sdkPasswordsMod.Credential]): js.Any
}

object Anon_Credentials {
  @scala.inline
  def apply(
    onComplete: js.Function1[js.Array[jpmLib.sdkPasswordsMod.Credential], js.Any],
    formSubmitURL: java.lang.String = null,
    onError: js.Function1[/* error */ jpmLib.FFAddonSDKNs.NSIException, _] = null,
    password: java.lang.String = null,
    passwordField: java.lang.String = null,
    realm: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    usernameField: java.lang.String = null
  ): Anon_Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete)
    if (formSubmitURL != null) __obj.updateDynamic("formSubmitURL")(formSubmitURL)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (password != null) __obj.updateDynamic("password")(password)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[Anon_Credentials]
  }
}

