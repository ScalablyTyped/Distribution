package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Players")
@js.native
class ResourcePlayers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gamesManagement.players.hide
    * @desc Hide the given player's leaderboard scores from the given
    * application. This method is only available to user accounts for your
    * developer console.
    * @alias gamesManagement.players.hide
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def hide(): GaxiosPromise[Unit] = js.native
  def hide(callback: BodyResponseCallback[Unit]): Unit = js.native
  def hide(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def hide(params: ParamsResourcePlayersHide): GaxiosPromise[Unit] = js.native
  def hide(params: ParamsResourcePlayersHide, callback: BodyResponseCallback[Unit]): Unit = js.native
  def hide(
    params: ParamsResourcePlayersHide,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def hide(params: ParamsResourcePlayersHide, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def hide(params: ParamsResourcePlayersHide, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * gamesManagement.players.unhide
    * @desc Unhide the given player's leaderboard scores from the given
    * application. This method is only available to user accounts for your
    * developer console.
    * @alias gamesManagement.players.unhide
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unhide(): GaxiosPromise[Unit] = js.native
  def unhide(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unhide(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unhide(params: ParamsResourcePlayersUnhide): GaxiosPromise[Unit] = js.native
  def unhide(params: ParamsResourcePlayersUnhide, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unhide(
    params: ParamsResourcePlayersUnhide,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def unhide(params: ParamsResourcePlayersUnhide, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unhide(params: ParamsResourcePlayersUnhide, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
}
