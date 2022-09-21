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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Inventorysourcegroups$Assignedinventorysources")
@js.native
open class ResourceInventorysourcegroupsAssignedinventorysources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkEdit(): GaxiosPromise[SchemaBulkEditAssignedInventorySourcesResponse] = js.native
  def bulkEdit(callback: BodyResponseCallback[SchemaBulkEditAssignedInventorySourcesResponse]): Unit = js.native
  def bulkEdit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditAssignedInventorySourcesResponse] = js.native
  def bulkEdit(params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit): GaxiosPromise[SchemaBulkEditAssignedInventorySourcesResponse] = js.native
  def bulkEdit(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit,
    callback: BodyResponseCallback[SchemaBulkEditAssignedInventorySourcesResponse]
  ): Unit = js.native
  def bulkEdit(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit,
    options: BodyResponseCallback[Readable | SchemaBulkEditAssignedInventorySourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditAssignedInventorySourcesResponse]
  ): Unit = js.native
  def bulkEdit(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit,
    options: MethodOptions
  ): GaxiosPromise[SchemaBulkEditAssignedInventorySourcesResponse] = js.native
  def bulkEdit(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkEditAssignedInventorySourcesResponse]
  ): Unit = js.native
  /**
    * Bulk edits multiple assignments between inventory sources and a single inventory source group. The operation will delete the assigned inventory sources provided in BulkEditAssignedInventorySourcesRequest.deleted_assigned_inventory_sources and then create the assigned inventory sources provided in BulkEditAssignedInventorySourcesRequest.created_assigned_inventory_sources.
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
    *   const res =
    *     await displayvideo.inventorySourceGroups.assignedInventorySources.bulkEdit({
    *       // Required. The ID of the inventory source group to which the assignments are assigned.
    *       inventorySourceGroupId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "advertiserId": "my_advertiserId",
    *         //   "createdAssignedInventorySources": [],
    *         //   "deletedAssignedInventorySources": [],
    *         //   "partnerId": "my_partnerId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedInventorySources": []
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
  def bulkEdit(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkEdit(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesBulkedit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAssignedInventorySource] = js.native
  def create(callback: BodyResponseCallback[SchemaAssignedInventorySource]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignedInventorySource] = js.native
  def create(params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate): GaxiosPromise[SchemaAssignedInventorySource] = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate,
    callback: BodyResponseCallback[SchemaAssignedInventorySource]
  ): Unit = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate,
    options: BodyResponseCallback[Readable | SchemaAssignedInventorySource],
    callback: BodyResponseCallback[Readable | SchemaAssignedInventorySource]
  ): Unit = js.native
  def create(params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate, options: MethodOptions): GaxiosPromise[SchemaAssignedInventorySource] = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignedInventorySource]
  ): Unit = js.native
  /**
    * Creates an assignment between an inventory source and an inventory source group.
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
    *   const res =
    *     await displayvideo.inventorySourceGroups.assignedInventorySources.create({
    *       // The ID of the advertiser that owns the parent inventory source group. The parent partner will not have access to this assigned inventory source.
    *       advertiserId: 'placeholder-value',
    *       // Required. The ID of the inventory source group to which the assignment will be assigned.
    *       inventorySourceGroupId: '[^/]+',
    *       // The ID of the partner that owns the parent inventory source group. Only this partner will have write access to this assigned inventory source.
    *       partnerId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "assignedInventorySourceId": "my_assignedInventorySourceId",
    *         //   "inventorySourceId": "my_inventorySourceId",
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedInventorySourceId": "my_assignedInventorySourceId",
    *   //   "inventorySourceId": "my_inventorySourceId",
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
  def create(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the assignment between an inventory source and an inventory source group.
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
    *   const res =
    *     await displayvideo.inventorySourceGroups.assignedInventorySources.delete({
    *       // The ID of the advertiser that owns the parent inventory source group. The parent partner does not have access to this assigned inventory source.
    *       advertiserId: 'placeholder-value',
    *       // Required. The ID of the assigned inventory source to delete.
    *       assignedInventorySourceId: '[^/]+',
    *       // Required. The ID of the inventory source group to which this assignment is assigned.
    *       inventorySourceGroupId: '[^/]+',
    *       // The ID of the partner that owns the parent inventory source group. Only this partner has write access to this assigned inventory source.
    *       partnerId: 'placeholder-value',
    *     });
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
  def delete(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAssignedInventorySourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAssignedInventorySourcesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAssignedInventorySourcesResponse] = js.native
  def list(params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesList): GaxiosPromise[SchemaListAssignedInventorySourcesResponse] = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesList,
    callback: BodyResponseCallback[SchemaListAssignedInventorySourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesList,
    options: BodyResponseCallback[Readable | SchemaListAssignedInventorySourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAssignedInventorySourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesList, options: MethodOptions): GaxiosPromise[SchemaListAssignedInventorySourcesResponse] = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAssignedInventorySourcesResponse]
  ): Unit = js.native
  /**
    * Lists inventory sources assigned to an inventory source group.
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
    *   const res =
    *     await displayvideo.inventorySourceGroups.assignedInventorySources.list({
    *       // The ID of the advertiser that has access to the assignment. If the parent inventory source group is partner-owned, only advertisers to which the parent group is explicitly shared can access the assigned inventory source.
    *       advertiserId: 'placeholder-value',
    *       // Allows filtering by assigned inventory source fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `assignedInventorySourceId` The length of this field should be no more than 500 characters.
    *       filter: 'placeholder-value',
    *       // Required. The ID of the inventory source group to which these assignments are assigned.
    *       inventorySourceGroupId: '[^/]+',
    *       // Field by which to sort the list. Acceptable values are: * `assignedInventorySourceId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be added to the field name. Example: `assignedInventorySourceId desc`.
    *       orderBy: 'placeholder-value',
    *       // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *       pageSize: 'placeholder-value',
    *       // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListAssignedInventorySources` method. If not specified, the first page of results will be returned.
    *       pageToken: 'placeholder-value',
    *       // The ID of the partner that has access to the assignment. If the parent inventory source group is advertiser-owned, the assignment cannot be accessed via a partner.
    *       partnerId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedInventorySources": [],
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
  def list(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceInventorysourcegroupsAssignedinventorysourcesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
