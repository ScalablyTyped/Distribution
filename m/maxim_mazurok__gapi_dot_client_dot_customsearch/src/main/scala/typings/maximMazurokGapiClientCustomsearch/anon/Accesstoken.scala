package typings.maximMazurokGapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accesstoken extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * Enables or disables [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/xml_results#chineseSearch). The default value for this parameter
    * is 0 (zero), meaning that the feature is enabled. Supported values are: * `1`: Disabled * `0`: Enabled (default)
    */
  var c2coff: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /**
    * Restricts search results to documents originating in a particular country. You may use [Boolean
    * operators](https://developers.google.com/custom-search/docs/xml_results_appendices#booleanOperators) in the cr parameter's value. Google Search determines the country of a
    * document by analyzing: * the top-level domain (TLD) of the document's URL * the geographic location of the Web server's IP address See the [Country Parameter
    * Values](https://developers.google.com/custom-search/docs/xml_results_appendices#countryCollections) page for a list of valid values for this parameter.
    */
  var cr: js.UndefOr[String] = js.native
  
  /** The Programmable Search Engine ID to use for this request. */
  var cx: js.UndefOr[String] = js.native
  
  /**
    * Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results from
    * the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number of past
    * years.
    */
  var dateRestrict: js.UndefOr[String] = js.native
  
  /** Identifies a phrase that all documents in the search results must contain. */
  var exactTerms: js.UndefOr[String] = js.native
  
  /** Identifies a word or phrase that should not appear in any documents in the search results. */
  var excludeTerms: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * Restricts results to files of a specified extension. A list of file types indexable by Google can be found in Search Console [Help
    * Center](https://support.google.com/webmasters/answer/35287).
    */
  var fileType: js.UndefOr[String] = js.native
  
  /**
    * Controls turning on or off the duplicate content filter. * See [Automatic Filtering](https://developers.google.com/custom-search/docs/xml_results#automaticFiltering) for more
    * information about Google's search results filters. Note that host crowding filtering applies only to multi-site searches. * By default, Google applies filtering to all search
    * results to improve the quality of those results. Acceptable values are: * `0`: Turns off duplicate content filter. * `1`: Turns on duplicate content filter.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Geolocation of end user. * The `gl` parameter value is a two-letter country code. The `gl` parameter boosts search results whose country of origin matches the parameter value.
    * See the [Country Codes](https://developers.google.com/custom-search/docs/xml_results_appendices#countryCodes) page for a list of valid values. * Specifying a `gl` parameter
    * value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in English- speaking countries other
    * than the United States.
    */
  var gl: js.UndefOr[String] = js.native
  
  /** **Deprecated**. Use the `gl` parameter for a similar effect. The local Google domain (for example, google.com, google.de, or google.fr) to use to perform the search. */
  var googlehost: js.UndefOr[String] = js.native
  
  /** Specifies the ending value for a search range. * Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query. */
  var highRange: js.UndefOr[String] = js.native
  
  /**
    * Sets the user interface language. * Explicitly setting this parameter improves the performance and the quality of your search results. * See the [Interface
    * Languages](https://developers.google.com/custom-search/docs/xml_results#wsInterfaceLanguages) section of [Internationalizing Queries and Results
    * Presentation](https://developers.google.com/custom-search/docs/xml_results#wsInternationalizing) for more information, and (Supported Interface
    * Languages)[https://developers.google.com/custom-search/docs/xml_results_appendices#interfaceLanguages] for a list of supported languages.
    */
  var hl: js.UndefOr[String] = js.native
  
  /** Appends the specified query terms to the query, as if they were combined with a logical AND operator. */
  var hq: js.UndefOr[String] = js.native
  
  /** Returns black and white, grayscale, transparent, or color images. Acceptable values are: * `"color"` * `"gray"` * `"mono"`: black and white * `"trans"`: transparent background */
  var imgColorType: js.UndefOr[String] = js.native
  
  /**
    * Returns images of a specific dominant color. Acceptable values are: * `"black"` * `"blue"` * `"brown"` * `"gray"` * `"green"` * `"orange"` * `"pink"` * `"purple"` * `"red"` *
    * `"teal"` * `"white"` * `"yellow"`
    */
  var imgDominantColor: js.UndefOr[String] = js.native
  
  /** Returns images of a specified size. Acceptable values are: * `"huge"` * `"icon"` * `"large"` * `"medium"` * `"small"` * `"xlarge"` * `"xxlarge"` */
  var imgSize: js.UndefOr[String] = js.native
  
  /** Returns images of a type. Acceptable values are: * `"clipart"` * `"face"` * `"lineart"` * `"stock"` * `"photo"` * `"animated"` */
  var imgType: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Specifies that all search results should contain a link to a particular URL. */
  var linkSite: js.UndefOr[String] = js.native
  
  /** Specifies the starting value for a search range. Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query. */
  var lowRange: js.UndefOr[String] = js.native
  
  /**
    * Restricts the search to documents written in a particular language (e.g., `lr=lang_ja`). Acceptable values are: * `"lang_ar"`: Arabic * `"lang_bg"`: Bulgarian * `"lang_ca"`:
    * Catalan * `"lang_cs"`: Czech * `"lang_da"`: Danish * `"lang_de"`: German * `"lang_el"`: Greek * `"lang_en"`: English * `"lang_es"`: Spanish * `"lang_et"`: Estonian *
    * `"lang_fi"`: Finnish * `"lang_fr"`: French * `"lang_hr"`: Croatian * `"lang_hu"`: Hungarian * `"lang_id"`: Indonesian * `"lang_is"`: Icelandic * `"lang_it"`: Italian *
    * `"lang_iw"`: Hebrew * `"lang_ja"`: Japanese * `"lang_ko"`: Korean * `"lang_lt"`: Lithuanian * `"lang_lv"`: Latvian * `"lang_nl"`: Dutch * `"lang_no"`: Norwegian * `"lang_pl"`:
    * Polish * `"lang_pt"`: Portuguese * `"lang_ro"`: Romanian * `"lang_ru"`: Russian * `"lang_sk"`: Slovak * `"lang_sl"`: Slovenian * `"lang_sr"`: Serbian * `"lang_sv"`: Swedish *
    * `"lang_tr"`: Turkish * `"lang_zh-CN"`: Chinese (Simplified) * `"lang_zh-TW"`: Chinese (Traditional)
    */
  var lr: js.UndefOr[String] = js.native
  
  /** Number of search results to return. * Valid values are integers between 1 and 10, inclusive. */
  var num: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms. */
  var orTerms: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Query */
  var q: js.UndefOr[String] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Specifies that all search results should be pages that are related to the specified URL. */
  var relatedSite: js.UndefOr[String] = js.native
  
  /**
    * Filters based on licensing. Supported values include: `cc_publicdomain`, `cc_attribute`, `cc_sharealike`, `cc_noncommercial`, `cc_nonderived` and combinations of these. See
    * [typical combinations](https://wiki.creativecommons.org/wiki/CC_Search_integration).
    */
  var rights: js.UndefOr[String] = js.native
  
  /** Search safety level. Acceptable values are: * `"active"`: Enables SafeSearch filtering. * `"off"`: Disables SafeSearch filtering. (default) */
  var safe: js.UndefOr[String] = js.native
  
  /** Specifies the search type: `image`. If unspecified, results are limited to webpages. Acceptable values are: * `"image"`: custom image search. */
  var searchType: js.UndefOr[String] = js.native
  
  /** Specifies a given site which should always be included or excluded from results (see `siteSearchFilter` parameter, below). */
  var siteSearch: js.UndefOr[String] = js.native
  
  /** Controls whether to include or exclude results from the site named in the `siteSearch` parameter. Acceptable values are: * `"e"`: exclude * `"i"`: include */
  var siteSearchFilter: js.UndefOr[String] = js.native
  
  /**
    * The sort expression to apply to the results. The sort parameter specifies that the results be sorted according to the specified expression i.e. sort by date. [Example:
    * sort=date](https://developers.google.com/custom-search/docs/structured_search#sort-by-attribute).
    */
  var sort: js.UndefOr[String] = js.native
  
  /**
    * The index of the first result to return. The default number of results per page is 10, so `&start=11` would start at the top of the second page of results. **Note**: The JSON
    * API will never return more than 100 results, even if more than 100 documents match the query, so setting the sum of `start + num` to a number greater than 100 will produce an
    * error. Also note that the maximum value for `num` is 10.
    */
  var start: js.UndefOr[Double] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object Accesstoken {
  
  @scala.inline
  def apply(): Accesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit class AccesstokenOps[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
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
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setC2coff(value: String): Self = this.set("c2coff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC2coff: Self = this.set("c2coff", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
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
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOrTerms(value: String): Self = this.set("orTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrTerms: Self = this.set("orTerms", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
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
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
