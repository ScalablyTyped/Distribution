package typings.googleapis.storagetransferV1Mod.storagetransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Resource$Googleserviceaccounts")
@js.native
open class ResourceGoogleserviceaccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleServiceAccount]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(params: ParamsResourceGoogleserviceaccountsGet): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(
    params: ParamsResourceGoogleserviceaccountsGet,
    callback: BodyResponseCallback[SchemaGoogleServiceAccount]
  ): Unit = js.native
  def get(
    params: ParamsResourceGoogleserviceaccountsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleServiceAccount],
    callback: BodyResponseCallback[Readable | SchemaGoogleServiceAccount]
  ): Unit = js.native
  def get(params: ParamsResourceGoogleserviceaccountsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleServiceAccount] = js.native
  def get(
    params: ParamsResourceGoogleserviceaccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleServiceAccount]
  ): Unit = js.native
  /**
    * Returns the Google service account that is used by Storage Transfer Service to access buckets in the project where transfers run or in other projects. Each Google service account is associated with one Google Cloud project. Users should add this service account to the Google Cloud Storage bucket ACLs to grant access to Storage Transfer Service. This service account is created and owned by Storage Transfer Service and can only be used by Storage Transfer Service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
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
    *   const res = await storagetransfer.googleServiceAccounts.get({
    *     // Required. The ID of the Google Cloud project that the Google service account is associated with.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountEmail": "my_accountEmail",
    *   //   "subjectId": "my_subjectId"
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
  def get(params: ParamsResourceGoogleserviceaccountsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceGoogleserviceaccountsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
