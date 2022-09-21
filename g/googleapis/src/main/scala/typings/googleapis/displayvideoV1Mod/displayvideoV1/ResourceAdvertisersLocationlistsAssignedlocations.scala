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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Locationlists$Assignedlocations")
@js.native
open class ResourceAdvertisersLocationlistsAssignedlocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bulkEdit(): GaxiosPromise[SchemaBulkEditAssignedLocationsResponse] = js.native
  def bulkEdit(callback: BodyResponseCallback[SchemaBulkEditAssignedLocationsResponse]): Unit = js.native
  def bulkEdit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBulkEditAssignedLocationsResponse] = js.native
  def bulkEdit(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit): GaxiosPromise[SchemaBulkEditAssignedLocationsResponse] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit,
    callback: BodyResponseCallback[SchemaBulkEditAssignedLocationsResponse]
  ): Unit = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit,
    options: BodyResponseCallback[Readable | SchemaBulkEditAssignedLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaBulkEditAssignedLocationsResponse]
  ): Unit = js.native
  def bulkEdit(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit, options: MethodOptions): GaxiosPromise[SchemaBulkEditAssignedLocationsResponse] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBulkEditAssignedLocationsResponse]
  ): Unit = js.native
  /**
    * Bulk edits multiple assignments between locations and a single location list. The operation will delete the assigned locations provided in BulkEditAssignedLocationsRequest.deleted_assigned_locations and then create the assigned locations provided in BulkEditAssignedLocationsRequest.created_assigned_locations.
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
    *     await displayvideo.advertisers.locationLists.assignedLocations.bulkEdit({
    *       // Required. The ID of the DV360 advertiser to which the location list belongs.
    *       advertiserId: 'placeholder-value',
    *       // Required. The ID of the location list to which these assignments are assigned.
    *       locationListId: '[^/]+',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createdAssignedLocations": [],
    *         //   "deletedAssignedLocations": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedLocations": []
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
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def bulkEdit(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAssignedLocation] = js.native
  def create(callback: BodyResponseCallback[SchemaAssignedLocation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignedLocation] = js.native
  def create(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate): GaxiosPromise[SchemaAssignedLocation] = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate,
    callback: BodyResponseCallback[SchemaAssignedLocation]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate,
    options: BodyResponseCallback[Readable | SchemaAssignedLocation],
    callback: BodyResponseCallback[Readable | SchemaAssignedLocation]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate, options: MethodOptions): GaxiosPromise[SchemaAssignedLocation] = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignedLocation]
  ): Unit = js.native
  /**
    * Creates an assignment between a location and a location list.
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
    *     await displayvideo.advertisers.locationLists.assignedLocations.create({
    *       // Required. The ID of the DV360 advertiser to which the location list belongs.
    *       advertiserId: 'placeholder-value',
    *       // Required. The ID of the location list for which the assignment will be created.
    *       locationListId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "assignedLocationId": "my_assignedLocationId",
    *         //   "name": "my_name",
    *         //   "targetingOptionId": "my_targetingOptionId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedLocationId": "my_assignedLocationId",
    *   //   "name": "my_name",
    *   //   "targetingOptionId": "my_targetingOptionId"
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
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the assignment between a location and a location list.
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
    *     await displayvideo.advertisers.locationLists.assignedLocations.delete({
    *       // Required. The ID of the DV360 advertiser to which the location list belongs.
    *       advertiserId: 'placeholder-value',
    *       // Required. The ID of the assigned location to delete.
    *       assignedLocationId: '[^/]+',
    *       // Required. The ID of the location list to which this assignment is assigned.
    *       locationListId: 'placeholder-value',
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
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAssignedLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAssignedLocationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAssignedLocationsResponse] = js.native
  def list(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsList): GaxiosPromise[SchemaListAssignedLocationsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsList,
    callback: BodyResponseCallback[SchemaListAssignedLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsList,
    options: BodyResponseCallback[Readable | SchemaListAssignedLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAssignedLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsList, options: MethodOptions): GaxiosPromise[SchemaListAssignedLocationsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAssignedLocationsResponse]
  ): Unit = js.native
  /**
    * Lists locations assigned to a location list.
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
    *     await displayvideo.advertisers.locationLists.assignedLocations.list({
    *       // Required. The ID of the DV360 advertiser to which the location list belongs.
    *       advertiserId: 'placeholder-value',
    *       // Allows filtering by location list assignment fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by the logical operator `OR`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `assignedLocationId` The length of this field should be no more than 500 characters.
    *       filter: 'placeholder-value',
    *       // Required. The ID of the location list to which these assignments are assigned.
    *       locationListId: 'placeholder-value',
    *       // Field by which to sort the list. Acceptable values are: * `assignedLocationId` (default) The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be added to the field name. Example: `assignedLocationId desc`.
    *       orderBy: 'placeholder-value',
    *       // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *       pageSize: 'placeholder-value',
    *       // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListAssignedLocations` method. If not specified, the first page of results will be returned.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedLocations": [],
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
  def list(params: ParamsResourceAdvertisersLocationlistsAssignedlocationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsAssignedlocationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
