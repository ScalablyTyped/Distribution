package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Membershipslevels")
@js.native
open class ResourceMembershipslevels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaMembershipsLevelListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaMembershipsLevelListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMembershipsLevelListResponse] = js.native
  def list(params: ParamsResourceMembershipslevelsList): GaxiosPromise[SchemaMembershipsLevelListResponse] = js.native
  def list(
    params: ParamsResourceMembershipslevelsList,
    callback: BodyResponseCallback[SchemaMembershipsLevelListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMembershipslevelsList,
    options: BodyResponseCallback[Readable | SchemaMembershipsLevelListResponse],
    callback: BodyResponseCallback[Readable | SchemaMembershipsLevelListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMembershipslevelsList, options: MethodOptions): GaxiosPromise[SchemaMembershipsLevelListResponse] = js.native
  def list(
    params: ParamsResourceMembershipslevelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembershipsLevelListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of all pricing levels offered by a creator to the fans.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube.channel-memberships.creator',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.membershipsLevels.list({
    *     // The *part* parameter specifies the membershipsLevel resource parts that the API response will include. Supported values are id and snippet.
    *     part: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "eventId": "my_eventId",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "visitorId": "my_visitorId"
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
  def list(params: ParamsResourceMembershipslevelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMembershipslevelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
