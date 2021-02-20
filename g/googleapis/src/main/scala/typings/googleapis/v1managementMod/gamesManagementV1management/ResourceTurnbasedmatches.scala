package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Turnbasedmatches")
@js.native
class ResourceTurnbasedmatches protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gamesManagement.turnBasedMatches.reset
    * @desc Reset all turn-based match data for a user. This method is only
    * accessible to whitelisted tester accounts for your application.
    * @alias gamesManagement.turnBasedMatches.reset
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Unit] = js.native
  def reset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsResourceTurnbasedmatchesReset): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsResourceTurnbasedmatchesReset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(
    params: ParamsResourceTurnbasedmatchesReset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(params: ParamsResourceTurnbasedmatchesReset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(
    params: ParamsResourceTurnbasedmatchesReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gamesManagement.turnBasedMatches.resetForAllPlayers
    * @desc Deletes turn-based matches where the only match participants are
    * from whitelisted tester accounts for your application. This method is
    * only available to user accounts for your developer console.
    * @alias gamesManagement.turnBasedMatches.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceTurnbasedmatchesResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(params: ParamsResourceTurnbasedmatchesResetforallplayers, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(
    params: ParamsResourceTurnbasedmatchesResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsResourceTurnbasedmatchesResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsResourceTurnbasedmatchesResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
