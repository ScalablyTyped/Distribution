package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Advertisergroups")
@js.native
open class ResourceAdvertisergroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAdvertisergroupsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAdvertisergroupsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisergroupsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisergroupsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAdvertisergroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing advertiser group.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.advertiserGroups.delete({
    *     // Advertiser group ID.
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
  def delete(params: ParamsResourceAdvertisergroupsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisergroupsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(params: ParamsResourceAdvertisergroupsGet): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(params: ParamsResourceAdvertisergroupsGet, callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def get(
    params: ParamsResourceAdvertisergroupsGet,
    options: BodyResponseCallback[Readable | SchemaAdvertiserGroup],
    callback: BodyResponseCallback[Readable | SchemaAdvertiserGroup]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisergroupsGet, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(
    params: ParamsResourceAdvertisergroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  /**
    * Gets one advertiser group by ID.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.advertiserGroups.get({
    *     // Advertiser group ID.
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
  def get(params: ParamsResourceAdvertisergroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisergroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(params: ParamsResourceAdvertisergroupsInsert): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(
    params: ParamsResourceAdvertisergroupsInsert,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAdvertisergroupsInsert,
    options: BodyResponseCallback[Readable | SchemaAdvertiserGroup],
    callback: BodyResponseCallback[Readable | SchemaAdvertiserGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceAdvertisergroupsInsert, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(
    params: ParamsResourceAdvertisergroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  /**
    * Inserts a new advertiser group.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.advertiserGroups.insert({
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
  def insert(params: ParamsResourceAdvertisergroupsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAdvertisergroupsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAdvertiserGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(params: ParamsResourceAdvertisergroupsList): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAdvertisergroupsList,
    callback: BodyResponseCallback[SchemaAdvertiserGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisergroupsList,
    options: BodyResponseCallback[Readable | SchemaAdvertiserGroupsListResponse],
    callback: BodyResponseCallback[Readable | SchemaAdvertiserGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisergroupsList, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAdvertisergroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroupsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of advertiser groups, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.advertiserGroups.list({
    *     // Select only advertiser groups with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "advertiser*2015" will return objects with names like "advertiser group June 2015", "advertiser group April 2015", or simply "advertiser group 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "advertisergroup" will match objects with name "my advertisergroup", "advertisergroup 2015", or simply "advertisergroup".
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
    *   //   "advertiserGroups": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceAdvertisergroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisergroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(params: ParamsResourceAdvertisergroupsPatch): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(params: ParamsResourceAdvertisergroupsPatch, callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisergroupsPatch,
    options: BodyResponseCallback[Readable | SchemaAdvertiserGroup],
    callback: BodyResponseCallback[Readable | SchemaAdvertiserGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisergroupsPatch, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(
    params: ParamsResourceAdvertisergroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  /**
    * Updates an existing advertiser group. This method supports patch semantics.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.advertiserGroups.patch({
    *     // AdvertiserGroup ID.
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
  def patch(params: ParamsResourceAdvertisergroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisergroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(params: ParamsResourceAdvertisergroupsUpdate): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(
    params: ParamsResourceAdvertisergroupsUpdate,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def update(
    params: ParamsResourceAdvertisergroupsUpdate,
    options: BodyResponseCallback[Readable | SchemaAdvertiserGroup],
    callback: BodyResponseCallback[Readable | SchemaAdvertiserGroup]
  ): Unit = js.native
  def update(params: ParamsResourceAdvertisergroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(
    params: ParamsResourceAdvertisergroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  /**
    * Updates an existing advertiser group.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.advertiserGroups.update({
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
  def update(params: ParamsResourceAdvertisergroupsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAdvertisergroupsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
