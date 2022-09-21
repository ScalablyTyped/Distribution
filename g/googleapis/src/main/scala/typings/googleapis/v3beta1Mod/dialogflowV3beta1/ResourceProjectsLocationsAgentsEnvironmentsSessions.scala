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

@JSImport("googleapis/build/src/apis/dialogflow/v3beta1", "dialogflow_v3beta1.Resource$Projects$Locations$Agents$Environments$Sessions")
@js.native
open class ResourceProjectsLocationsAgentsEnvironmentsSessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def detectIntent(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse] = js.native
  def detectIntent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse]): Unit = js.native
  def detectIntent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse] = js.native
  def detectIntent(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsDetectintent): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsDetectintent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsDetectintent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsDetectintent,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsDetectintent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse]
  ): Unit = js.native
  /**
    * Processes a natural language query and returns structured, actionable data as a result. This method is not idempotent, because it may cause session entity types to be updated, which in turn might affect results of future queries. Note: Always use agent versions for production traffic. See [Versions and environments](https://cloud.google.com/dialogflow/cx/docs/concept/version).
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
    *     await dialogflow.projects.locations.agents.environments.sessions.detectIntent(
    *       {
    *         // Required. The name of the session this query is sent to. Format: `projects//locations//agents//sessions/` or `projects//locations//agents//environments//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment. It's up to the API caller to choose an appropriate `Session ID`. It can be a random number or some type of session identifiers (preferably hashed). The length of the `Session ID` must not exceed 36 characters. For more information, see the [sessions guide](https://cloud.google.com/dialogflow/cx/docs/concept/session). Note: Always use agent versions for production traffic. See [Versions and environments](https://cloud.google.com/dialogflow/cx/docs/concept/version).
    *         session:
    *           'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "outputAudioConfig": {},
    *           //   "queryInput": {},
    *           //   "queryParams": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowCancellation": false,
    *   //   "outputAudio": "my_outputAudio",
    *   //   "outputAudioConfig": {},
    *   //   "queryResult": {},
    *   //   "responseId": "my_responseId",
    *   //   "responseType": "my_responseType"
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
  def detectIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsDetectintent,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def detectIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsDetectintent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var entityTypes: ResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypes = js.native
  
  def fulfillIntent(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse] = js.native
  def fulfillIntent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse]): Unit = js.native
  def fulfillIntent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse] = js.native
  def fulfillIntent(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsFulfillintent): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse] = js.native
  def fulfillIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsFulfillintent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse]
  ): Unit = js.native
  def fulfillIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsFulfillintent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse]
  ): Unit = js.native
  def fulfillIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsFulfillintent,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse] = js.native
  def fulfillIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsFulfillintent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1FulfillIntentResponse]
  ): Unit = js.native
  /**
    * Fulfills a matched intent returned by MatchIntent. Must be called after MatchIntent, with input from MatchIntentResponse. Otherwise, the behavior is undefined.
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
    *     await dialogflow.projects.locations.agents.environments.sessions.fulfillIntent(
    *       {
    *         // Required. The name of the session this query is sent to. Format: `projects//locations//agents//sessions/` or `projects//locations//agents//environments//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment. It's up to the API caller to choose an appropriate `Session ID`. It can be a random number or some type of session identifiers (preferably hashed). The length of the `Session ID` must not exceed 36 characters. For more information, see the [sessions guide](https://cloud.google.com/dialogflow/cx/docs/concept/session).
    *         session:
    *           'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "match": {},
    *           //   "matchIntentRequest": {},
    *           //   "outputAudioConfig": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "outputAudio": "my_outputAudio",
    *   //   "outputAudioConfig": {},
    *   //   "queryResult": {},
    *   //   "responseId": "my_responseId"
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
  def fulfillIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsFulfillintent,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def fulfillIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsFulfillintent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def matchIntent(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse] = js.native
  def matchIntent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse]): Unit = js.native
  def matchIntent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse] = js.native
  def matchIntent(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsMatchintent): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse] = js.native
  def matchIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsMatchintent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse]
  ): Unit = js.native
  def matchIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsMatchintent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse]
  ): Unit = js.native
  def matchIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsMatchintent,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse] = js.native
  def matchIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsMatchintent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1MatchIntentResponse]
  ): Unit = js.native
  /**
    * Returns preliminary intent match results, doesn't change the session status.
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
    *     await dialogflow.projects.locations.agents.environments.sessions.matchIntent(
    *       {
    *         // Required. The name of the session this query is sent to. Format: `projects//locations//agents//sessions/` or `projects//locations//agents//environments//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment. It's up to the API caller to choose an appropriate `Session ID`. It can be a random number or some type of session identifiers (preferably hashed). The length of the `Session ID` must not exceed 36 characters. For more information, see the [sessions guide](https://cloud.google.com/dialogflow/cx/docs/concept/session).
    *         session:
    *           'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "queryInput": {},
    *           //   "queryParams": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentPage": {},
    *   //   "matches": [],
    *   //   "text": "my_text",
    *   //   "transcript": "my_transcript",
    *   //   "triggerEvent": "my_triggerEvent",
    *   //   "triggerIntent": "my_triggerIntent"
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
  def matchIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsMatchintent,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def matchIntent(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsMatchintent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
