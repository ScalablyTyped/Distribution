package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/area120tables/v1alpha1", "area120tables_v1alpha1.Resource$Workspaces")
@js.native
open class ResourceWorkspaces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaWorkspace] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def get(params: ParamsResourceWorkspacesGet): GaxiosPromise[SchemaWorkspace] = js.native
  def get(params: ParamsResourceWorkspacesGet, callback: BodyResponseCallback[SchemaWorkspace]): Unit = js.native
  def get(
    params: ParamsResourceWorkspacesGet,
    options: BodyResponseCallback[Readable | SchemaWorkspace],
    callback: BodyResponseCallback[Readable | SchemaWorkspace]
  ): Unit = js.native
  def get(params: ParamsResourceWorkspacesGet, options: MethodOptions): GaxiosPromise[SchemaWorkspace] = js.native
  def get(
    params: ParamsResourceWorkspacesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkspace]
  ): Unit = js.native
  /**
    * Gets a workspace. Returns NOT_FOUND if the workspace does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/spreadsheets.readonly',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.workspaces.get({
    *     // Required. The name of the workspace to retrieve. Format: workspaces/{workspace\}
    *     name: 'workspaces/my-workspace',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "tables": [],
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
  def get(params: ParamsResourceWorkspacesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceWorkspacesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkspacesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(params: ParamsResourceWorkspacesList): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(params: ParamsResourceWorkspacesList, callback: BodyResponseCallback[SchemaListWorkspacesResponse]): Unit = js.native
  def list(
    params: ParamsResourceWorkspacesList,
    options: BodyResponseCallback[Readable | SchemaListWorkspacesResponse],
    callback: BodyResponseCallback[Readable | SchemaListWorkspacesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceWorkspacesList, options: MethodOptions): GaxiosPromise[SchemaListWorkspacesResponse] = js.native
  def list(
    params: ParamsResourceWorkspacesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkspacesResponse]
  ): Unit = js.native
  /**
    * Lists workspaces for the user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/area120tables.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const area120tables = google.area120tables('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *       'https://www.googleapis.com/auth/spreadsheets',
    *       'https://www.googleapis.com/auth/spreadsheets.readonly',
    *       'https://www.googleapis.com/auth/tables',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await area120tables.workspaces.list({
    *     // The maximum number of workspaces to return. The service may return fewer than this value. If unspecified, at most 10 workspaces are returned. The maximum value is 25; values above 25 are coerced to 25.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListWorkspaces` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListWorkspaces` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "workspaces": []
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
  def list(params: ParamsResourceWorkspacesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceWorkspacesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
