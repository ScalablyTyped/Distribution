package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Pushtokens")
@js.native
class ResourcePushtokens protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * games.pushtokens.remove
    * @desc Removes a push token for the current user and application. Removing
    * a non-existent push token will report success.
    * @alias games.pushtokens.remove
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PushTokenId} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def remove(): GaxiosPromise[Unit] = js.native
  def remove(callback: BodyResponseCallback[Unit]): Unit = js.native
  def remove(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def remove(params: ParamsResourcePushtokensRemove): GaxiosPromise[Unit] = js.native
  def remove(params: ParamsResourcePushtokensRemove, callback: BodyResponseCallback[Unit]): Unit = js.native
  def remove(
    params: ParamsResourcePushtokensRemove,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def remove(params: ParamsResourcePushtokensRemove, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def remove(
    params: ParamsResourcePushtokensRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * games.pushtokens.update
    * @desc Registers a push token for the current user and application.
    * @alias games.pushtokens.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PushToken} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Unit] = js.native
  def update(callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def update(params: ParamsResourcePushtokensUpdate): GaxiosPromise[Unit] = js.native
  def update(params: ParamsResourcePushtokensUpdate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(
    params: ParamsResourcePushtokensUpdate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def update(params: ParamsResourcePushtokensUpdate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def update(
    params: ParamsResourcePushtokensUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
