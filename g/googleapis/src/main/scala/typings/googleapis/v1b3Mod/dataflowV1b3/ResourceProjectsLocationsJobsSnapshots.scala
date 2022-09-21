package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Snapshots")
@js.native
open class ResourceProjectsLocationsJobsSnapshots protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSnapshotsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsJobsSnapshotsList): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsSnapshotsList,
    callback: BodyResponseCallback[SchemaListSnapshotsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsSnapshotsList,
    options: BodyResponseCallback[Readable | SchemaListSnapshotsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSnapshotsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsJobsSnapshotsList, options: MethodOptions): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsSnapshotsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSnapshotsResponse]
  ): Unit = js.native
  /**
    * Lists snapshots.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataflow = google.dataflow('v1b3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/compute',
    *       'https://www.googleapis.com/auth/compute.readonly',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dataflow.projects.locations.jobs.snapshots.list({
    *     // If specified, list snapshots created from this job.
    *     jobId: 'placeholder-value',
    *     // The location to list snapshots in.
    *     location: 'placeholder-value',
    *     // The project ID to list snapshots for.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def list(params: ParamsResourceProjectsLocationsJobsSnapshotsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsSnapshotsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
