package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Resource$Audiences")
@js.native
class ResourceAudiences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * plusDomains.audiences.list
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.audiences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of circles to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string} params.userId The ID of the user to get audiences for. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAudiencesFeed] = js.native
  def list(callback: BodyResponseCallback[SchemaAudiencesFeed]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAudiencesFeed] = js.native
  def list(params: ParamsResourceAudiencesList): GaxiosPromise[SchemaAudiencesFeed] = js.native
  def list(params: ParamsResourceAudiencesList, callback: BodyResponseCallback[SchemaAudiencesFeed]): Unit = js.native
  def list(
    params: ParamsResourceAudiencesList,
    options: BodyResponseCallback[SchemaAudiencesFeed],
    callback: BodyResponseCallback[SchemaAudiencesFeed]
  ): Unit = js.native
  def list(params: ParamsResourceAudiencesList, options: MethodOptions): GaxiosPromise[SchemaAudiencesFeed] = js.native
  def list(
    params: ParamsResourceAudiencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAudiencesFeed]
  ): Unit = js.native
}
