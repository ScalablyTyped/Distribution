package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Sessions")
@js.native
open class ResourceProjectsAgentSessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var contexts: ResourceProjectsAgentSessionsContexts = js.native
  
  def deleteContexts(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteContexts(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def deleteContexts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteContexts(params: ParamsResourceProjectsAgentSessionsDeletecontexts): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsResourceProjectsAgentSessionsDeletecontexts,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(
    params: ParamsResourceProjectsAgentSessionsDeletecontexts,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(params: ParamsResourceProjectsAgentSessionsDeletecontexts, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsResourceProjectsAgentSessionsDeletecontexts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes all active contexts in the specified session.
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
    * const dialogflow = google.dialogflow('v2');
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
    *   const res = await dialogflow.projects.agent.sessions.deleteContexts({
    *     // Required. The name of the session to delete all contexts from. Format: `projects//agent/sessions/` or `projects//agent/environments//users//sessions/`. If `Environment ID` is not specified we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *     parent: 'projects/my-project/agent/sessions/my-session',
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
  def deleteContexts(params: ParamsResourceProjectsAgentSessionsDeletecontexts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteContexts(
    params: ParamsResourceProjectsAgentSessionsDeletecontexts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def detectIntent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2DetectIntentResponse] = js.native
  def detectIntent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2DetectIntentResponse]): Unit = js.native
  def detectIntent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2DetectIntentResponse] = js.native
  def detectIntent(params: ParamsResourceProjectsAgentSessionsDetectintent): GaxiosPromise[SchemaGoogleCloudDialogflowV2DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsResourceProjectsAgentSessionsDetectintent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsResourceProjectsAgentSessionsDetectintent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2DetectIntentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(params: ParamsResourceProjectsAgentSessionsDetectintent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsResourceProjectsAgentSessionsDetectintent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2DetectIntentResponse]
  ): Unit = js.native
  /**
    * Processes a natural language query and returns structured, actionable data as a result. This method is not idempotent, because it may cause contexts and session entity types to be updated, which in turn might affect results of future queries. If you might use [Agent Assist](https://cloud.google.com/dialogflow/docs/#aa) or other CCAI products now or in the future, consider using AnalyzeContent instead of `DetectIntent`. `AnalyzeContent` has additional functionality for Agent Assist and other CCAI products. Note: Always use agent versions for production traffic. See [Versions and environments](https://cloud.google.com/dialogflow/es/docs/agents-versions).
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
    * const dialogflow = google.dialogflow('v2');
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
    *   const res = await dialogflow.projects.agent.sessions.detectIntent({
    *     // Required. The name of the session this query is sent to. Format: `projects//agent/sessions/`, or `projects//agent/environments//users//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment (`Environment ID` might be referred to as environment name at some places). If `User ID` is not specified, we are using "-". It's up to the API caller to choose an appropriate `Session ID` and `User Id`. They can be a random number or some type of user and session identifiers (preferably hashed). The length of the `Session ID` and `User ID` must not exceed 36 characters. For more information, see the [API interactions guide](https://cloud.google.com/dialogflow/docs/api-overview). Note: Always use agent versions for production traffic. See [Versions and environments](https://cloud.google.com/dialogflow/es/docs/agents-versions).
    *     session: 'projects/my-project/agent/sessions/my-session',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inputAudio": "my_inputAudio",
    *       //   "outputAudioConfig": {},
    *       //   "outputAudioConfigMask": "my_outputAudioConfigMask",
    *       //   "queryInput": {},
    *       //   "queryParams": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "outputAudio": "my_outputAudio",
    *   //   "outputAudioConfig": {},
    *   //   "queryResult": {},
    *   //   "responseId": "my_responseId",
    *   //   "webhookStatus": {}
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
  def detectIntent(params: ParamsResourceProjectsAgentSessionsDetectintent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def detectIntent(
    params: ParamsResourceProjectsAgentSessionsDetectintent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var entityTypes: ResourceProjectsAgentSessionsEntitytypes = js.native
}
