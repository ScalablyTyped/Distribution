package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to verify the IDP assertion.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest extends js.Object {
  /**
    * When it&#39;s true, automatically creates a new account if the user
    * doesn&#39;t exist. When it&#39;s false, allows existing user to sign in
    * normally and throws exception if the user doesn&#39;t exist.
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The GITKit token for the non-trusted IDP pending to be confirmed by the
    * user.
    */
  var pendingIdToken: js.UndefOr[String] = js.native
  /**
    * The post body if the request is a HTTP POST.
    */
  var postBody: js.UndefOr[String] = js.native
  /**
    * The URI to which the IDP redirects the user back. It may contain
    * federated login result params added by the IDP.
    */
  var requestUri: js.UndefOr[String] = js.native
  /**
    * Whether return 200 and IDP credential rather than throw exception when
    * federated id is already linked.
    */
  var returnIdpCredential: js.UndefOr[Boolean] = js.native
  /**
    * Whether to return refresh tokens.
    */
  var returnRefreshToken: js.UndefOr[Boolean] = js.native
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  /**
    * Session ID, which should match the one in previous createAuthUri request.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the
    * correct IDP parameters, Firebear needs to know which Tenant to retrieve
    * IDP configs from.
    */
  var tenantId: js.UndefOr[String] = js.native
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest {
  @scala.inline
  def apply(
    autoCreate: js.UndefOr[Boolean] = js.undefined,
    delegatedProjectNumber: String = null,
    idToken: String = null,
    instanceId: String = null,
    pendingIdToken: String = null,
    postBody: String = null,
    requestUri: String = null,
    returnIdpCredential: js.UndefOr[Boolean] = js.undefined,
    returnRefreshToken: js.UndefOr[Boolean] = js.undefined,
    returnSecureToken: js.UndefOr[Boolean] = js.undefined,
    sessionId: String = null,
    tenantId: String = null,
    tenantProjectNumber: String = null
  ): SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (pendingIdToken != null) __obj.updateDynamic("pendingIdToken")(pendingIdToken.asInstanceOf[js.Any])
    if (postBody != null) __obj.updateDynamic("postBody")(postBody.asInstanceOf[js.Any])
    if (requestUri != null) __obj.updateDynamic("requestUri")(requestUri.asInstanceOf[js.Any])
    if (!js.isUndefined(returnIdpCredential)) __obj.updateDynamic("returnIdpCredential")(returnIdpCredential.asInstanceOf[js.Any])
    if (!js.isUndefined(returnRefreshToken)) __obj.updateDynamic("returnRefreshToken")(returnRefreshToken.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (tenantProjectNumber != null) __obj.updateDynamic("tenantProjectNumber")(tenantProjectNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest]
  }
}

