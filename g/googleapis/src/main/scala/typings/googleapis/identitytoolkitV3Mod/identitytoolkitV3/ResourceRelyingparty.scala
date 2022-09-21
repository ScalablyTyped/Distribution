package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/identitytoolkit/v3", "identitytoolkit_v3.Resource$Relyingparty")
@js.native
open class ResourceRelyingparty protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def createAuthUri(): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(callback: BodyResponseCallback[SchemaCreateAuthUriResponse]): Unit = js.native
  def createAuthUri(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(params: ParamsResourceRelyingpartyCreateauthuri): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(
    params: ParamsResourceRelyingpartyCreateauthuri,
    callback: BodyResponseCallback[SchemaCreateAuthUriResponse]
  ): Unit = js.native
  def createAuthUri(
    params: ParamsResourceRelyingpartyCreateauthuri,
    options: BodyResponseCallback[Readable | SchemaCreateAuthUriResponse],
    callback: BodyResponseCallback[Readable | SchemaCreateAuthUriResponse]
  ): Unit = js.native
  def createAuthUri(params: ParamsResourceRelyingpartyCreateauthuri, options: MethodOptions): GaxiosPromise[SchemaCreateAuthUriResponse] = js.native
  def createAuthUri(
    params: ParamsResourceRelyingpartyCreateauthuri,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateAuthUriResponse]
  ): Unit = js.native
  /**
    * Creates the URI used by the IdP to authenticate the user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.createAuthUri({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appId": "my_appId",
    *       //   "authFlowType": "my_authFlowType",
    *       //   "clientId": "my_clientId",
    *       //   "context": "my_context",
    *       //   "continueUri": "my_continueUri",
    *       //   "customParameter": {},
    *       //   "hostedDomain": "my_hostedDomain",
    *       //   "identifier": "my_identifier",
    *       //   "oauthConsumerKey": "my_oauthConsumerKey",
    *       //   "oauthScope": "my_oauthScope",
    *       //   "openidRealm": "my_openidRealm",
    *       //   "otaApp": "my_otaApp",
    *       //   "providerId": "my_providerId",
    *       //   "sessionId": "my_sessionId",
    *       //   "tenantId": "my_tenantId",
    *       //   "tenantProjectNumber": "my_tenantProjectNumber"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allProviders": [],
    *   //   "authUri": "my_authUri",
    *   //   "captchaRequired": false,
    *   //   "forExistingProvider": false,
    *   //   "kind": "my_kind",
    *   //   "providerId": "my_providerId",
    *   //   "registered": false,
    *   //   "sessionId": "my_sessionId",
    *   //   "signinMethods": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def createAuthUri(params: ParamsResourceRelyingpartyCreateauthuri, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createAuthUri(
    params: ParamsResourceRelyingpartyCreateauthuri,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteAccount(): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(callback: BodyResponseCallback[SchemaDeleteAccountResponse]): Unit = js.native
  def deleteAccount(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(params: ParamsResourceRelyingpartyDeleteaccount): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(
    params: ParamsResourceRelyingpartyDeleteaccount,
    callback: BodyResponseCallback[SchemaDeleteAccountResponse]
  ): Unit = js.native
  def deleteAccount(
    params: ParamsResourceRelyingpartyDeleteaccount,
    options: BodyResponseCallback[Readable | SchemaDeleteAccountResponse],
    callback: BodyResponseCallback[Readable | SchemaDeleteAccountResponse]
  ): Unit = js.native
  def deleteAccount(params: ParamsResourceRelyingpartyDeleteaccount, options: MethodOptions): GaxiosPromise[SchemaDeleteAccountResponse] = js.native
  def deleteAccount(
    params: ParamsResourceRelyingpartyDeleteaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteAccountResponse]
  ): Unit = js.native
  /**
    * Delete user account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.deleteAccount({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "idToken": "my_idToken",
    *       //   "localId": "my_localId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def deleteAccount(params: ParamsResourceRelyingpartyDeleteaccount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteAccount(
    params: ParamsResourceRelyingpartyDeleteaccount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def downloadAccount(): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(callback: BodyResponseCallback[SchemaDownloadAccountResponse]): Unit = js.native
  def downloadAccount(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(params: ParamsResourceRelyingpartyDownloadaccount): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(
    params: ParamsResourceRelyingpartyDownloadaccount,
    callback: BodyResponseCallback[SchemaDownloadAccountResponse]
  ): Unit = js.native
  def downloadAccount(
    params: ParamsResourceRelyingpartyDownloadaccount,
    options: BodyResponseCallback[Readable | SchemaDownloadAccountResponse],
    callback: BodyResponseCallback[Readable | SchemaDownloadAccountResponse]
  ): Unit = js.native
  def downloadAccount(params: ParamsResourceRelyingpartyDownloadaccount, options: MethodOptions): GaxiosPromise[SchemaDownloadAccountResponse] = js.native
  def downloadAccount(
    params: ParamsResourceRelyingpartyDownloadaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDownloadAccountResponse]
  ): Unit = js.native
  /**
    * Batch download user accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.downloadAccount({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "maxResults": 0,
    *       //   "nextPageToken": "my_nextPageToken",
    *       //   "targetProjectId": "my_targetProjectId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "users": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def downloadAccount(params: ParamsResourceRelyingpartyDownloadaccount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def downloadAccount(
    params: ParamsResourceRelyingpartyDownloadaccount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def emailLinkSignin(): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(callback: BodyResponseCallback[SchemaEmailLinkSigninResponse]): Unit = js.native
  def emailLinkSignin(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(params: ParamsResourceRelyingpartyEmaillinksignin): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(
    params: ParamsResourceRelyingpartyEmaillinksignin,
    callback: BodyResponseCallback[SchemaEmailLinkSigninResponse]
  ): Unit = js.native
  def emailLinkSignin(
    params: ParamsResourceRelyingpartyEmaillinksignin,
    options: BodyResponseCallback[Readable | SchemaEmailLinkSigninResponse],
    callback: BodyResponseCallback[Readable | SchemaEmailLinkSigninResponse]
  ): Unit = js.native
  def emailLinkSignin(params: ParamsResourceRelyingpartyEmaillinksignin, options: MethodOptions): GaxiosPromise[SchemaEmailLinkSigninResponse] = js.native
  def emailLinkSignin(
    params: ParamsResourceRelyingpartyEmaillinksignin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmailLinkSigninResponse]
  ): Unit = js.native
  /**
    * Reset password for a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.emailLinkSignin({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "email": "my_email",
    *       //   "idToken": "my_idToken",
    *       //   "oobCode": "my_oobCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "expiresIn": "my_expiresIn",
    *   //   "idToken": "my_idToken",
    *   //   "isNewUser": false,
    *   //   "kind": "my_kind",
    *   //   "localId": "my_localId",
    *   //   "refreshToken": "my_refreshToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def emailLinkSignin(params: ParamsResourceRelyingpartyEmaillinksignin, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def emailLinkSignin(
    params: ParamsResourceRelyingpartyEmaillinksignin,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAccountInfo(): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(callback: BodyResponseCallback[SchemaGetAccountInfoResponse]): Unit = js.native
  def getAccountInfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(params: ParamsResourceRelyingpartyGetaccountinfo): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(
    params: ParamsResourceRelyingpartyGetaccountinfo,
    callback: BodyResponseCallback[SchemaGetAccountInfoResponse]
  ): Unit = js.native
  def getAccountInfo(
    params: ParamsResourceRelyingpartyGetaccountinfo,
    options: BodyResponseCallback[Readable | SchemaGetAccountInfoResponse],
    callback: BodyResponseCallback[Readable | SchemaGetAccountInfoResponse]
  ): Unit = js.native
  def getAccountInfo(params: ParamsResourceRelyingpartyGetaccountinfo, options: MethodOptions): GaxiosPromise[SchemaGetAccountInfoResponse] = js.native
  def getAccountInfo(
    params: ParamsResourceRelyingpartyGetaccountinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetAccountInfoResponse]
  ): Unit = js.native
  /**
    * Returns the account info.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.getAccountInfo({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "email": [],
    *       //   "idToken": "my_idToken",
    *       //   "localId": [],
    *       //   "phoneNumber": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "users": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getAccountInfo(params: ParamsResourceRelyingpartyGetaccountinfo, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAccountInfo(
    params: ParamsResourceRelyingpartyGetaccountinfo,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getOobConfirmationCode(): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(callback: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse]): Unit = js.native
  def getOobConfirmationCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(params: ParamsResourceRelyingpartyGetoobconfirmationcode): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(
    params: ParamsResourceRelyingpartyGetoobconfirmationcode,
    callback: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse]
  ): Unit = js.native
  def getOobConfirmationCode(
    params: ParamsResourceRelyingpartyGetoobconfirmationcode,
    options: BodyResponseCallback[Readable | SchemaGetOobConfirmationCodeResponse],
    callback: BodyResponseCallback[Readable | SchemaGetOobConfirmationCodeResponse]
  ): Unit = js.native
  def getOobConfirmationCode(params: ParamsResourceRelyingpartyGetoobconfirmationcode, options: MethodOptions): GaxiosPromise[SchemaGetOobConfirmationCodeResponse] = js.native
  def getOobConfirmationCode(
    params: ParamsResourceRelyingpartyGetoobconfirmationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOobConfirmationCodeResponse]
  ): Unit = js.native
  /**
    * Get a code for user action confirmation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.getOobConfirmationCode({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "androidInstallApp": false,
    *       //   "androidMinimumVersion": "my_androidMinimumVersion",
    *       //   "androidPackageName": "my_androidPackageName",
    *       //   "canHandleCodeInApp": false,
    *       //   "captchaResp": "my_captchaResp",
    *       //   "challenge": "my_challenge",
    *       //   "continueUrl": "my_continueUrl",
    *       //   "email": "my_email",
    *       //   "iOSAppStoreId": "my_iOSAppStoreId",
    *       //   "iOSBundleId": "my_iOSBundleId",
    *       //   "idToken": "my_idToken",
    *       //   "kind": "my_kind",
    *       //   "newEmail": "my_newEmail",
    *       //   "requestType": "my_requestType",
    *       //   "userIp": "my_userIp"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "kind": "my_kind",
    *   //   "oobCode": "my_oobCode"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getOobConfirmationCode(params: ParamsResourceRelyingpartyGetoobconfirmationcode, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getOobConfirmationCode(
    params: ParamsResourceRelyingpartyGetoobconfirmationcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getProjectConfig(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]): Unit = js.native
  def getProjectConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(params: ParamsResourceRelyingpartyGetprojectconfig): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(
    params: ParamsResourceRelyingpartyGetprojectconfig,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  def getProjectConfig(
    params: ParamsResourceRelyingpartyGetprojectconfig,
    options: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse],
    callback: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  def getProjectConfig(params: ParamsResourceRelyingpartyGetprojectconfig, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(
    params: ParamsResourceRelyingpartyGetprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  ): Unit = js.native
  /**
    * Get project configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.getProjectConfig({
    *     // Delegated GCP project number of the request.
    *     delegatedProjectNumber: 'placeholder-value',
    *     // GCP project number of the request.
    *     projectNumber: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowPasswordUser": false,
    *   //   "apiKey": "my_apiKey",
    *   //   "authorizedDomains": [],
    *   //   "changeEmailTemplate": {},
    *   //   "dynamicLinksDomain": "my_dynamicLinksDomain",
    *   //   "enableAnonymousUser": false,
    *   //   "idpConfig": [],
    *   //   "legacyResetPasswordTemplate": {},
    *   //   "projectId": "my_projectId",
    *   //   "resetPasswordTemplate": {},
    *   //   "useEmailSending": false,
    *   //   "verifyEmailTemplate": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getProjectConfig(params: ParamsResourceRelyingpartyGetprojectconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getProjectConfig(
    params: ParamsResourceRelyingpartyGetprojectconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getPublicKeys(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]): Unit = js.native
  def getPublicKeys(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(params: ParamsResourceRelyingpartyGetpublickeys): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(
    params: ParamsResourceRelyingpartyGetpublickeys,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  def getPublicKeys(
    params: ParamsResourceRelyingpartyGetpublickeys,
    options: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse],
    callback: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  def getPublicKeys(params: ParamsResourceRelyingpartyGetpublickeys, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse] = js.native
  def getPublicKeys(
    params: ParamsResourceRelyingpartyGetpublickeys,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyGetPublicKeysResponse]
  ): Unit = js.native
  /**
    * Get token signing public key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.getPublicKeys({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getPublicKeys(params: ParamsResourceRelyingpartyGetpublickeys, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getPublicKeys(
    params: ParamsResourceRelyingpartyGetpublickeys,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getRecaptchaParam(): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(callback: BodyResponseCallback[SchemaGetRecaptchaParamResponse]): Unit = js.native
  def getRecaptchaParam(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(params: ParamsResourceRelyingpartyGetrecaptchaparam): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(
    params: ParamsResourceRelyingpartyGetrecaptchaparam,
    callback: BodyResponseCallback[SchemaGetRecaptchaParamResponse]
  ): Unit = js.native
  def getRecaptchaParam(
    params: ParamsResourceRelyingpartyGetrecaptchaparam,
    options: BodyResponseCallback[Readable | SchemaGetRecaptchaParamResponse],
    callback: BodyResponseCallback[Readable | SchemaGetRecaptchaParamResponse]
  ): Unit = js.native
  def getRecaptchaParam(params: ParamsResourceRelyingpartyGetrecaptchaparam, options: MethodOptions): GaxiosPromise[SchemaGetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(
    params: ParamsResourceRelyingpartyGetrecaptchaparam,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetRecaptchaParamResponse]
  ): Unit = js.native
  /**
    * Get recaptcha secure param.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.getRecaptchaParam({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "recaptchaSiteKey": "my_recaptchaSiteKey",
    *   //   "recaptchaStoken": "my_recaptchaStoken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getRecaptchaParam(params: ParamsResourceRelyingpartyGetrecaptchaparam, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getRecaptchaParam(
    params: ParamsResourceRelyingpartyGetrecaptchaparam,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetPassword(): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(callback: BodyResponseCallback[SchemaResetPasswordResponse]): Unit = js.native
  def resetPassword(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(params: ParamsResourceRelyingpartyResetpassword): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(
    params: ParamsResourceRelyingpartyResetpassword,
    callback: BodyResponseCallback[SchemaResetPasswordResponse]
  ): Unit = js.native
  def resetPassword(
    params: ParamsResourceRelyingpartyResetpassword,
    options: BodyResponseCallback[Readable | SchemaResetPasswordResponse],
    callback: BodyResponseCallback[Readable | SchemaResetPasswordResponse]
  ): Unit = js.native
  def resetPassword(params: ParamsResourceRelyingpartyResetpassword, options: MethodOptions): GaxiosPromise[SchemaResetPasswordResponse] = js.native
  def resetPassword(
    params: ParamsResourceRelyingpartyResetpassword,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResetPasswordResponse]
  ): Unit = js.native
  /**
    * Reset password for a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.resetPassword({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "email": "my_email",
    *       //   "newPassword": "my_newPassword",
    *       //   "oldPassword": "my_oldPassword",
    *       //   "oobCode": "my_oobCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "kind": "my_kind",
    *   //   "newEmail": "my_newEmail",
    *   //   "requestType": "my_requestType"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def resetPassword(params: ParamsResourceRelyingpartyResetpassword, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetPassword(
    params: ParamsResourceRelyingpartyResetpassword,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sendVerificationCode(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]): Unit = js.native
  def sendVerificationCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(params: ParamsResourceRelyingpartySendverificationcode): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(
    params: ParamsResourceRelyingpartySendverificationcode,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  def sendVerificationCode(
    params: ParamsResourceRelyingpartySendverificationcode,
    options: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse],
    callback: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  def sendVerificationCode(params: ParamsResourceRelyingpartySendverificationcode, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(
    params: ParamsResourceRelyingpartySendverificationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  ): Unit = js.native
  /**
    * Send SMS verification code.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.sendVerificationCode({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "iosReceipt": "my_iosReceipt",
    *       //   "iosSecret": "my_iosSecret",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "recaptchaToken": "my_recaptchaToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "sessionInfo": "my_sessionInfo"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def sendVerificationCode(params: ParamsResourceRelyingpartySendverificationcode, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sendVerificationCode(
    params: ParamsResourceRelyingpartySendverificationcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setAccountInfo(): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(callback: BodyResponseCallback[SchemaSetAccountInfoResponse]): Unit = js.native
  def setAccountInfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(params: ParamsResourceRelyingpartySetaccountinfo): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(
    params: ParamsResourceRelyingpartySetaccountinfo,
    callback: BodyResponseCallback[SchemaSetAccountInfoResponse]
  ): Unit = js.native
  def setAccountInfo(
    params: ParamsResourceRelyingpartySetaccountinfo,
    options: BodyResponseCallback[Readable | SchemaSetAccountInfoResponse],
    callback: BodyResponseCallback[Readable | SchemaSetAccountInfoResponse]
  ): Unit = js.native
  def setAccountInfo(params: ParamsResourceRelyingpartySetaccountinfo, options: MethodOptions): GaxiosPromise[SchemaSetAccountInfoResponse] = js.native
  def setAccountInfo(
    params: ParamsResourceRelyingpartySetaccountinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSetAccountInfoResponse]
  ): Unit = js.native
  /**
    * Set account info for a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.setAccountInfo({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "captchaChallenge": "my_captchaChallenge",
    *       //   "captchaResponse": "my_captchaResponse",
    *       //   "createdAt": "my_createdAt",
    *       //   "customAttributes": "my_customAttributes",
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "deleteAttribute": [],
    *       //   "deleteProvider": [],
    *       //   "disableUser": false,
    *       //   "displayName": "my_displayName",
    *       //   "email": "my_email",
    *       //   "emailVerified": false,
    *       //   "idToken": "my_idToken",
    *       //   "instanceId": "my_instanceId",
    *       //   "lastLoginAt": "my_lastLoginAt",
    *       //   "localId": "my_localId",
    *       //   "oobCode": "my_oobCode",
    *       //   "password": "my_password",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "photoUrl": "my_photoUrl",
    *       //   "provider": [],
    *       //   "returnSecureToken": false,
    *       //   "upgradeToFederatedLogin": false,
    *       //   "validSince": "my_validSince"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "email": "my_email",
    *   //   "emailVerified": false,
    *   //   "expiresIn": "my_expiresIn",
    *   //   "idToken": "my_idToken",
    *   //   "kind": "my_kind",
    *   //   "localId": "my_localId",
    *   //   "newEmail": "my_newEmail",
    *   //   "passwordHash": "my_passwordHash",
    *   //   "photoUrl": "my_photoUrl",
    *   //   "providerUserInfo": [],
    *   //   "refreshToken": "my_refreshToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setAccountInfo(params: ParamsResourceRelyingpartySetaccountinfo, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setAccountInfo(
    params: ParamsResourceRelyingpartySetaccountinfo,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setProjectConfig(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]): Unit = js.native
  def setProjectConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(params: ParamsResourceRelyingpartySetprojectconfig): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(
    params: ParamsResourceRelyingpartySetprojectconfig,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  def setProjectConfig(
    params: ParamsResourceRelyingpartySetprojectconfig,
    options: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse],
    callback: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  def setProjectConfig(params: ParamsResourceRelyingpartySetprojectconfig, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  def setProjectConfig(
    params: ParamsResourceRelyingpartySetprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  ): Unit = js.native
  /**
    * Set project configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.setProjectConfig({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowPasswordUser": false,
    *       //   "apiKey": "my_apiKey",
    *       //   "authorizedDomains": [],
    *       //   "changeEmailTemplate": {},
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "enableAnonymousUser": false,
    *       //   "idpConfig": [],
    *       //   "legacyResetPasswordTemplate": {},
    *       //   "resetPasswordTemplate": {},
    *       //   "useEmailSending": false,
    *       //   "verifyEmailTemplate": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "projectId": "my_projectId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setProjectConfig(params: ParamsResourceRelyingpartySetprojectconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setProjectConfig(
    params: ParamsResourceRelyingpartySetprojectconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def signOutUser(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]): Unit = js.native
  def signOutUser(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(params: ParamsResourceRelyingpartySignoutuser): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(
    params: ParamsResourceRelyingpartySignoutuser,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  def signOutUser(
    params: ParamsResourceRelyingpartySignoutuser,
    options: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartySignOutUserResponse],
    callback: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  def signOutUser(params: ParamsResourceRelyingpartySignoutuser, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  def signOutUser(
    params: ParamsResourceRelyingpartySignoutuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartySignOutUserResponse]
  ): Unit = js.native
  /**
    * Sign out user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.signOutUser({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "instanceId": "my_instanceId",
    *       //   "localId": "my_localId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "localId": "my_localId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def signOutUser(params: ParamsResourceRelyingpartySignoutuser, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def signOutUser(
    params: ParamsResourceRelyingpartySignoutuser,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def signupNewUser(): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(callback: BodyResponseCallback[SchemaSignupNewUserResponse]): Unit = js.native
  def signupNewUser(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(params: ParamsResourceRelyingpartySignupnewuser): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(
    params: ParamsResourceRelyingpartySignupnewuser,
    callback: BodyResponseCallback[SchemaSignupNewUserResponse]
  ): Unit = js.native
  def signupNewUser(
    params: ParamsResourceRelyingpartySignupnewuser,
    options: BodyResponseCallback[Readable | SchemaSignupNewUserResponse],
    callback: BodyResponseCallback[Readable | SchemaSignupNewUserResponse]
  ): Unit = js.native
  def signupNewUser(params: ParamsResourceRelyingpartySignupnewuser, options: MethodOptions): GaxiosPromise[SchemaSignupNewUserResponse] = js.native
  def signupNewUser(
    params: ParamsResourceRelyingpartySignupnewuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignupNewUserResponse]
  ): Unit = js.native
  /**
    * Signup new user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.signupNewUser({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "captchaChallenge": "my_captchaChallenge",
    *       //   "captchaResponse": "my_captchaResponse",
    *       //   "disabled": false,
    *       //   "displayName": "my_displayName",
    *       //   "email": "my_email",
    *       //   "emailVerified": false,
    *       //   "idToken": "my_idToken",
    *       //   "instanceId": "my_instanceId",
    *       //   "localId": "my_localId",
    *       //   "password": "my_password",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "photoUrl": "my_photoUrl",
    *       //   "tenantId": "my_tenantId",
    *       //   "tenantProjectNumber": "my_tenantProjectNumber"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "email": "my_email",
    *   //   "expiresIn": "my_expiresIn",
    *   //   "idToken": "my_idToken",
    *   //   "kind": "my_kind",
    *   //   "localId": "my_localId",
    *   //   "refreshToken": "my_refreshToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def signupNewUser(params: ParamsResourceRelyingpartySignupnewuser, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def signupNewUser(
    params: ParamsResourceRelyingpartySignupnewuser,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def uploadAccount(): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(callback: BodyResponseCallback[SchemaUploadAccountResponse]): Unit = js.native
  def uploadAccount(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(params: ParamsResourceRelyingpartyUploadaccount): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(
    params: ParamsResourceRelyingpartyUploadaccount,
    callback: BodyResponseCallback[SchemaUploadAccountResponse]
  ): Unit = js.native
  def uploadAccount(
    params: ParamsResourceRelyingpartyUploadaccount,
    options: BodyResponseCallback[Readable | SchemaUploadAccountResponse],
    callback: BodyResponseCallback[Readable | SchemaUploadAccountResponse]
  ): Unit = js.native
  def uploadAccount(params: ParamsResourceRelyingpartyUploadaccount, options: MethodOptions): GaxiosPromise[SchemaUploadAccountResponse] = js.native
  def uploadAccount(
    params: ParamsResourceRelyingpartyUploadaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploadAccountResponse]
  ): Unit = js.native
  /**
    * Batch upload existing user accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.uploadAccount({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowOverwrite": false,
    *       //   "blockSize": 0,
    *       //   "cpuMemCost": 0,
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "dkLen": 0,
    *       //   "hashAlgorithm": "my_hashAlgorithm",
    *       //   "memoryCost": 0,
    *       //   "parallelization": 0,
    *       //   "rounds": 0,
    *       //   "saltSeparator": "my_saltSeparator",
    *       //   "sanityCheck": false,
    *       //   "signerKey": "my_signerKey",
    *       //   "targetProjectId": "my_targetProjectId",
    *       //   "users": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "error": [],
    *   //   "kind": "my_kind"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def uploadAccount(params: ParamsResourceRelyingpartyUploadaccount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def uploadAccount(
    params: ParamsResourceRelyingpartyUploadaccount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verifyAssertion(): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(callback: BodyResponseCallback[SchemaVerifyAssertionResponse]): Unit = js.native
  def verifyAssertion(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(params: ParamsResourceRelyingpartyVerifyassertion): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(
    params: ParamsResourceRelyingpartyVerifyassertion,
    callback: BodyResponseCallback[SchemaVerifyAssertionResponse]
  ): Unit = js.native
  def verifyAssertion(
    params: ParamsResourceRelyingpartyVerifyassertion,
    options: BodyResponseCallback[Readable | SchemaVerifyAssertionResponse],
    callback: BodyResponseCallback[Readable | SchemaVerifyAssertionResponse]
  ): Unit = js.native
  def verifyAssertion(params: ParamsResourceRelyingpartyVerifyassertion, options: MethodOptions): GaxiosPromise[SchemaVerifyAssertionResponse] = js.native
  def verifyAssertion(
    params: ParamsResourceRelyingpartyVerifyassertion,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyAssertionResponse]
  ): Unit = js.native
  /**
    * Verifies the assertion returned by the IdP.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.verifyAssertion({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoCreate": false,
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "idToken": "my_idToken",
    *       //   "instanceId": "my_instanceId",
    *       //   "pendingIdToken": "my_pendingIdToken",
    *       //   "postBody": "my_postBody",
    *       //   "requestUri": "my_requestUri",
    *       //   "returnIdpCredential": false,
    *       //   "returnRefreshToken": false,
    *       //   "returnSecureToken": false,
    *       //   "sessionId": "my_sessionId",
    *       //   "tenantId": "my_tenantId",
    *       //   "tenantProjectNumber": "my_tenantProjectNumber"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "appInstallationUrl": "my_appInstallationUrl",
    *   //   "appScheme": "my_appScheme",
    *   //   "context": "my_context",
    *   //   "dateOfBirth": "my_dateOfBirth",
    *   //   "displayName": "my_displayName",
    *   //   "email": "my_email",
    *   //   "emailRecycled": false,
    *   //   "emailVerified": false,
    *   //   "errorMessage": "my_errorMessage",
    *   //   "expiresIn": "my_expiresIn",
    *   //   "federatedId": "my_federatedId",
    *   //   "firstName": "my_firstName",
    *   //   "fullName": "my_fullName",
    *   //   "idToken": "my_idToken",
    *   //   "inputEmail": "my_inputEmail",
    *   //   "isNewUser": false,
    *   //   "kind": "my_kind",
    *   //   "language": "my_language",
    *   //   "lastName": "my_lastName",
    *   //   "localId": "my_localId",
    *   //   "needConfirmation": false,
    *   //   "needEmail": false,
    *   //   "nickName": "my_nickName",
    *   //   "oauthAccessToken": "my_oauthAccessToken",
    *   //   "oauthAuthorizationCode": "my_oauthAuthorizationCode",
    *   //   "oauthExpireIn": 0,
    *   //   "oauthIdToken": "my_oauthIdToken",
    *   //   "oauthRequestToken": "my_oauthRequestToken",
    *   //   "oauthScope": "my_oauthScope",
    *   //   "oauthTokenSecret": "my_oauthTokenSecret",
    *   //   "originalEmail": "my_originalEmail",
    *   //   "photoUrl": "my_photoUrl",
    *   //   "providerId": "my_providerId",
    *   //   "rawUserInfo": "my_rawUserInfo",
    *   //   "refreshToken": "my_refreshToken",
    *   //   "screenName": "my_screenName",
    *   //   "timeZone": "my_timeZone",
    *   //   "verifiedProvider": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def verifyAssertion(params: ParamsResourceRelyingpartyVerifyassertion, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verifyAssertion(
    params: ParamsResourceRelyingpartyVerifyassertion,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verifyCustomToken(): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(callback: BodyResponseCallback[SchemaVerifyCustomTokenResponse]): Unit = js.native
  def verifyCustomToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(params: ParamsResourceRelyingpartyVerifycustomtoken): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(
    params: ParamsResourceRelyingpartyVerifycustomtoken,
    callback: BodyResponseCallback[SchemaVerifyCustomTokenResponse]
  ): Unit = js.native
  def verifyCustomToken(
    params: ParamsResourceRelyingpartyVerifycustomtoken,
    options: BodyResponseCallback[Readable | SchemaVerifyCustomTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaVerifyCustomTokenResponse]
  ): Unit = js.native
  def verifyCustomToken(params: ParamsResourceRelyingpartyVerifycustomtoken, options: MethodOptions): GaxiosPromise[SchemaVerifyCustomTokenResponse] = js.native
  def verifyCustomToken(
    params: ParamsResourceRelyingpartyVerifycustomtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyCustomTokenResponse]
  ): Unit = js.native
  /**
    * Verifies the developer asserted ID token.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.verifyCustomToken({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "instanceId": "my_instanceId",
    *       //   "returnSecureToken": false,
    *       //   "token": "my_token"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expiresIn": "my_expiresIn",
    *   //   "idToken": "my_idToken",
    *   //   "isNewUser": false,
    *   //   "kind": "my_kind",
    *   //   "refreshToken": "my_refreshToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def verifyCustomToken(params: ParamsResourceRelyingpartyVerifycustomtoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verifyCustomToken(
    params: ParamsResourceRelyingpartyVerifycustomtoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verifyPassword(): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(callback: BodyResponseCallback[SchemaVerifyPasswordResponse]): Unit = js.native
  def verifyPassword(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(params: ParamsResourceRelyingpartyVerifypassword): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(
    params: ParamsResourceRelyingpartyVerifypassword,
    callback: BodyResponseCallback[SchemaVerifyPasswordResponse]
  ): Unit = js.native
  def verifyPassword(
    params: ParamsResourceRelyingpartyVerifypassword,
    options: BodyResponseCallback[Readable | SchemaVerifyPasswordResponse],
    callback: BodyResponseCallback[Readable | SchemaVerifyPasswordResponse]
  ): Unit = js.native
  def verifyPassword(params: ParamsResourceRelyingpartyVerifypassword, options: MethodOptions): GaxiosPromise[SchemaVerifyPasswordResponse] = js.native
  def verifyPassword(
    params: ParamsResourceRelyingpartyVerifypassword,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyPasswordResponse]
  ): Unit = js.native
  /**
    * Verifies the user entered password.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.verifyPassword({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "captchaChallenge": "my_captchaChallenge",
    *       //   "captchaResponse": "my_captchaResponse",
    *       //   "delegatedProjectNumber": "my_delegatedProjectNumber",
    *       //   "email": "my_email",
    *       //   "idToken": "my_idToken",
    *       //   "instanceId": "my_instanceId",
    *       //   "password": "my_password",
    *       //   "pendingIdToken": "my_pendingIdToken",
    *       //   "returnSecureToken": false,
    *       //   "tenantId": "my_tenantId",
    *       //   "tenantProjectNumber": "my_tenantProjectNumber"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "email": "my_email",
    *   //   "expiresIn": "my_expiresIn",
    *   //   "idToken": "my_idToken",
    *   //   "kind": "my_kind",
    *   //   "localId": "my_localId",
    *   //   "oauthAccessToken": "my_oauthAccessToken",
    *   //   "oauthAuthorizationCode": "my_oauthAuthorizationCode",
    *   //   "oauthExpireIn": 0,
    *   //   "photoUrl": "my_photoUrl",
    *   //   "refreshToken": "my_refreshToken",
    *   //   "registered": false
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def verifyPassword(params: ParamsResourceRelyingpartyVerifypassword, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verifyPassword(
    params: ParamsResourceRelyingpartyVerifypassword,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verifyPhoneNumber(): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]): Unit = js.native
  def verifyPhoneNumber(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(params: ParamsResourceRelyingpartyVerifyphonenumber): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(
    params: ParamsResourceRelyingpartyVerifyphonenumber,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyPhoneNumber(
    params: ParamsResourceRelyingpartyVerifyphonenumber,
    options: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse],
    callback: BodyResponseCallback[Readable | SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyPhoneNumber(params: ParamsResourceRelyingpartyVerifyphonenumber, options: MethodOptions): GaxiosPromise[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  def verifyPhoneNumber(
    params: ParamsResourceRelyingpartyVerifyphonenumber,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): Unit = js.native
  /**
    * Verifies ownership of a phone number and creates/updates the user account accordingly.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.relyingparty.verifyPhoneNumber({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "code": "my_code",
    *       //   "idToken": "my_idToken",
    *       //   "operation": "my_operation",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "sessionInfo": "my_sessionInfo",
    *       //   "temporaryProof": "my_temporaryProof",
    *       //   "verificationProof": "my_verificationProof"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expiresIn": "my_expiresIn",
    *   //   "idToken": "my_idToken",
    *   //   "isNewUser": false,
    *   //   "localId": "my_localId",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "refreshToken": "my_refreshToken",
    *   //   "temporaryProof": "my_temporaryProof",
    *   //   "temporaryProofExpiresIn": "my_temporaryProofExpiresIn",
    *   //   "verificationProof": "my_verificationProof",
    *   //   "verificationProofExpiresIn": "my_verificationProofExpiresIn"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def verifyPhoneNumber(params: ParamsResourceRelyingpartyVerifyphonenumber, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verifyPhoneNumber(
    params: ParamsResourceRelyingpartyVerifyphonenumber,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
