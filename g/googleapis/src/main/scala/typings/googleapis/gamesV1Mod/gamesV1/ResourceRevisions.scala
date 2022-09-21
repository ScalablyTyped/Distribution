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

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Revisions")
@js.native
open class ResourceRevisions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def check(): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(callback: BodyResponseCallback[SchemaRevisionCheckResponse]): Unit = js.native
  def check(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(params: ParamsResourceRevisionsCheck): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(params: ParamsResourceRevisionsCheck, callback: BodyResponseCallback[SchemaRevisionCheckResponse]): Unit = js.native
  def check(
    params: ParamsResourceRevisionsCheck,
    options: BodyResponseCallback[Readable | SchemaRevisionCheckResponse],
    callback: BodyResponseCallback[Readable | SchemaRevisionCheckResponse]
  ): Unit = js.native
  def check(params: ParamsResourceRevisionsCheck, options: MethodOptions): GaxiosPromise[SchemaRevisionCheckResponse] = js.native
  def check(
    params: ParamsResourceRevisionsCheck,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevisionCheckResponse]
  ): Unit = js.native
  /**
    * Checks whether the games client is out of date.
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
    *   const res = await games.revisions.check({
    *     // The revision of the client SDK used by your application. Format: `[PLATFORM_TYPE]:[VERSION_NUMBER]`. Possible values of `PLATFORM_TYPE` are: * `ANDROID` - Client is running the Android SDK. * `IOS` - Client is running the iOS SDK. * `WEB_APP` - Client is running as a Web App.
    *     clientRevision: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "kind": "my_kind",
    *   //   "revisionStatus": "my_revisionStatus"
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
  def check(params: ParamsResourceRevisionsCheck, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def check(
    params: ParamsResourceRevisionsCheck,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
