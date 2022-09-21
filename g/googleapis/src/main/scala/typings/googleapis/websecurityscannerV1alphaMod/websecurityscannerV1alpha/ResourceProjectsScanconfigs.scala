package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs")
@js.native
open class ResourceProjectsScanconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaScanConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def create(params: ParamsResourceProjectsScanconfigsCreate): GaxiosPromise[SchemaScanConfig] = js.native
  def create(params: ParamsResourceProjectsScanconfigsCreate, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def create(
    params: ParamsResourceProjectsScanconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaScanConfig],
    callback: BodyResponseCallback[Readable | SchemaScanConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsScanconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def create(
    params: ParamsResourceProjectsScanconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  /**
    * Creates a new ScanConfig.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/websecurityscanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1alpha');
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
    *   const res = await websecurityscanner.projects.scanConfigs.create({
    *     // Required. The parent resource name where the scan is created, which should be a project resource name in the format 'projects/{projectId\}'.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authentication": {},
    *       //   "blacklistPatterns": [],
    *       //   "displayName": "my_displayName",
    *       //   "latestRun": {},
    *       //   "maxQps": 0,
    *       //   "name": "my_name",
    *       //   "schedule": {},
    *       //   "startingUrls": [],
    *       //   "targetPlatforms": [],
    *       //   "userAgent": "my_userAgent"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authentication": {},
    *   //   "blacklistPatterns": [],
    *   //   "displayName": "my_displayName",
    *   //   "latestRun": {},
    *   //   "maxQps": 0,
    *   //   "name": "my_name",
    *   //   "schedule": {},
    *   //   "startingUrls": [],
    *   //   "targetPlatforms": [],
    *   //   "userAgent": "my_userAgent"
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
  def create(params: ParamsResourceProjectsScanconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsScanconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsScanconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsScanconfigsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsScanconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsScanconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsScanconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing ScanConfig and its child resources.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/websecurityscanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1alpha');
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
    *   const res = await websecurityscanner.projects.scanConfigs.delete({
    *     // Required. The resource name of the ScanConfig to be deleted. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}'.
    *     name: 'projects/my-project/scanConfigs/my-scanConfig',
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
  def delete(params: ParamsResourceProjectsScanconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsScanconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaScanConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet): GaxiosPromise[SchemaScanConfig] = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: BodyResponseCallback[Readable | SchemaScanConfig],
    callback: BodyResponseCallback[Readable | SchemaScanConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  /**
    * Gets a ScanConfig.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/websecurityscanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1alpha');
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
    *   const res = await websecurityscanner.projects.scanConfigs.get({
    *     // Required. The resource name of the ScanConfig to be returned. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}'.
    *     name: 'projects/my-project/scanConfigs/my-scanConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authentication": {},
    *   //   "blacklistPatterns": [],
    *   //   "displayName": "my_displayName",
    *   //   "latestRun": {},
    *   //   "maxQps": 0,
    *   //   "name": "my_name",
    *   //   "schedule": {},
    *   //   "startingUrls": [],
    *   //   "targetPlatforms": [],
    *   //   "userAgent": "my_userAgent"
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
  def get(params: ParamsResourceProjectsScanconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScanConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsList): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    callback: BodyResponseCallback[SchemaListScanConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: BodyResponseCallback[Readable | SchemaListScanConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListScanConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsList, options: MethodOptions): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScanConfigsResponse]
  ): Unit = js.native
  /**
    * Lists ScanConfigs under a given project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/websecurityscanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1alpha');
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
    *   const res = await websecurityscanner.projects.scanConfigs.list({
    *     // The maximum number of ScanConfigs to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name, which should be a project resource name in the format 'projects/{projectId\}'.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "scanConfigs": []
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
  def list(params: ParamsResourceProjectsScanconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaScanConfig],
    callback: BodyResponseCallback[Readable | SchemaScanConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  /**
    * Updates a ScanConfig. This method support partial update of a ScanConfig.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/websecurityscanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1alpha');
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
    *   const res = await websecurityscanner.projects.scanConfigs.patch({
    *     // The resource name of the ScanConfig. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}'. The ScanConfig IDs are generated by the system.
    *     name: 'projects/my-project/scanConfigs/my-scanConfig',
    *     // Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authentication": {},
    *       //   "blacklistPatterns": [],
    *       //   "displayName": "my_displayName",
    *       //   "latestRun": {},
    *       //   "maxQps": 0,
    *       //   "name": "my_name",
    *       //   "schedule": {},
    *       //   "startingUrls": [],
    *       //   "targetPlatforms": [],
    *       //   "userAgent": "my_userAgent"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authentication": {},
    *   //   "blacklistPatterns": [],
    *   //   "displayName": "my_displayName",
    *   //   "latestRun": {},
    *   //   "maxQps": 0,
    *   //   "name": "my_name",
    *   //   "schedule": {},
    *   //   "startingUrls": [],
    *   //   "targetPlatforms": [],
    *   //   "userAgent": "my_userAgent"
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
  def patch(params: ParamsResourceProjectsScanconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var scanRuns: ResourceProjectsScanconfigsScanruns = js.native
  
  def start(): GaxiosPromise[SchemaScanRun] = js.native
  def start(callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def start(params: ParamsResourceProjectsScanconfigsStart): GaxiosPromise[SchemaScanRun] = js.native
  def start(params: ParamsResourceProjectsScanconfigsStart, callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def start(
    params: ParamsResourceProjectsScanconfigsStart,
    options: BodyResponseCallback[Readable | SchemaScanRun],
    callback: BodyResponseCallback[Readable | SchemaScanRun]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsScanconfigsStart, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def start(
    params: ParamsResourceProjectsScanconfigsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  /**
    * Start a ScanRun according to the given ScanConfig.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/websecurityscanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const websecurityscanner = google.websecurityscanner('v1alpha');
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
    *   const res = await websecurityscanner.projects.scanConfigs.start({
    *     // Required. The resource name of the ScanConfig to be used. The name follows the format of 'projects/{projectId\}/scanConfigs/{scanConfigId\}'.
    *     name: 'projects/my-project/scanConfigs/my-scanConfig',
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
    *   //   "endTime": "my_endTime",
    *   //   "executionState": "my_executionState",
    *   //   "hasVulnerabilities": false,
    *   //   "name": "my_name",
    *   //   "progressPercent": 0,
    *   //   "resultState": "my_resultState",
    *   //   "startTime": "my_startTime",
    *   //   "urlsCrawledCount": "my_urlsCrawledCount",
    *   //   "urlsTestedCount": "my_urlsTestedCount"
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
  def start(params: ParamsResourceProjectsScanconfigsStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceProjectsScanconfigsStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
