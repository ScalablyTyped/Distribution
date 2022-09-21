package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Events")
@js.native
open class ResourceEvents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def listByPlayer(): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(callback: BodyResponseCallback[SchemaPlayerEventListResponse]): Unit = js.native
  def listByPlayer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(params: ParamsResourceEventsListbyplayer): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(
    params: ParamsResourceEventsListbyplayer,
    callback: BodyResponseCallback[SchemaPlayerEventListResponse]
  ): Unit = js.native
  def listByPlayer(
    params: ParamsResourceEventsListbyplayer,
    options: BodyResponseCallback[Readable | SchemaPlayerEventListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlayerEventListResponse]
  ): Unit = js.native
  def listByPlayer(params: ParamsResourceEventsListbyplayer, options: MethodOptions): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(
    params: ParamsResourceEventsListbyplayer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerEventListResponse]
  ): Unit = js.native
  /**
    * Returns a list showing the current progress on events in this application for the currently authenticated user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.events.listByPlayer({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The maximum number of events to return in the response, used for paging. For any response, the actual number of events to return may be less than the specified maxResults.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def listByPlayer(params: ParamsResourceEventsListbyplayer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listByPlayer(
    params: ParamsResourceEventsListbyplayer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listDefinitions(): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(callback: BodyResponseCallback[SchemaEventDefinitionListResponse]): Unit = js.native
  def listDefinitions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(params: ParamsResourceEventsListdefinitions): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(
    params: ParamsResourceEventsListdefinitions,
    callback: BodyResponseCallback[SchemaEventDefinitionListResponse]
  ): Unit = js.native
  def listDefinitions(
    params: ParamsResourceEventsListdefinitions,
    options: BodyResponseCallback[Readable | SchemaEventDefinitionListResponse],
    callback: BodyResponseCallback[Readable | SchemaEventDefinitionListResponse]
  ): Unit = js.native
  def listDefinitions(params: ParamsResourceEventsListdefinitions, options: MethodOptions): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(
    params: ParamsResourceEventsListdefinitions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventDefinitionListResponse]
  ): Unit = js.native
  /**
    * Returns a list of the event definitions in this application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.events.listDefinitions({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The maximum number of event definitions to return in the response, used for paging. For any response, the actual number of event definitions to return may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def listDefinitions(params: ParamsResourceEventsListdefinitions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listDefinitions(
    params: ParamsResourceEventsListdefinitions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def record(): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(callback: BodyResponseCallback[SchemaEventUpdateResponse]): Unit = js.native
  def record(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(params: ParamsResourceEventsRecord): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(params: ParamsResourceEventsRecord, callback: BodyResponseCallback[SchemaEventUpdateResponse]): Unit = js.native
  def record(
    params: ParamsResourceEventsRecord,
    options: BodyResponseCallback[Readable | SchemaEventUpdateResponse],
    callback: BodyResponseCallback[Readable | SchemaEventUpdateResponse]
  ): Unit = js.native
  def record(params: ParamsResourceEventsRecord, options: MethodOptions): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(
    params: ParamsResourceEventsRecord,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventUpdateResponse]
  ): Unit = js.native
  /**
    * Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/games.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const games = google.games('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.events.record({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "currentTimeMillis": "my_currentTimeMillis",
    *       //   "kind": "my_kind",
    *       //   "requestId": "my_requestId",
    *       //   "timePeriods": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "batchFailures": [],
    *   //   "eventFailures": [],
    *   //   "kind": "my_kind",
    *   //   "playerEvents": []
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
  def record(params: ParamsResourceEventsRecord, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def record(
    params: ParamsResourceEventsRecord,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
