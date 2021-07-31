package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Thumbnails")
@js.native
class ResourceThumbnails protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.thumbnails.set
    * @desc Uploads a custom video thumbnail to YouTube and sets it for a
    * video.
    * @alias youtube.thumbnails.set
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string} params.videoId The videoId parameter specifies a YouTube video ID for which the custom video thumbnail is being provided.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def set(): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(callback: BodyResponseCallback[SchemaThumbnailSetResponse]): Unit = js.native
  def set(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(params: ParamsResourceThumbnailsSet): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(params: ParamsResourceThumbnailsSet, callback: BodyResponseCallback[SchemaThumbnailSetResponse]): Unit = js.native
  def set(
    params: ParamsResourceThumbnailsSet,
    options: BodyResponseCallback[SchemaThumbnailSetResponse],
    callback: BodyResponseCallback[SchemaThumbnailSetResponse]
  ): Unit = js.native
  def set(params: ParamsResourceThumbnailsSet, options: MethodOptions): GaxiosPromise[SchemaThumbnailSetResponse] = js.native
  def set(
    params: ParamsResourceThumbnailsSet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThumbnailSetResponse]
  ): Unit = js.native
}
