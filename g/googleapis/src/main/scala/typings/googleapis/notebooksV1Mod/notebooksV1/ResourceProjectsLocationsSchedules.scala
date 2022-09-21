package typings.googleapis.notebooksV1Mod.notebooksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/notebooks/v1", "notebooks_v1.Resource$Projects$Locations$Schedules")
@js.native
open class ResourceProjectsLocationsSchedules protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsSchedulesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSchedulesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSchedulesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsSchedulesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSchedulesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new Scheduled Notebook in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.schedules.create({
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *     // Required. User-defined unique ID of this schedule.
    *     scheduleId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "cronSchedule": "my_cronSchedule",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "executionTemplate": {},
    *       //   "name": "my_name",
    *       //   "recentExecutions": [],
    *       //   "state": "my_state",
    *       //   "timeZone": "my_timeZone",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceProjectsLocationsSchedulesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSchedulesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsSchedulesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSchedulesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSchedulesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsSchedulesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSchedulesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes schedule and all underlying jobs
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.schedules.delete({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/schedules/{schedule_id\}`
    *     name: 'projects/my-project/locations/my-location/schedules/my-schedule',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(params: ParamsResourceProjectsLocationsSchedulesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSchedulesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSchedule] = js.native
  def get(callback: BodyResponseCallback[SchemaSchedule]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchedule] = js.native
  def get(params: ParamsResourceProjectsLocationsSchedulesGet): GaxiosPromise[SchemaSchedule] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSchedulesGet,
    callback: BodyResponseCallback[SchemaSchedule]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSchedulesGet,
    options: BodyResponseCallback[Readable | SchemaSchedule],
    callback: BodyResponseCallback[Readable | SchemaSchedule]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSchedulesGet, options: MethodOptions): GaxiosPromise[SchemaSchedule] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSchedulesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchedule]
  ): Unit = js.native
  /**
    * Gets details of schedule
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.schedules.get({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/schedules/{schedule_id\}`
    *     name: 'projects/my-project/locations/my-location/schedules/my-schedule',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "cronSchedule": "my_cronSchedule",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "executionTemplate": {},
    *   //   "name": "my_name",
    *   //   "recentExecutions": [],
    *   //   "state": "my_state",
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsSchedulesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSchedulesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSchedulesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSchedulesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSchedulesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSchedulesList): GaxiosPromise[SchemaListSchedulesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSchedulesList,
    callback: BodyResponseCallback[SchemaListSchedulesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSchedulesList,
    options: BodyResponseCallback[Readable | SchemaListSchedulesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSchedulesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSchedulesList, options: MethodOptions): GaxiosPromise[SchemaListSchedulesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSchedulesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSchedulesResponse]
  ): Unit = js.native
  /**
    * Lists schedules in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.schedules.list({
    *     // Filter applied to resulting schedules.
    *     filter: 'placeholder-value',
    *     // Field to order results by.
    *     orderBy: 'placeholder-value',
    *     // Maximum return size of the list call.
    *     pageSize: 'placeholder-value',
    *     // A previous returned page token that can be used to continue listing from the last result.
    *     pageToken: 'placeholder-value',
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "schedules": [],
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsSchedulesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSchedulesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def trigger(): GaxiosPromise[SchemaOperation] = js.native
  def trigger(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def trigger(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def trigger(params: ParamsResourceProjectsLocationsSchedulesTrigger): GaxiosPromise[SchemaOperation] = js.native
  def trigger(
    params: ParamsResourceProjectsLocationsSchedulesTrigger,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def trigger(
    params: ParamsResourceProjectsLocationsSchedulesTrigger,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def trigger(params: ParamsResourceProjectsLocationsSchedulesTrigger, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def trigger(
    params: ParamsResourceProjectsLocationsSchedulesTrigger,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Triggers execution of an existing schedule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.schedules.trigger({
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}/schedules/{schedule_id\}`
    *     name: 'projects/my-project/locations/my-location/schedules/my-schedule',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def trigger(params: ParamsResourceProjectsLocationsSchedulesTrigger, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def trigger(
    params: ParamsResourceProjectsLocationsSchedulesTrigger,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
