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
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
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
      def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
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
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlHistory] = js.native
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
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceUrlGet
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Additional information to return.
        */
      var projection: js.UndefOr[String] = js.undefined
      
      /**
        * The short URL, including the protocol.
        */
      var shortUrl: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceUrlGet {
      
      inline def apply(): ParamsResourceUrlGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlGet]
      }
      
      extension [Self <: ParamsResourceUrlGet](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
        
        inline def setShortUrl(value: String): Self = StObject.set(x, "shortUrl", value.asInstanceOf[js.Any])
        
        inline def setShortUrlUndefined: Self = StObject.set(x, "shortUrl", js.undefined)
      }
    }
    
    trait ParamsResourceUrlInsert
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaUrl] = js.undefined
    }
    object ParamsResourceUrlInsert {
      
      inline def apply(): ParamsResourceUrlInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlInsert]
      }
      
      extension [Self <: ParamsResourceUrlInsert](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setRequestBody(value: SchemaUrl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceUrlList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Additional information to return.
        */
      var projection: js.UndefOr[String] = js.undefined
      
      /**
        * Token for requesting successive pages of results.
        */
      var `start-token`: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceUrlList {
      
      inline def apply(): ParamsResourceUrlList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlList]
      }
      
      extension [Self <: ParamsResourceUrlList](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
        
        inline def `setStart-token`(value: String): Self = StObject.set(x, "start-token", value.asInstanceOf[js.Any])
        
        inline def `setStart-tokenUndefined`: Self = StObject.set(x, "start-token", js.undefined)
      }
    }
    
    trait SchemaAnalyticsSnapshot extends StObject {
      
      /**
        * Top browsers, e.g. &quot;Chrome&quot;; sorted by (descending) click
        * counts. Only present if this data is available.
        */
      var browsers: js.UndefOr[js.Array[SchemaStringCount]] = js.undefined
      
      /**
        * Top countries (expressed as country codes), e.g. &quot;US&quot; or
        * &quot;DE&quot;; sorted by (descending) click counts. Only present if this
        * data is available.
        */
      var countries: js.UndefOr[js.Array[SchemaStringCount]] = js.undefined
      
      /**
        * Number of clicks on all goo.gl short URLs pointing to this long URL.
        */
      var longUrlClicks: js.UndefOr[String] = js.undefined
      
      /**
        * Top platforms or OSes, e.g. &quot;Windows&quot;; sorted by (descending)
        * click counts. Only present if this data is available.
        */
      var platforms: js.UndefOr[js.Array[SchemaStringCount]] = js.undefined
      
      /**
        * Top referring hosts, e.g. &quot;www.google.com&quot;; sorted by
        * (descending) click counts. Only present if this data is available.
        */
      var referrers: js.UndefOr[js.Array[SchemaStringCount]] = js.undefined
      
      /**
        * Number of clicks on this short URL.
        */
      var shortUrlClicks: js.UndefOr[String] = js.undefined
    }
    object SchemaAnalyticsSnapshot {
      
      inline def apply(): SchemaAnalyticsSnapshot = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAnalyticsSnapshot]
      }
      
      extension [Self <: SchemaAnalyticsSnapshot](x: Self) {
        
        inline def setBrowsers(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
        
        inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
        
        inline def setBrowsersVarargs(value: SchemaStringCount*): Self = StObject.set(x, "browsers", js.Array(value :_*))
        
        inline def setCountries(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
        
        inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
        
        inline def setCountriesVarargs(value: SchemaStringCount*): Self = StObject.set(x, "countries", js.Array(value :_*))
        
        inline def setLongUrlClicks(value: String): Self = StObject.set(x, "longUrlClicks", value.asInstanceOf[js.Any])
        
        inline def setLongUrlClicksUndefined: Self = StObject.set(x, "longUrlClicks", js.undefined)
        
        inline def setPlatforms(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
        
        inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
        
        inline def setPlatformsVarargs(value: SchemaStringCount*): Self = StObject.set(x, "platforms", js.Array(value :_*))
        
        inline def setReferrers(value: js.Array[SchemaStringCount]): Self = StObject.set(x, "referrers", value.asInstanceOf[js.Any])
        
        inline def setReferrersUndefined: Self = StObject.set(x, "referrers", js.undefined)
        
        inline def setReferrersVarargs(value: SchemaStringCount*): Self = StObject.set(x, "referrers", js.Array(value :_*))
        
        inline def setShortUrlClicks(value: String): Self = StObject.set(x, "shortUrlClicks", value.asInstanceOf[js.Any])
        
        inline def setShortUrlClicksUndefined: Self = StObject.set(x, "shortUrlClicks", js.undefined)
      }
    }
    
    trait SchemaAnalyticsSummary extends StObject {
      
      /**
        * Click analytics over all time.
        */
      var allTime: js.UndefOr[SchemaAnalyticsSnapshot] = js.undefined
      
      /**
        * Click analytics over the last day.
        */
      var day: js.UndefOr[SchemaAnalyticsSnapshot] = js.undefined
      
      /**
        * Click analytics over the last month.
        */
      var month: js.UndefOr[SchemaAnalyticsSnapshot] = js.undefined
      
      /**
        * Click analytics over the last two hours.
        */
      var twoHours: js.UndefOr[SchemaAnalyticsSnapshot] = js.undefined
      
      /**
        * Click analytics over the last week.
        */
      var week: js.UndefOr[SchemaAnalyticsSnapshot] = js.undefined
    }
    object SchemaAnalyticsSummary {
      
      inline def apply(): SchemaAnalyticsSummary = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAnalyticsSummary]
      }
      
      extension [Self <: SchemaAnalyticsSummary](x: Self) {
        
        inline def setAllTime(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "allTime", value.asInstanceOf[js.Any])
        
        inline def setAllTimeUndefined: Self = StObject.set(x, "allTime", js.undefined)
        
        inline def setDay(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setMonth(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        inline def setTwoHours(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "twoHours", value.asInstanceOf[js.Any])
        
        inline def setTwoHoursUndefined: Self = StObject.set(x, "twoHours", js.undefined)
        
        inline def setWeek(value: SchemaAnalyticsSnapshot): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
        
        inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      }
    }
    
    trait SchemaStringCount extends StObject {
      
      /**
        * Number of clicks for this top entry, e.g. for this particular country or
        * browser.
        */
      var count: js.UndefOr[String] = js.undefined
      
      /**
        * Label assigned to this top entry, e.g. &quot;US&quot; or
        * &quot;Chrome&quot;.
        */
      var id: js.UndefOr[String] = js.undefined
    }
    object SchemaStringCount {
      
      inline def apply(): SchemaStringCount = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaStringCount]
      }
      
      extension [Self <: SchemaStringCount](x: Self) {
        
        inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    trait SchemaUrl extends StObject {
      
      /**
        * A summary of the click analytics for the short and long URL. Might not be
        * present if not requested or currently unavailable.
        */
      var analytics: js.UndefOr[SchemaAnalyticsSummary] = js.undefined
      
      /**
        * Time the short URL was created; ISO 8601 representation using the
        * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ format, e.g.
        * &quot;2010-10-14T19:01:24.944+00:00&quot;.
        */
      var created: js.UndefOr[String] = js.undefined
      
      /**
        * Short URL, e.g. &quot;http://goo.gl/l6MS&quot;.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * The fixed string &quot;urlshortener#url&quot;.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * Long URL, e.g. &quot;http://www.google.com/&quot;. Might not be present
        * if the status is &quot;REMOVED&quot;.
        */
      var longUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Status of the target URL. Possible values: &quot;OK&quot;,
        * &quot;MALWARE&quot;, &quot;PHISHING&quot;, or &quot;REMOVED&quot;. A URL
        * might be marked &quot;REMOVED&quot; if it was flagged as spam, for
        * example.
        */
      var status: js.UndefOr[String] = js.undefined
    }
    object SchemaUrl {
      
      inline def apply(): SchemaUrl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrl]
      }
      
      extension [Self <: SchemaUrl](x: Self) {
        
        inline def setAnalytics(value: SchemaAnalyticsSummary): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
        
        inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
        
        inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLongUrl(value: String): Self = StObject.set(x, "longUrl", value.asInstanceOf[js.Any])
        
        inline def setLongUrlUndefined: Self = StObject.set(x, "longUrl", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait SchemaUrlHistory extends StObject {
      
      /**
        * A list of URL resources.
        */
      var items: js.UndefOr[js.Array[SchemaUrl]] = js.undefined
      
      /**
        * Number of items returned with each full &quot;page&quot; of results. Note
        * that the last page could have fewer items than the
        * &quot;itemsPerPage&quot; value.
        */
      var itemsPerPage: js.UndefOr[Double] = js.undefined
      
      /**
        * The fixed string &quot;urlshortener#urlHistory&quot;.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * A token to provide to get the next page of results.
        */
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Total number of short URLs associated with this user (may be
        * approximate).
        */
      var totalItems: js.UndefOr[Double] = js.undefined
    }
    object SchemaUrlHistory {
      
      inline def apply(): SchemaUrlHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrlHistory]
      }
      
      extension [Self <: SchemaUrlHistory](x: Self) {
        
        inline def setItems(value: js.Array[SchemaUrl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
        
        inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaUrl*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
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
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
