package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3beta1", "dialogflow_v3beta1.Resource$Projects$Locations$Agents$Flows")
@js.native
open class ResourceProjectsLocationsAgentsFlows protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsFlowsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Flow],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsFlowsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  /**
    * Creates a flow in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.create({
    *     // The language of the following fields in `flow`: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // Required. The agent to create a flow for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "eventHandlers": [],
    *       //   "name": "my_name",
    *       //   "nluSettings": {},
    *       //   "transitionRouteGroups": [],
    *       //   "transitionRoutes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "eventHandlers": [],
    *   //   "name": "my_name",
    *   //   "nluSettings": {},
    *   //   "transitionRouteGroups": [],
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
  def create(params: ParamsResourceProjectsLocationsAgentsFlowsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsFlowsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsFlowsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a specified flow.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.delete({
    *     // This field has no effect for flows with no incoming transitions. For flows with incoming transitions: * If `force` is set to false, an error will be returned with message indicating the incoming transitions. * If `force` is set to true, Dialogflow will remove the flow, as well as any transitions to the flow (i.e. Target flow in event handlers or Target flow in transition routes that point to this flow will be cleared).
    *     force: 'placeholder-value',
    *     // Required. The name of the flow to delete. Format: `projects//locations//agents//flows/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
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
  def delete(params: ParamsResourceProjectsLocationsAgentsFlowsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `export`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(params: ParamsResourceProjectsLocationsAgentsFlowsExport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsFlowsExport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsFlowsExport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsLocationsAgentsFlowsExport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsFlowsExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Exports the specified flow to a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ExportFlowResponse Note that resources (e.g. intents, entities, webhooks) that the flow references will also be exported.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.export({
    *     // Required. The name of the flow to export. Format: `projects//locations//agents//flows/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "flowUri": "my_flowUri",
    *       //   "includeReferencedFlows": false
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
  def `export`(params: ParamsResourceProjectsLocationsAgentsFlowsExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsFlowsExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Flow],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  /**
    * Retrieves the specified flow.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.get({
    *     // The language to retrieve the flow for. The following fields are language dependent: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // Required. The name of the flow to get. Format: `projects//locations//agents//flows/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "eventHandlers": [],
    *   //   "name": "my_name",
    *   //   "nluSettings": {},
    *   //   "transitionRouteGroups": [],
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
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getValidationResult(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def getValidationResult(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]): Unit = js.native
  def getValidationResult(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def getValidationResult(params: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]
  ): Unit = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]
  ): Unit = js.native
  def getValidationResult(params: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]
  ): Unit = js.native
  /**
    * Gets the latest flow validation result. Flow validation is performed when ValidateFlow is called.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.flows.getValidationResult({
    *       // If not specified, the agent's default language is used.
    *       languageCode: 'placeholder-value',
    *       // Required. The flow name. Format: `projects//locations//agents//flows//validationResult`.
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/validationResult',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "validationMessages": []
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
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsAgentsFlowsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsFlowsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsFlowsImport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsAgentsFlowsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsFlowsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Imports the specified flow to the specified agent from a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ImportFlowResponse Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.import({
    *     // Required. The agent to import the flow into. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "flowContent": "my_flowContent",
    *       //   "flowUri": "my_flowUri",
    *       //   "importOption": "my_importOption"
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
  def `import`(params: ParamsResourceProjectsLocationsAgentsFlowsImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsAgentsFlowsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsFlowsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsFlowsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListFlowsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all flows in the specified agent.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.list({
    *     // The language to list flows for. The following fields are language dependent: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent containing the flows. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "flows": [],
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
  def list(params: ParamsResourceProjectsLocationsAgentsFlowsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var pages: ResourceProjectsLocationsAgentsFlowsPages = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsFlowsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Flow],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsFlowsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Flow] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Flow]
  ): Unit = js.native
  /**
    * Updates the specified flow. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.patch({
    *     // The language of the following fields in `flow`: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
    *     // The mask to control which fields get updated. If the mask is not present, all fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "eventHandlers": [],
    *       //   "name": "my_name",
    *       //   "nluSettings": {},
    *       //   "transitionRouteGroups": [],
    *       //   "transitionRoutes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "eventHandlers": [],
    *   //   "name": "my_name",
    *   //   "nluSettings": {},
    *   //   "transitionRouteGroups": [],
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
  def patch(params: ParamsResourceProjectsLocationsAgentsFlowsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def train(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def train(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(params: ParamsResourceProjectsLocationsAgentsFlowsTrain): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(
    params: ParamsResourceProjectsLocationsAgentsFlowsTrain,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def train(
    params: ParamsResourceProjectsLocationsAgentsFlowsTrain,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def train(params: ParamsResourceProjectsLocationsAgentsFlowsTrain, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(
    params: ParamsResourceProjectsLocationsAgentsFlowsTrain,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Trains the specified flow. Note that only the flow in 'draft' environment is trained. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.train({
    *     // Required. The flow to train. Format: `projects//locations//agents//flows/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
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
  def train(params: ParamsResourceProjectsLocationsAgentsFlowsTrain, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def train(
    params: ParamsResourceProjectsLocationsAgentsFlowsTrain,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var transitionRouteGroups: ResourceProjectsLocationsAgentsFlowsTransitionroutegroups = js.native
  
  def validate(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def validate(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]): Unit = js.native
  def validate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def validate(params: ParamsResourceProjectsLocationsAgentsFlowsValidate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsFlowsValidate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]
  ): Unit = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsFlowsValidate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]
  ): Unit = js.native
  def validate(params: ParamsResourceProjectsLocationsAgentsFlowsValidate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsFlowsValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]
  ): Unit = js.native
  /**
    * Validates the specified flow and creates or updates validation results. Please call this API after the training is completed to get the complete validation results.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *   const res = await dialogflow.projects.locations.agents.flows.validate({
    *     // Required. The flow to validate. Format: `projects//locations//agents//flows/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "languageCode": "my_languageCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime",
    *   //   "validationMessages": []
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
  def validate(params: ParamsResourceProjectsLocationsAgentsFlowsValidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsFlowsValidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var versions: ResourceProjectsLocationsAgentsFlowsVersions = js.native
}
