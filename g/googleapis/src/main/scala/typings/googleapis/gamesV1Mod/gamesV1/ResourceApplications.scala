package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Applications")
@js.native
class ResourceApplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * games.applications.get
    * @desc Retrieves the metadata of the application with the given ID. If the
    * requested application is not available for the specified platformType,
    * the returned response will not include any instance data.
    * @alias games.applications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string=} params.platformType Restrict application details returned to the specific platform.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceApplicationsGet, callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: BodyResponseCallback[SchemaApplication],
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceApplicationsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceApplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  
  /**
    * games.applications.played
    * @desc Indicate that the the currently authenticated user is playing your
    * application.
    * @alias games.applications.played
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.builtinGameId Override used only by built-in games in Play Games application.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def played(): GaxiosPromise[Unit] = js.native
  def played(callback: BodyResponseCallback[Unit]): Unit = js.native
  def played(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def played(params: ParamsResourceApplicationsPlayed): GaxiosPromise[Unit] = js.native
  def played(params: ParamsResourceApplicationsPlayed, callback: BodyResponseCallback[Unit]): Unit = js.native
  def played(
    params: ParamsResourceApplicationsPlayed,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def played(params: ParamsResourceApplicationsPlayed, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def played(
    params: ParamsResourceApplicationsPlayed,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * games.applications.verify
    * @desc Verifies the auth token provided with this request is for the
    * application with the specified ID, and returns the ID of the player it
    * was granted for.
    * @alias games.applications.verify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verify(): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(callback: BodyResponseCallback[SchemaApplicationVerifyResponse]): Unit = js.native
  def verify(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(params: ParamsResourceApplicationsVerify): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(
    params: ParamsResourceApplicationsVerify,
    callback: BodyResponseCallback[SchemaApplicationVerifyResponse]
  ): Unit = js.native
  def verify(
    params: ParamsResourceApplicationsVerify,
    options: BodyResponseCallback[SchemaApplicationVerifyResponse],
    callback: BodyResponseCallback[SchemaApplicationVerifyResponse]
  ): Unit = js.native
  def verify(params: ParamsResourceApplicationsVerify, options: MethodOptions): GaxiosPromise[SchemaApplicationVerifyResponse] = js.native
  def verify(
    params: ParamsResourceApplicationsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplicationVerifyResponse]
  ): Unit = js.native
}
