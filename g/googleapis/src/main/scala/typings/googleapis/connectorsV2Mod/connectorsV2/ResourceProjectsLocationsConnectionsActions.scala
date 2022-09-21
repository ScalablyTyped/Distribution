package typings.googleapis.connectorsV2Mod.connectorsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/connectors/v2", "connectors_v2.Resource$Projects$Locations$Connections$Actions")
@js.native
open class ResourceProjectsLocationsConnectionsActions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def execute(): GaxiosPromise[SchemaExecuteActionResponse] = js.native
  def execute(callback: BodyResponseCallback[SchemaExecuteActionResponse]): Unit = js.native
  def execute(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecuteActionResponse] = js.native
  def execute(params: ParamsResourceProjectsLocationsConnectionsActionsExecute): GaxiosPromise[SchemaExecuteActionResponse] = js.native
  def execute(
    params: ParamsResourceProjectsLocationsConnectionsActionsExecute,
    callback: BodyResponseCallback[SchemaExecuteActionResponse]
  ): Unit = js.native
  def execute(
    params: ParamsResourceProjectsLocationsConnectionsActionsExecute,
    options: BodyResponseCallback[Readable | SchemaExecuteActionResponse],
    callback: BodyResponseCallback[Readable | SchemaExecuteActionResponse]
  ): Unit = js.native
  def execute(params: ParamsResourceProjectsLocationsConnectionsActionsExecute, options: MethodOptions): GaxiosPromise[SchemaExecuteActionResponse] = js.native
  def execute(
    params: ParamsResourceProjectsLocationsConnectionsActionsExecute,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecuteActionResponse]
  ): Unit = js.native
  /**
    * Executes an action with the name specified in the request. The input parameters for executing the action are passed through the body of the ExecuteAction request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *   const res = await connectors.projects.locations.connections.actions.execute({
    *     // Required. Resource name of the Action. Format: projects/{project\}/locations/{location\}/connections/{connection\}/actions/{action\}
    *     name: 'projects/my-project/locations/my-location/connections/my-connection/actions/my-action',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "parameters": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": []
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
  def execute(params: ParamsResourceProjectsLocationsConnectionsActionsExecute, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def execute(
    params: ParamsResourceProjectsLocationsConnectionsActionsExecute,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListActionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListActionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListActionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsActionsList): GaxiosPromise[SchemaListActionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsActionsList,
    callback: BodyResponseCallback[SchemaListActionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsActionsList,
    options: BodyResponseCallback[Readable | SchemaListActionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListActionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionsActionsList, options: MethodOptions): GaxiosPromise[SchemaListActionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsActionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListActionsResponse]
  ): Unit = js.native
  /**
    * Gets the schema of all the actions supported by the connector.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/connectors.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const connectors = google.connectors('v2');
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
    *   const res = await connectors.projects.locations.connections.actions.list({
    *     // Number of Actions to return. Defaults to 25.
    *     pageSize: 'placeholder-value',
    *     // Page token, return from a previous ListActions call, that can be used retrieve the next page of content. If unspecified, the request returns the first page of actions.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource name of the Action. Format: projects/{project\}/locations/{location\}/connections/{connection\}
    *     parent:
    *       'projects/my-project/locations/my-location/connections/my-connection',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "actions": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unsupportedActionNames": []
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
  def list(params: ParamsResourceProjectsLocationsConnectionsActionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionsActionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
