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

@JSImport("googleapis/build/src/apis/dialogflow/v3beta1", "dialogflow_v3beta1.Resource$Projects$Locations$Agents$Webhooks")
@js.native
open class ResourceProjectsLocationsAgentsWebhooks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsWebhooksCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsWebhooksCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsWebhooksCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Webhook],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsWebhooksCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsWebhooksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  /**
    * Creates a webhook in the specified agent.
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
    *   const res = await dialogflow.projects.locations.agents.webhooks.create({
    *     // Required. The agent to create a webhook for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disabled": false,
    *       //   "displayName": "my_displayName",
    *       //   "genericWebService": {},
    *       //   "name": "my_name",
    *       //   "serviceDirectory": {},
    *       //   "timeout": "my_timeout"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disabled": false,
    *   //   "displayName": "my_displayName",
    *   //   "genericWebService": {},
    *   //   "name": "my_name",
    *   //   "serviceDirectory": {},
    *   //   "timeout": "my_timeout"
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
  def create(params: ParamsResourceProjectsLocationsAgentsWebhooksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsWebhooksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsWebhooksDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsWebhooksDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsWebhooksDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsWebhooksDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsWebhooksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified webhook.
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
    *   const res = await dialogflow.projects.locations.agents.webhooks.delete({
    *     // This field has no effect for webhook not being used. For webhooks that are used by pages/flows/transition route groups: * If `force` is set to false, an error will be returned with message indicating the referenced resources. * If `force` is set to true, Dialogflow will remove the webhook, as well as any references to the webhook (i.e. Webhook and tagin fulfillments that point to this webhook will be removed).
    *     force: 'placeholder-value',
    *     // Required. The name of the webhook to delete. Format: `projects//locations//agents//webhooks/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/webhooks/my-webhook',
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
  def delete(params: ParamsResourceProjectsLocationsAgentsWebhooksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsWebhooksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsWebhooksGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsWebhooksGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsWebhooksGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Webhook],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsWebhooksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsWebhooksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  /**
    * Retrieves the specified webhook.
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
    *   const res = await dialogflow.projects.locations.agents.webhooks.get({
    *     // Required. The name of the webhook. Format: `projects//locations//agents//webhooks/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/webhooks/my-webhook',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disabled": false,
    *   //   "displayName": "my_displayName",
    *   //   "genericWebService": {},
    *   //   "name": "my_name",
    *   //   "serviceDirectory": {},
    *   //   "timeout": "my_timeout"
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
  def get(params: ParamsResourceProjectsLocationsAgentsWebhooksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsWebhooksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsWebhooksList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsWebhooksList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsWebhooksList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsWebhooksList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsWebhooksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListWebhooksResponse]
  ): Unit = js.native
  /**
    * Returns the list of all webhooks in the specified agent.
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
    *   const res = await dialogflow.projects.locations.agents.webhooks.list({
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all webhooks for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "webhooks": []
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
  def list(params: ParamsResourceProjectsLocationsAgentsWebhooksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsWebhooksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsWebhooksPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsWebhooksPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsWebhooksPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Webhook],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsWebhooksPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Webhook] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsWebhooksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  ): Unit = js.native
  /**
    * Updates the specified webhook.
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
    *   const res = await dialogflow.projects.locations.agents.webhooks.patch({
    *     // The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/webhooks/my-webhook',
    *     // The mask to control which fields get updated. If the mask is not present, all fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disabled": false,
    *       //   "displayName": "my_displayName",
    *       //   "genericWebService": {},
    *       //   "name": "my_name",
    *       //   "serviceDirectory": {},
    *       //   "timeout": "my_timeout"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disabled": false,
    *   //   "displayName": "my_displayName",
    *   //   "genericWebService": {},
    *   //   "name": "my_name",
    *   //   "serviceDirectory": {},
    *   //   "timeout": "my_timeout"
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
  def patch(params: ParamsResourceProjectsLocationsAgentsWebhooksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsWebhooksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
