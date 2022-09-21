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

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Youtube$V3")
@js.native
open class ResourceYoutubeV3 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def updateCommentThreads(): GaxiosPromise[SchemaCommentThread] = js.native
  def updateCommentThreads(callback: BodyResponseCallback[SchemaCommentThread]): Unit = js.native
  def updateCommentThreads(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentThread] = js.native
  def updateCommentThreads(params: ParamsResourceYoutubeV3Updatecommentthreads): GaxiosPromise[SchemaCommentThread] = js.native
  def updateCommentThreads(
    params: ParamsResourceYoutubeV3Updatecommentthreads,
    callback: BodyResponseCallback[SchemaCommentThread]
  ): Unit = js.native
  def updateCommentThreads(
    params: ParamsResourceYoutubeV3Updatecommentthreads,
    options: BodyResponseCallback[Readable | SchemaCommentThread],
    callback: BodyResponseCallback[Readable | SchemaCommentThread]
  ): Unit = js.native
  def updateCommentThreads(params: ParamsResourceYoutubeV3Updatecommentthreads, options: MethodOptions): GaxiosPromise[SchemaCommentThread] = js.native
  def updateCommentThreads(
    params: ParamsResourceYoutubeV3Updatecommentthreads,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentThread]
  ): Unit = js.native
  /**
    * Updates an existing resource.
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
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.youtube.v3.updateCommentThreads({
    *     // The *part* parameter specifies a comma-separated list of commentThread resource properties that the API response will include. You must at least include the snippet part in the parameter value since that part contains all of the properties that the API request can update.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "replies": {},
    *       //   "snippet": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "replies": {},
    *   //   "snippet": {}
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
  def updateCommentThreads(params: ParamsResourceYoutubeV3Updatecommentthreads, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateCommentThreads(
    params: ParamsResourceYoutubeV3Updatecommentthreads,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
