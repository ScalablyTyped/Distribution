package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects$Topics$Snapshots")
@js.native
class ResourceProjectsTopicsSnapshots protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * pubsub.projects.topics.snapshots.list
    * @desc Lists the names of the snapshots on this topic. Snapshots are used
    * in <a
    * href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
    * operations, which allow you to manage message acknowledgments in bulk.
    * That is, you can set the acknowledgment state of messages in an existing
    * subscription to the state captured by a snapshot.
    * @alias pubsub.projects.topics.snapshots.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of snapshot names to return.
    * @param {string=} params.pageToken The value returned by the last `ListTopicSnapshotsResponse`; indicates that this is a continuation of a prior `ListTopicSnapshots` call, and that the system should return the next page of data.
    * @param {string} params.topic The name of the topic that snapshots are attached to. Format is `projects/{project}/topics/{topic}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaListTopicSnapshotsResponse],
    callback: BodyResponseCallback[SchemaListTopicSnapshotsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTopicsSnapshotsList, options: MethodOptions): GaxiosPromise[SchemaListTopicSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSnapshotsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicSnapshotsResponse]
  ): Unit = js.native
}
