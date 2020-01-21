package typings.googleapis.customsearchV1Mod.customsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Resource$Cse$Siterestrict")
@js.native
class ResourceCseSiterestrict protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * search.cse.siterestrict.list
    * @desc Returns metadata about the search performed, metadata about the
    * custom search engine used for the search, and the search results. Uses a
    * small set of url patterns.
    * @alias search.cse.siterestrict.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.c2coff Turns off the translation between zh-CN and zh-TW.
    * @param {string=} params.cr Country restrict(s).
    * @param {string=} params.cx The custom search engine ID to scope this search query
    * @param {string=} params.dateRestrict Specifies all search results are from a time period
    * @param {string=} params.exactTerms Identifies a phrase that all documents in the search results must contain
    * @param {string=} params.excludeTerms Identifies a word or phrase that should not appear in any documents in the search results
    * @param {string=} params.fileType Returns images of a specified type. Some of the allowed values are: bmp, gif, png, jpg, svg, pdf, ...
    * @param {string=} params.filter Controls turning on or off the duplicate content filter.
    * @param {string=} params.gl Geolocation of end user.
    * @param {string=} params.googlehost The local Google domain to use to perform the search.
    * @param {string=} params.highRange Creates a range in form as_nlo value..as_nhi value and attempts to append it to query
    * @param {string=} params.hl Sets the user interface language.
    * @param {string=} params.hq Appends the extra query terms to the query.
    * @param {string=} params.imgColorType Returns black and white, grayscale, or color images: mono, gray, and color.
    * @param {string=} params.imgDominantColor Returns images of a specific dominant color: red, orange, yellow, green, teal, blue, purple, pink, white, gray, black and brown.
    * @param {string=} params.imgSize Returns images of a specified size, where size can be one of: icon, small, medium, large, xlarge, xxlarge, and huge.
    * @param {string=} params.imgType Returns images of a type, which can be one of: clipart, face, lineart, news, and photo.
    * @param {string=} params.linkSite Specifies that all search results should contain a link to a particular URL
    * @param {string=} params.lowRange Creates a range in form as_nlo value..as_nhi value and attempts to append it to query
    * @param {string=} params.lr The language restriction for the search results
    * @param {integer=} params.num Number of search results to return
    * @param {string=} params.orTerms Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms
    * @param {string} params.q Query
    * @param {string=} params.relatedSite Specifies that all search results should be pages that are related to the specified URL
    * @param {string=} params.rights Filters based on licensing. Supported values include: cc_publicdomain, cc_attribute, cc_sharealike, cc_noncommercial, cc_nonderived and combinations of these.
    * @param {string=} params.safe Search safety level
    * @param {string=} params.searchType Specifies the search type: image.
    * @param {string=} params.siteSearch Specifies all search results should be pages from a given site
    * @param {string=} params.siteSearchFilter Controls whether to include or exclude results from the site named in the as_sitesearch parameter
    * @param {string=} params.sort The sort expression to apply to the results
    * @param {integer=} params.start The index of the first result to return
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSearch] = js.native
  def list(callback: BodyResponseCallback[SchemaSearch]): Unit = js.native
  def list(params: ParamsResourceCseSiterestrictList): GaxiosPromise[SchemaSearch] = js.native
  def list(params: ParamsResourceCseSiterestrictList, callback: BodyResponseCallback[SchemaSearch]): Unit = js.native
  def list(
    params: ParamsResourceCseSiterestrictList,
    options: BodyResponseCallback[SchemaSearch],
    callback: BodyResponseCallback[SchemaSearch]
  ): Unit = js.native
  def list(params: ParamsResourceCseSiterestrictList, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
  def list(
    params: ParamsResourceCseSiterestrictList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearch]
  ): Unit = js.native
}

