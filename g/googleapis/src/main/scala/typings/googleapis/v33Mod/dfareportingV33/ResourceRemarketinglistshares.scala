package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Remarketinglistshares")
@js.native
open class ResourceRemarketinglistshares protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def get(callback: BodyResponseCallback[SchemaRemarketingListShare]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def get(params: ParamsResourceRemarketinglistsharesGet): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def get(
    params: ParamsResourceRemarketinglistsharesGet,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def get(
    params: ParamsResourceRemarketinglistsharesGet,
    options: BodyResponseCallback[Readable | SchemaRemarketingListShare],
    callback: BodyResponseCallback[Readable | SchemaRemarketingListShare]
  ): Unit = js.native
  def get(params: ParamsResourceRemarketinglistsharesGet, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def get(
    params: ParamsResourceRemarketinglistsharesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  /**
    * Gets one remarketing list share by remarketing list ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingListShares.get({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Remarketing list ID.
    *     remarketingListId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "remarketingListId": "my_remarketingListId",
    *   //   "sharedAccountIds": [],
    *   //   "sharedAdvertiserIds": []
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
  def get(params: ParamsResourceRemarketinglistsharesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRemarketinglistsharesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def patch(callback: BodyResponseCallback[SchemaRemarketingListShare]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def patch(params: ParamsResourceRemarketinglistsharesPatch): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsharesPatch,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def patch(
    params: ParamsResourceRemarketinglistsharesPatch,
    options: BodyResponseCallback[Readable | SchemaRemarketingListShare],
    callback: BodyResponseCallback[Readable | SchemaRemarketingListShare]
  ): Unit = js.native
  def patch(params: ParamsResourceRemarketinglistsharesPatch, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsharesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  /**
    * Updates an existing remarketing list share. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingListShares.patch({
    *     // RemarketingList ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "remarketingListId": "my_remarketingListId",
    *       //   "sharedAccountIds": [],
    *       //   "sharedAdvertiserIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "remarketingListId": "my_remarketingListId",
    *   //   "sharedAccountIds": [],
    *   //   "sharedAdvertiserIds": []
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
  def patch(params: ParamsResourceRemarketinglistsharesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsharesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def update(callback: BodyResponseCallback[SchemaRemarketingListShare]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def update(params: ParamsResourceRemarketinglistsharesUpdate): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def update(
    params: ParamsResourceRemarketinglistsharesUpdate,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  def update(
    params: ParamsResourceRemarketinglistsharesUpdate,
    options: BodyResponseCallback[Readable | SchemaRemarketingListShare],
    callback: BodyResponseCallback[Readable | SchemaRemarketingListShare]
  ): Unit = js.native
  def update(params: ParamsResourceRemarketinglistsharesUpdate, options: MethodOptions): GaxiosPromise[SchemaRemarketingListShare] = js.native
  def update(
    params: ParamsResourceRemarketinglistsharesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListShare]
  ): Unit = js.native
  /**
    * Updates an existing remarketing list share.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.remarketingListShares.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "remarketingListId": "my_remarketingListId",
    *       //   "sharedAccountIds": [],
    *       //   "sharedAdvertiserIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "remarketingListId": "my_remarketingListId",
    *   //   "sharedAccountIds": [],
    *   //   "sharedAdvertiserIds": []
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
  def update(params: ParamsResourceRemarketinglistsharesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceRemarketinglistsharesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
