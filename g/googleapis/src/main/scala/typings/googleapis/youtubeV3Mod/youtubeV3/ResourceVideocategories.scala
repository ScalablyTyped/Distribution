package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Videocategories")
@js.native
class ResourceVideocategories protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.videoCategories.list
    * @desc Returns a list of categories that can be associated with YouTube
    * videos.
    * @alias youtube.videoCategories.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that should be used for text values in the API response.
    * @param {string=} params.id The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving.
    * @param {string} params.part The part parameter specifies the videoCategory resource properties that the API response will include. Set the parameter value to snippet.
    * @param {string=} params.regionCode The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVideoCategoryListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaVideoCategoryListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVideoCategoryListResponse] = js.native
  def list(params: ParamsResourceVideocategoriesList): GaxiosPromise[SchemaVideoCategoryListResponse] = js.native
  def list(
    params: ParamsResourceVideocategoriesList,
    callback: BodyResponseCallback[SchemaVideoCategoryListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceVideocategoriesList,
    options: BodyResponseCallback[SchemaVideoCategoryListResponse],
    callback: BodyResponseCallback[SchemaVideoCategoryListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVideocategoriesList, options: MethodOptions): GaxiosPromise[SchemaVideoCategoryListResponse] = js.native
  def list(
    params: ParamsResourceVideocategoriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoCategoryListResponse]
  ): Unit = js.native
}
