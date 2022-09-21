package typings.googleapis.v35Mod.dfareportingV35

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Placementstrategies")
@js.native
open class ResourcePlacementstrategies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlacementstrategiesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlacementstrategiesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePlacementstrategiesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePlacementstrategiesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePlacementstrategiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing placement strategy.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementStrategies.delete({
    *     // Placement strategy ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourcePlacementstrategiesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePlacementstrategiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(params: ParamsResourcePlacementstrategiesGet): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(
    params: ParamsResourcePlacementstrategiesGet,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def get(
    params: ParamsResourcePlacementstrategiesGet,
    options: BodyResponseCallback[Readable | SchemaPlacementStrategy],
    callback: BodyResponseCallback[Readable | SchemaPlacementStrategy]
  ): Unit = js.native
  def get(params: ParamsResourcePlacementstrategiesGet, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(
    params: ParamsResourcePlacementstrategiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  /**
    * Gets one placement strategy by ID.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementStrategies.get({
    *     // Placement strategy ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourcePlacementstrategiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePlacementstrategiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(params: ParamsResourcePlacementstrategiesInsert): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(
    params: ParamsResourcePlacementstrategiesInsert,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def insert(
    params: ParamsResourcePlacementstrategiesInsert,
    options: BodyResponseCallback[Readable | SchemaPlacementStrategy],
    callback: BodyResponseCallback[Readable | SchemaPlacementStrategy]
  ): Unit = js.native
  def insert(params: ParamsResourcePlacementstrategiesInsert, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(
    params: ParamsResourcePlacementstrategiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  /**
    * Inserts a new placement strategy.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementStrategies.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def insert(params: ParamsResourcePlacementstrategiesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePlacementstrategiesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlacementStrategiesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(params: ParamsResourcePlacementstrategiesList): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(
    params: ParamsResourcePlacementstrategiesList,
    callback: BodyResponseCallback[SchemaPlacementStrategiesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlacementstrategiesList,
    options: BodyResponseCallback[Readable | SchemaPlacementStrategiesListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlacementStrategiesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlacementstrategiesList, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(
    params: ParamsResourcePlacementstrategiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategiesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of placement strategies, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementStrategies.list({
    *     // Select only placement strategies with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "placementstrategy*2015" will return objects with names like "placementstrategy June 2015", "placementstrategy April 2015", or simply "placementstrategy 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placementstrategy" will match objects with name "my placementstrategy", "placementstrategy 2015", or simply "placementstrategy".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "placementStrategies": []
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
  def list(params: ParamsResourcePlacementstrategiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlacementstrategiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(params: ParamsResourcePlacementstrategiesPatch): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(
    params: ParamsResourcePlacementstrategiesPatch,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePlacementstrategiesPatch,
    options: BodyResponseCallback[Readable | SchemaPlacementStrategy],
    callback: BodyResponseCallback[Readable | SchemaPlacementStrategy]
  ): Unit = js.native
  def patch(params: ParamsResourcePlacementstrategiesPatch, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(
    params: ParamsResourcePlacementstrategiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  /**
    * Updates an existing placement strategy. This method supports patch semantics.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementStrategies.patch({
    *     // PlacementStrategy ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourcePlacementstrategiesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePlacementstrategiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(params: ParamsResourcePlacementstrategiesUpdate): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(
    params: ParamsResourcePlacementstrategiesUpdate,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def update(
    params: ParamsResourcePlacementstrategiesUpdate,
    options: BodyResponseCallback[Readable | SchemaPlacementStrategy],
    callback: BodyResponseCallback[Readable | SchemaPlacementStrategy]
  ): Unit = js.native
  def update(params: ParamsResourcePlacementstrategiesUpdate, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(
    params: ParamsResourcePlacementstrategiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  /**
    * Updates an existing placement strategy.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.placementStrategies.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def update(params: ParamsResourcePlacementstrategiesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePlacementstrategiesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
