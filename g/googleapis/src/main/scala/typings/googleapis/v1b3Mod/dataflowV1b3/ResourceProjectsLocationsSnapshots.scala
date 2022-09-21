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

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Snapshots")
@js.native
open class ResourceProjectsLocationsSnapshots protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaDeleteSnapshotResponse]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def delete(params: ParamsResourceProjectsLocationsSnapshotsDelete): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSnapshotsDelete,
    callback: BodyResponseCallback[SchemaDeleteSnapshotResponse]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSnapshotsDelete,
    options: BodyResponseCallback[Readable | SchemaDeleteSnapshotResponse],
    callback: BodyResponseCallback[Readable | SchemaDeleteSnapshotResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsSnapshotsDelete, options: MethodOptions): GaxiosPromise[SchemaDeleteSnapshotResponse] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSnapshotsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteSnapshotResponse]
  ): Unit = js.native
  /**
    * Deletes a snapshot.
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
    *   const res = await dataflow.projects.locations.snapshots.delete({
    *     // The location that contains this snapshot.
    *     location: 'placeholder-value',
    *     // The ID of the Cloud Platform project that the snapshot belongs to.
    *     projectId: 'placeholder-value',
    *     // The ID of the snapshot.
    *     snapshotId: 'placeholder-value',
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
  def delete(params: ParamsResourceProjectsLocationsSnapshotsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSnapshotsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSnapshot] = js.native
  def get(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(params: ParamsResourceProjectsLocationsSnapshotsGet): GaxiosPromise[SchemaSnapshot] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSnapshotsGet,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSnapshotsGet,
    options: BodyResponseCallback[Readable | SchemaSnapshot],
    callback: BodyResponseCallback[Readable | SchemaSnapshot]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSnapshotsGet, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSnapshotsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  /**
    * Gets information about a snapshot.
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
    *   const res = await dataflow.projects.locations.snapshots.get({
    *     // The location that contains this snapshot.
    *     location: 'placeholder-value',
    *     // The ID of the Cloud Platform project that the snapshot belongs to.
    *     projectId: 'placeholder-value',
    *     // The ID of the snapshot.
    *     snapshotId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "diskSizeBytes": "my_diskSizeBytes",
    *   //   "id": "my_id",
    *   //   "projectId": "my_projectId",
    *   //   "pubsubMetadata": [],
    *   //   "region": "my_region",
    *   //   "sourceJobId": "my_sourceJobId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl"
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
  def get(params: ParamsResourceProjectsLocationsSnapshotsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSnapshotsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSnapshotsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSnapshotsList): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSnapshotsList,
    callback: BodyResponseCallback[SchemaListSnapshotsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSnapshotsList,
    options: BodyResponseCallback[Readable | SchemaListSnapshotsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSnapshotsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSnapshotsList, options: MethodOptions): GaxiosPromise[SchemaListSnapshotsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSnapshotsList,
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
    *   const res = await dataflow.projects.locations.snapshots.list({
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
  def list(params: ParamsResourceProjectsLocationsSnapshotsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSnapshotsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
