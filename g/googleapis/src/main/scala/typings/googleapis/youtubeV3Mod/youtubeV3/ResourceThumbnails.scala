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

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Thumbnails")
@js.native
open class ResourceThumbnails protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def set(): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(callback: BodyResponseCallback[SchemaThumbnailSetResponse]): Unit = js.native
  def set(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(params: ParamsResourceThumbnailsSet): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(params: ParamsResourceThumbnailsSet, callback: BodyResponseCallback[SchemaThumbnailSetResponse]): Unit = js.native
  def set(
    params: ParamsResourceThumbnailsSet,
    options: BodyResponseCallback[Readable | SchemaThumbnailSetResponse],
    callback: BodyResponseCallback[Readable | SchemaThumbnailSetResponse]
  ): Unit = js.native
  def set(params: ParamsResourceThumbnailsSet, options: MethodOptions): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(
    params: ParamsResourceThumbnailsSet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThumbnailSetResponse]
  ): Unit = js.native
  /**
    * As this is not an insert in a strict sense (it supports uploading/setting of a thumbnail for multiple videos, which doesn't result in creation of a single resource), I use a custom verb here.
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
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtube.upload',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.thumbnails.set({
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // Returns the Thumbnail with the given video IDs for Stubby or Apiary.
    *     videoId: 'placeholder-value',
    *
    *     requestBody: {
    *       // request body parameters
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
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
  def set(params: ParamsResourceThumbnailsSet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def set(
    params: ParamsResourceThumbnailsSet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
