package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/contactcenterinsights/v1", "contactcenterinsights_v1.Resource$Projects$Locations$Conversations")
@js.native
open class ResourceProjectsLocationsConversations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var analyses: ResourceProjectsLocationsConversationsAnalyses = js.native
  
  def calculateStats(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse] = js.native
  def calculateStats(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse]): Unit = js.native
  def calculateStats(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse] = js.native
  def calculateStats(params: ParamsResourceProjectsLocationsConversationsCalculatestats): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse] = js.native
  def calculateStats(
    params: ParamsResourceProjectsLocationsConversationsCalculatestats,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse]
  ): Unit = js.native
  def calculateStats(
    params: ParamsResourceProjectsLocationsConversationsCalculatestats,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse]
  ): Unit = js.native
  def calculateStats(params: ParamsResourceProjectsLocationsConversationsCalculatestats, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse] = js.native
  def calculateStats(
    params: ParamsResourceProjectsLocationsConversationsCalculatestats,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse]
  ): Unit = js.native
  /**
    * Gets conversation statistics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.conversations.calculateStats(
    *       {
    *         // A filter to reduce results to a specific subset. This field is useful for getting statistics about conversations with specific properties.
    *         filter: 'placeholder-value',
    *         // Required. The location of the conversations.
    *         location: 'projects/my-project/locations/my-location',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "averageDuration": "my_averageDuration",
    *   //   "averageTurnCount": 0,
    *   //   "conversationCount": 0,
    *   //   "conversationCountTimeSeries": {},
    *   //   "customHighlighterMatches": {},
    *   //   "issueMatches": {},
    *   //   "issueMatchesStats": {},
    *   //   "smartHighlighterMatches": {}
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
  def calculateStats(params: ParamsResourceProjectsLocationsConversationsCalculatestats, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def calculateStats(
    params: ParamsResourceProjectsLocationsConversationsCalculatestats,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def create(params: ParamsResourceProjectsLocationsConversationsCreate): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Conversation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsConversationsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  /**
    * Creates a conversation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.conversations.create({
    *       // A unique ID for the new conversation. This ID will become the final component of the conversation's resource name. If no ID is specified, a server-generated ID will be used. This value should be 4-64 characters and must match the regular expression `^[a-z0-9-]{4,64\}$`. Valid characters are `a-z-`
    *       conversationId: 'placeholder-value',
    *       // Required. The parent resource of the conversation.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "agentId": "my_agentId",
    *         //   "callMetadata": {},
    *         //   "createTime": "my_createTime",
    *         //   "dataSource": {},
    *         //   "dialogflowIntents": {},
    *         //   "duration": "my_duration",
    *         //   "expireTime": "my_expireTime",
    *         //   "labels": {},
    *         //   "languageCode": "my_languageCode",
    *         //   "latestAnalysis": {},
    *         //   "medium": "my_medium",
    *         //   "name": "my_name",
    *         //   "obfuscatedUserId": "my_obfuscatedUserId",
    *         //   "runtimeAnnotations": [],
    *         //   "startTime": "my_startTime",
    *         //   "transcript": {},
    *         //   "ttl": "my_ttl",
    *         //   "turnCount": 0,
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentId": "my_agentId",
    *   //   "callMetadata": {},
    *   //   "createTime": "my_createTime",
    *   //   "dataSource": {},
    *   //   "dialogflowIntents": {},
    *   //   "duration": "my_duration",
    *   //   "expireTime": "my_expireTime",
    *   //   "labels": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "latestAnalysis": {},
    *   //   "medium": "my_medium",
    *   //   "name": "my_name",
    *   //   "obfuscatedUserId": "my_obfuscatedUserId",
    *   //   "runtimeAnnotations": [],
    *   //   "startTime": "my_startTime",
    *   //   "transcript": {},
    *   //   "ttl": "my_ttl",
    *   //   "turnCount": 0,
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
  def create(params: ParamsResourceProjectsLocationsConversationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsConversationsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsConversationsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a conversation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.conversations.delete({
    *       // If set to true, all of this conversation's analyses will also be deleted. Otherwise, the request will only succeed if the conversation has no analyses.
    *       force: 'placeholder-value',
    *       // Required. The name of the conversation to delete.
    *       name: 'projects/my-project/locations/my-location/conversations/my-conversation',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsConversationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def get(params: ParamsResourceProjectsLocationsConversationsGet): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Conversation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConversationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  /**
    * Gets a conversation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.conversations.get({
    *     // Required. The name of the conversation to get.
    *     name: 'projects/my-project/locations/my-location/conversations/my-conversation',
    *     // The level of details of the conversation. Default is `FULL`.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentId": "my_agentId",
    *   //   "callMetadata": {},
    *   //   "createTime": "my_createTime",
    *   //   "dataSource": {},
    *   //   "dialogflowIntents": {},
    *   //   "duration": "my_duration",
    *   //   "expireTime": "my_expireTime",
    *   //   "labels": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "latestAnalysis": {},
    *   //   "medium": "my_medium",
    *   //   "name": "my_name",
    *   //   "obfuscatedUserId": "my_obfuscatedUserId",
    *   //   "runtimeAnnotations": [],
    *   //   "startTime": "my_startTime",
    *   //   "transcript": {},
    *   //   "ttl": "my_ttl",
    *   //   "turnCount": 0,
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
  def get(params: ParamsResourceProjectsLocationsConversationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConversationsList): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConversationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1ListConversationsResponse]
  ): Unit = js.native
  /**
    * Lists conversations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res = await contactcenterinsights.projects.locations.conversations.list(
    *     {
    *       // A filter to reduce results to a specific subset. Useful for querying conversations with specific properties.
    *       filter: 'placeholder-value',
    *       // The maximum number of conversations to return in the response. A valid page size ranges from 0 to 1,000 inclusive. If the page size is zero or unspecified, a default page size of 100 will be chosen. Note that a call might return fewer results than the requested page size.
    *       pageSize: 'placeholder-value',
    *       // The value returned by the last `ListConversationsResponse`. This value indicates that this is a continuation of a prior `ListConversations` call and that the system should return the next page of data.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent resource of the conversation.
    *       parent: 'projects/my-project/locations/my-location',
    *       // The level of details of the conversation. Default is `BASIC`.
    *       view: 'placeholder-value',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversations": [],
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
  def list(params: ParamsResourceProjectsLocationsConversationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def patch(params: ParamsResourceProjectsLocationsConversationsPatch): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Conversation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsConversationsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudContactcenterinsightsV1Conversation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudContactcenterinsightsV1Conversation]
  ): Unit = js.native
  /**
    * Updates a conversation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/contactcenterinsights.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const contactcenterinsights = google.contactcenterinsights('v1');
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
    *   const res =
    *     await contactcenterinsights.projects.locations.conversations.patch({
    *       // Immutable. The resource name of the conversation. Format: projects/{project\}/locations/{location\}/conversations/{conversation\}
    *       name: 'projects/my-project/locations/my-location/conversations/my-conversation',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "agentId": "my_agentId",
    *         //   "callMetadata": {},
    *         //   "createTime": "my_createTime",
    *         //   "dataSource": {},
    *         //   "dialogflowIntents": {},
    *         //   "duration": "my_duration",
    *         //   "expireTime": "my_expireTime",
    *         //   "labels": {},
    *         //   "languageCode": "my_languageCode",
    *         //   "latestAnalysis": {},
    *         //   "medium": "my_medium",
    *         //   "name": "my_name",
    *         //   "obfuscatedUserId": "my_obfuscatedUserId",
    *         //   "runtimeAnnotations": [],
    *         //   "startTime": "my_startTime",
    *         //   "transcript": {},
    *         //   "ttl": "my_ttl",
    *         //   "turnCount": 0,
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentId": "my_agentId",
    *   //   "callMetadata": {},
    *   //   "createTime": "my_createTime",
    *   //   "dataSource": {},
    *   //   "dialogflowIntents": {},
    *   //   "duration": "my_duration",
    *   //   "expireTime": "my_expireTime",
    *   //   "labels": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "latestAnalysis": {},
    *   //   "medium": "my_medium",
    *   //   "name": "my_name",
    *   //   "obfuscatedUserId": "my_obfuscatedUserId",
    *   //   "runtimeAnnotations": [],
    *   //   "startTime": "my_startTime",
    *   //   "transcript": {},
    *   //   "ttl": "my_ttl",
    *   //   "turnCount": 0,
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
  def patch(params: ParamsResourceProjectsLocationsConversationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
