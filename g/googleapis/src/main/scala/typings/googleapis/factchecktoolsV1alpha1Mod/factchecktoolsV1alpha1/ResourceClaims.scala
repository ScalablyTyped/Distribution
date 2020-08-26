package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/factchecktools/v1alpha1", "factchecktools_v1alpha1.Resource$Claims")
@js.native
class ResourceClaims protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * factchecktools.claims.search
    * @desc Search through fact-checked claims.
    * @alias factchecktools.claims.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode The BCP-47 language code, such as "en-US" or "sr-Latn". Can be used to restrict results by language, though we do not currently consider the region.
    * @param {integer=} params.maxAgeDays The maximum age of the returned search results, in days. Age is determined by either claim date or review date, whichever is newer.
    * @param {integer=} params.offset An integer that specifies the current offset (that is, starting result location) in search results. This field is only considered if `page_token` is unset. For example, 0 means to return results starting from the first matching result, and 10 means to return from the 11th result.
    * @param {integer=} params.pageSize The pagination size. We will return up to that many results. Defaults to 10 if not set.
    * @param {string=} params.pageToken The pagination token. You may provide the `next_page_token` returned from a previous List request, if any, in order to get the next page. All other fields must have the same values as in the previous request.
    * @param {string=} params.query Textual query string. Required unless `review_publisher_site_filter` is specified.
    * @param {string=} params.reviewPublisherSiteFilter The review publisher site to filter results by, e.g. nytimes.com.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  ): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(params: ParamsResourceClaimsSearch): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(
    params: ParamsResourceClaimsSearch,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceClaimsSearch,
    options: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse],
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceClaimsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(
    params: ParamsResourceClaimsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  ): Unit = js.native
}

