package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Inventorysourcegroups")
@js.native
open class ResourceInventorysourcegroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assignedInventorySources: ResourceInventorysourcegroupsAssignedinventorysources = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def create(callback: BodyResponseCallback[SchemaInventorySourceGroup]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def create(params: ParamsResourceInventorysourcegroupsCreate): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsCreate,
    callback: BodyResponseCallback[SchemaInventorySourceGroup]
  ): Unit = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsCreate,
    options: BodyResponseCallback[Readable | SchemaInventorySourceGroup],
    callback: BodyResponseCallback[Readable | SchemaInventorySourceGroup]
  ): Unit = js.native
  def create(params: ParamsResourceInventorysourcegroupsCreate, options: MethodOptions): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySourceGroup]
  ): Unit = js.native
  /**
    * Creates a new inventory source group. Returns the newly created inventory source group if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.inventorySourceGroups.create({
    *     // The ID of the advertiser that owns the inventory source group. The parent partner will not have access to this group.
    *     advertiserId: 'placeholder-value',
    *     // The ID of the partner that owns the inventory source group. Only this partner will have write access to this group. Only advertisers to which this group is explicitly shared will have read access to this group.
    *     partnerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "inventorySourceGroupId": "my_inventorySourceGroupId",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "inventorySourceGroupId": "my_inventorySourceGroupId",
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
  def create(params: ParamsResourceInventorysourcegroupsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceInventorysourcegroupsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceInventorysourcegroupsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceInventorysourcegroupsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceInventorysourcegroupsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceInventorysourcegroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an inventory source group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.inventorySourceGroups.delete({
    *     // The ID of the advertiser that owns the inventory source group. The parent partner does not have access to this group.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the inventory source group to delete.
    *     inventorySourceGroupId: '[^/]+',
    *     // The ID of the partner that owns the inventory source group. Only this partner has write access to this group.
    *     partnerId: 'placeholder-value',
    *   });
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
  def delete(params: ParamsResourceInventorysourcegroupsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceInventorysourcegroupsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaInventorySourceGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def get(params: ParamsResourceInventorysourcegroupsGet): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def get(
    params: ParamsResourceInventorysourcegroupsGet,
    callback: BodyResponseCallback[SchemaInventorySourceGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceInventorysourcegroupsGet,
    options: BodyResponseCallback[Readable | SchemaInventorySourceGroup],
    callback: BodyResponseCallback[Readable | SchemaInventorySourceGroup]
  ): Unit = js.native
  def get(params: ParamsResourceInventorysourcegroupsGet, options: MethodOptions): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def get(
    params: ParamsResourceInventorysourcegroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySourceGroup]
  ): Unit = js.native
  /**
    * Gets an inventory source group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.inventorySourceGroups.get({
    *     // The ID of the advertiser that has access to the inventory source group. If an inventory source group is partner-owned, only advertisers to which the group is explicitly shared can access the group.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the inventory source group to fetch.
    *     inventorySourceGroupId: '[^/]+',
    *     // The ID of the partner that has access to the inventory source group. A partner cannot access an advertiser-owned inventory source group.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "inventorySourceGroupId": "my_inventorySourceGroupId",
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
  def get(params: ParamsResourceInventorysourcegroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceInventorysourcegroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInventorySourceGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInventorySourceGroupsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInventorySourceGroupsResponse] = js.native
  def list(params: ParamsResourceInventorysourcegroupsList): GaxiosPromise[SchemaListInventorySourceGroupsResponse] = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsList,
    callback: BodyResponseCallback[SchemaListInventorySourceGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsList,
    options: BodyResponseCallback[Readable | SchemaListInventorySourceGroupsResponse],
    callback: BodyResponseCallback[Readable | SchemaListInventorySourceGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInventorysourcegroupsList, options: MethodOptions): GaxiosPromise[SchemaListInventorySourceGroupsResponse] = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInventorySourceGroupsResponse]
  ): Unit = js.native
  /**
    * Lists inventory source groups that are accessible to the current user. The order is defined by the order_by parameter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.inventorySourceGroups.list({
    *     // The ID of the advertiser that has access to the inventory source group. If an inventory source group is partner-owned, only advertisers to which the group is explicitly shared can access the group.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by inventory source group properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `inventorySourceGroupId` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) * `inventorySourceGroupId` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. For example, `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListInventorySources` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that has access to the inventory source group. A partner cannot access advertiser-owned inventory source groups.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inventorySourceGroups": [],
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
  def list(params: ParamsResourceInventorysourcegroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaInventorySourceGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def patch(params: ParamsResourceInventorysourcegroupsPatch): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def patch(
    params: ParamsResourceInventorysourcegroupsPatch,
    callback: BodyResponseCallback[SchemaInventorySourceGroup]
  ): Unit = js.native
  def patch(
    params: ParamsResourceInventorysourcegroupsPatch,
    options: BodyResponseCallback[Readable | SchemaInventorySourceGroup],
    callback: BodyResponseCallback[Readable | SchemaInventorySourceGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceInventorysourcegroupsPatch, options: MethodOptions): GaxiosPromise[SchemaInventorySourceGroup] = js.native
  def patch(
    params: ParamsResourceInventorysourcegroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInventorySourceGroup]
  ): Unit = js.native
  /**
    * Updates an inventory source group. Returns the updated inventory source group if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.inventorySourceGroups.patch({
    *     // The ID of the advertiser that owns the inventory source group. The parent partner does not have access to this group.
    *     advertiserId: 'placeholder-value',
    *     // Output only. The unique ID of the inventory source group. Assigned by the system.
    *     inventorySourceGroupId: 'placeholder-value',
    *     // The ID of the partner that owns the inventory source group. Only this partner has write access to this group.
    *     partnerId: 'placeholder-value',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "inventorySourceGroupId": "my_inventorySourceGroupId",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "inventorySourceGroupId": "my_inventorySourceGroupId",
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
  def patch(params: ParamsResourceInventorysourcegroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceInventorysourcegroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
