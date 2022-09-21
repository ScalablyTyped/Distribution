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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Stats")
@js.native
open class ResourceStats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaStatsResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaStatsResponse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStatsResponse] = js.native
  def get(params: ParamsResourceStatsGet): GaxiosPromise[SchemaStatsResponse] = js.native
  def get(params: ParamsResourceStatsGet, callback: BodyResponseCallback[SchemaStatsResponse]): Unit = js.native
  def get(
    params: ParamsResourceStatsGet,
    options: BodyResponseCallback[Readable | SchemaStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaStatsResponse]
  ): Unit = js.native
  def get(params: ParamsResourceStatsGet, options: MethodOptions): GaxiosPromise[SchemaStatsResponse] = js.native
  def get(
    params: ParamsResourceStatsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStatsResponse]
  ): Unit = js.native
  /**
    * Returns engagement and spend statistics in this application for the currently authenticated user.
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
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await games.stats.get({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "avg_session_length_minutes": {},
    *   //   "churn_probability": {},
    *   //   "days_since_last_played": 0,
    *   //   "high_spender_probability": {},
    *   //   "kind": "my_kind",
    *   //   "num_purchases": 0,
    *   //   "num_sessions": 0,
    *   //   "num_sessions_percentile": {},
    *   //   "spend_percentile": {},
    *   //   "spend_probability": {},
    *   //   "total_spend_next_28_days": {}
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
  def get(params: ParamsResourceStatsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceStatsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
