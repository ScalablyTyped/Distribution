package typings.googleapis.scriptV1Mod.scriptV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaProject] = js.native
  def create(callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def create(params: ParamsResourceProjectsCreate): GaxiosPromise[SchemaProject] = js.native
  def create(params: ParamsResourceProjectsCreate, callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def create(
    params: ParamsResourceProjectsCreate,
    options: BodyResponseCallback[Readable | SchemaProject],
    callback: BodyResponseCallback[Readable | SchemaProject]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsCreate, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def create(
    params: ParamsResourceProjectsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  /**
    * Creates a new, empty script project with no script files and a base manifest file.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/script.projects'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "parentId": "my_parentId",
    *       //   "title": "my_title"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "lastModifyUser": {},
    *   //   "parentId": "my_parentId",
    *   //   "scriptId": "my_scriptId",
    *   //   "title": "my_title",
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
  def create(params: ParamsResourceProjectsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var deployments: ResourceProjectsDeployments = js.native
  
  def get(): GaxiosPromise[SchemaProject] = js.native
  def get(callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def get(params: ParamsResourceProjectsGet): GaxiosPromise[SchemaProject] = js.native
  def get(params: ParamsResourceProjectsGet, callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: BodyResponseCallback[Readable | SchemaProject],
    callback: BodyResponseCallback[Readable | SchemaProject]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsGet, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  /**
    * Gets a script project's metadata.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/script.projects',
    *       'https://www.googleapis.com/auth/script.projects.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.get({
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "lastModifyUser": {},
    *   //   "parentId": "my_parentId",
    *   //   "scriptId": "my_scriptId",
    *   //   "title": "my_title",
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
  def get(params: ParamsResourceProjectsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getContent(): GaxiosPromise[SchemaContent] = js.native
  def getContent(callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def getContent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContent] = js.native
  def getContent(params: ParamsResourceProjectsGetcontent): GaxiosPromise[SchemaContent] = js.native
  def getContent(params: ParamsResourceProjectsGetcontent, callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def getContent(
    params: ParamsResourceProjectsGetcontent,
    options: BodyResponseCallback[Readable | SchemaContent],
    callback: BodyResponseCallback[Readable | SchemaContent]
  ): Unit = js.native
  def getContent(params: ParamsResourceProjectsGetcontent, options: MethodOptions): GaxiosPromise[SchemaContent] = js.native
  def getContent(
    params: ParamsResourceProjectsGetcontent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContent]
  ): Unit = js.native
  /**
    * Gets the content of the script project, including the code source and metadata for each script file.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/script.projects',
    *       'https://www.googleapis.com/auth/script.projects.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.getContent({
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *     // The version number of the project to retrieve. If not provided, the project's HEAD version is returned.
    *     versionNumber: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
    *   //   "scriptId": "my_scriptId"
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
  def getContent(params: ParamsResourceProjectsGetcontent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getContent(
    params: ParamsResourceProjectsGetcontent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getMetrics(): GaxiosPromise[SchemaMetrics] = js.native
  def getMetrics(callback: BodyResponseCallback[SchemaMetrics]): Unit = js.native
  def getMetrics(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMetrics] = js.native
  def getMetrics(params: ParamsResourceProjectsGetmetrics): GaxiosPromise[SchemaMetrics] = js.native
  def getMetrics(params: ParamsResourceProjectsGetmetrics, callback: BodyResponseCallback[SchemaMetrics]): Unit = js.native
  def getMetrics(
    params: ParamsResourceProjectsGetmetrics,
    options: BodyResponseCallback[Readable | SchemaMetrics],
    callback: BodyResponseCallback[Readable | SchemaMetrics]
  ): Unit = js.native
  def getMetrics(params: ParamsResourceProjectsGetmetrics, options: MethodOptions): GaxiosPromise[SchemaMetrics] = js.native
  def getMetrics(
    params: ParamsResourceProjectsGetmetrics,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetrics]
  ): Unit = js.native
  /**
    * Get metrics data for scripts, such as number of executions and active users.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/script.metrics'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.getMetrics({
    *     // Optional field indicating a specific deployment to retrieve metrics from.
    *     'metricsFilter.deploymentId': 'placeholder-value',
    *     // Required field indicating what granularity of metrics are returned.
    *     metricsGranularity: 'placeholder-value',
    *     // Required field indicating the script to get metrics for.
    *     scriptId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeUsers": [],
    *   //   "failedExecutions": [],
    *   //   "totalExecutions": []
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
  def getMetrics(params: ParamsResourceProjectsGetmetrics, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getMetrics(
    params: ParamsResourceProjectsGetmetrics,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateContent(): GaxiosPromise[SchemaContent] = js.native
  def updateContent(callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def updateContent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContent] = js.native
  def updateContent(params: ParamsResourceProjectsUpdatecontent): GaxiosPromise[SchemaContent] = js.native
  def updateContent(params: ParamsResourceProjectsUpdatecontent, callback: BodyResponseCallback[SchemaContent]): Unit = js.native
  def updateContent(
    params: ParamsResourceProjectsUpdatecontent,
    options: BodyResponseCallback[Readable | SchemaContent],
    callback: BodyResponseCallback[Readable | SchemaContent]
  ): Unit = js.native
  def updateContent(params: ParamsResourceProjectsUpdatecontent, options: MethodOptions): GaxiosPromise[SchemaContent] = js.native
  def updateContent(
    params: ParamsResourceProjectsUpdatecontent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContent]
  ): Unit = js.native
  /**
    * Updates the content of the specified script project. This content is stored as the HEAD version, and is used when the script is executed as a trigger, in the script editor, in add-on preview mode, or as a web app or Apps Script API in development mode. This clears all the existing files in the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/script.projects'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.updateContent({
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "files": [],
    *       //   "scriptId": "my_scriptId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
    *   //   "scriptId": "my_scriptId"
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
  def updateContent(params: ParamsResourceProjectsUpdatecontent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateContent(
    params: ParamsResourceProjectsUpdatecontent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var versions: ResourceProjectsVersions = js.native
}
