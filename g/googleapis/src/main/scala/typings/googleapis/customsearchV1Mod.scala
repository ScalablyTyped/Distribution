package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Anchor
import typings.googleapis.anon.ByteSize
import typings.googleapis.anon.CorrectedQuery
import typings.googleapis.anon.FormattedSearchTime
import typings.googleapis.anon.HeightSource
import typings.googleapis.anon.HtmlTitle
import typings.googleapis.anon.Labelwithop
import typings.googleapis.anon.Template
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customsearchV1Mod {
  
  object customsearchV1 {
    
    /**
      * CustomSearch API
      *
      * Searches over a website or collection of websites
      *
      * @example
      * const {google} = require('googleapis');
      * const customsearch = google.customsearch('v1');
      *
      * @namespace customsearch
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Customsearch
      */
    @JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Customsearch")
    @js.native
    class Customsearch protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var cse: ResourceCse = js.native
    }
    
    @JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Resource$Cse")
    @js.native
    class ResourceCse protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * search.cse.list
        * @desc Returns metadata about the search performed, metadata about the
        * custom search engine used for the search, and the search results.
        * @alias search.cse.list
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
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
      def list(params: ParamsResourceCseList): GaxiosPromise[SchemaSearch] = js.native
      def list(params: ParamsResourceCseList, callback: BodyResponseCallback[SchemaSearch]): Unit = js.native
      def list(
        params: ParamsResourceCseList,
        options: BodyResponseCallback[SchemaSearch],
        callback: BodyResponseCallback[SchemaSearch]
      ): Unit = js.native
      def list(params: ParamsResourceCseList, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
      def list(
        params: ParamsResourceCseList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSearch]
      ): Unit = js.native
      
      var siterestrict: ResourceCseSiterestrict = js.native
    }
    
    @JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Resource$Cse$Siterestrict")
    @js.native
    class ResourceCseSiterestrict protected () extends StObject {
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
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
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
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceCseList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Turns off the translation between zh-CN and zh-TW.
        */
      var c2coff: js.UndefOr[String] = js.undefined
      
      /**
        * Country restrict(s).
        */
      var cr: js.UndefOr[String] = js.undefined
      
      /**
        * The custom search engine ID to scope this search query
        */
      var cx: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies all search results are from a time period
        */
      var dateRestrict: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a phrase that all documents in the search results must contain
        */
      var exactTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a word or phrase that should not appear in any documents in
        * the search results
        */
      var excludeTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specified type. Some of the allowed values are: bmp,
        * gif, png, jpg, svg, pdf, ...
        */
      var fileType: js.UndefOr[String] = js.undefined
      
      /**
        * Controls turning on or off the duplicate content filter.
        */
      var filter: js.UndefOr[String] = js.undefined
      
      /**
        * Geolocation of end user.
        */
      var gl: js.UndefOr[String] = js.undefined
      
      /**
        * The local Google domain to use to perform the search.
        */
      var googlehost: js.UndefOr[String] = js.undefined
      
      /**
        * Creates a range in form as_nlo value..as_nhi value and attempts to append
        * it to query
        */
      var highRange: js.UndefOr[String] = js.undefined
      
      /**
        * Sets the user interface language.
        */
      var hl: js.UndefOr[String] = js.undefined
      
      /**
        * Appends the extra query terms to the query.
        */
      var hq: js.UndefOr[String] = js.undefined
      
      /**
        * Returns black and white, grayscale, or color images: mono, gray, and
        * color.
        */
      var imgColorType: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specific dominant color: red, orange, yellow, green,
        * teal, blue, purple, pink, white, gray, black and brown.
        */
      var imgDominantColor: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specified size, where size can be one of: icon,
        * small, medium, large, xlarge, xxlarge, and huge.
        */
      var imgSize: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a type, which can be one of: clipart, face, lineart,
        * news, and photo.
        */
      var imgType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should contain a link to a particular
        * URL
        */
      var linkSite: js.UndefOr[String] = js.undefined
      
      /**
        * Creates a range in form as_nlo value..as_nhi value and attempts to append
        * it to query
        */
      var lowRange: js.UndefOr[String] = js.undefined
      
      /**
        * The language restriction for the search results
        */
      var lr: js.UndefOr[String] = js.undefined
      
      /**
        * Number of search results to return
        */
      var num: js.UndefOr[Double] = js.undefined
      
      /**
        * Provides additional search terms to check for in a document, where each
        * document in the search results must contain at least one of the
        * additional search terms
        */
      var orTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Query
        */
      var q: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should be pages that are related to the
        * specified URL
        */
      var relatedSite: js.UndefOr[String] = js.undefined
      
      /**
        * Filters based on licensing. Supported values include: cc_publicdomain,
        * cc_attribute, cc_sharealike, cc_noncommercial, cc_nonderived and
        * combinations of these.
        */
      var rights: js.UndefOr[String] = js.undefined
      
      /**
        * Search safety level
        */
      var safe: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the search type: image.
        */
      var searchType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies all search results should be pages from a given site
        */
      var siteSearch: js.UndefOr[String] = js.undefined
      
      /**
        * Controls whether to include or exclude results from the site named in the
        * as_sitesearch parameter
        */
      var siteSearchFilter: js.UndefOr[String] = js.undefined
      
      /**
        * The sort expression to apply to the results
        */
      var sort: js.UndefOr[String] = js.undefined
      
      /**
        * The index of the first result to return
        */
      var start: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceCseList {
      
      @scala.inline
      def apply(): ParamsResourceCseList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceCseList]
      }
      
      @scala.inline
      implicit class ParamsResourceCseListMutableBuilder[Self <: ParamsResourceCseList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setC2coff(value: String): Self = StObject.set(x, "c2coff", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setC2coffUndefined: Self = StObject.set(x, "c2coff", js.undefined)
        
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
        def setOrTerms(value: String): Self = StObject.set(x, "orTerms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrTermsUndefined: Self = StObject.set(x, "orTerms", js.undefined)
        
        @scala.inline
        def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQUndefined: Self = StObject.set(x, "q", js.undefined)
        
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
      }
    }
    
    trait ParamsResourceCseSiterestrictList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Turns off the translation between zh-CN and zh-TW.
        */
      var c2coff: js.UndefOr[String] = js.undefined
      
      /**
        * Country restrict(s).
        */
      var cr: js.UndefOr[String] = js.undefined
      
      /**
        * The custom search engine ID to scope this search query
        */
      var cx: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies all search results are from a time period
        */
      var dateRestrict: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a phrase that all documents in the search results must contain
        */
      var exactTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a word or phrase that should not appear in any documents in
        * the search results
        */
      var excludeTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specified type. Some of the allowed values are: bmp,
        * gif, png, jpg, svg, pdf, ...
        */
      var fileType: js.UndefOr[String] = js.undefined
      
      /**
        * Controls turning on or off the duplicate content filter.
        */
      var filter: js.UndefOr[String] = js.undefined
      
      /**
        * Geolocation of end user.
        */
      var gl: js.UndefOr[String] = js.undefined
      
      /**
        * The local Google domain to use to perform the search.
        */
      var googlehost: js.UndefOr[String] = js.undefined
      
      /**
        * Creates a range in form as_nlo value..as_nhi value and attempts to append
        * it to query
        */
      var highRange: js.UndefOr[String] = js.undefined
      
      /**
        * Sets the user interface language.
        */
      var hl: js.UndefOr[String] = js.undefined
      
      /**
        * Appends the extra query terms to the query.
        */
      var hq: js.UndefOr[String] = js.undefined
      
      /**
        * Returns black and white, grayscale, or color images: mono, gray, and
        * color.
        */
      var imgColorType: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specific dominant color: red, orange, yellow, green,
        * teal, blue, purple, pink, white, gray, black and brown.
        */
      var imgDominantColor: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specified size, where size can be one of: icon,
        * small, medium, large, xlarge, xxlarge, and huge.
        */
      var imgSize: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a type, which can be one of: clipart, face, lineart,
        * news, and photo.
        */
      var imgType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should contain a link to a particular
        * URL
        */
      var linkSite: js.UndefOr[String] = js.undefined
      
      /**
        * Creates a range in form as_nlo value..as_nhi value and attempts to append
        * it to query
        */
      var lowRange: js.UndefOr[String] = js.undefined
      
      /**
        * The language restriction for the search results
        */
      var lr: js.UndefOr[String] = js.undefined
      
      /**
        * Number of search results to return
        */
      var num: js.UndefOr[Double] = js.undefined
      
      /**
        * Provides additional search terms to check for in a document, where each
        * document in the search results must contain at least one of the
        * additional search terms
        */
      var orTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Query
        */
      var q: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should be pages that are related to the
        * specified URL
        */
      var relatedSite: js.UndefOr[String] = js.undefined
      
      /**
        * Filters based on licensing. Supported values include: cc_publicdomain,
        * cc_attribute, cc_sharealike, cc_noncommercial, cc_nonderived and
        * combinations of these.
        */
      var rights: js.UndefOr[String] = js.undefined
      
      /**
        * Search safety level
        */
      var safe: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the search type: image.
        */
      var searchType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies all search results should be pages from a given site
        */
      var siteSearch: js.UndefOr[String] = js.undefined
      
      /**
        * Controls whether to include or exclude results from the site named in the
        * as_sitesearch parameter
        */
      var siteSearchFilter: js.UndefOr[String] = js.undefined
      
      /**
        * The sort expression to apply to the results
        */
      var sort: js.UndefOr[String] = js.undefined
      
      /**
        * The index of the first result to return
        */
      var start: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceCseSiterestrictList {
      
      @scala.inline
      def apply(): ParamsResourceCseSiterestrictList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceCseSiterestrictList]
      }
      
      @scala.inline
      implicit class ParamsResourceCseSiterestrictListMutableBuilder[Self <: ParamsResourceCseSiterestrictList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setC2coff(value: String): Self = StObject.set(x, "c2coff", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setC2coffUndefined: Self = StObject.set(x, "c2coff", js.undefined)
        
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
        def setOrTerms(value: String): Self = StObject.set(x, "orTerms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrTermsUndefined: Self = StObject.set(x, "orTerms", js.undefined)
        
        @scala.inline
        def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQUndefined: Self = StObject.set(x, "q", js.undefined)
        
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
      }
    }
    
    trait SchemaContext extends StObject {
      
      var facets: js.UndefOr[js.Array[js.Array[Anchor]]] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object SchemaContext {
      
      @scala.inline
      def apply(): SchemaContext = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaContext]
      }
      
      @scala.inline
      implicit class SchemaContextMutableBuilder[Self <: SchemaContext] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFacets(value: js.Array[js.Array[Anchor]]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
        
        @scala.inline
        def setFacetsVarargs(value: js.Array[Anchor]*): Self = StObject.set(x, "facets", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaPromotion extends StObject {
      
      var bodyLines: js.UndefOr[js.Array[HtmlTitle]] = js.undefined
      
      var displayLink: js.UndefOr[String] = js.undefined
      
      var htmlTitle: js.UndefOr[String] = js.undefined
      
      var image: js.UndefOr[HeightSource] = js.undefined
      
      var link: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object SchemaPromotion {
      
      @scala.inline
      def apply(): SchemaPromotion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPromotion]
      }
      
      @scala.inline
      implicit class SchemaPromotionMutableBuilder[Self <: SchemaPromotion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBodyLines(value: js.Array[HtmlTitle]): Self = StObject.set(x, "bodyLines", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyLinesUndefined: Self = StObject.set(x, "bodyLines", js.undefined)
        
        @scala.inline
        def setBodyLinesVarargs(value: HtmlTitle*): Self = StObject.set(x, "bodyLines", js.Array(value :_*))
        
        @scala.inline
        def setDisplayLink(value: String): Self = StObject.set(x, "displayLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayLinkUndefined: Self = StObject.set(x, "displayLink", js.undefined)
        
        @scala.inline
        def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
        
        @scala.inline
        def setImage(value: HeightSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        @scala.inline
        def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaQuery extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var cr: js.UndefOr[String] = js.undefined
      
      var cx: js.UndefOr[String] = js.undefined
      
      var dateRestrict: js.UndefOr[String] = js.undefined
      
      var disableCnTwTranslation: js.UndefOr[String] = js.undefined
      
      var exactTerms: js.UndefOr[String] = js.undefined
      
      var excludeTerms: js.UndefOr[String] = js.undefined
      
      var fileType: js.UndefOr[String] = js.undefined
      
      var filter: js.UndefOr[String] = js.undefined
      
      var gl: js.UndefOr[String] = js.undefined
      
      var googleHost: js.UndefOr[String] = js.undefined
      
      var highRange: js.UndefOr[String] = js.undefined
      
      var hl: js.UndefOr[String] = js.undefined
      
      var hq: js.UndefOr[String] = js.undefined
      
      var imgColorType: js.UndefOr[String] = js.undefined
      
      var imgDominantColor: js.UndefOr[String] = js.undefined
      
      var imgSize: js.UndefOr[String] = js.undefined
      
      var imgType: js.UndefOr[String] = js.undefined
      
      var inputEncoding: js.UndefOr[String] = js.undefined
      
      var language: js.UndefOr[String] = js.undefined
      
      var linkSite: js.UndefOr[String] = js.undefined
      
      var lowRange: js.UndefOr[String] = js.undefined
      
      var orTerms: js.UndefOr[String] = js.undefined
      
      var outputEncoding: js.UndefOr[String] = js.undefined
      
      var relatedSite: js.UndefOr[String] = js.undefined
      
      var rights: js.UndefOr[String] = js.undefined
      
      var safe: js.UndefOr[String] = js.undefined
      
      var searchTerms: js.UndefOr[String] = js.undefined
      
      var searchType: js.UndefOr[String] = js.undefined
      
      var siteSearch: js.UndefOr[String] = js.undefined
      
      var siteSearchFilter: js.UndefOr[String] = js.undefined
      
      var sort: js.UndefOr[String] = js.undefined
      
      var startIndex: js.UndefOr[Double] = js.undefined
      
      var startPage: js.UndefOr[Double] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var totalResults: js.UndefOr[String] = js.undefined
    }
    object SchemaQuery {
      
      @scala.inline
      def apply(): SchemaQuery = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaQuery]
      }
      
      @scala.inline
      implicit class SchemaQueryMutableBuilder[Self <: SchemaQuery] (val x: Self) extends AnyVal {
        
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
    
    trait SchemaResult extends StObject {
      
      var cacheId: js.UndefOr[String] = js.undefined
      
      var displayLink: js.UndefOr[String] = js.undefined
      
      var fileFormat: js.UndefOr[String] = js.undefined
      
      var formattedUrl: js.UndefOr[String] = js.undefined
      
      var htmlFormattedUrl: js.UndefOr[String] = js.undefined
      
      var htmlSnippet: js.UndefOr[String] = js.undefined
      
      var htmlTitle: js.UndefOr[String] = js.undefined
      
      var image: js.UndefOr[ByteSize] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[js.Array[Labelwithop]] = js.undefined
      
      var link: js.UndefOr[String] = js.undefined
      
      var mime: js.UndefOr[String] = js.undefined
      
      var pagemap: js.UndefOr[StringDictionary[js.Array[StringDictionary[js.Any]]]] = js.undefined
      
      var snippet: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object SchemaResult {
      
      @scala.inline
      def apply(): SchemaResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaResult]
      }
      
      @scala.inline
      implicit class SchemaResultMutableBuilder[Self <: SchemaResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
        
        @scala.inline
        def setDisplayLink(value: String): Self = StObject.set(x, "displayLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayLinkUndefined: Self = StObject.set(x, "displayLink", js.undefined)
        
        @scala.inline
        def setFileFormat(value: String): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
        
        @scala.inline
        def setFormattedUrl(value: String): Self = StObject.set(x, "formattedUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedUrlUndefined: Self = StObject.set(x, "formattedUrl", js.undefined)
        
        @scala.inline
        def setHtmlFormattedUrl(value: String): Self = StObject.set(x, "htmlFormattedUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlFormattedUrlUndefined: Self = StObject.set(x, "htmlFormattedUrl", js.undefined)
        
        @scala.inline
        def setHtmlSnippet(value: String): Self = StObject.set(x, "htmlSnippet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlSnippetUndefined: Self = StObject.set(x, "htmlSnippet", js.undefined)
        
        @scala.inline
        def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
        
        @scala.inline
        def setImage(value: ByteSize): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLabels(value: js.Array[Labelwithop]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setLabelsVarargs(value: Labelwithop*): Self = StObject.set(x, "labels", js.Array(value :_*))
        
        @scala.inline
        def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
        
        @scala.inline
        def setPagemap(value: StringDictionary[js.Array[StringDictionary[js.Any]]]): Self = StObject.set(x, "pagemap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPagemapUndefined: Self = StObject.set(x, "pagemap", js.undefined)
        
        @scala.inline
        def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaSearch extends StObject {
      
      var context: js.UndefOr[SchemaContext] = js.undefined
      
      var items: js.UndefOr[js.Array[SchemaResult]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.undefined
      
      var queries: js.UndefOr[StringDictionary[js.Array[SchemaQuery]]] = js.undefined
      
      var searchInformation: js.UndefOr[FormattedSearchTime] = js.undefined
      
      var spelling: js.UndefOr[CorrectedQuery] = js.undefined
      
      var url: js.UndefOr[Template] = js.undefined
    }
    object SchemaSearch {
      
      @scala.inline
      def apply(): SchemaSearch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSearch]
      }
      
      @scala.inline
      implicit class SchemaSearchMutableBuilder[Self <: SchemaSearch] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: SchemaContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[SchemaResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: SchemaResult*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setPromotions(value: js.Array[SchemaPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
        
        @scala.inline
        def setPromotionsVarargs(value: SchemaPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
        
        @scala.inline
        def setQueries(value: StringDictionary[js.Array[SchemaQuery]]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
        
        @scala.inline
        def setSearchInformation(value: FormattedSearchTime): Self = StObject.set(x, "searchInformation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchInformationUndefined: Self = StObject.set(x, "searchInformation", js.undefined)
        
        @scala.inline
        def setSpelling(value: CorrectedQuery): Self = StObject.set(x, "spelling", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpellingUndefined: Self = StObject.set(x, "spelling", js.undefined)
        
        @scala.inline
        def setUrl(value: Template): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
