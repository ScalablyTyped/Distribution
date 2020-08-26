package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Snapshots")
@js.native
class ResourceSnapshots protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.snapshots.get
    * @desc Retrieves the metadata for a given snapshot ID.
    * @alias games.snapshots.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.snapshotId The ID of the snapshot.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSnapshot] = js.native
  def get(callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(params: ParamsResourceSnapshotsGet): GaxiosPromise[SchemaSnapshot] = js.native
  def get(params: ParamsResourceSnapshotsGet, callback: BodyResponseCallback[SchemaSnapshot]): Unit = js.native
  def get(
    params: ParamsResourceSnapshotsGet,
    options: BodyResponseCallback[SchemaSnapshot],
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  def get(params: ParamsResourceSnapshotsGet, options: MethodOptions): GaxiosPromise[SchemaSnapshot] = js.native
  def get(
    params: ParamsResourceSnapshotsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshot]
  ): Unit = js.native
  /**
    * games.snapshots.list
    * @desc Retrieves a list of snapshots created by your application for the
    * player corresponding to the player ID.
    * @alias games.snapshots.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of snapshot resources to return in the response, used for paging. For any response, the actual number of snapshot resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSnapshotListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(params: ParamsResourceSnapshotsList): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(params: ParamsResourceSnapshotsList, callback: BodyResponseCallback[SchemaSnapshotListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSnapshotsList,
    options: BodyResponseCallback[SchemaSnapshotListResponse],
    callback: BodyResponseCallback[SchemaSnapshotListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSnapshotsList, options: MethodOptions): GaxiosPromise[SchemaSnapshotListResponse] = js.native
  def list(
    params: ParamsResourceSnapshotsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSnapshotListResponse]
  ): Unit = js.native
}

