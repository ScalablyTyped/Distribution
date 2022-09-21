package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounts$Credentials")
@js.native
open class ResourceAccountsCredentials protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAccountCredentials] = js.native
  def create(callback: BodyResponseCallback[SchemaAccountCredentials]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountCredentials] = js.native
  def create(params: ParamsResourceAccountsCredentialsCreate): GaxiosPromise[SchemaAccountCredentials] = js.native
  def create(
    params: ParamsResourceAccountsCredentialsCreate,
    callback: BodyResponseCallback[SchemaAccountCredentials]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsCredentialsCreate,
    options: BodyResponseCallback[Readable | SchemaAccountCredentials],
    callback: BodyResponseCallback[Readable | SchemaAccountCredentials]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCredentialsCreate, options: MethodOptions): GaxiosPromise[SchemaAccountCredentials] = js.native
  def create(
    params: ParamsResourceAccountsCredentialsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountCredentials]
  ): Unit = js.native
  /**
    * Uploads credentials for the Merchant Center account. If credentials already exist for this Merchant Center account and purpose, this method updates them.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.credentials.create({
    *     // Required. The merchant id of the account these credentials belong to.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessToken": "my_accessToken",
    *       //   "expiresIn": "my_expiresIn",
    *       //   "purpose": "my_purpose"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessToken": "my_accessToken",
    *   //   "expiresIn": "my_expiresIn",
    *   //   "purpose": "my_purpose"
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
  def create(params: ParamsResourceAccountsCredentialsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsCredentialsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
