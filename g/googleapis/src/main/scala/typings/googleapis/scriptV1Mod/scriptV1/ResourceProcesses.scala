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

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Processes")
@js.native
open class ResourceProcesses protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListUserProcessesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUserProcessesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUserProcessesResponse] = js.native
  def list(params: ParamsResourceProcessesList): GaxiosPromise[SchemaListUserProcessesResponse] = js.native
  def list(
    params: ParamsResourceProcessesList,
    callback: BodyResponseCallback[SchemaListUserProcessesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProcessesList,
    options: BodyResponseCallback[Readable | SchemaListUserProcessesResponse],
    callback: BodyResponseCallback[Readable | SchemaListUserProcessesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProcessesList, options: MethodOptions): GaxiosPromise[SchemaListUserProcessesResponse] = js.native
  def list(
    params: ParamsResourceProcessesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUserProcessesResponse]
  ): Unit = js.native
  /**
    * List information about processes made by or on behalf of a user, such as process type and current status.
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
    *     scopes: ['https://www.googleapis.com/auth/script.processes'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.processes.list({
    *     // The maximum number of returned processes per page of results. Defaults to 50.
    *     pageSize: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    *     pageToken: 'placeholder-value',
    *     // Optional field used to limit returned processes to those originating from projects with a specific deployment ID.
    *     'userProcessFilter.deploymentId': 'placeholder-value',
    *     // Optional field used to limit returned processes to those that completed on or before the given timestamp.
    *     'userProcessFilter.endTime': 'placeholder-value',
    *     // Optional field used to limit returned processes to those originating from a script function with the given function name.
    *     'userProcessFilter.functionName': 'placeholder-value',
    *     // Optional field used to limit returned processes to those originating from projects with project names containing a specific string.
    *     'userProcessFilter.projectName': 'placeholder-value',
    *     // Optional field used to limit returned processes to those originating from projects with a specific script ID.
    *     'userProcessFilter.scriptId': 'placeholder-value',
    *     // Optional field used to limit returned processes to those that were started on or after the given timestamp.
    *     'userProcessFilter.startTime': 'placeholder-value',
    *     // Optional field used to limit returned processes to those having one of the specified process statuses.
    *     'userProcessFilter.statuses': 'placeholder-value',
    *     // Optional field used to limit returned processes to those having one of the specified process types.
    *     'userProcessFilter.types': 'placeholder-value',
    *     // Optional field used to limit returned processes to those having one of the specified user access levels.
    *     'userProcessFilter.userAccessLevels': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "processes": []
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
  def list(params: ParamsResourceProcessesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProcessesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listScriptProcesses(): GaxiosPromise[SchemaListScriptProcessesResponse] = js.native
  def listScriptProcesses(callback: BodyResponseCallback[SchemaListScriptProcessesResponse]): Unit = js.native
  def listScriptProcesses(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListScriptProcessesResponse] = js.native
  def listScriptProcesses(params: ParamsResourceProcessesListscriptprocesses): GaxiosPromise[SchemaListScriptProcessesResponse] = js.native
  def listScriptProcesses(
    params: ParamsResourceProcessesListscriptprocesses,
    callback: BodyResponseCallback[SchemaListScriptProcessesResponse]
  ): Unit = js.native
  def listScriptProcesses(
    params: ParamsResourceProcessesListscriptprocesses,
    options: BodyResponseCallback[Readable | SchemaListScriptProcessesResponse],
    callback: BodyResponseCallback[Readable | SchemaListScriptProcessesResponse]
  ): Unit = js.native
  def listScriptProcesses(params: ParamsResourceProcessesListscriptprocesses, options: MethodOptions): GaxiosPromise[SchemaListScriptProcessesResponse] = js.native
  def listScriptProcesses(
    params: ParamsResourceProcessesListscriptprocesses,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScriptProcessesResponse]
  ): Unit = js.native
  /**
    * List information about a script's executed processes, such as process type and current status.
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
    *     scopes: ['https://www.googleapis.com/auth/script.processes'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.processes.listScriptProcesses({
    *     // The maximum number of returned processes per page of results. Defaults to 50.
    *     pageSize: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    *     pageToken: 'placeholder-value',
    *     // The script ID of the project whose processes are listed.
    *     scriptId: 'placeholder-value',
    *     // Optional field used to limit returned processes to those originating from projects with a specific deployment ID.
    *     'scriptProcessFilter.deploymentId': 'placeholder-value',
    *     // Optional field used to limit returned processes to those that completed on or before the given timestamp.
    *     'scriptProcessFilter.endTime': 'placeholder-value',
    *     // Optional field used to limit returned processes to those originating from a script function with the given function name.
    *     'scriptProcessFilter.functionName': 'placeholder-value',
    *     // Optional field used to limit returned processes to those that were started on or after the given timestamp.
    *     'scriptProcessFilter.startTime': 'placeholder-value',
    *     // Optional field used to limit returned processes to those having one of the specified process statuses.
    *     'scriptProcessFilter.statuses': 'placeholder-value',
    *     // Optional field used to limit returned processes to those having one of the specified process types.
    *     'scriptProcessFilter.types': 'placeholder-value',
    *     // Optional field used to limit returned processes to those having one of the specified user access levels.
    *     'scriptProcessFilter.userAccessLevels': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "processes": []
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
  def listScriptProcesses(params: ParamsResourceProcessesListscriptprocesses, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listScriptProcesses(
    params: ParamsResourceProcessesListscriptprocesses,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
