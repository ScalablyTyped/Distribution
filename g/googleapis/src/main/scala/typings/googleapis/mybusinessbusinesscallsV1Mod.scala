package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mybusinessbusinesscallsV1Mod {
  
  object mybusinessbusinesscallsV1 {
    
    @JSImport("googleapis/build/src/apis/mybusinessbusinesscalls/v1", "mybusinessbusinesscalls_v1.Mybusinessbusinesscalls")
    @js.native
    open class Mybusinessbusinesscalls protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var locations: ResourceLocations = js.native
    }
    
    @JSImport("googleapis/build/src/apis/mybusinessbusinesscalls/v1", "mybusinessbusinesscalls_v1.Resource$Locations")
    @js.native
    open class ResourceLocations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var businesscallsinsights: ResourceLocationsBusinesscallsinsights = js.native
      
      var context: APIRequestContext = js.native
      
      def getBusinesscallssettings(): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def getBusinesscallssettings(callback: BodyResponseCallback[SchemaBusinessCallsSettings]): Unit = js.native
      def getBusinesscallssettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def getBusinesscallssettings(params: ParamsResourceLocationsGetbusinesscallssettings): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def getBusinesscallssettings(
        params: ParamsResourceLocationsGetbusinesscallssettings,
        callback: BodyResponseCallback[SchemaBusinessCallsSettings]
      ): Unit = js.native
      def getBusinesscallssettings(
        params: ParamsResourceLocationsGetbusinesscallssettings,
        options: BodyResponseCallback[Readable | SchemaBusinessCallsSettings],
        callback: BodyResponseCallback[Readable | SchemaBusinessCallsSettings]
      ): Unit = js.native
      def getBusinesscallssettings(params: ParamsResourceLocationsGetbusinesscallssettings, options: MethodOptions): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def getBusinesscallssettings(
        params: ParamsResourceLocationsGetbusinesscallssettings,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBusinessCallsSettings]
      ): Unit = js.native
      /**
        * Returns the Business calls settings resource for the given location.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/mybusinessbusinesscalls.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const mybusinessbusinesscalls = google.mybusinessbusinesscalls('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await mybusinessbusinesscalls.locations.getBusinesscallssettings({
        *     // Required. The BusinessCallsSettings to get. The `name` field is used to identify the business call settings to get. Format: locations/{location_id\}/businesscallssettings.
        *     name: 'locations/my-location/businesscallssettings',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "callsState": "my_callsState",
        *   //   "consentTime": "my_consentTime",
        *   //   "name": "my_name"
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def getBusinesscallssettings(params: ParamsResourceLocationsGetbusinesscallssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def getBusinesscallssettings(
        params: ParamsResourceLocationsGetbusinesscallssettings,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def updateBusinesscallssettings(): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def updateBusinesscallssettings(callback: BodyResponseCallback[SchemaBusinessCallsSettings]): Unit = js.native
      def updateBusinesscallssettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def updateBusinesscallssettings(params: ParamsResourceLocationsUpdatebusinesscallssettings): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def updateBusinesscallssettings(
        params: ParamsResourceLocationsUpdatebusinesscallssettings,
        callback: BodyResponseCallback[SchemaBusinessCallsSettings]
      ): Unit = js.native
      def updateBusinesscallssettings(
        params: ParamsResourceLocationsUpdatebusinesscallssettings,
        options: BodyResponseCallback[Readable | SchemaBusinessCallsSettings],
        callback: BodyResponseCallback[Readable | SchemaBusinessCallsSettings]
      ): Unit = js.native
      def updateBusinesscallssettings(params: ParamsResourceLocationsUpdatebusinesscallssettings, options: MethodOptions): GaxiosPromise[SchemaBusinessCallsSettings] = js.native
      def updateBusinesscallssettings(
        params: ParamsResourceLocationsUpdatebusinesscallssettings,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBusinessCallsSettings]
      ): Unit = js.native
      /**
        * Updates the Business call settings for the specified location.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/mybusinessbusinesscalls.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const mybusinessbusinesscalls = google.mybusinessbusinesscalls('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res =
        *     await mybusinessbusinesscalls.locations.updateBusinesscallssettings({
        *       // Required. The resource name of the calls settings. Format: locations/{location\}/businesscallssettings
        *       name: 'locations/my-location/businesscallssettings',
        *       // Required. The list of fields to update.
        *       updateMask: 'placeholder-value',
        *
        *       // Request body metadata
        *       requestBody: {
        *         // request body parameters
        *         // {
        *         //   "callsState": "my_callsState",
        *         //   "consentTime": "my_consentTime",
        *         //   "name": "my_name"
        *         // }
        *       },
        *     });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "callsState": "my_callsState",
        *   //   "consentTime": "my_consentTime",
        *   //   "name": "my_name"
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def updateBusinesscallssettings(params: ParamsResourceLocationsUpdatebusinesscallssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def updateBusinesscallssettings(
        params: ParamsResourceLocationsUpdatebusinesscallssettings,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/mybusinessbusinesscalls/v1", "mybusinessbusinesscalls_v1.Resource$Locations$Businesscallsinsights")
    @js.native
    open class ResourceLocationsBusinesscallsinsights protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaListBusinessCallsInsightsResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListBusinessCallsInsightsResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBusinessCallsInsightsResponse] = js.native
      def list(params: ParamsResourceLocationsBusinesscallsinsightsList): GaxiosPromise[SchemaListBusinessCallsInsightsResponse] = js.native
      def list(
        params: ParamsResourceLocationsBusinesscallsinsightsList,
        callback: BodyResponseCallback[SchemaListBusinessCallsInsightsResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceLocationsBusinesscallsinsightsList,
        options: BodyResponseCallback[Readable | SchemaListBusinessCallsInsightsResponse],
        callback: BodyResponseCallback[Readable | SchemaListBusinessCallsInsightsResponse]
      ): Unit = js.native
      def list(params: ParamsResourceLocationsBusinesscallsinsightsList, options: MethodOptions): GaxiosPromise[SchemaListBusinessCallsInsightsResponse] = js.native
      def list(
        params: ParamsResourceLocationsBusinesscallsinsightsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListBusinessCallsInsightsResponse]
      ): Unit = js.native
      /**
        * Returns insights for Business calls for a location.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/mybusinessbusinesscalls.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const mybusinessbusinesscalls = google.mybusinessbusinesscalls('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res =
        *     await mybusinessbusinesscalls.locations.businesscallsinsights.list({
        *       // Optional. A filter constraining the calls insights to return. The response includes only entries that match the filter. If the MetricType is not provided, AGGREGATE_COUNT is returned. If no end_date is provided, the last date for which data is available is used. If no start_date is provided, we will default to the first date for which data is available, which is currently 6 months. If start_date is before the date when data is available, data is returned starting from the date when it is available. At this time we support following filters. 1. start_date="DATE" where date is in YYYY-MM-DD format. 2. end_date="DATE" where date is in YYYY-MM-DD format. 3. metric_type=XYZ where XYZ is a valid MetricType. 4. Conjunctions(AND) of all of the above. e.g., "start_date=2021-08-01 AND end_date=2021-08-10 AND metric_type=AGGREGATE_COUNT" The AGGREGATE_COUNT metric_type ignores the DD part of the date.
        *       filter: 'placeholder-value',
        *       // Optional. The maximum number of BusinessCallsInsights to return. If unspecified, at most 20 will be returned. Some of the metric_types(e.g, AGGREGATE_COUNT) returns a single page. For these metrics, the page_size is ignored.
        *       pageSize: 'placeholder-value',
        *       // Optional. A page token, received from a previous `ListBusinessCallsInsights` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBusinessCallsInsights` must match the call that provided the page token. Some of the metric_types (e.g, AGGREGATE_COUNT) returns a single page. For these metrics, the pake_token is ignored.
        *       pageToken: 'placeholder-value',
        *       // Required. The parent location to fetch calls insights for. Format: locations/{location_id\}
        *       parent: 'locations/my-location',
        *     });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "businessCallsInsights": [],
        *   //   "nextPageToken": "my_nextPageToken"
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def list(params: ParamsResourceLocationsBusinesscallsinsightsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceLocationsBusinesscallsinsightsList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
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
    
    trait ParamsResourceLocationsBusinesscallsinsightsList
      extends StObject
         with StandardParameters {
      
      /**
        * Optional. A filter constraining the calls insights to return. The response includes only entries that match the filter. If the MetricType is not provided, AGGREGATE_COUNT is returned. If no end_date is provided, the last date for which data is available is used. If no start_date is provided, we will default to the first date for which data is available, which is currently 6 months. If start_date is before the date when data is available, data is returned starting from the date when it is available. At this time we support following filters. 1. start_date="DATE" where date is in YYYY-MM-DD format. 2. end_date="DATE" where date is in YYYY-MM-DD format. 3. metric_type=XYZ where XYZ is a valid MetricType. 4. Conjunctions(AND) of all of the above. e.g., "start_date=2021-08-01 AND end_date=2021-08-10 AND metric_type=AGGREGATE_COUNT" The AGGREGATE_COUNT metric_type ignores the DD part of the date.
        */
      var filter: js.UndefOr[String] = js.undefined
      
      /**
        * Optional. The maximum number of BusinessCallsInsights to return. If unspecified, at most 20 will be returned. Some of the metric_types(e.g, AGGREGATE_COUNT) returns a single page. For these metrics, the page_size is ignored.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional. A page token, received from a previous `ListBusinessCallsInsights` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBusinessCallsInsights` must match the call that provided the page token. Some of the metric_types (e.g, AGGREGATE_COUNT) returns a single page. For these metrics, the pake_token is ignored.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. The parent location to fetch calls insights for. Format: locations/{location_id\}
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLocationsBusinesscallsinsightsList {
      
      inline def apply(): ParamsResourceLocationsBusinesscallsinsightsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLocationsBusinesscallsinsightsList]
      }
      
      extension [Self <: ParamsResourceLocationsBusinesscallsinsightsList](x: Self) {
        
        inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait ParamsResourceLocationsGetbusinesscallssettings
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The BusinessCallsSettings to get. The `name` field is used to identify the business call settings to get. Format: locations/{location_id\}/businesscallssettings.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLocationsGetbusinesscallssettings {
      
      inline def apply(): ParamsResourceLocationsGetbusinesscallssettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLocationsGetbusinesscallssettings]
      }
      
      extension [Self <: ParamsResourceLocationsGetbusinesscallssettings](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceLocationsUpdatebusinesscallssettings
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The resource name of the calls settings. Format: locations/{location\}/businesscallssettings
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaBusinessCallsSettings] = js.undefined
      
      /**
        * Required. The list of fields to update.
        */
      var updateMask: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLocationsUpdatebusinesscallssettings {
      
      inline def apply(): ParamsResourceLocationsUpdatebusinesscallssettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLocationsUpdatebusinesscallssettings]
      }
      
      extension [Self <: ParamsResourceLocationsUpdatebusinesscallssettings](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRequestBody(value: SchemaBusinessCallsSettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
        
        inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
      }
    }
    
    trait SchemaAggregateMetrics extends StObject {
      
      /**
        * Total count of answered calls.
        */
      var answeredCallsCount: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * End date for this metric.
        */
      var endDate: js.UndefOr[SchemaDate] = js.undefined
      
      /**
        * A list of metrics by hour of day.
        */
      var hourlyMetrics: js.UndefOr[js.Array[SchemaHourlyMetrics]] = js.undefined
      
      /**
        * Total count of missed calls.
        */
      var missedCallsCount: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Date for this metric. If metric is monthly, only year and month are used.
        */
      var startDate: js.UndefOr[SchemaDate] = js.undefined
      
      /**
        * A list of metrics by day of week.
        */
      var weekdayMetrics: js.UndefOr[js.Array[SchemaWeekDayMetrics]] = js.undefined
    }
    object SchemaAggregateMetrics {
      
      inline def apply(): SchemaAggregateMetrics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAggregateMetrics]
      }
      
      extension [Self <: SchemaAggregateMetrics](x: Self) {
        
        inline def setAnsweredCallsCount(value: Double): Self = StObject.set(x, "answeredCallsCount", value.asInstanceOf[js.Any])
        
        inline def setAnsweredCallsCountNull: Self = StObject.set(x, "answeredCallsCount", null)
        
        inline def setAnsweredCallsCountUndefined: Self = StObject.set(x, "answeredCallsCount", js.undefined)
        
        inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
        
        inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
        
        inline def setHourlyMetrics(value: js.Array[SchemaHourlyMetrics]): Self = StObject.set(x, "hourlyMetrics", value.asInstanceOf[js.Any])
        
        inline def setHourlyMetricsUndefined: Self = StObject.set(x, "hourlyMetrics", js.undefined)
        
        inline def setHourlyMetricsVarargs(value: SchemaHourlyMetrics*): Self = StObject.set(x, "hourlyMetrics", js.Array(value*))
        
        inline def setMissedCallsCount(value: Double): Self = StObject.set(x, "missedCallsCount", value.asInstanceOf[js.Any])
        
        inline def setMissedCallsCountNull: Self = StObject.set(x, "missedCallsCount", null)
        
        inline def setMissedCallsCountUndefined: Self = StObject.set(x, "missedCallsCount", js.undefined)
        
        inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
        
        inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
        
        inline def setWeekdayMetrics(value: js.Array[SchemaWeekDayMetrics]): Self = StObject.set(x, "weekdayMetrics", value.asInstanceOf[js.Any])
        
        inline def setWeekdayMetricsUndefined: Self = StObject.set(x, "weekdayMetrics", js.undefined)
        
        inline def setWeekdayMetricsVarargs(value: SchemaWeekDayMetrics*): Self = StObject.set(x, "weekdayMetrics", js.Array(value*))
      }
    }
    
    trait SchemaBusinessCallsInsights extends StObject {
      
      /**
        * Metric for the time range based on start_date and end_date.
        */
      var aggregateMetrics: js.UndefOr[SchemaAggregateMetrics] = js.undefined
      
      /**
        * The metric for which the value applies.
        */
      var metricType: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Required. The resource name of the calls insights. Format: locations/{location\}/businesscallsinsights
        */
      var name: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaBusinessCallsInsights {
      
      inline def apply(): SchemaBusinessCallsInsights = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBusinessCallsInsights]
      }
      
      extension [Self <: SchemaBusinessCallsInsights](x: Self) {
        
        inline def setAggregateMetrics(value: SchemaAggregateMetrics): Self = StObject.set(x, "aggregateMetrics", value.asInstanceOf[js.Any])
        
        inline def setAggregateMetricsUndefined: Self = StObject.set(x, "aggregateMetrics", js.undefined)
        
        inline def setMetricType(value: String): Self = StObject.set(x, "metricType", value.asInstanceOf[js.Any])
        
        inline def setMetricTypeNull: Self = StObject.set(x, "metricType", null)
        
        inline def setMetricTypeUndefined: Self = StObject.set(x, "metricType", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait SchemaBusinessCallsSettings extends StObject {
      
      /**
        * Required. The state of this location's enrollment in Business calls.
        */
      var callsState: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Input only. Time when the end user provided consent to the API user to enable business calls.
        */
      var consentTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Required. The resource name of the calls settings. Format: locations/{location\}/businesscallssettings
        */
      var name: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaBusinessCallsSettings {
      
      inline def apply(): SchemaBusinessCallsSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBusinessCallsSettings]
      }
      
      extension [Self <: SchemaBusinessCallsSettings](x: Self) {
        
        inline def setCallsState(value: String): Self = StObject.set(x, "callsState", value.asInstanceOf[js.Any])
        
        inline def setCallsStateNull: Self = StObject.set(x, "callsState", null)
        
        inline def setCallsStateUndefined: Self = StObject.set(x, "callsState", js.undefined)
        
        inline def setConsentTime(value: String): Self = StObject.set(x, "consentTime", value.asInstanceOf[js.Any])
        
        inline def setConsentTimeNull: Self = StObject.set(x, "consentTime", null)
        
        inline def setConsentTimeUndefined: Self = StObject.set(x, "consentTime", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait SchemaDate extends StObject {
      
      /**
        * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        */
      var day: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        */
      var month: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        */
      var year: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaDate {
      
      inline def apply(): SchemaDate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDate]
      }
      
      extension [Self <: SchemaDate](x: Self) {
        
        inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayNull: Self = StObject.set(x, "day", null)
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthNull: Self = StObject.set(x, "month", null)
        
        inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        inline def setYearNull: Self = StObject.set(x, "year", null)
        
        inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
    
    trait SchemaHourlyMetrics extends StObject {
      
      /**
        * Hour of the day. Allowed values are 0-23.
        */
      var hour: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Total count of missed calls for this hour.
        */
      var missedCallsCount: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaHourlyMetrics {
      
      inline def apply(): SchemaHourlyMetrics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaHourlyMetrics]
      }
      
      extension [Self <: SchemaHourlyMetrics](x: Self) {
        
        inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
        
        inline def setHourNull: Self = StObject.set(x, "hour", null)
        
        inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
        
        inline def setMissedCallsCount(value: Double): Self = StObject.set(x, "missedCallsCount", value.asInstanceOf[js.Any])
        
        inline def setMissedCallsCountNull: Self = StObject.set(x, "missedCallsCount", null)
        
        inline def setMissedCallsCountUndefined: Self = StObject.set(x, "missedCallsCount", js.undefined)
      }
    }
    
    trait SchemaListBusinessCallsInsightsResponse extends StObject {
      
      /**
        * A collection of business calls insights for the location.
        */
      var businessCallsInsights: js.UndefOr[js.Array[SchemaBusinessCallsInsights]] = js.undefined
      
      /**
        * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. Some of the metric_types (e.g, AGGREGATE_COUNT) returns a single page. For these metrics, the next_page_token will be empty.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaListBusinessCallsInsightsResponse {
      
      inline def apply(): SchemaListBusinessCallsInsightsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListBusinessCallsInsightsResponse]
      }
      
      extension [Self <: SchemaListBusinessCallsInsightsResponse](x: Self) {
        
        inline def setBusinessCallsInsights(value: js.Array[SchemaBusinessCallsInsights]): Self = StObject.set(x, "businessCallsInsights", value.asInstanceOf[js.Any])
        
        inline def setBusinessCallsInsightsUndefined: Self = StObject.set(x, "businessCallsInsights", js.undefined)
        
        inline def setBusinessCallsInsightsVarargs(value: SchemaBusinessCallsInsights*): Self = StObject.set(x, "businessCallsInsights", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait SchemaWeekDayMetrics extends StObject {
      
      /**
        * Day of the week. Allowed values are Sunday - Saturday.
        */
      var day: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Total count of missed calls for this hour.
        */
      var missedCallsCount: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaWeekDayMetrics {
      
      inline def apply(): SchemaWeekDayMetrics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWeekDayMetrics]
      }
      
      extension [Self <: SchemaWeekDayMetrics](x: Self) {
        
        inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayNull: Self = StObject.set(x, "day", null)
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setMissedCallsCount(value: Double): Self = StObject.set(x, "missedCallsCount", value.asInstanceOf[js.Any])
        
        inline def setMissedCallsCountNull: Self = StObject.set(x, "missedCallsCount", null)
        
        inline def setMissedCallsCountUndefined: Self = StObject.set(x, "missedCallsCount", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
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
        * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
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
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
