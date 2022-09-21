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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Collectionstatuses")
@js.native
open class ResourceCollectionstatuses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCollectionStatus] = js.native
  def get(callback: BodyResponseCallback[SchemaCollectionStatus]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCollectionStatus] = js.native
  def get(params: ParamsResourceCollectionstatusesGet): GaxiosPromise[SchemaCollectionStatus] = js.native
  def get(
    params: ParamsResourceCollectionstatusesGet,
    callback: BodyResponseCallback[SchemaCollectionStatus]
  ): Unit = js.native
  def get(
    params: ParamsResourceCollectionstatusesGet,
    options: BodyResponseCallback[Readable | SchemaCollectionStatus],
    callback: BodyResponseCallback[Readable | SchemaCollectionStatus]
  ): Unit = js.native
  def get(params: ParamsResourceCollectionstatusesGet, options: MethodOptions): GaxiosPromise[SchemaCollectionStatus] = js.native
  def get(
    params: ParamsResourceCollectionstatusesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCollectionStatus]
  ): Unit = js.native
  /**
    * Gets the status of a collection from your Merchant Center account.
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
    *   const res = await content.collectionstatuses.get({
    *     // Required. The collectionId of the collection. CollectionId is the same as the REST ID of the collection.
    *     collectionId: 'placeholder-value',
    *     // Required. The ID of the account that contains the collection. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "collectionLevelIssuses": [],
    *   //   "creationDate": "my_creationDate",
    *   //   "destinationStatuses": [],
    *   //   "id": "my_id",
    *   //   "lastUpdateDate": "my_lastUpdateDate"
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
  def get(params: ParamsResourceCollectionstatusesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCollectionstatusesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCollectionStatusesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCollectionStatusesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCollectionStatusesResponse] = js.native
  def list(params: ParamsResourceCollectionstatusesList): GaxiosPromise[SchemaListCollectionStatusesResponse] = js.native
  def list(
    params: ParamsResourceCollectionstatusesList,
    callback: BodyResponseCallback[SchemaListCollectionStatusesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCollectionstatusesList,
    options: BodyResponseCallback[Readable | SchemaListCollectionStatusesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCollectionStatusesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCollectionstatusesList, options: MethodOptions): GaxiosPromise[SchemaListCollectionStatusesResponse] = js.native
  def list(
    params: ParamsResourceCollectionstatusesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCollectionStatusesResponse]
  ): Unit = js.native
  /**
    * Lists the statuses of the collections in your Merchant Center account.
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
    *   const res = await content.collectionstatuses.list({
    *     // Required. The ID of the account that contains the collection. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The maximum number of collection statuses to return in the response, used for paging. Defaults to 50; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Token (if provided) to retrieve the subsequent page. All other parameters must match the original call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resources": []
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
  def list(params: ParamsResourceCollectionstatusesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCollectionstatusesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
