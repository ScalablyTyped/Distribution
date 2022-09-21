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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Snapshots")
@js.native
open class ResourceSnapshots protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSnapshot] = js.native
  def get(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(params: ParamsResourceSnapshotsGet): GaxiosPromise[SchemaSnapshot] = js.native
  def get(params: ParamsResourceSnapshotsGet, callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def get(
    params: ParamsResourceSnapshotsGet,
    options: BodyResponseCallback[Readable | SchemaSnapshot],
    callback: BodyResponseCallback[Readable | SchemaSnapshot]
  ): Unit = js.native
  def get(params: ParamsResourceSnapshotsGet, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(
    params: ParamsResourceSnapshotsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  /**
    * Retrieves the metadata for a given snapshot ID.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/games',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.snapshots.get({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The ID of the snapshot.
    *     snapshotId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "coverImage": {},
    *   //   "description": "my_description",
    *   //   "driveId": "my_driveId",
    *   //   "durationMillis": "my_durationMillis",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lastModifiedMillis": "my_lastModifiedMillis",
    *   //   "progressValue": "my_progressValue",
    *   //   "title": "my_title",
    *   //   "type": "my_type",
    *   //   "uniqueName": "my_uniqueName"
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
  def get(params: ParamsResourceSnapshotsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSnapshotsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSnapshotListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(params: ParamsResourceSnapshotsList): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(params: ParamsResourceSnapshotsList, callback: BodyResponseCallback[SchemaSnapshotListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSnapshotsList,
    options: BodyResponseCallback[Readable | SchemaSnapshotListResponse],
    callback: BodyResponseCallback[Readable | SchemaSnapshotListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSnapshotsList, options: MethodOptions): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(
    params: ParamsResourceSnapshotsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshotListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of snapshots created by your application for the player corresponding to the player ID.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/games',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.snapshots.list({
    *     // The preferred language to use for strings returned by this method.
    *     language: 'placeholder-value',
    *     // The maximum number of snapshot resources to return in the response, used for paging. For any response, the actual number of snapshot resources returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // A player ID. A value of `me` may be used in place of the authenticated player's ID.
    *     playerId: 'placeholder-value',
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
  def list(params: ParamsResourceSnapshotsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSnapshotsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
