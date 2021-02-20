package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlshortenerV1Mod {
  
  object urlshortenerV1 {
    
    @JSImport("googleapis/build/src/apis/urlshortener/v1", "urlshortener_v1.Resource$Url")
    @js.native
    class ResourceUrl protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * urlshortener.url.get
        * @desc Expands a short URL or gets creation time and analytics.
        * @alias urlshortener.url.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.projection Additional information to return.
        * @param {string} params.shortUrl The short URL, including the protocol.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaUrl] = js.native
      def get(callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
      def get(params: ParamsResourceUrlGet): GaxiosPromise[SchemaUrl] = js.native
      def get(params: ParamsResourceUrlGet, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
      def get(
        params: ParamsResourceUrlGet,
        options: BodyResponseCallback[SchemaUrl],
        callback: BodyResponseCallback[SchemaUrl]
      ): Unit = js.native
      def get(params: ParamsResourceUrlGet, options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
      def get(params: ParamsResourceUrlGet, options: MethodOptions, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
      
      /**
        * urlshortener.url.insert
        * @desc Creates a new short URL.
        * @alias urlshortener.url.insert
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {().Url} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def insert(): GaxiosPromise[SchemaUrl] = js.native
      def insert(callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
      def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
      def insert(params: ParamsResourceUrlInsert): GaxiosPromise[SchemaUrl] = js.native
      def insert(params: ParamsResourceUrlInsert, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
      def insert(
        params: ParamsResourceUrlInsert,
        options: BodyResponseCallback[SchemaUrl],
        callback: BodyResponseCallback[SchemaUrl]
      ): Unit = js.native
      def insert(params: ParamsResourceUrlInsert, options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
      def insert(params: ParamsResourceUrlInsert, options: MethodOptions, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
      
      /**
        * urlshortener.url.list
        * @desc Retrieves a list of URLs shortened by a user.
        * @alias urlshortener.url.list
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {string=} params.projection Additional information to return.
        * @param {string=} params.start-token Token for requesting successive pages of results.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaUrlHistory] = js.native
      def list(callback: BodyResponseCallback[SchemaUrlHistory]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlHistory] = js.native
      def list(params: ParamsResourceUrlList): GaxiosPromise[SchemaUrlHistory] = js.native
      def list(params: ParamsResourceUrlList, callback: BodyResponseCallback[SchemaUrlHistory]): Unit = js.native
      def list(
        params: ParamsResourceUrlList,
        options: BodyResponseCallback[SchemaUrlHistory],
        callback: BodyResponseCallback[SchemaUrlHistory]
      ): Unit = js.native
      def list(params: ParamsResourceUrlList, options: MethodOptions): GaxiosPromise[SchemaUrlHistory] = js.native
      def list(
        params: ParamsResourceUrlList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaUrlHistory]
      ): Unit = js.native
    }
    
    /**
      * URL Shortener API
      *
      * Lets you create, inspect, and manage goo.gl short URLs
      *
      * @example
      * const {google} = require('googleapis');
      * const urlshortener = google.urlshortener('v1');
      *
      * @namespace urlshortener
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Urlshortener
      */
    @JSImport("googleapis/build/src/apis/urlshortener/v1", "urlshortener_v1.Urlshortener")
    @js.native
    class Urlshortener protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var url: ResourceUrl = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceUrlGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Additional information to return.
        */
      var projection: js.UndefOr[String] = js.native
      
      /**
        * The short URL, including the protocol.
        */
      var shortUrl: js.UndefOr[String] = js.native
    }
    object ParamsResourceUrlGet {
      
      @scala.inline
      def apply(): ParamsResourceUrlGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlGet]
      }
      
      @scala.inline
      implicit class ParamsResourceUrlGetMutableBuilder[Self <: ParamsResourceUrlGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
        
        @scala.inline
        def setShortUrl(value: String): Self = StObject.set(x, "shortUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortUrlUndefined: Self = StObject.set(x, "shortUrl", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceUrlInsert extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaUrl] = js.native
    }
    object ParamsResourceUrlInsert {
      
      @scala.inline
      def apply(): ParamsResourceUrlInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlInsert]
      }
      
      @scala.inline
      implicit class ParamsResourceUrlInsertMutableBuilder[Self <: ParamsResourceUrlInsert] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaUrl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceUrlList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Additional information to return.
        */
      var projection: js.UndefOr[String] = js.native
      
      /**
        * Token for requesting successive pages of results.
        */
      var `start-token`: js.UndefOr[String] = js.native
    }
    object ParamsResourceUrlList {
      
      @scala.inline
      def apply(): ParamsResourceUrlList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlList]
      }
      
      @scala.inline
      implicit class ParamsResourceUrlListMutableBuilder[Self <: ParamsResourceUrlList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
        
        @scala.inline
        def `setStart-token`(value: String): Self = StObject.set(x, "start-token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-tokenUndefined`: Self = StObject.set(x, "start-token", js.undefined)
      }
    }
    
    @js.native
    trait SchemaAnalyticsSnapshot extends StObject {
      
      /**
        * Top browsers, e.g. &quot;Chrome&quot;; sorted by (descending) click
        * counts. Only present if this data is available.
        */
      var browsers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
      
      /**
        * Top countries (expressed as country codes), e.g. &quot;US&quot; or
        * &quot;DE&quot;; sorted by (descending) click counts. Only present if this
        * data is available.
        */
      var countries: js.UndefOr[js.Array[SchemaStringCount]] = js.native
      
      /**
        * Number of clicks on all goo.gl short URLs pointing to this long URL.
        */
      var longUrlClicks: js.UndefOr[String] = js.native
      
      /**
        * Top platforms or OSes, e.g. &quot;Windows&quot;; sorted by (descending)
        * click counts. Only present if this data is available.
        */
      var platforms: js.UndefOr[js.Array[SchemaStringCount]] = js.native
      
      /**
        * Top referring hosts, e.g. &quot;www.google.com&quot;; sorted by
        * (descending) click counts. Only present if this data is available.
        */
      var referrers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
      
      /**
        * Number of clicks on this short URL.
        */
      var shortUrlClicks: js.UndefOr[String] = js.native
    }
    object SchemaAnalyticsSnapshot {
      
      @scala.inline
      def apply(): SchemaAnalyticsSnapshot = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAnalyticsSnapshot]
      }
      
      @scala.inline
      implicit class SchemaAnalyticsSnapshotMutableBuilder[Self <: SchemaAnalyticsSnapshot] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBrowsers(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
        
        @scala.inline
        def setBrowsersVarargs(value: SchemaStringCount*): Self = StObject.set(x, "browsers", js.Array(value :_*))
        
        @scala.inline
        def setCountries(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
        
        @scala.inline
        def setCountriesVarargs(value: SchemaStringCount*): Self = StObject.set(x, "countries", js.Array(value :_*))
        
        @scala.inline
        def setLongUrlClicks(value: String): Self = StObject.set(x, "longUrlClicks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLongUrlClicksUndefined: Self = StObject.set(x, "longUrlClicks", js.undefined)
        
        @scala.inline
        def setPlatforms(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
        
        @scala.inline
        def setPlatformsVarargs(value: SchemaStringCount*): Self = StObject.set(x, "platforms", js.Array(value :_*))
        
        @scala.inline
        def setReferrers(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "referrers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReferrersUndefined: Self = StObject.set(x, "referrers", js.undefined)
        
        @scala.inline
        def setReferrersVarargs(value: SchemaStringCount*): Self = StObject.set(x, "referrers", js.Array(value :_*))
        
        @scala.inline
        def setShortUrlClicks(value: String): Self = StObject.set(x, "shortUrlClicks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortUrlClicksUndefined: Self = StObject.set(x, "shortUrlClicks", js.undefined)
      }
    }
    
    @js.native
    trait SchemaAnalyticsSummary extends StObject {
      
      /**
        * Click analytics over all time.
        */
      var allTime: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
      
      /**
        * Click analytics over the last day.
        */
      var day: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
      
      /**
        * Click analytics over the last month.
        */
      var month: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
      
      /**
        * Click analytics over the last two hours.
        */
      var twoHours: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
      
      /**
        * Click analytics over the last week.
        */
      var week: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
    }
    object SchemaAnalyticsSummary {
      
      @scala.inline
      def apply(): SchemaAnalyticsSummary = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAnalyticsSummary]
      }
      
      @scala.inline
      implicit class SchemaAnalyticsSummaryMutableBuilder[Self <: SchemaAnalyticsSummary] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllTime(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "allTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllTimeUndefined: Self = StObject.set(x, "allTime", js.undefined)
        
        @scala.inline
        def setDay(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        @scala.inline
        def setMonth(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        @scala.inline
        def setTwoHours(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "twoHours", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTwoHoursUndefined: Self = StObject.set(x, "twoHours", js.undefined)
        
        @scala.inline
        def setWeek(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      }
    }
    
    @js.native
    trait SchemaStringCount extends StObject {
      
      /**
        * Number of clicks for this top entry, e.g. for this particular country or
        * browser.
        */
      var count: js.UndefOr[String] = js.native
      
      /**
        * Label assigned to this top entry, e.g. &quot;US&quot; or
        * &quot;Chrome&quot;.
        */
      var id: js.UndefOr[String] = js.native
    }
    object SchemaStringCount {
      
      @scala.inline
      def apply(): SchemaStringCount = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaStringCount]
      }
      
      @scala.inline
      implicit class SchemaStringCountMutableBuilder[Self <: SchemaStringCount] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    @js.native
    trait SchemaUrl extends StObject {
      
      /**
        * A summary of the click analytics for the short and long URL. Might not be
        * present if not requested or currently unavailable.
        */
      var analytics: js.UndefOr[SchemaAnalyticsSummary] = js.native
      
      /**
        * Time the short URL was created; ISO 8601 representation using the
        * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ format, e.g.
        * &quot;2010-10-14T19:01:24.944+00:00&quot;.
        */
      var created: js.UndefOr[String] = js.native
      
      /**
        * Short URL, e.g. &quot;http://goo.gl/l6MS&quot;.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * The fixed string &quot;urlshortener#url&quot;.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Long URL, e.g. &quot;http://www.google.com/&quot;. Might not be present
        * if the status is &quot;REMOVED&quot;.
        */
      var longUrl: js.UndefOr[String] = js.native
      
      /**
        * Status of the target URL. Possible values: &quot;OK&quot;,
        * &quot;MALWARE&quot;, &quot;PHISHING&quot;, or &quot;REMOVED&quot;. A URL
        * might be marked &quot;REMOVED&quot; if it was flagged as spam, for
        * example.
        */
      var status: js.UndefOr[String] = js.native
    }
    object SchemaUrl {
      
      @scala.inline
      def apply(): SchemaUrl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrl]
      }
      
      @scala.inline
      implicit class SchemaUrlMutableBuilder[Self <: SchemaUrl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnalytics(value: SchemaAnalyticsSummary): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
        
        @scala.inline
        def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLongUrl(value: String): Self = StObject.set(x, "longUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLongUrlUndefined: Self = StObject.set(x, "longUrl", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait SchemaUrlHistory extends StObject {
      
      /**
        * A list of URL resources.
        */
      var items: js.UndefOr[js.Array[SchemaUrl]] = js.native
      
      /**
        * Number of items returned with each full &quot;page&quot; of results. Note
        * that the last page could have fewer items than the
        * &quot;itemsPerPage&quot; value.
        */
      var itemsPerPage: js.UndefOr[Double] = js.native
      
      /**
        * The fixed string &quot;urlshortener#urlHistory&quot;.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * A token to provide to get the next page of results.
        */
      var nextPageToken: js.UndefOr[String] = js.native
      
      /**
        * Total number of short URLs associated with this user (may be
        * approximate).
        */
      var totalItems: js.UndefOr[Double] = js.native
    }
    object SchemaUrlHistory {
      
      @scala.inline
      def apply(): SchemaUrlHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrlHistory]
      }
      
      @scala.inline
      implicit class SchemaUrlHistoryMutableBuilder[Self <: SchemaUrlHistory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[SchemaUrl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: SchemaUrl*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.native
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
