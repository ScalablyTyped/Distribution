package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v2_4
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v24Mod {
  
  object analyticsV24 {
    
    /**
      * Google Analytics API
      *
      * Views and manages your Google Analytics data.
      *
      * @example
      * const {google} = require('googleapis');
      * const analytics = google.analytics('v2.4');
      *
      * @namespace analytics
      * @type {Function}
      * @version v2.4
      * @variation v2.4
      * @param {object=} options Options for Analytics
      */
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Analytics")
    @js.native
    class Analytics protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var data: ResourceData = js.native
      
      var management: ResourceManagement = js.native
    }
    
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Data")
    @js.native
    class ResourceData protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * analytics.data.get
        * @desc Returns Analytics report data for a view (profile).
        * @alias analytics.data.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.dimensions A comma-separated list of Analytics dimensions. E.g., 'ga:browser,ga:city'.
        * @param {string} params.end-date End date for fetching report data. All requests should specify an end date formatted as YYYY-MM-DD.
        * @param {string=} params.filters A comma-separated list of dimension or metric filters to be applied to the report data.
        * @param {string} params.ids Unique table ID for retrieving report data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
        * @param {integer=} params.max-results The maximum number of entries to include in this feed.
        * @param {string} params.metrics A comma-separated list of Analytics metrics. E.g., 'ga:sessions,ga:pageviews'. At least one metric must be specified to retrieve a valid Analytics report.
        * @param {string=} params.segment An Analytics advanced segment to be applied to the report data.
        * @param {string=} params.sort A comma-separated list of dimensions or metrics that determine the sort order for the report data.
        * @param {string} params.start-date Start date for fetching report data. All requests should specify a start date formatted as YYYY-MM-DD.
        * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[Unit] = js.native
      def get(callback: BodyResponseCallback[Unit]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
      def get(params: ParamsResourceDataGet): GaxiosPromise[Unit] = js.native
      def get(params: ParamsResourceDataGet, callback: BodyResponseCallback[Unit]): Unit = js.native
      def get(
        params: ParamsResourceDataGet,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def get(params: ParamsResourceDataGet, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def get(params: ParamsResourceDataGet, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management")
    @js.native
    class ResourceManagement protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var accounts: ResourceManagementAccounts = js.native
      
      var context: APIRequestContext = js.native
      
      var goals: ResourceManagementGoals = js.native
      
      var profiles: ResourceManagementProfiles = js.native
      
      var segments: ResourceManagementSegments = js.native
      
      var webproperties: ResourceManagementWebproperties = js.native
    }
    
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Accounts")
    @js.native
    class ResourceManagementAccounts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * analytics.management.accounts.list
        * @desc Lists all accounts to which the user has access.
        * @alias analytics.management.accounts.list
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {integer=} params.max-results The maximum number of accounts to include in this response.
        * @param {integer=} params.start-index An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[Unit] = js.native
      def list(callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementAccountsList): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementAccountsList, callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(
        params: ParamsResourceManagementAccountsList,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def list(params: ParamsResourceManagementAccountsList, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(
        params: ParamsResourceManagementAccountsList,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Goals")
    @js.native
    class ResourceManagementGoals protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * analytics.management.goals.list
        * @desc Lists goals to which the user has access.
        * @alias analytics.management.goals.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.accountId Account ID to retrieve goals for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
        * @param {integer=} params.max-results The maximum number of goals to include in this response.
        * @param {string} params.profileId View (Profile) ID to retrieve goals for. Can either be a specific view (profile) ID or '~all', which refers to all the views (profiles) that user has access to.
        * @param {integer=} params.start-index An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
        * @param {string} params.webPropertyId Web property ID to retrieve goals for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[Unit] = js.native
      def list(callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementGoalsList): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementGoalsList, callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(
        params: ParamsResourceManagementGoalsList,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def list(params: ParamsResourceManagementGoalsList, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(
        params: ParamsResourceManagementGoalsList,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Profiles")
    @js.native
    class ResourceManagementProfiles protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * analytics.management.profiles.list
        * @desc Lists views (profiles) to which the user has access.
        * @alias analytics.management.profiles.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.accountId Account ID for the views (profiles) to retrieve. Can either be a specific account ID or '~all', which refers to all the accounts to which the user has access.
        * @param {integer=} params.max-results The maximum number of views (profiles) to include in this response.
        * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
        * @param {string} params.webPropertyId Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties to which the user has access.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[Unit] = js.native
      def list(callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementProfilesList): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementProfilesList, callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(
        params: ParamsResourceManagementProfilesList,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def list(params: ParamsResourceManagementProfilesList, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(
        params: ParamsResourceManagementProfilesList,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Segments")
    @js.native
    class ResourceManagementSegments protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * analytics.management.segments.list
        * @desc Lists advanced segments to which the user has access.
        * @alias analytics.management.segments.list
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {integer=} params.max-results The maximum number of advanced segments to include in this response.
        * @param {integer=} params.start-index An index of the first advanced segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[Unit] = js.native
      def list(callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementSegmentsList): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementSegmentsList, callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(
        params: ParamsResourceManagementSegmentsList,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def list(params: ParamsResourceManagementSegmentsList, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(
        params: ParamsResourceManagementSegmentsList,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Webproperties")
    @js.native
    class ResourceManagementWebproperties protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * analytics.management.webproperties.list
        * @desc Lists web properties to which the user has access.
        * @alias analytics.management.webproperties.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.accountId Account ID to retrieve web properties for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
        * @param {integer=} params.max-results The maximum number of web properties to include in this response.
        * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[Unit] = js.native
      def list(callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementWebpropertiesList): GaxiosPromise[Unit] = js.native
      def list(params: ParamsResourceManagementWebpropertiesList, callback: BodyResponseCallback[Unit]): Unit = js.native
      def list(
        params: ParamsResourceManagementWebpropertiesList,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def list(params: ParamsResourceManagementWebpropertiesList, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def list(
        params: ParamsResourceManagementWebpropertiesList,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v2_4 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v2_4): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v2_4): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceDataGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * A comma-separated list of Analytics dimensions. E.g.,
        * 'ga:browser,ga:city'.
        */
      var dimensions: js.UndefOr[String] = js.native
      
      /**
        * End date for fetching report data. All requests should specify an end
        * date formatted as YYYY-MM-DD.
        */
      var `end-date`: js.UndefOr[String] = js.native
      
      /**
        * A comma-separated list of dimension or metric filters to be applied to
        * the report data.
        */
      var filters: js.UndefOr[String] = js.native
      
      /**
        * Unique table ID for retrieving report data. Table ID is of the form
        * ga:XXXX, where XXXX is the Analytics view (profile) ID.
        */
      var ids: js.UndefOr[String] = js.native
      
      /**
        * The maximum number of entries to include in this feed.
        */
      var `max-results`: js.UndefOr[Double] = js.native
      
      /**
        * A comma-separated list of Analytics metrics. E.g.,
        * 'ga:sessions,ga:pageviews'. At least one metric must be specified to
        * retrieve a valid Analytics report.
        */
      var metrics: js.UndefOr[String] = js.native
      
      /**
        * An Analytics advanced segment to be applied to the report data.
        */
      var segment: js.UndefOr[String] = js.native
      
      /**
        * A comma-separated list of dimensions or metrics that determine the sort
        * order for the report data.
        */
      var sort: js.UndefOr[String] = js.native
      
      /**
        * Start date for fetching report data. All requests should specify a start
        * date formatted as YYYY-MM-DD.
        */
      var `start-date`: js.UndefOr[String] = js.native
      
      /**
        * An index of the first entity to retrieve. Use this parameter as a
        * pagination mechanism along with the max-results parameter.
        */
      var `start-index`: js.UndefOr[Double] = js.native
    }
    object ParamsResourceDataGet {
      
      @scala.inline
      def apply(): ParamsResourceDataGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceDataGet]
      }
      
      @scala.inline
      implicit class ParamsResourceDataGetMutableBuilder[Self <: ParamsResourceDataGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
        
        @scala.inline
        def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setEnd-dateUndefined`: Self = StObject.set(x, "end-date", js.undefined)
        
        @scala.inline
        def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
        
        @scala.inline
        def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
        
        @scala.inline
        def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
        
        @scala.inline
        def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        @scala.inline
        def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
        
        @scala.inline
        def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        @scala.inline
        def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-dateUndefined`: Self = StObject.set(x, "start-date", js.undefined)
        
        @scala.inline
        def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceManagementAccountsList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The maximum number of accounts to include in this response.
        */
      var `max-results`: js.UndefOr[Double] = js.native
      
      /**
        * An index of the first account to retrieve. Use this parameter as a
        * pagination mechanism along with the max-results parameter.
        */
      var `start-index`: js.UndefOr[Double] = js.native
    }
    object ParamsResourceManagementAccountsList {
      
      @scala.inline
      def apply(): ParamsResourceManagementAccountsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceManagementAccountsList]
      }
      
      @scala.inline
      implicit class ParamsResourceManagementAccountsListMutableBuilder[Self <: ParamsResourceManagementAccountsList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
        
        @scala.inline
        def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceManagementGoalsList extends StandardParameters {
      
      /**
        * Account ID to retrieve goals for. Can either be a specific account ID or
        * '~all', which refers to all the accounts that user has access to.
        */
      var accountId: js.UndefOr[String] = js.native
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The maximum number of goals to include in this response.
        */
      var `max-results`: js.UndefOr[Double] = js.native
      
      /**
        * View (Profile) ID to retrieve goals for. Can either be a specific view
        * (profile) ID or '~all', which refers to all the views (profiles) that
        * user has access to.
        */
      var profileId: js.UndefOr[String] = js.native
      
      /**
        * An index of the first goal to retrieve. Use this parameter as a
        * pagination mechanism along with the max-results parameter.
        */
      var `start-index`: js.UndefOr[Double] = js.native
      
      /**
        * Web property ID to retrieve goals for. Can either be a specific web
        * property ID or '~all', which refers to all the web properties that user
        * has access to.
        */
      var webPropertyId: js.UndefOr[String] = js.native
    }
    object ParamsResourceManagementGoalsList {
      
      @scala.inline
      def apply(): ParamsResourceManagementGoalsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceManagementGoalsList]
      }
      
      @scala.inline
      implicit class ParamsResourceManagementGoalsListMutableBuilder[Self <: ParamsResourceManagementGoalsList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
        
        @scala.inline
        def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
        
        @scala.inline
        def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
        
        @scala.inline
        def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceManagementProfilesList extends StandardParameters {
      
      /**
        * Account ID for the views (profiles) to retrieve. Can either be a specific
        * account ID or '~all', which refers to all the accounts to which the user
        * has access.
        */
      var accountId: js.UndefOr[String] = js.native
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The maximum number of views (profiles) to include in this response.
        */
      var `max-results`: js.UndefOr[Double] = js.native
      
      /**
        * An index of the first entity to retrieve. Use this parameter as a
        * pagination mechanism along with the max-results parameter.
        */
      var `start-index`: js.UndefOr[Double] = js.native
      
      /**
        * Web property ID for the views (profiles) to retrieve. Can either be a
        * specific web property ID or '~all', which refers to all the web
        * properties to which the user has access.
        */
      var webPropertyId: js.UndefOr[String] = js.native
    }
    object ParamsResourceManagementProfilesList {
      
      @scala.inline
      def apply(): ParamsResourceManagementProfilesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceManagementProfilesList]
      }
      
      @scala.inline
      implicit class ParamsResourceManagementProfilesListMutableBuilder[Self <: ParamsResourceManagementProfilesList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
        
        @scala.inline
        def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
        
        @scala.inline
        def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceManagementSegmentsList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The maximum number of advanced segments to include in this response.
        */
      var `max-results`: js.UndefOr[Double] = js.native
      
      /**
        * An index of the first advanced segment to retrieve. Use this parameter as
        * a pagination mechanism along with the max-results parameter.
        */
      var `start-index`: js.UndefOr[Double] = js.native
    }
    object ParamsResourceManagementSegmentsList {
      
      @scala.inline
      def apply(): ParamsResourceManagementSegmentsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceManagementSegmentsList]
      }
      
      @scala.inline
      implicit class ParamsResourceManagementSegmentsListMutableBuilder[Self <: ParamsResourceManagementSegmentsList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
        
        @scala.inline
        def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceManagementWebpropertiesList extends StandardParameters {
      
      /**
        * Account ID to retrieve web properties for. Can either be a specific
        * account ID or '~all', which refers to all the accounts that user has
        * access to.
        */
      var accountId: js.UndefOr[String] = js.native
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The maximum number of web properties to include in this response.
        */
      var `max-results`: js.UndefOr[Double] = js.native
      
      /**
        * An index of the first entity to retrieve. Use this parameter as a
        * pagination mechanism along with the max-results parameter.
        */
      var `start-index`: js.UndefOr[Double] = js.native
    }
    object ParamsResourceManagementWebpropertiesList {
      
      @scala.inline
      def apply(): ParamsResourceManagementWebpropertiesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceManagementWebpropertiesList]
      }
      
      @scala.inline
      implicit class ParamsResourceManagementWebpropertiesListMutableBuilder[Self <: ParamsResourceManagementWebpropertiesList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
        
        @scala.inline
        def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
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
