package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iamcredentials/v1", "iamcredentials_v1.Resource$Projects$Serviceaccounts")
@js.native
class ResourceProjectsServiceaccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * iamcredentials.projects.serviceAccounts.generateAccessToken
    * @desc Generates an OAuth 2.0 access token for a service account.
    * @alias iamcredentials.projects.serviceAccounts.generateAccessToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().GenerateAccessTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateAccessToken(): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(callback: BodyResponseCallback[SchemaGenerateAccessTokenResponse]): Unit = js.native
  def generateAccessToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken,
    callback: BodyResponseCallback[SchemaGenerateAccessTokenResponse]
  ): Unit = js.native
  def generateAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken,
    options: BodyResponseCallback[SchemaGenerateAccessTokenResponse],
    callback: BodyResponseCallback[SchemaGenerateAccessTokenResponse]
  ): Unit = js.native
  def generateAccessToken(params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken, options: MethodOptions): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateAccessTokenResponse]
  ): Unit = js.native
  
  /**
    * iamcredentials.projects.serviceAccounts.generateIdToken
    * @desc Generates an OpenID Connect ID token for a service account.
    * @alias iamcredentials.projects.serviceAccounts.generateIdToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().GenerateIdTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateIdToken(): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(callback: BodyResponseCallback[SchemaGenerateIdTokenResponse]): Unit = js.native
  def generateIdToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(params: ParamsResourceProjectsServiceaccountsGenerateidtoken): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidtoken,
    callback: BodyResponseCallback[SchemaGenerateIdTokenResponse]
  ): Unit = js.native
  def generateIdToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidtoken,
    options: BodyResponseCallback[SchemaGenerateIdTokenResponse],
    callback: BodyResponseCallback[SchemaGenerateIdTokenResponse]
  ): Unit = js.native
  def generateIdToken(params: ParamsResourceProjectsServiceaccountsGenerateidtoken, options: MethodOptions): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateIdTokenResponse]
  ): Unit = js.native
  
  /**
    * iamcredentials.projects.serviceAccounts.generateIdentityBindingAccessToken
    * @alias
    * iamcredentials.projects.serviceAccounts.generateIdentityBindingAccessToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().GenerateIdentityBindingAccessTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateIdentityBindingAccessToken(): GaxiosPromise[SchemaGenerateIdentityBindingAccessTokenResponse] = js.native
  def generateIdentityBindingAccessToken(callback: BodyResponseCallback[SchemaGenerateIdentityBindingAccessTokenResponse]): Unit = js.native
  def generateIdentityBindingAccessToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGenerateIdentityBindingAccessTokenResponse] = js.native
  def generateIdentityBindingAccessToken(params: ParamsResourceProjectsServiceaccountsGenerateidentitybindingaccesstoken): GaxiosPromise[SchemaGenerateIdentityBindingAccessTokenResponse] = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidentitybindingaccesstoken,
    callback: BodyResponseCallback[SchemaGenerateIdentityBindingAccessTokenResponse]
  ): Unit = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidentitybindingaccesstoken,
    options: BodyResponseCallback[SchemaGenerateIdentityBindingAccessTokenResponse],
    callback: BodyResponseCallback[SchemaGenerateIdentityBindingAccessTokenResponse]
  ): Unit = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidentitybindingaccesstoken,
    options: MethodOptions
  ): GaxiosPromise[SchemaGenerateIdentityBindingAccessTokenResponse] = js.native
  def generateIdentityBindingAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidentitybindingaccesstoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateIdentityBindingAccessTokenResponse]
  ): Unit = js.native
  
  /**
    * iamcredentials.projects.serviceAccounts.signBlob
    * @desc Signs a blob using a service account's system-managed private key.
    * @alias iamcredentials.projects.serviceAccounts.signBlob
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().SignBlobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signBlob(): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(callback: BodyResponseCallback[SchemaSignBlobResponse]): Unit = js.native
  def signBlob(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(params: ParamsResourceProjectsServiceaccountsSignblob): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    options: BodyResponseCallback[SchemaSignBlobResponse],
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  def signBlob(params: ParamsResourceProjectsServiceaccountsSignblob, options: MethodOptions): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  
  /**
    * iamcredentials.projects.serviceAccounts.signJwt
    * @desc Signs a JWT using a service account's system-managed private key.
    * @alias iamcredentials.projects.serviceAccounts.signJwt
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    * @param {().SignJwtRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def signJwt(): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(callback: BodyResponseCallback[SchemaSignJwtResponse]): Unit = js.native
  def signJwt(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(params: ParamsResourceProjectsServiceaccountsSignjwt): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    options: BodyResponseCallback[SchemaSignJwtResponse],
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
  def signJwt(params: ParamsResourceProjectsServiceaccountsSignjwt, options: MethodOptions): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
}
