package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Sponsors")
@js.native
class ResourceSponsors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.sponsors.list
    * @desc Lists sponsors for a channel.
    * @alias youtube.sponsors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter parameter specifies which channel sponsors to return.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies the sponsor resource parts that the API response will include. Supported values are id and snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSponsorListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSponsorListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSponsorListResponse] = js.native
  def list(params: ParamsResourceSponsorsList): GaxiosPromise[SchemaSponsorListResponse] = js.native
  def list(params: ParamsResourceSponsorsList, callback: BodyResponseCallback[SchemaSponsorListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSponsorsList,
    options: BodyResponseCallback[SchemaSponsorListResponse],
    callback: BodyResponseCallback[SchemaSponsorListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSponsorsList, options: MethodOptions): GaxiosPromise[SchemaSponsorListResponse] = js.native
  def list(
    params: ParamsResourceSponsorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSponsorListResponse]
  ): Unit = js.native
}
