package typings.googleapis.dialogflowV3Mod.dialogflowV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents$Flows$Transitionroutegroups")
@js.native
open class ResourceProjectsLocationsAgentsFlowsTransitionroutegroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  /**
    * Creates an TransitionRouteGroup in the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await dialogflow.projects.locations.agents.flows.transitionRouteGroups.create(
    *       {
    *         // The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *         languageCode: 'placeholder-value',
    *         // Required. The flow to create an TransitionRouteGroup for. Format: `projects//locations//agents//flows/`.
    *         parent:
    *           'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "displayName": "my_displayName",
    *           //   "name": "my_name",
    *           //   "transitionRoutes": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "transitionRoutes": []
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
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await dialogflow.projects.locations.agents.flows.transitionRouteGroups.delete(
    *       {
    *         // This field has no effect for transition route group that no page is using. If the transition route group is referenced by any page: * If `force` is set to false, an error will be returned with message indicating pages that reference the transition route group. * If `force` is set to true, Dialogflow will remove the transition route group, as well as any reference to it.
    *         force: 'placeholder-value',
    *         // Required. The name of the TransitionRouteGroup to delete. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
    *         name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/transitionRouteGroups/my-transitionRouteGroup',
    *       }
    *     );
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
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  /**
    * Retrieves the specified TransitionRouteGroup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await dialogflow.projects.locations.agents.flows.transitionRouteGroups.get({
    *       // The language to retrieve the transition route group for. The following fields are language dependent: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *       languageCode: 'placeholder-value',
    *       // Required. The name of the TransitionRouteGroup. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/transitionRouteGroups/my-transitionRouteGroup',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "transitionRoutes": []
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
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListTransitionRouteGroupsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all transition route groups in the specified flow.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await dialogflow.projects.locations.agents.flows.transitionRouteGroups.list(
    *       {
    *         // The language to list transition route groups for. The following fields are language dependent: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *         languageCode: 'placeholder-value',
    *         // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *         pageSize: 'placeholder-value',
    *         // The next_page_token value returned from a previous list request.
    *         pageToken: 'placeholder-value',
    *         // Required. The flow to list all transition route groups for. Format: `projects//locations//agents//flows/`.
    *         parent:
    *           'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transitionRouteGroups": []
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
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3TransitionRouteGroup]
  ): Unit = js.native
  /**
    * Updates the specified TransitionRouteGroup. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await dialogflow.projects.locations.agents.flows.transitionRouteGroups.patch(
    *       {
    *         // The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *         languageCode: 'placeholder-value',
    *         // The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
    *         name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/transitionRouteGroups/my-transitionRouteGroup',
    *         // The mask to control which fields get updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "displayName": "my_displayName",
    *           //   "name": "my_name",
    *           //   "transitionRoutes": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "transitionRoutes": []
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
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsTransitionroutegroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
