package typings.googleapis.v2Mod.androidpublisherV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Tracks")
@js.native
class ResourceEditsTracks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidpublisher.edits.tracks.get
    * @desc Fetches the track configuration for the specified track type.
    * Includes the APK version codes that are in this track.
    * @alias androidpublisher.edits.tracks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTrack] = js.native
  def get(callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def get(params: ParamsResourceEditsTracksGet): GaxiosPromise[SchemaTrack] = js.native
  def get(params: ParamsResourceEditsTracksGet, callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def get(
    params: ParamsResourceEditsTracksGet,
    options: BodyResponseCallback[SchemaTrack],
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  def get(params: ParamsResourceEditsTracksGet, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def get(
    params: ParamsResourceEditsTracksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.tracks.list
    * @desc Lists all the track configurations for this edit.
    * @alias androidpublisher.edits.tracks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTracksListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(params: ParamsResourceEditsTracksList): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(params: ParamsResourceEditsTracksList, callback: BodyResponseCallback[SchemaTracksListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsTracksList,
    options: BodyResponseCallback[SchemaTracksListResponse],
    callback: BodyResponseCallback[SchemaTracksListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsTracksList, options: MethodOptions): GaxiosPromise[SchemaTracksListResponse] = js.native
  def list(
    params: ParamsResourceEditsTracksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTracksListResponse]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.tracks.patch
    * @desc Updates the track configuration for the specified track type. When
    * halted, the rollout track cannot be updated without adding new APKs, and
    * adding new APKs will cause it to resume. This method supports patch
    * semantics.
    * @alias androidpublisher.edits.tracks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify.
    * @param {().Track} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTrack] = js.native
  def patch(callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def patch(params: ParamsResourceEditsTracksPatch): GaxiosPromise[SchemaTrack] = js.native
  def patch(params: ParamsResourceEditsTracksPatch, callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def patch(
    params: ParamsResourceEditsTracksPatch,
    options: BodyResponseCallback[SchemaTrack],
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsTracksPatch, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def patch(
    params: ParamsResourceEditsTracksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.tracks.update
    * @desc Updates the track configuration for the specified track type. When
    * halted, the rollout track cannot be updated without adding new APKs, and
    * adding new APKs will cause it to resume.
    * @alias androidpublisher.edits.tracks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify.
    * @param {().Track} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTrack] = js.native
  def update(callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def update(params: ParamsResourceEditsTracksUpdate): GaxiosPromise[SchemaTrack] = js.native
  def update(params: ParamsResourceEditsTracksUpdate, callback: BodyResponseCallback[SchemaTrack]): Unit = js.native
  def update(
    params: ParamsResourceEditsTracksUpdate,
    options: BodyResponseCallback[SchemaTrack],
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
  def update(params: ParamsResourceEditsTracksUpdate, options: MethodOptions): GaxiosPromise[SchemaTrack] = js.native
  def update(
    params: ParamsResourceEditsTracksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrack]
  ): Unit = js.native
}
