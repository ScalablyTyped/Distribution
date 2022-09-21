package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Players")
@js.native
open class ResourcePlayers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def hide(): GaxiosPromise[Unit] = js.native
  def hide(callback: BodyResponseCallback[Unit]): Unit = js.native
  def hide(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def hide(params: ParamsResourcePlayersHide): GaxiosPromise[Unit] = js.native
  def hide(params: ParamsResourcePlayersHide, callback: BodyResponseCallback[Unit]): Unit = js.native
  def hide(
    params: ParamsResourcePlayersHide,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def hide(params: ParamsResourcePlayersHide, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def hide(params: ParamsResourcePlayersHide, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesManagement.players.hide({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *     // A player ID. A value of `me` may be used in place of the authenticated player's ID.
    *     playerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def hide(params: ParamsResourcePlayersHide, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def hide(
    params: ParamsResourcePlayersHide,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unhide(): GaxiosPromise[Unit] = js.native
  def unhide(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unhide(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unhide(params: ParamsResourcePlayersUnhide): GaxiosPromise[Unit] = js.native
  def unhide(params: ParamsResourcePlayersUnhide, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unhide(
    params: ParamsResourcePlayersUnhide,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def unhide(params: ParamsResourcePlayersUnhide, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unhide(params: ParamsResourcePlayersUnhide, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesManagement.players.unhide({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *     // A player ID. A value of `me` may be used in place of the authenticated player's ID.
    *     playerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def unhide(params: ParamsResourcePlayersUnhide, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unhide(
    params: ParamsResourcePlayersUnhide,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
