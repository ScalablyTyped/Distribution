package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Guidecategories")
@js.native
class ResourceGuidecategories protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.guideCategories.list
    * @desc Returns a list of categories that can be associated with YouTube
    * channels.
    * @alias youtube.guideCategories.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that will be used for text values in the API response.
    * @param {string=} params.id The id parameter specifies a comma-separated list of the YouTube channel category ID(s) for the resource(s) that are being retrieved. In a guideCategory resource, the id property specifies the YouTube channel category ID.
    * @param {string} params.part The part parameter specifies the guideCategory resource properties that the API response will include. Set the parameter value to snippet.
    * @param {string=} params.regionCode The regionCode parameter instructs the API to return the list of guide categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGuideCategoryListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGuideCategoryListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGuideCategoryListResponse] = js.native
  def list(params: ParamsResourceGuidecategoriesList): GaxiosPromise[SchemaGuideCategoryListResponse] = js.native
  def list(
    params: ParamsResourceGuidecategoriesList,
    callback: BodyResponseCallback[SchemaGuideCategoryListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGuidecategoriesList,
    options: BodyResponseCallback[SchemaGuideCategoryListResponse],
    callback: BodyResponseCallback[SchemaGuideCategoryListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGuidecategoriesList, options: MethodOptions): GaxiosPromise[SchemaGuideCategoryListResponse] = js.native
  def list(
    params: ParamsResourceGuidecategoriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuideCategoryListResponse]
  ): Unit = js.native
}
