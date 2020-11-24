package typings.googleapis.customsearchV1Mod.customsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCseList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Turns off the translation between zh-CN and zh-TW.
    */
  var c2coff: js.UndefOr[String] = js.native
  
  /**
    * Country restrict(s).
    */
  var cr: js.UndefOr[String] = js.native
  
  /**
    * The custom search engine ID to scope this search query
    */
  var cx: js.UndefOr[String] = js.native
  
  /**
    * Specifies all search results are from a time period
    */
  var dateRestrict: js.UndefOr[String] = js.native
  
  /**
    * Identifies a phrase that all documents in the search results must contain
    */
  var exactTerms: js.UndefOr[String] = js.native
  
  /**
    * Identifies a word or phrase that should not appear in any documents in
    * the search results
    */
  var excludeTerms: js.UndefOr[String] = js.native
  
  /**
    * Returns images of a specified type. Some of the allowed values are: bmp,
    * gif, png, jpg, svg, pdf, ...
    */
  var fileType: js.UndefOr[String] = js.native
  
  /**
    * Controls turning on or off the duplicate content filter.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Geolocation of end user.
    */
  var gl: js.UndefOr[String] = js.native
  
  /**
    * The local Google domain to use to perform the search.
    */
  var googlehost: js.UndefOr[String] = js.native
  
  /**
    * Creates a range in form as_nlo value..as_nhi value and attempts to append
    * it to query
    */
  var highRange: js.UndefOr[String] = js.native
  
  /**
    * Sets the user interface language.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * Appends the extra query terms to the query.
    */
  var hq: js.UndefOr[String] = js.native
  
  /**
    * Returns black and white, grayscale, or color images: mono, gray, and
    * color.
    */
  var imgColorType: js.UndefOr[String] = js.native
  
  /**
    * Returns images of a specific dominant color: red, orange, yellow, green,
    * teal, blue, purple, pink, white, gray, black and brown.
    */
  var imgDominantColor: js.UndefOr[String] = js.native
  
  /**
    * Returns images of a specified size, where size can be one of: icon,
    * small, medium, large, xlarge, xxlarge, and huge.
    */
  var imgSize: js.UndefOr[String] = js.native
  
  /**
    * Returns images of a type, which can be one of: clipart, face, lineart,
    * news, and photo.
    */
  var imgType: js.UndefOr[String] = js.native
  
  /**
    * Specifies that all search results should contain a link to a particular
    * URL
    */
  var linkSite: js.UndefOr[String] = js.native
  
  /**
    * Creates a range in form as_nlo value..as_nhi value and attempts to append
    * it to query
    */
  var lowRange: js.UndefOr[String] = js.native
  
  /**
    * The language restriction for the search results
    */
  var lr: js.UndefOr[String] = js.native
  
  /**
    * Number of search results to return
    */
  var num: js.UndefOr[Double] = js.native
  
  /**
    * Provides additional search terms to check for in a document, where each
    * document in the search results must contain at least one of the
    * additional search terms
    */
  var orTerms: js.UndefOr[String] = js.native
  
  /**
    * Query
    */
  var q: js.UndefOr[String] = js.native
  
  /**
    * Specifies that all search results should be pages that are related to the
    * specified URL
    */
  var relatedSite: js.UndefOr[String] = js.native
  
  /**
    * Filters based on licensing. Supported values include: cc_publicdomain,
    * cc_attribute, cc_sharealike, cc_noncommercial, cc_nonderived and
    * combinations of these.
    */
  var rights: js.UndefOr[String] = js.native
  
  /**
    * Search safety level
    */
  var safe: js.UndefOr[String] = js.native
  
  /**
    * Specifies the search type: image.
    */
  var searchType: js.UndefOr[String] = js.native
  
  /**
    * Specifies all search results should be pages from a given site
    */
  var siteSearch: js.UndefOr[String] = js.native
  
  /**
    * Controls whether to include or exclude results from the site named in the
    * as_sitesearch parameter
    */
  var siteSearchFilter: js.UndefOr[String] = js.native
  
  /**
    * The sort expression to apply to the results
    */
  var sort: js.UndefOr[String] = js.native
  
  /**
    * The index of the first result to return
    */
  var start: js.UndefOr[Double] = js.native
}
object ParamsResourceCseList {
  
  @scala.inline
  def apply(): ParamsResourceCseList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCseList]
  }
  
  @scala.inline
  implicit class ParamsResourceCseListOps[Self <: ParamsResourceCseList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setC2coff(value: String): Self = this.set("c2coff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC2coff: Self = this.set("c2coff", js.undefined)
    
    @scala.inline
    def setCr(value: String): Self = this.set("cr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCr: Self = this.set("cr", js.undefined)
    
    @scala.inline
    def setCx(value: String): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setDateRestrict(value: String): Self = this.set("dateRestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRestrict: Self = this.set("dateRestrict", js.undefined)
    
    @scala.inline
    def setExactTerms(value: String): Self = this.set("exactTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactTerms: Self = this.set("exactTerms", js.undefined)
    
    @scala.inline
    def setExcludeTerms(value: String): Self = this.set("excludeTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeTerms: Self = this.set("excludeTerms", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGl(value: String): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGl: Self = this.set("gl", js.undefined)
    
    @scala.inline
    def setGooglehost(value: String): Self = this.set("googlehost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglehost: Self = this.set("googlehost", js.undefined)
    
    @scala.inline
    def setHighRange(value: String): Self = this.set("highRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighRange: Self = this.set("highRange", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    
    @scala.inline
    def setHq(value: String): Self = this.set("hq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHq: Self = this.set("hq", js.undefined)
    
    @scala.inline
    def setImgColorType(value: String): Self = this.set("imgColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgColorType: Self = this.set("imgColorType", js.undefined)
    
    @scala.inline
    def setImgDominantColor(value: String): Self = this.set("imgDominantColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgDominantColor: Self = this.set("imgDominantColor", js.undefined)
    
    @scala.inline
    def setImgSize(value: String): Self = this.set("imgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgSize: Self = this.set("imgSize", js.undefined)
    
    @scala.inline
    def setImgType(value: String): Self = this.set("imgType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgType: Self = this.set("imgType", js.undefined)
    
    @scala.inline
    def setLinkSite(value: String): Self = this.set("linkSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkSite: Self = this.set("linkSite", js.undefined)
    
    @scala.inline
    def setLowRange(value: String): Self = this.set("lowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowRange: Self = this.set("lowRange", js.undefined)
    
    @scala.inline
    def setLr(value: String): Self = this.set("lr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLr: Self = this.set("lr", js.undefined)
    
    @scala.inline
    def setNum(value: Double): Self = this.set("num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum: Self = this.set("num", js.undefined)
    
    @scala.inline
    def setOrTerms(value: String): Self = this.set("orTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrTerms: Self = this.set("orTerms", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setRelatedSite(value: String): Self = this.set("relatedSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedSite: Self = this.set("relatedSite", js.undefined)
    
    @scala.inline
    def setRights(value: String): Self = this.set("rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRights: Self = this.set("rights", js.undefined)
    
    @scala.inline
    def setSafe(value: String): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setSearchType(value: String): Self = this.set("searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchType: Self = this.set("searchType", js.undefined)
    
    @scala.inline
    def setSiteSearch(value: String): Self = this.set("siteSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSearch: Self = this.set("siteSearch", js.undefined)
    
    @scala.inline
    def setSiteSearchFilter(value: String): Self = this.set("siteSearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSearchFilter: Self = this.set("siteSearchFilter", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
