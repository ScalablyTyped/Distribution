package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Jobtriggers")
@js.native
open class ResourceProjectsJobtriggers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def activate(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def activate(params: ParamsResourceProjectsJobtriggersActivate): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def activate(
    params: ParamsResourceProjectsJobtriggersActivate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def activate(
    params: ParamsResourceProjectsJobtriggersActivate,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DlpJob],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  def activate(params: ParamsResourceProjectsJobtriggersActivate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DlpJob] = js.native
  def activate(
    params: ParamsResourceProjectsJobtriggersActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DlpJob]
  ): Unit = js.native
  /**
    * Activate a job trigger. Causes the immediate execute of a trigger instead of waiting on the trigger event to occur.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.jobTriggers.activate({
    *     // Required. Resource name of the trigger to activate, for example `projects/dlp-test-project/jobTriggers/53234423`.
    *     name: 'projects/my-project/jobTriggers/my-jobTrigger',
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
    *   //   "createTime": "my_createTime",
    *   //   "endTime": "my_endTime",
    *   //   "errors": [],
    *   //   "inspectDetails": {},
    *   //   "jobTriggerName": "my_jobTriggerName",
    *   //   "name": "my_name",
    *   //   "riskDetails": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "type": "my_type"
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
  def activate(params: ParamsResourceProjectsJobtriggersActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceProjectsJobtriggersActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def create(params: ParamsResourceProjectsJobtriggersCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def create(
    params: ParamsResourceProjectsJobtriggersCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsJobtriggersCreate,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2JobTrigger],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsJobtriggersCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def create(
    params: ParamsResourceProjectsJobtriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  /**
    * Creates a job trigger to run DLP actions such as scanning storage for sensitive information on a set schedule. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.jobTriggers.create({
    *     // Required. Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "jobTrigger": {},
    *       //   "locationId": "my_locationId",
    *       //   "triggerId": "my_triggerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "errors": [],
    *   //   "inspectJob": {},
    *   //   "lastRunTime": "my_lastRunTime",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "triggers": [],
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
  def create(params: ParamsResourceProjectsJobtriggersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsJobtriggersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsJobtriggersDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsJobtriggersDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsJobtriggersDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsJobtriggersDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsJobtriggersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.jobTriggers.delete({
    *     // Required. Resource name of the project and the triggeredJob, for example `projects/dlp-test-project/jobTriggers/53234423`.
    *     name: 'projects/my-project/jobTriggers/my-jobTrigger',
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
  def delete(params: ParamsResourceProjectsJobtriggersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsJobtriggersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def get(params: ParamsResourceProjectsJobtriggersGet): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def get(
    params: ParamsResourceProjectsJobtriggersGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsJobtriggersGet,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2JobTrigger],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsJobtriggersGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def get(
    params: ParamsResourceProjectsJobtriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  /**
    * Gets a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.jobTriggers.get({
    *     // Required. Resource name of the project and the triggeredJob, for example `projects/dlp-test-project/jobTriggers/53234423`.
    *     name: 'projects/my-project/jobTriggers/my-jobTrigger',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "errors": [],
    *   //   "inspectJob": {},
    *   //   "lastRunTime": "my_lastRunTime",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "triggers": [],
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
  def get(params: ParamsResourceProjectsJobtriggersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsJobtriggersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(params: ParamsResourceProjectsJobtriggersList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobtriggersList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsJobtriggersList,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListJobTriggersResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsJobtriggersList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsJobtriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  ): Unit = js.native
  /**
    * Lists job triggers. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.jobTriggers.list({
    *     // Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * Supported fields/values for inspect triggers: - `status` - HEALTHY|PAUSED|CANCELLED - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by quotation marks. Nanoseconds are ignored. - 'error_count' - Number of errors that have occurred while running. * The operator must be `=` or `!=` for status and inspected_storage. Examples: * inspected_storage = cloud_storage AND status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY) * last_run_time \> \"2017-12-12T00:00:00+00:00\" The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Deprecated. This field has no effect.
    *     locationId: 'placeholder-value',
    *     // Comma separated list of triggeredJob fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the JobTrigger was created. - `update_time`: corresponds to the time the JobTrigger was last updated. - `last_run_time`: corresponds to the last time the JobTrigger ran. - `name`: corresponds to the JobTrigger's name. - `display_name`: corresponds to the JobTrigger's display name. - `status`: corresponds to JobTrigger's status.
    *     orderBy: 'placeholder-value',
    *     // Size of the page, can be limited by a server.
    *     pageSize: 'placeholder-value',
    *     // Page token to continue retrieval. Comes from previous call to ListJobTriggers. `order_by` field must not change for subsequent calls.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project',
    *     // The type of jobs. Will use `DlpJobType.INSPECT` if not set.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "jobTriggers": [],
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
  def list(params: ParamsResourceProjectsJobtriggersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsJobtriggersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def patch(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def patch(params: ParamsResourceProjectsJobtriggersPatch): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def patch(
    params: ParamsResourceProjectsJobtriggersPatch,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsJobtriggersPatch,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2JobTrigger],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsJobtriggersPatch, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  def patch(
    params: ParamsResourceProjectsJobtriggersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2JobTrigger]
  ): Unit = js.native
  /**
    * Updates a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.jobTriggers.patch({
    *     // Required. Resource name of the project and the triggeredJob, for example `projects/dlp-test-project/jobTriggers/53234423`.
    *     name: 'projects/my-project/jobTriggers/my-jobTrigger',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "jobTrigger": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "errors": [],
    *   //   "inspectJob": {},
    *   //   "lastRunTime": "my_lastRunTime",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "triggers": [],
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
  def patch(params: ParamsResourceProjectsJobtriggersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsJobtriggersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
