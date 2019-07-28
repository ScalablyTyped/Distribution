package typings.atHapiBell.atHapiBellMod

import typings.atHapiBell.Anon_ExtendedProfile
import typings.atHapiBell.Anon_Uri
import typings.atHapiHapi.atHapiHapiMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProviderOptions
  extends RequiredProviderOptions
     with OptionalOptions
     with BellOptions {
  var provider: CustomProtocol1 | CustomProtocol2
}

object CustomProviderOptions {
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    password: String,
    provider: CustomProtocol1 | CustomProtocol2,
    allowRuntimeProviderParams: StringLikeMap | Boolean = null,
    config: Anon_ExtendedProfile | Anon_Uri = null,
    cookie: String = null,
    domain: String = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    location: String | (js.Function1[/* req */ Request, String]) = null,
    profileParams: StringLikeMap = null,
    providerParams: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap]) = null,
    runtimeStateCallback: /* req */ Request => String = null,
    scope: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]]) = null,
    skipProfile: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null
  ): CustomProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret, password = password, provider = provider.asInstanceOf[js.Any])
    if (allowRuntimeProviderParams != null) __obj.updateDynamic("allowRuntimeProviderParams")(allowRuntimeProviderParams.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly)
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (profileParams != null) __obj.updateDynamic("profileParams")(profileParams)
    if (providerParams != null) __obj.updateDynamic("providerParams")(providerParams.asInstanceOf[js.Any])
    if (runtimeStateCallback != null) __obj.updateDynamic("runtimeStateCallback")(js.Any.fromFunction1(runtimeStateCallback))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(skipProfile)) __obj.updateDynamic("skipProfile")(skipProfile)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProviderOptions]
  }
}

