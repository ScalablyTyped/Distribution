package typings.maximMazurokGapiClientCustomsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /**
      * Enables or disables [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/xml_results#chineseSearch). The default value for this parameter
      * is 0 (zero), meaning that the feature is enabled. Supported values are: * `1`: Disabled * `0`: Enabled (default)
      */
    var c2coff: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts search results to documents originating in a particular country. You may use [Boolean
      * operators](https://developers.google.com/custom-search/docs/xml_results_appendices#booleanOperators) in the cr parameter's value. Google Search determines the country of a
      * document by analyzing: * the top-level domain (TLD) of the document's URL * the geographic location of the Web server's IP address See the [Country Parameter
      * Values](https://developers.google.com/custom-search/docs/xml_results_appendices#countryCollections) page for a list of valid values for this parameter.
      */
    var cr: js.UndefOr[String] = js.undefined
    
    /** The Programmable Search Engine ID to use for this request. */
    var cx: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results from
      * the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number of past
      * years.
      */
    var dateRestrict: js.UndefOr[String] = js.undefined
    
    /** Identifies a phrase that all documents in the search results must contain. */
    var exactTerms: js.UndefOr[String] = js.undefined
    
    /** Identifies a word or phrase that should not appear in any documents in the search results. */
    var excludeTerms: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts results to files of a specified extension. A list of file types indexable by Google can be found in Search Console [Help
      * Center](https://support.google.com/webmasters/answer/35287).
      */
    var fileType: js.UndefOr[String] = js.undefined
    
    /**
      * Controls turning on or off the duplicate content filter. * See [Automatic Filtering](https://developers.google.com/custom-search/docs/xml_results#automaticFiltering) for more
      * information about Google's search results filters. Note that host crowding filtering applies only to multi-site searches. * By default, Google applies filtering to all search
      * results to improve the quality of those results. Acceptable values are: * `0`: Turns off duplicate content filter. * `1`: Turns on duplicate content filter.
      */
    var filter: js.UndefOr[String] = js.undefined
    
    /**
      * Geolocation of end user. * The `gl` parameter value is a two-letter country code. The `gl` parameter boosts search results whose country of origin matches the parameter value.
      * See the [Country Codes](https://developers.google.com/custom-search/docs/xml_results_appendices#countryCodes) page for a list of valid values. * Specifying a `gl` parameter
      * value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in English- speaking countries other
      * than the United States.
      */
    var gl: js.UndefOr[String] = js.undefined
    
    /** **Deprecated**. Use the `gl` parameter for a similar effect. The local Google domain (for example, google.com, google.de, or google.fr) to use to perform the search. */
    var googlehost: js.UndefOr[String] = js.undefined
    
    /** Specifies the ending value for a search range. * Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query. */
    var highRange: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the user interface language. * Explicitly setting this parameter improves the performance and the quality of your search results. * See the [Interface
      * Languages](https://developers.google.com/custom-search/docs/xml_results#wsInterfaceLanguages) section of [Internationalizing Queries and Results
      * Presentation](https://developers.google.com/custom-search/docs/xml_results#wsInternationalizing) for more information, and (Supported Interface
      * Languages)[https://developers.google.com/custom-search/docs/xml_results_appendices#interfaceLanguages] for a list of supported languages.
      */
    var hl: js.UndefOr[String] = js.undefined
    
    /** Appends the specified query terms to the query, as if they were combined with a logical AND operator. */
    var hq: js.UndefOr[String] = js.undefined
    
    /** Returns black and white, grayscale, transparent, or color images. Acceptable values are: * `"color"` * `"gray"` * `"mono"`: black and white * `"trans"`: transparent background */
    var imgColorType: js.UndefOr[String] = js.undefined
    
    /**
      * Returns images of a specific dominant color. Acceptable values are: * `"black"` * `"blue"` * `"brown"` * `"gray"` * `"green"` * `"orange"` * `"pink"` * `"purple"` * `"red"` *
      * `"teal"` * `"white"` * `"yellow"`
      */
    var imgDominantColor: js.UndefOr[String] = js.undefined
    
    /** Returns images of a specified size. Acceptable values are: * `"huge"` * `"icon"` * `"large"` * `"medium"` * `"small"` * `"xlarge"` * `"xxlarge"` */
    var imgSize: js.UndefOr[String] = js.undefined
    
    /** Returns images of a type. Acceptable values are: * `"clipart"` * `"face"` * `"lineart"` * `"stock"` * `"photo"` * `"animated"` */
    var imgType: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** Specifies that all search results should contain a link to a particular URL. */
    var linkSite: js.UndefOr[String] = js.undefined
    
    /** Specifies the starting value for a search range. Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query. */
    var lowRange: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts the search to documents written in a particular language (e.g., `lr=lang_ja`). Acceptable values are: * `"lang_ar"`: Arabic * `"lang_bg"`: Bulgarian * `"lang_ca"`:
      * Catalan * `"lang_cs"`: Czech * `"lang_da"`: Danish * `"lang_de"`: German * `"lang_el"`: Greek * `"lang_en"`: English * `"lang_es"`: Spanish * `"lang_et"`: Estonian *
      * `"lang_fi"`: Finnish * `"lang_fr"`: French * `"lang_hr"`: Croatian * `"lang_hu"`: Hungarian * `"lang_id"`: Indonesian * `"lang_is"`: Icelandic * `"lang_it"`: Italian *
      * `"lang_iw"`: Hebrew * `"lang_ja"`: Japanese * `"lang_ko"`: Korean * `"lang_lt"`: Lithuanian * `"lang_lv"`: Latvian * `"lang_nl"`: Dutch * `"lang_no"`: Norwegian * `"lang_pl"`:
      * Polish * `"lang_pt"`: Portuguese * `"lang_ro"`: Romanian * `"lang_ru"`: Russian * `"lang_sk"`: Slovak * `"lang_sl"`: Slovenian * `"lang_sr"`: Serbian * `"lang_sv"`: Swedish *
      * `"lang_tr"`: Turkish * `"lang_zh-CN"`: Chinese (Simplified) * `"lang_zh-TW"`: Chinese (Traditional)
      */
    var lr: js.UndefOr[String] = js.undefined
    
    /** Number of search results to return. * Valid values are integers between 1 and 10, inclusive. */
    var num: js.UndefOr[Double] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms. */
    var orTerms: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Query */
    var q: js.UndefOr[String] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Specifies that all search results should be pages that are related to the specified URL. */
    var relatedSite: js.UndefOr[String] = js.undefined
    
    /**
      * Filters based on licensing. Supported values include: `cc_publicdomain`, `cc_attribute`, `cc_sharealike`, `cc_noncommercial`, `cc_nonderived` and combinations of these. See
      * [typical combinations](https://wiki.creativecommons.org/wiki/CC_Search_integration).
      */
    var rights: js.UndefOr[String] = js.undefined
    
    /** Search safety level. Acceptable values are: * `"active"`: Enables SafeSearch filtering. * `"off"`: Disables SafeSearch filtering. (default) */
    var safe: js.UndefOr[String] = js.undefined
    
    /** Specifies the search type: `image`. If unspecified, results are limited to webpages. Acceptable values are: * `"image"`: custom image search. */
    var searchType: js.UndefOr[String] = js.undefined
    
    /** Specifies a given site which should always be included or excluded from results (see `siteSearchFilter` parameter, below). */
    var siteSearch: js.UndefOr[String] = js.undefined
    
    /** Controls whether to include or exclude results from the site named in the `siteSearch` parameter. Acceptable values are: * `"e"`: exclude * `"i"`: include */
    var siteSearchFilter: js.UndefOr[String] = js.undefined
    
    /**
      * The sort expression to apply to the results. The sort parameter specifies that the results be sorted according to the specified expression i.e. sort by date. [Example:
      * sort=date](https://developers.google.com/custom-search/docs/structured_search#sort-by-attribute).
      */
    var sort: js.UndefOr[String] = js.undefined
    
    /**
      * The index of the first result to return. The default number of results per page is 10, so `&start=11` would start at the top of the second page of results. **Note**: The JSON
      * API will never return more than 100 results, even if more than 100 documents match the query, so setting the sum of `start + num` to a number greater than 100 will produce an
      * error. Also note that the maximum value for `num` is 10.
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    @scala.inline
    def apply(): Accesstoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setC2coff(value: String): Self = StObject.set(x, "c2coff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC2coffUndefined: Self = StObject.set(x, "c2coff", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCr(value: String): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrUndefined: Self = StObject.set(x, "cr", js.undefined)
      
      @scala.inline
      def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setDateRestrict(value: String): Self = StObject.set(x, "dateRestrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRestrictUndefined: Self = StObject.set(x, "dateRestrict", js.undefined)
      
      @scala.inline
      def setExactTerms(value: String): Self = StObject.set(x, "exactTerms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactTermsUndefined: Self = StObject.set(x, "exactTerms", js.undefined)
      
      @scala.inline
      def setExcludeTerms(value: String): Self = StObject.set(x, "excludeTerms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeTermsUndefined: Self = StObject.set(x, "excludeTerms", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
      
      @scala.inline
      def setGooglehost(value: String): Self = StObject.set(x, "googlehost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGooglehostUndefined: Self = StObject.set(x, "googlehost", js.undefined)
      
      @scala.inline
      def setHighRange(value: String): Self = StObject.set(x, "highRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighRangeUndefined: Self = StObject.set(x, "highRange", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setHq(value: String): Self = StObject.set(x, "hq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHqUndefined: Self = StObject.set(x, "hq", js.undefined)
      
      @scala.inline
      def setImgColorType(value: String): Self = StObject.set(x, "imgColorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgColorTypeUndefined: Self = StObject.set(x, "imgColorType", js.undefined)
      
      @scala.inline
      def setImgDominantColor(value: String): Self = StObject.set(x, "imgDominantColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgDominantColorUndefined: Self = StObject.set(x, "imgDominantColor", js.undefined)
      
      @scala.inline
      def setImgSize(value: String): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
      
      @scala.inline
      def setImgType(value: String): Self = StObject.set(x, "imgType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgTypeUndefined: Self = StObject.set(x, "imgType", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLinkSite(value: String): Self = StObject.set(x, "linkSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkSiteUndefined: Self = StObject.set(x, "linkSite", js.undefined)
      
      @scala.inline
      def setLowRange(value: String): Self = StObject.set(x, "lowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowRangeUndefined: Self = StObject.set(x, "lowRange", js.undefined)
      
      @scala.inline
      def setLr(value: String): Self = StObject.set(x, "lr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLrUndefined: Self = StObject.set(x, "lr", js.undefined)
      
      @scala.inline
      def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setOrTerms(value: String): Self = StObject.set(x, "orTerms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrTermsUndefined: Self = StObject.set(x, "orTerms", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setRelatedSite(value: String): Self = StObject.set(x, "relatedSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedSiteUndefined: Self = StObject.set(x, "relatedSite", js.undefined)
      
      @scala.inline
      def setRights(value: String): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
      
      @scala.inline
      def setSafe(value: String): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
      
      @scala.inline
      def setSiteSearch(value: String): Self = StObject.set(x, "siteSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteSearchFilter(value: String): Self = StObject.set(x, "siteSearchFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteSearchFilterUndefined: Self = StObject.set(x, "siteSearchFilter", js.undefined)
      
      @scala.inline
      def setSiteSearchUndefined: Self = StObject.set(x, "siteSearch", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait ByteSize extends StObject {
    
    /** The size of the image, in pixels. */
    var byteSize: js.UndefOr[Double] = js.undefined
    
    /** A URL pointing to the webpage hosting the image. */
    var contextLink: js.UndefOr[String] = js.undefined
    
    /** The height of the image, in pixels. */
    var height: js.UndefOr[Double] = js.undefined
    
    /** The height of the thumbnail image, in pixels. */
    var thumbnailHeight: js.UndefOr[Double] = js.undefined
    
    /** A URL to the thumbnail image. */
    var thumbnailLink: js.UndefOr[String] = js.undefined
    
    /** The width of the thumbnail image, in pixels. */
    var thumbnailWidth: js.UndefOr[Double] = js.undefined
    
    /** The width of the image, in pixels. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ByteSize {
    
    @scala.inline
    def apply(): ByteSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteSize]
    }
    
    @scala.inline
    implicit class ByteSizeMutableBuilder[Self <: ByteSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteSizeUndefined: Self = StObject.set(x, "byteSize", js.undefined)
      
      @scala.inline
      def setContextLink(value: String): Self = StObject.set(x, "contextLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextLinkUndefined: Self = StObject.set(x, "contextLink", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setThumbnailHeight(value: Double): Self = StObject.set(x, "thumbnailHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailHeightUndefined: Self = StObject.set(x, "thumbnailHeight", js.undefined)
      
      @scala.inline
      def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
      
      @scala.inline
      def setThumbnailWidth(value: Double): Self = StObject.set(x, "thumbnailWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailWidthUndefined: Self = StObject.set(x, "thumbnailWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CorrectedQuery extends StObject {
    
    /** The corrected query. */
    var correctedQuery: js.UndefOr[String] = js.undefined
    
    /** The corrected query, formatted in HTML. */
    var htmlCorrectedQuery: js.UndefOr[String] = js.undefined
  }
  object CorrectedQuery {
    
    @scala.inline
    def apply(): CorrectedQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CorrectedQuery]
    }
    
    @scala.inline
    implicit class CorrectedQueryMutableBuilder[Self <: CorrectedQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorrectedQuery(value: String): Self = StObject.set(x, "correctedQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrectedQueryUndefined: Self = StObject.set(x, "correctedQuery", js.undefined)
      
      @scala.inline
      def setHtmlCorrectedQuery(value: String): Self = StObject.set(x, "htmlCorrectedQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlCorrectedQueryUndefined: Self = StObject.set(x, "htmlCorrectedQuery", js.undefined)
    }
  }
  
  trait Count extends StObject {
    
    /** Number of search results returned in this set. */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Restricts search results to documents originating in a particular country. You may use [Boolean
      * operators](https://developers.google.com/custom-search/docs/xml_results#booleanOperators) in the `cr` parameter's value. Google WebSearch determines the country of a
      * document by analyzing the following: * The top-level domain (TLD) of the document's URL. * The geographic location of the web server's IP address. See [Country (cr)
      * Parameter Values](https://developers.google.com/custom-search/docs/xml_results#countryCollections) for a list of valid values for this parameter.
      */
    var cr: js.UndefOr[String] = js.undefined
    
    /**
      * The identifier of an engine created using the Programmable Search Engine [Control Panel](https://programmablesearchengine.google.com/). This is a custom property not defined
      * in the OpenSearch spec. This parameter is **required**.
      */
    var cx: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results
      * from the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number
      * of past years.
      */
    var dateRestrict: js.UndefOr[String] = js.undefined
    
    /**
      * Enables or disables the [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/xml_results#chineseSearch) feature. Supported values
      * are: * `0`: enabled (default) * `1`: disabled
      */
    var disableCnTwTranslation: js.UndefOr[String] = js.undefined
    
    /** Identifies a phrase that all documents in the search results must contain. */
    var exactTerms: js.UndefOr[String] = js.undefined
    
    /** Identifies a word or phrase that should not appear in any documents in the search results. */
    var excludeTerms: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts results to files of a specified extension. Filetypes supported by Google include: * Adobe Portable Document Format (`pdf`) * Adobe PostScript (`ps`) * Lotus 1-2-3
      * (`wk1`, `wk2`, `wk3`, `wk4`, `wk5`, `wki`, `wks`, `wku`) * Lotus WordPro (`lwp`) * Macwrite (`mw`) * Microsoft Excel (`xls`) * Microsoft PowerPoint (`ppt`) * Microsoft Word
      * (`doc`) * Microsoft Works (`wks`, `wps`, `wdb`) * Microsoft Write (`wri`) * Rich Text Format (`rtf`) * Shockwave Flash (`swf`) * Text (`ans`, `txt`). Additional filetypes
      * may be added in the future. An up-to-date list can always be found in Google's [file type FAQ](https://support.google.com/webmasters/answer/35287).
      */
    var fileType: js.UndefOr[String] = js.undefined
    
    /**
      * Activates or deactivates the automatic filtering of Google search results. See [Automatic
      * Filtering](https://developers.google.com/custom-search/docs/xml_results#automaticFiltering) for more information about Google's search results filters. Valid values for this
      * parameter are: * `0`: Disabled * `1`: Enabled (default) **Note**: By default, Google applies filtering to all search results to improve the quality of those results.
      */
    var filter: js.UndefOr[String] = js.undefined
    
    /**
      * Boosts search results whose country of origin matches the parameter value. See [Country Codes](https://developers.google.com/custom-search/docs/xml_results#countryCodes) for
      * a list of valid values. Specifying a `gl` parameter value in WebSearch requests should improve the relevance of results. This is particularly true for international
      * customers and, even more specifically, for customers in English-speaking countries other than the United States.
      */
    var gl: js.UndefOr[String] = js.undefined
    
    /** Specifies the Google domain (for example, google.com, google.de, or google.fr) to which the search should be limited. */
    var googleHost: js.UndefOr[String] = js.undefined
    
    /** Specifies the ending value for a search range. Use `cse:lowRange` and `cse:highrange` to append an inclusive search range of `lowRange...highRange` to the query. */
    var highRange: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the interface language (host language) of your user interface. Explicitly setting this parameter improves the performance and the quality of your search results.
      * See the [Interface Languages](https://developers.google.com/custom-search/docs/xml_results#wsInterfaceLanguages) section of [Internationalizing Queries and Results
      * Presentation](https://developers.google.com/custom-search/docs/xml_results#wsInternationalizing) for more information, and [Supported Interface
      * Languages](https://developers.google.com/custom-search/docs/xml_results_appendices#interfaceLanguages) for a list of supported languages.
      */
    var hl: js.UndefOr[String] = js.undefined
    
    /** Appends the specified query terms to the query, as if they were combined with a logical `AND` operator. */
    var hq: js.UndefOr[String] = js.undefined
    
    /** Restricts results to images of a specified color type. Supported values are: * `mono` (black and white) * `gray` (grayscale) * `color` (color) */
    var imgColorType: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts results to images with a specific dominant color. Supported values are: * `red` * `orange` * `yellow` * `green` * `teal` * `blue` * `purple` * `pink` * `white` *
      * `gray` * `black` * `brown`
      */
    var imgDominantColor: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts results to images of a specified size. Supported values are: * `icon` (small) * `small | medium | large | xlarge` (medium) * `xxlarge` (large) * `huge`
      * (extra-large)
      */
    var imgSize: js.UndefOr[String] = js.undefined
    
    /**
      * Restricts results to images of a specified type. Supported values are: * `clipart` (Clip art) * `face` (Face) * `lineart` (Line drawing) * `photo` (Photo) * `animated`
      * (Animated) * `stock` (Stock)
      */
    var imgType: js.UndefOr[String] = js.undefined
    
    /** The character encoding supported for search requests. */
    var inputEncoding: js.UndefOr[String] = js.undefined
    
    /** The language of the search results. */
    var language: js.UndefOr[String] = js.undefined
    
    /** Specifies that all results should contain a link to a specific URL. */
    var linkSite: js.UndefOr[String] = js.undefined
    
    /** Specifies the starting value for a search range. Use `cse:lowRange` and `cse:highrange` to append an inclusive search range of `lowRange...highRange` to the query. */
    var lowRange: js.UndefOr[String] = js.undefined
    
    /**
      * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms. You can also
      * use the [Boolean OR](https://developers.google.com/custom-search/docs/xml_results#BooleanOrqt) query term for this type of query.
      */
    var orTerms: js.UndefOr[String] = js.undefined
    
    /** The character encoding supported for search results. */
    var outputEncoding: js.UndefOr[String] = js.undefined
    
    /** Specifies that all search results should be pages that are related to the specified URL. The parameter value should be a URL. */
    var relatedSite: js.UndefOr[String] = js.undefined
    
    /** Filters based on licensing. Supported values include: * `cc_publicdomain` * `cc_attribute` * `cc_sharealike` * `cc_noncommercial` * `cc_nonderived` */
    var rights: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the [SafeSearch level](https://developers.google.com/custom-search/docs/xml_results#safeSearchLevels) used for filtering out adult results. This is a custom
      * property not defined in the OpenSearch spec. Valid parameter values are: * `"off"`: Disable SafeSearch * `"active"`: Enable SafeSearch
      */
    var safe: js.UndefOr[String] = js.undefined
    
    /** The search terms entered by the user. */
    var searchTerms: js.UndefOr[String] = js.undefined
    
    /** Allowed values are `web` or `image`. If unspecified, results are limited to webpages. */
    var searchType: js.UndefOr[String] = js.undefined
    
    /** Restricts results to URLs from a specified site. */
    var siteSearch: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether to include or exclude results from the site named in the `sitesearch` parameter. Supported values are: * `i`: include content from site * `e`: exclude
      * content from site
      */
    var siteSearchFilter: js.UndefOr[String] = js.undefined
    
    /** Specifies that results should be sorted according to the specified expression. For example, sort by date. */
    var sort: js.UndefOr[String] = js.undefined
    
    /** The index of the current set of search results into the total set of results, where the index of the first result is 1. */
    var startIndex: js.UndefOr[Double] = js.undefined
    
    /** The page number of this set of results, where the page length is set by the `count` property. */
    var startPage: js.UndefOr[Double] = js.undefined
    
    /** A description of the query. */
    var title: js.UndefOr[String] = js.undefined
    
    /** Estimated number of total search results. May not be accurate. */
    var totalResults: js.UndefOr[String] = js.undefined
  }
  object Count {
    
    @scala.inline
    def apply(): Count = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCr(value: String): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrUndefined: Self = StObject.set(x, "cr", js.undefined)
      
      @scala.inline
      def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setDateRestrict(value: String): Self = StObject.set(x, "dateRestrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRestrictUndefined: Self = StObject.set(x, "dateRestrict", js.undefined)
      
      @scala.inline
      def setDisableCnTwTranslation(value: String): Self = StObject.set(x, "disableCnTwTranslation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCnTwTranslationUndefined: Self = StObject.set(x, "disableCnTwTranslation", js.undefined)
      
      @scala.inline
      def setExactTerms(value: String): Self = StObject.set(x, "exactTerms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactTermsUndefined: Self = StObject.set(x, "exactTerms", js.undefined)
      
      @scala.inline
      def setExcludeTerms(value: String): Self = StObject.set(x, "excludeTerms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeTermsUndefined: Self = StObject.set(x, "excludeTerms", js.undefined)
      
      @scala.inline
      def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
      
      @scala.inline
      def setGoogleHost(value: String): Self = StObject.set(x, "googleHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleHostUndefined: Self = StObject.set(x, "googleHost", js.undefined)
      
      @scala.inline
      def setHighRange(value: String): Self = StObject.set(x, "highRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighRangeUndefined: Self = StObject.set(x, "highRange", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setHq(value: String): Self = StObject.set(x, "hq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHqUndefined: Self = StObject.set(x, "hq", js.undefined)
      
      @scala.inline
      def setImgColorType(value: String): Self = StObject.set(x, "imgColorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgColorTypeUndefined: Self = StObject.set(x, "imgColorType", js.undefined)
      
      @scala.inline
      def setImgDominantColor(value: String): Self = StObject.set(x, "imgDominantColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgDominantColorUndefined: Self = StObject.set(x, "imgDominantColor", js.undefined)
      
      @scala.inline
      def setImgSize(value: String): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
      
      @scala.inline
      def setImgType(value: String): Self = StObject.set(x, "imgType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgTypeUndefined: Self = StObject.set(x, "imgType", js.undefined)
      
      @scala.inline
      def setInputEncoding(value: String): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputEncodingUndefined: Self = StObject.set(x, "inputEncoding", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLinkSite(value: String): Self = StObject.set(x, "linkSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkSiteUndefined: Self = StObject.set(x, "linkSite", js.undefined)
      
      @scala.inline
      def setLowRange(value: String): Self = StObject.set(x, "lowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowRangeUndefined: Self = StObject.set(x, "lowRange", js.undefined)
      
      @scala.inline
      def setOrTerms(value: String): Self = StObject.set(x, "orTerms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrTermsUndefined: Self = StObject.set(x, "orTerms", js.undefined)
      
      @scala.inline
      def setOutputEncoding(value: String): Self = StObject.set(x, "outputEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputEncodingUndefined: Self = StObject.set(x, "outputEncoding", js.undefined)
      
      @scala.inline
      def setRelatedSite(value: String): Self = StObject.set(x, "relatedSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedSiteUndefined: Self = StObject.set(x, "relatedSite", js.undefined)
      
      @scala.inline
      def setRights(value: String): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
      
      @scala.inline
      def setSafe(value: String): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setSearchTerms(value: String): Self = StObject.set(x, "searchTerms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTermsUndefined: Self = StObject.set(x, "searchTerms", js.undefined)
      
      @scala.inline
      def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
      
      @scala.inline
      def setSiteSearch(value: String): Self = StObject.set(x, "siteSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteSearchFilter(value: String): Self = StObject.set(x, "siteSearchFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteSearchFilterUndefined: Self = StObject.set(x, "siteSearchFilter", js.undefined)
      
      @scala.inline
      def setSiteSearchUndefined: Self = StObject.set(x, "siteSearch", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      @scala.inline
      def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPageUndefined: Self = StObject.set(x, "startPage", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTotalResults(value: String): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
    }
  }
  
  trait DisplayName extends StObject {
    
    /** The display name of a refinement label. This is the name you should display in your user interface. */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** Refinement label and the associated refinement operation. */
    var label_with_op: js.UndefOr[String] = js.undefined
    
    /** The name of a refinement label, which you can use to refine searches. Don't display this in your user interface; instead, use displayName. */
    var name: js.UndefOr[String] = js.undefined
  }
  object DisplayName {
    
    @scala.inline
    def apply(): DisplayName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayName]
    }
    
    @scala.inline
    implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setLabel_with_op(value: String): Self = StObject.set(x, "label_with_op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel_with_opUndefined: Self = StObject.set(x, "label_with_op", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait FormattedSearchTime extends StObject {
    
    /** The time taken for the server to return search results, formatted according to locale style. */
    var formattedSearchTime: js.UndefOr[String] = js.undefined
    
    /** The total number of search results, formatted according to locale style. */
    var formattedTotalResults: js.UndefOr[String] = js.undefined
    
    /** The time taken for the server to return search results. */
    var searchTime: js.UndefOr[Double] = js.undefined
    
    /** The total number of search results returned by the query. */
    var totalResults: js.UndefOr[String] = js.undefined
  }
  object FormattedSearchTime {
    
    @scala.inline
    def apply(): FormattedSearchTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattedSearchTime]
    }
    
    @scala.inline
    implicit class FormattedSearchTimeMutableBuilder[Self <: FormattedSearchTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormattedSearchTime(value: String): Self = StObject.set(x, "formattedSearchTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedSearchTimeUndefined: Self = StObject.set(x, "formattedSearchTime", js.undefined)
      
      @scala.inline
      def setFormattedTotalResults(value: String): Self = StObject.set(x, "formattedTotalResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedTotalResultsUndefined: Self = StObject.set(x, "formattedTotalResults", js.undefined)
      
      @scala.inline
      def setSearchTime(value: Double): Self = StObject.set(x, "searchTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTimeUndefined: Self = StObject.set(x, "searchTime", js.undefined)
      
      @scala.inline
      def setTotalResults(value: String): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    /** Image height in pixels. */
    var height: js.UndefOr[Double] = js.undefined
    
    /** URL of the image for this promotion link. */
    var source: js.UndefOr[String] = js.undefined
    
    /** Image width in pixels. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait HtmlTitle extends StObject {
    
    /** The block object's text in HTML, if it has text. */
    var htmlTitle: js.UndefOr[String] = js.undefined
    
    /** The anchor text of the block object's link, if it has a link. */
    var link: js.UndefOr[String] = js.undefined
    
    /** The block object's text, if it has text. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The URL of the block object's link, if it has one. */
    var url: js.UndefOr[String] = js.undefined
  }
  object HtmlTitle {
    
    @scala.inline
    def apply(): HtmlTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlTitle]
    }
    
    @scala.inline
    implicit class HtmlTitleMutableBuilder[Self <: HtmlTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait NextPage extends StObject {
    
    /** Metadata representing the next page of results, if applicable. */
    var nextPage: js.UndefOr[js.Array[Count]] = js.undefined
    
    /** Metadata representing the previous page of results, if applicable. */
    var previousPage: js.UndefOr[js.Array[Count]] = js.undefined
    
    /** Metadata representing the current request. */
    var request: js.UndefOr[js.Array[Count]] = js.undefined
  }
  object NextPage {
    
    @scala.inline
    def apply(): NextPage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextPage]
    }
    
    @scala.inline
    implicit class NextPageMutableBuilder[Self <: NextPage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextPage(value: js.Array[Count]): Self = StObject.set(x, "nextPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPageUndefined: Self = StObject.set(x, "nextPage", js.undefined)
      
      @scala.inline
      def setNextPageVarargs(value: Count*): Self = StObject.set(x, "nextPage", js.Array(value :_*))
      
      @scala.inline
      def setPreviousPage(value: js.Array[Count]): Self = StObject.set(x, "previousPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
      
      @scala.inline
      def setPreviousPageVarargs(value: Count*): Self = StObject.set(x, "previousPage", js.Array(value :_*))
      
      @scala.inline
      def setRequest(value: js.Array[Count]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRequestVarargs(value: Count*): Self = StObject.set(x, "request", js.Array(value :_*))
    }
  }
  
  trait Template extends StObject {
    
    /** The actual [OpenSearch template](http://www.opensearch.org/specifications/opensearch/1.1#opensearch_url_template_syntax) for this API. */
    var template: js.UndefOr[String] = js.undefined
    
    /** The MIME type of the OpenSearch URL template for the Custom Search JSON API. */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Template {
    
    @scala.inline
    def apply(): Template = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
