package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Superchatevents")
@js.native
class ResourceSuperchatevents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.superChatEvents.list
    * @desc Lists Super Chat events for a channel.
    * @alias youtube.superChatEvents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The parameter value must be a language code included in the list returned by the i18nLanguages.list method.  If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies the superChatEvent resource parts that the API response will include. Supported values are id and snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSuperChatEventListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSuperChatEventListResponse]): Unit = js.native
  def list(params: ParamsResourceSuperchateventsList): GaxiosPromise[SchemaSuperChatEventListResponse] = js.native
  def list(
    params: ParamsResourceSuperchateventsList,
    callback: BodyResponseCallback[SchemaSuperChatEventListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSuperchateventsList,
    options: BodyResponseCallback[SchemaSuperChatEventListResponse],
    callback: BodyResponseCallback[SchemaSuperChatEventListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSuperchateventsList, options: MethodOptions): GaxiosPromise[SchemaSuperChatEventListResponse] = js.native
  def list(
    params: ParamsResourceSuperchateventsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSuperChatEventListResponse]
  ): Unit = js.native
}

