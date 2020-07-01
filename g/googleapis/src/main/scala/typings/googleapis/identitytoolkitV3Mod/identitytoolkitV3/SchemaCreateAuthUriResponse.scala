package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of creating the IDP authentication URL.
  */
@js.native
trait SchemaCreateAuthUriResponse extends js.Object {
  /**
    * all providers the user has once used to do federated login
    */
  var allProviders: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URI used by the IDP to authenticate the user.
    */
  var authUri: js.UndefOr[String] = js.native
  /**
    * True if captcha is required.
    */
  var captchaRequired: js.UndefOr[Boolean] = js.native
  /**
    * True if the authUri is for user&#39;s existing provider.
    */
  var forExistingProvider: js.UndefOr[Boolean] = js.native
  /**
    * The fixed string identitytoolkit#CreateAuthUriResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The provider ID of the auth URI.
    */
  var providerId: js.UndefOr[String] = js.native
  /**
    * Whether the user is registered if the identifier is an email.
    */
  var registered: js.UndefOr[Boolean] = js.native
  /**
    * Session ID which should be passed in the following verifyAssertion
    * request.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * All sign-in methods this user has used.
    */
  var signinMethods: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCreateAuthUriResponse {
  @scala.inline
  def apply(
    allProviders: js.Array[String] = null,
    authUri: String = null,
    captchaRequired: js.UndefOr[Boolean] = js.undefined,
    forExistingProvider: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    providerId: String = null,
    registered: js.UndefOr[Boolean] = js.undefined,
    sessionId: String = null,
    signinMethods: js.Array[String] = null
  ): SchemaCreateAuthUriResponse = {
    val __obj = js.Dynamic.literal()
    if (allProviders != null) __obj.updateDynamic("allProviders")(allProviders.asInstanceOf[js.Any])
    if (authUri != null) __obj.updateDynamic("authUri")(authUri.asInstanceOf[js.Any])
    if (!js.isUndefined(captchaRequired)) __obj.updateDynamic("captchaRequired")(captchaRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forExistingProvider)) __obj.updateDynamic("forExistingProvider")(forExistingProvider.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    if (!js.isUndefined(registered)) __obj.updateDynamic("registered")(registered.get.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (signinMethods != null) __obj.updateDynamic("signinMethods")(signinMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateAuthUriResponse]
  }
}

