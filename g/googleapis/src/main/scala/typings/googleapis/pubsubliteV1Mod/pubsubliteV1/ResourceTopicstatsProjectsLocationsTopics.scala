package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Topicstats$Projects$Locations$Topics")
@js.native
open class ResourceTopicstatsProjectsLocationsTopics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def computeHeadCursor(): GaxiosPromise[SchemaComputeHeadCursorResponse] = js.native
  def computeHeadCursor(callback: BodyResponseCallback[SchemaComputeHeadCursorResponse]): Unit = js.native
  def computeHeadCursor(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComputeHeadCursorResponse] = js.native
  def computeHeadCursor(params: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor): GaxiosPromise[SchemaComputeHeadCursorResponse] = js.native
  def computeHeadCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor,
    callback: BodyResponseCallback[SchemaComputeHeadCursorResponse]
  ): Unit = js.native
  def computeHeadCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor,
    options: BodyResponseCallback[Readable | SchemaComputeHeadCursorResponse],
    callback: BodyResponseCallback[Readable | SchemaComputeHeadCursorResponse]
  ): Unit = js.native
  def computeHeadCursor(params: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor, options: MethodOptions): GaxiosPromise[SchemaComputeHeadCursorResponse] = js.native
  def computeHeadCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComputeHeadCursorResponse]
  ): Unit = js.native
  /**
    * Compute the head cursor for the partition. The head cursor's offset is guaranteed to be less than or equal to all messages which have not yet been acknowledged as published, and greater than the offset of any message whose publish has already been acknowledged. It is zero if there have never been messages in the partition.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *     await pubsublite.topicStats.projects.locations.topics.computeHeadCursor({
    *       // Required. The topic for which we should compute the head cursor.
    *       topic: 'projects/my-project/locations/my-location/topics/my-topic',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "partition": "my_partition"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "headCursor": {}
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
  def computeHeadCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def computeHeadCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputeheadcursor,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def computeMessageStats(): GaxiosPromise[SchemaComputeMessageStatsResponse] = js.native
  def computeMessageStats(callback: BodyResponseCallback[SchemaComputeMessageStatsResponse]): Unit = js.native
  def computeMessageStats(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComputeMessageStatsResponse] = js.native
  def computeMessageStats(params: ParamsResourceTopicstatsProjectsLocationsTopicsComputemessagestats): GaxiosPromise[SchemaComputeMessageStatsResponse] = js.native
  def computeMessageStats(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputemessagestats,
    callback: BodyResponseCallback[SchemaComputeMessageStatsResponse]
  ): Unit = js.native
  def computeMessageStats(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputemessagestats,
    options: BodyResponseCallback[Readable | SchemaComputeMessageStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaComputeMessageStatsResponse]
  ): Unit = js.native
  def computeMessageStats(params: ParamsResourceTopicstatsProjectsLocationsTopicsComputemessagestats, options: MethodOptions): GaxiosPromise[SchemaComputeMessageStatsResponse] = js.native
  def computeMessageStats(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputemessagestats,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComputeMessageStatsResponse]
  ): Unit = js.native
  /**
    * Compute statistics about a range of messages in a given topic and partition.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *     await pubsublite.topicStats.projects.locations.topics.computeMessageStats({
    *       // Required. The topic for which we should compute message stats.
    *       topic: 'projects/my-project/locations/my-location/topics/my-topic',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "endCursor": {},
    *         //   "partition": "my_partition",
    *         //   "startCursor": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "messageBytes": "my_messageBytes",
    *   //   "messageCount": "my_messageCount",
    *   //   "minimumEventTime": "my_minimumEventTime",
    *   //   "minimumPublishTime": "my_minimumPublishTime"
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
  def computeMessageStats(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputemessagestats,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def computeMessageStats(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputemessagestats,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def computeTimeCursor(): GaxiosPromise[SchemaComputeTimeCursorResponse] = js.native
  def computeTimeCursor(callback: BodyResponseCallback[SchemaComputeTimeCursorResponse]): Unit = js.native
  def computeTimeCursor(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComputeTimeCursorResponse] = js.native
  def computeTimeCursor(params: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor): GaxiosPromise[SchemaComputeTimeCursorResponse] = js.native
  def computeTimeCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor,
    callback: BodyResponseCallback[SchemaComputeTimeCursorResponse]
  ): Unit = js.native
  def computeTimeCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor,
    options: BodyResponseCallback[Readable | SchemaComputeTimeCursorResponse],
    callback: BodyResponseCallback[Readable | SchemaComputeTimeCursorResponse]
  ): Unit = js.native
  def computeTimeCursor(params: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor, options: MethodOptions): GaxiosPromise[SchemaComputeTimeCursorResponse] = js.native
  def computeTimeCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComputeTimeCursorResponse]
  ): Unit = js.native
  /**
    * Compute the corresponding cursor for a publish or event time in a topic partition.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *     await pubsublite.topicStats.projects.locations.topics.computeTimeCursor({
    *       // Required. The topic for which we should compute the cursor.
    *       topic: 'projects/my-project/locations/my-location/topics/my-topic',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "partition": "my_partition",
    *         //   "target": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cursor": {}
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
  def computeTimeCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def computeTimeCursor(
    params: ParamsResourceTopicstatsProjectsLocationsTopicsComputetimecursor,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
