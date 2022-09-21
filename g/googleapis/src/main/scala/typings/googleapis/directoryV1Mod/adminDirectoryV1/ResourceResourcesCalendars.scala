package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Calendars")
@js.native
open class ResourceResourcesCalendars protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesCalendarsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResourcesCalendarsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResourcesCalendarsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResourcesCalendarsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResourcesCalendarsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a calendar resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.calendars.delete({
    *     // The unique ID of the calendar resource to delete.
    *     calendarResourceId: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
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
  def delete(params: ParamsResourceResourcesCalendarsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceResourcesCalendarsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(params: ParamsResourceResourcesCalendarsGet): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(
    params: ParamsResourceResourcesCalendarsGet,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def get(
    params: ParamsResourceResourcesCalendarsGet,
    options: BodyResponseCallback[Readable | SchemaCalendarResource],
    callback: BodyResponseCallback[Readable | SchemaCalendarResource]
  ): Unit = js.native
  def get(params: ParamsResourceResourcesCalendarsGet, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def get(
    params: ParamsResourceResourcesCalendarsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  /**
    * Retrieves a calendar resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.calendars.get({
    *     // The unique ID of the calendar resource to retrieve.
    *     calendarResourceId: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buildingId": "my_buildingId",
    *   //   "capacity": 0,
    *   //   "etags": "my_etags",
    *   //   "featureInstances": {},
    *   //   "floorName": "my_floorName",
    *   //   "floorSection": "my_floorSection",
    *   //   "generatedResourceName": "my_generatedResourceName",
    *   //   "kind": "my_kind",
    *   //   "resourceCategory": "my_resourceCategory",
    *   //   "resourceDescription": "my_resourceDescription",
    *   //   "resourceEmail": "my_resourceEmail",
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceName": "my_resourceName",
    *   //   "resourceType": "my_resourceType",
    *   //   "userVisibleDescription": "my_userVisibleDescription"
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
  def get(params: ParamsResourceResourcesCalendarsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceResourcesCalendarsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(params: ParamsResourceResourcesCalendarsInsert): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(
    params: ParamsResourceResourcesCalendarsInsert,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def insert(
    params: ParamsResourceResourcesCalendarsInsert,
    options: BodyResponseCallback[Readable | SchemaCalendarResource],
    callback: BodyResponseCallback[Readable | SchemaCalendarResource]
  ): Unit = js.native
  def insert(params: ParamsResourceResourcesCalendarsInsert, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def insert(
    params: ParamsResourceResourcesCalendarsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  /**
    * Inserts a calendar resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.calendars.insert({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "buildingId": "my_buildingId",
    *       //   "capacity": 0,
    *       //   "etags": "my_etags",
    *       //   "featureInstances": {},
    *       //   "floorName": "my_floorName",
    *       //   "floorSection": "my_floorSection",
    *       //   "generatedResourceName": "my_generatedResourceName",
    *       //   "kind": "my_kind",
    *       //   "resourceCategory": "my_resourceCategory",
    *       //   "resourceDescription": "my_resourceDescription",
    *       //   "resourceEmail": "my_resourceEmail",
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceName": "my_resourceName",
    *       //   "resourceType": "my_resourceType",
    *       //   "userVisibleDescription": "my_userVisibleDescription"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buildingId": "my_buildingId",
    *   //   "capacity": 0,
    *   //   "etags": "my_etags",
    *   //   "featureInstances": {},
    *   //   "floorName": "my_floorName",
    *   //   "floorSection": "my_floorSection",
    *   //   "generatedResourceName": "my_generatedResourceName",
    *   //   "kind": "my_kind",
    *   //   "resourceCategory": "my_resourceCategory",
    *   //   "resourceDescription": "my_resourceDescription",
    *   //   "resourceEmail": "my_resourceEmail",
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceName": "my_resourceName",
    *   //   "resourceType": "my_resourceType",
    *   //   "userVisibleDescription": "my_userVisibleDescription"
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
  def insert(params: ParamsResourceResourcesCalendarsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceResourcesCalendarsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(callback: BodyResponseCallback[SchemaCalendarResources]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(params: ParamsResourceResourcesCalendarsList): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(
    params: ParamsResourceResourcesCalendarsList,
    callback: BodyResponseCallback[SchemaCalendarResources]
  ): Unit = js.native
  def list(
    params: ParamsResourceResourcesCalendarsList,
    options: BodyResponseCallback[Readable | SchemaCalendarResources],
    callback: BodyResponseCallback[Readable | SchemaCalendarResources]
  ): Unit = js.native
  def list(params: ParamsResourceResourcesCalendarsList, options: MethodOptions): GaxiosPromise[SchemaCalendarResources] = js.native
  def list(
    params: ParamsResourceResourcesCalendarsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResources]
  ): Unit = js.native
  /**
    * Retrieves a list of calendar resources for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.calendars.list({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Field(s) to sort results by in either ascending or descending order. Supported fields include `resourceId`, `resourceName`, `capacity`, `buildingId`, and `floorName`. If no order is specified, defaults to ascending. Should be of the form "field [asc|desc], field [asc|desc], ...". For example `buildingId, capacity desc` would return results sorted first by `buildingId` in ascending order then by `capacity` in descending order.
    *     orderBy: 'placeholder-value',
    *     // Token to specify the next page in the list.
    *     pageToken: 'placeholder-value',
    *     // String query used to filter results. Should be of the form "field operator value" where field can be any of supported fields and operators can be any of supported operations. Operators include '=' for exact match, '!=' for mismatch and ':' for prefix match or HAS match where applicable. For prefix match, the value should always be followed by a *. Logical operators NOT and AND are supported (in this order of precedence). Supported fields include `generatedResourceName`, `name`, `buildingId`, `floor_name`, `capacity`, `featureInstances.feature.name`, `resourceEmail`, `resourceCategory`. For example `buildingId=US-NYC-9TH AND featureInstances.feature.name:Phone`.
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
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
  def list(params: ParamsResourceResourcesCalendarsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceResourcesCalendarsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(params: ParamsResourceResourcesCalendarsPatch): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(
    params: ParamsResourceResourcesCalendarsPatch,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def patch(
    params: ParamsResourceResourcesCalendarsPatch,
    options: BodyResponseCallback[Readable | SchemaCalendarResource],
    callback: BodyResponseCallback[Readable | SchemaCalendarResource]
  ): Unit = js.native
  def patch(params: ParamsResourceResourcesCalendarsPatch, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def patch(
    params: ParamsResourceResourcesCalendarsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  /**
    * Patches a calendar resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.calendars.patch({
    *     // The unique ID of the calendar resource to update.
    *     calendarResourceId: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "buildingId": "my_buildingId",
    *       //   "capacity": 0,
    *       //   "etags": "my_etags",
    *       //   "featureInstances": {},
    *       //   "floorName": "my_floorName",
    *       //   "floorSection": "my_floorSection",
    *       //   "generatedResourceName": "my_generatedResourceName",
    *       //   "kind": "my_kind",
    *       //   "resourceCategory": "my_resourceCategory",
    *       //   "resourceDescription": "my_resourceDescription",
    *       //   "resourceEmail": "my_resourceEmail",
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceName": "my_resourceName",
    *       //   "resourceType": "my_resourceType",
    *       //   "userVisibleDescription": "my_userVisibleDescription"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buildingId": "my_buildingId",
    *   //   "capacity": 0,
    *   //   "etags": "my_etags",
    *   //   "featureInstances": {},
    *   //   "floorName": "my_floorName",
    *   //   "floorSection": "my_floorSection",
    *   //   "generatedResourceName": "my_generatedResourceName",
    *   //   "kind": "my_kind",
    *   //   "resourceCategory": "my_resourceCategory",
    *   //   "resourceDescription": "my_resourceDescription",
    *   //   "resourceEmail": "my_resourceEmail",
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceName": "my_resourceName",
    *   //   "resourceType": "my_resourceType",
    *   //   "userVisibleDescription": "my_userVisibleDescription"
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
  def patch(params: ParamsResourceResourcesCalendarsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceResourcesCalendarsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(callback: BodyResponseCallback[SchemaCalendarResource]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(params: ParamsResourceResourcesCalendarsUpdate): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(
    params: ParamsResourceResourcesCalendarsUpdate,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  def update(
    params: ParamsResourceResourcesCalendarsUpdate,
    options: BodyResponseCallback[Readable | SchemaCalendarResource],
    callback: BodyResponseCallback[Readable | SchemaCalendarResource]
  ): Unit = js.native
  def update(params: ParamsResourceResourcesCalendarsUpdate, options: MethodOptions): GaxiosPromise[SchemaCalendarResource] = js.native
  def update(
    params: ParamsResourceResourcesCalendarsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarResource]
  ): Unit = js.native
  /**
    * Updates a calendar resource. This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.resource.calendar',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.resources.calendars.update({
    *     // The unique ID of the calendar resource to update.
    *     calendarResourceId: 'placeholder-value',
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "buildingId": "my_buildingId",
    *       //   "capacity": 0,
    *       //   "etags": "my_etags",
    *       //   "featureInstances": {},
    *       //   "floorName": "my_floorName",
    *       //   "floorSection": "my_floorSection",
    *       //   "generatedResourceName": "my_generatedResourceName",
    *       //   "kind": "my_kind",
    *       //   "resourceCategory": "my_resourceCategory",
    *       //   "resourceDescription": "my_resourceDescription",
    *       //   "resourceEmail": "my_resourceEmail",
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceName": "my_resourceName",
    *       //   "resourceType": "my_resourceType",
    *       //   "userVisibleDescription": "my_userVisibleDescription"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buildingId": "my_buildingId",
    *   //   "capacity": 0,
    *   //   "etags": "my_etags",
    *   //   "featureInstances": {},
    *   //   "floorName": "my_floorName",
    *   //   "floorSection": "my_floorSection",
    *   //   "generatedResourceName": "my_generatedResourceName",
    *   //   "kind": "my_kind",
    *   //   "resourceCategory": "my_resourceCategory",
    *   //   "resourceDescription": "my_resourceDescription",
    *   //   "resourceEmail": "my_resourceEmail",
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceName": "my_resourceName",
    *   //   "resourceType": "my_resourceType",
    *   //   "userVisibleDescription": "my_userVisibleDescription"
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
  def update(params: ParamsResourceResourcesCalendarsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceResourcesCalendarsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
