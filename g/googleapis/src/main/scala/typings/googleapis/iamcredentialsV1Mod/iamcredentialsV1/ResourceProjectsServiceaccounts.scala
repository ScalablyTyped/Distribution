package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iamcredentials/v1", "iamcredentials_v1.Resource$Projects$Serviceaccounts")
@js.native
open class ResourceProjectsServiceaccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generateAccessToken(): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(callback: BodyResponseCallback[SchemaGenerateAccessTokenResponse]): Unit = js.native
  def generateAccessToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken,
    callback: BodyResponseCallback[SchemaGenerateAccessTokenResponse]
  ): Unit = js.native
  def generateAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken,
    options: BodyResponseCallback[Readable | SchemaGenerateAccessTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateAccessTokenResponse]
  ): Unit = js.native
  def generateAccessToken(params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken, options: MethodOptions): GaxiosPromise[SchemaGenerateAccessTokenResponse] = js.native
  def generateAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateAccessTokenResponse]
  ): Unit = js.native
  /**
    * Generates an OAuth 2.0 access token for a service account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iamcredentials.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iamcredentials = google.iamcredentials('v1');
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
    *   const res = await iamcredentials.projects.serviceAccounts.generateAccessToken(
    *     {
    *       // Required. The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID\}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    *       name: 'projects/my-project/serviceAccounts/my-serviceAccount',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "delegates": [],
    *         //   "lifetime": "my_lifetime",
    *         //   "scope": []
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessToken": "my_accessToken",
    *   //   "expireTime": "my_expireTime"
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
  def generateAccessToken(params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateAccessToken(
    params: ParamsResourceProjectsServiceaccountsGenerateaccesstoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateIdToken(): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(callback: BodyResponseCallback[SchemaGenerateIdTokenResponse]): Unit = js.native
  def generateIdToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(params: ParamsResourceProjectsServiceaccountsGenerateidtoken): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidtoken,
    callback: BodyResponseCallback[SchemaGenerateIdTokenResponse]
  ): Unit = js.native
  def generateIdToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidtoken,
    options: BodyResponseCallback[Readable | SchemaGenerateIdTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateIdTokenResponse]
  ): Unit = js.native
  def generateIdToken(params: ParamsResourceProjectsServiceaccountsGenerateidtoken, options: MethodOptions): GaxiosPromise[SchemaGenerateIdTokenResponse] = js.native
  def generateIdToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateIdTokenResponse]
  ): Unit = js.native
  /**
    * Generates an OpenID Connect ID token for a service account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iamcredentials.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iamcredentials = google.iamcredentials('v1');
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
    *   const res = await iamcredentials.projects.serviceAccounts.generateIdToken({
    *     // Required. The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID\}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "audience": "my_audience",
    *       //   "delegates": [],
    *       //   "includeEmail": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token"
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
  def generateIdToken(params: ParamsResourceProjectsServiceaccountsGenerateidtoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateIdToken(
    params: ParamsResourceProjectsServiceaccountsGenerateidtoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def signBlob(): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(callback: BodyResponseCallback[SchemaSignBlobResponse]): Unit = js.native
  def signBlob(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(params: ParamsResourceProjectsServiceaccountsSignblob): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    options: BodyResponseCallback[Readable | SchemaSignBlobResponse],
    callback: BodyResponseCallback[Readable | SchemaSignBlobResponse]
  ): Unit = js.native
  def signBlob(params: ParamsResourceProjectsServiceaccountsSignblob, options: MethodOptions): GaxiosPromise[SchemaSignBlobResponse] = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignBlobResponse]
  ): Unit = js.native
  /**
    * Signs a blob using a service account's system-managed private key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iamcredentials.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iamcredentials = google.iamcredentials('v1');
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
    *   const res = await iamcredentials.projects.serviceAccounts.signBlob({
    *     // Required. The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID\}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delegates": [],
    *       //   "payload": "my_payload"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keyId": "my_keyId",
    *   //   "signedBlob": "my_signedBlob"
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
  def signBlob(params: ParamsResourceProjectsServiceaccountsSignblob, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def signBlob(
    params: ParamsResourceProjectsServiceaccountsSignblob,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def signJwt(): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(callback: BodyResponseCallback[SchemaSignJwtResponse]): Unit = js.native
  def signJwt(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(params: ParamsResourceProjectsServiceaccountsSignjwt): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    options: BodyResponseCallback[Readable | SchemaSignJwtResponse],
    callback: BodyResponseCallback[Readable | SchemaSignJwtResponse]
  ): Unit = js.native
  def signJwt(params: ParamsResourceProjectsServiceaccountsSignjwt, options: MethodOptions): GaxiosPromise[SchemaSignJwtResponse] = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignJwtResponse]
  ): Unit = js.native
  /**
    * Signs a JWT using a service account's system-managed private key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iamcredentials.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iamcredentials = google.iamcredentials('v1');
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
    *   const res = await iamcredentials.projects.serviceAccounts.signJwt({
    *     // Required. The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID\}`. The `-` wildcard character is required; replacing it with a project ID is invalid.
    *     name: 'projects/my-project/serviceAccounts/my-serviceAccount',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delegates": [],
    *       //   "payload": "my_payload"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keyId": "my_keyId",
    *   //   "signedJwt": "my_signedJwt"
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
  def signJwt(params: ParamsResourceProjectsServiceaccountsSignjwt, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def signJwt(
    params: ParamsResourceProjectsServiceaccountsSignjwt,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
