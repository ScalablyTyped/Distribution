package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects$Topics$Snapshots")
@js.native
open class ResourceProjectsTopicsSnapshots protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListTopicSnapshotsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicSnapshotsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTopicSnapshotsResponse] = js.native
  def list(params: ParamsResourceProjectsTopicsSnapshotsList): GaxiosPromise[SchemaListTopicSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSnapshotsList,
    callback: BodyResponseCallback[SchemaListTopicSnapshotsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTopicsSnapshotsList,
    options: BodyResponseCallback[Readable | SchemaListTopicSnapshotsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTopicSnapshotsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTopicsSnapshotsList, options: MethodOptions): GaxiosPromise[SchemaListTopicSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSnapshotsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicSnapshotsResponse]
  ): Unit = js.native
  /**
    * Lists the names of the snapshots on this topic. Snapshots are used in [Seek](https://cloud.google.com/pubsub/docs/replay-overview) operations, which allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment state of messages in an existing subscription to the state captured by a snapshot.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.topics.snapshots.list({
    *     // Maximum number of snapshot names to return.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListTopicSnapshotsResponse`; indicates that this is a continuation of a prior `ListTopicSnapshots` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the topic that snapshots are attached to. Format is `projects/{project\}/topics/{topic\}`.
    *     topic: 'projects/my-project/topics/my-topic',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "snapshots": []
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
  def list(params: ParamsResourceProjectsTopicsSnapshotsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSnapshotsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
