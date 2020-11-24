package typings.maximMazurokGapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends js.Object {
  
  /** Number of search results returned in this set. */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * Restricts search results to documents originating in a particular country. You may use [Boolean
    * operators](https://developers.google.com/custom-search/docs/xml_results#booleanOperators) in the `cr` parameter's value. Google WebSearch determines the country of a
    * document by analyzing the following: * The top-level domain (TLD) of the document's URL. * The geographic location of the web server's IP address. See [Country (cr)
    * Parameter Values](https://developers.google.com/custom-search/docs/xml_results#countryCollections) for a list of valid values for this parameter.
    */
  var cr: js.UndefOr[String] = js.native
  
  /**
    * The identifier of an engine created using the Programmable Search Engine [Control Panel](https://programmablesearchengine.google.com/). This is a custom property not defined
    * in the OpenSearch spec. This parameter is **required**.
    */
  var cx: js.UndefOr[String] = js.native
  
  /**
    * Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results
    * from the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number
    * of past years.
    */
  var dateRestrict: js.UndefOr[String] = js.native
  
  /**
    * Enables or disables the [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/xml_results#chineseSearch) feature. Supported values
    * are: * `0`: enabled (default) * `1`: disabled
    */
  var disableCnTwTranslation: js.UndefOr[String] = js.native
  
  /** Identifies a phrase that all documents in the search results must contain. */
  var exactTerms: js.UndefOr[String] = js.native
  
  /** Identifies a word or phrase that should not appear in any documents in the search results. */
  var excludeTerms: js.UndefOr[String] = js.native
  
  /**
    * Restricts results to files of a specified extension. Filetypes supported by Google include: * Adobe Portable Document Format (`pdf`) * Adobe PostScript (`ps`) * Lotus 1-2-3
    * (`wk1`, `wk2`, `wk3`, `wk4`, `wk5`, `wki`, `wks`, `wku`) * Lotus WordPro (`lwp`) * Macwrite (`mw`) * Microsoft Excel (`xls`) * Microsoft PowerPoint (`ppt`) * Microsoft Word
    * (`doc`) * Microsoft Works (`wks`, `wps`, `wdb`) * Microsoft Write (`wri`) * Rich Text Format (`rtf`) * Shockwave Flash (`swf`) * Text (`ans`, `txt`). Additional filetypes
    * may be added in the future. An up-to-date list can always be found in Google's [file type FAQ](https://support.google.com/webmasters/answer/35287).
    */
  var fileType: js.UndefOr[String] = js.native
  
  /**
    * Activates or deactivates the automatic filtering of Google search results. See [Automatic
    * Filtering](https://developers.google.com/custom-search/docs/xml_results#automaticFiltering) for more information about Google's search results filters. Valid values for this
    * parameter are: * `0`: Disabled * `1`: Enabled (default) **Note**: By default, Google applies filtering to all search results to improve the quality of those results.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Boosts search results whose country of origin matches the parameter value. See [Country Codes](https://developers.google.com/custom-search/docs/xml_results#countryCodes) for
    * a list of valid values. Specifying a `gl` parameter value in WebSearch requests should improve the relevance of results. This is particularly true for international
    * customers and, even more specifically, for customers in English-speaking countries other than the United States.
    */
  var gl: js.UndefOr[String] = js.native
  
  /** Specifies the Google domain (for example, google.com, google.de, or google.fr) to which the search should be limited. */
  var googleHost: js.UndefOr[String] = js.native
  
  /** Specifies the ending value for a search range. Use `cse:lowRange` and `cse:highrange` to append an inclusive search range of `lowRange...highRange` to the query. */
  var highRange: js.UndefOr[String] = js.native
  
  /**
    * Specifies the interface language (host language) of your user interface. Explicitly setting this parameter improves the performance and the quality of your search results.
    * See the [Interface Languages](https://developers.google.com/custom-search/docs/xml_results#wsInterfaceLanguages) section of [Internationalizing Queries and Results
    * Presentation](https://developers.google.com/custom-search/docs/xml_results#wsInternationalizing) for more information, and [Supported Interface
    * Languages](https://developers.google.com/custom-search/docs/xml_results_appendices#interfaceLanguages) for a list of supported languages.
    */
  var hl: js.UndefOr[String] = js.native
  
  /** Appends the specified query terms to the query, as if they were combined with a logical `AND` operator. */
  var hq: js.UndefOr[String] = js.native
  
  /** Restricts results to images of a specified color type. Supported values are: * `mono` (black and white) * `gray` (grayscale) * `color` (color) */
  var imgColorType: js.UndefOr[String] = js.native
  
  /**
    * Restricts results to images with a specific dominant color. Supported values are: * `red` * `orange` * `yellow` * `green` * `teal` * `blue` * `purple` * `pink` * `white` *
    * `gray` * `black` * `brown`
    */
  var imgDominantColor: js.UndefOr[String] = js.native
  
  /**
    * Restricts results to images of a specified size. Supported values are: * `icon` (small) * `small | medium | large | xlarge` (medium) * `xxlarge` (large) * `huge`
    * (extra-large)
    */
  var imgSize: js.UndefOr[String] = js.native
  
  /**
    * Restricts results to images of a specified type. Supported values are: * `clipart` (Clip art) * `face` (Face) * `lineart` (Line drawing) * `photo` (Photo) * `animated`
    * (Animated) * `stock` (Stock)
    */
  var imgType: js.UndefOr[String] = js.native
  
  /** The character encoding supported for search requests. */
  var inputEncoding: js.UndefOr[String] = js.native
  
  /** The language of the search results. */
  var language: js.UndefOr[String] = js.native
  
  /** Specifies that all results should contain a link to a specific URL. */
  var linkSite: js.UndefOr[String] = js.native
  
  /** Specifies the starting value for a search range. Use `cse:lowRange` and `cse:highrange` to append an inclusive search range of `lowRange...highRange` to the query. */
  var lowRange: js.UndefOr[String] = js.native
  
  /**
    * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms. You can also
    * use the [Boolean OR](https://developers.google.com/custom-search/docs/xml_results#BooleanOrqt) query term for this type of query.
    */
  var orTerms: js.UndefOr[String] = js.native
  
  /** The character encoding supported for search results. */
  var outputEncoding: js.UndefOr[String] = js.native
  
  /** Specifies that all search results should be pages that are related to the specified URL. The parameter value should be a URL. */
  var relatedSite: js.UndefOr[String] = js.native
  
  /** Filters based on licensing. Supported values include: * `cc_publicdomain` * `cc_attribute` * `cc_sharealike` * `cc_noncommercial` * `cc_nonderived` */
  var rights: js.UndefOr[String] = js.native
  
  /**
    * Specifies the [SafeSearch level](https://developers.google.com/custom-search/docs/xml_results#safeSearchLevels) used for filtering out adult results. This is a custom
    * property not defined in the OpenSearch spec. Valid parameter values are: * `"off"`: Disable SafeSearch * `"active"`: Enable SafeSearch
    */
  var safe: js.UndefOr[String] = js.native
  
  /** The search terms entered by the user. */
  var searchTerms: js.UndefOr[String] = js.native
  
  /** Allowed values are `web` or `image`. If unspecified, results are limited to webpages. */
  var searchType: js.UndefOr[String] = js.native
  
  /** Restricts results to URLs from a specified site. */
  var siteSearch: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether to include or exclude results from the site named in the `sitesearch` parameter. Supported values are: * `i`: include content from site * `e`: exclude
    * content from site
    */
  var siteSearchFilter: js.UndefOr[String] = js.native
  
  /** Specifies that results should be sorted according to the specified expression. For example, sort by date. */
  var sort: js.UndefOr[String] = js.native
  
  /** The index of the current set of search results into the total set of results, where the index of the first result is 1. */
  var startIndex: js.UndefOr[Double] = js.native
  
  /** The page number of this set of results, where the page length is set by the `count` property. */
  var startPage: js.UndefOr[Double] = js.native
  
  /** A description of the query. */
  var title: js.UndefOr[String] = js.native
  
  /** Estimated number of total search results. May not be accurate. */
  var totalResults: js.UndefOr[String] = js.native
}
object Count {
  
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
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
    def setDisableCnTwTranslation(value: String): Self = this.set("disableCnTwTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCnTwTranslation: Self = this.set("disableCnTwTranslation", js.undefined)
    
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
    def setGoogleHost(value: String): Self = this.set("googleHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleHost: Self = this.set("googleHost", js.undefined)
    
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
    def setInputEncoding(value: String): Self = this.set("inputEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputEncoding: Self = this.set("inputEncoding", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLinkSite(value: String): Self = this.set("linkSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkSite: Self = this.set("linkSite", js.undefined)
    
    @scala.inline
    def setLowRange(value: String): Self = this.set("lowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowRange: Self = this.set("lowRange", js.undefined)
    
    @scala.inline
    def setOrTerms(value: String): Self = this.set("orTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrTerms: Self = this.set("orTerms", js.undefined)
    
    @scala.inline
    def setOutputEncoding(value: String): Self = this.set("outputEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputEncoding: Self = this.set("outputEncoding", js.undefined)
    
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
    def setSearchTerms(value: String): Self = this.set("searchTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTerms: Self = this.set("searchTerms", js.undefined)
    
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
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStartPage(value: Double): Self = this.set("startPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPage: Self = this.set("startPage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTotalResults(value: String): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
}
