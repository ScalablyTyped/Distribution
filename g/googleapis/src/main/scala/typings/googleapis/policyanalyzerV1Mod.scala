package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
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

object policyanalyzerV1Mod {
  
  object policyanalyzerV1 {
    
    @JSImport("googleapis/build/src/apis/policyanalyzer/v1", "policyanalyzer_v1.Policyanalyzer")
    @js.native
    open class Policyanalyzer protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/policyanalyzer/v1", "policyanalyzer_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var locations: ResourceProjectsLocations = js.native
    }
    
    @JSImport("googleapis/build/src/apis/policyanalyzer/v1", "policyanalyzer_v1.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var activityTypes: ResourceProjectsLocationsActivitytypes = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/policyanalyzer/v1", "policyanalyzer_v1.Resource$Projects$Locations$Activitytypes")
    @js.native
    open class ResourceProjectsLocationsActivitytypes protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var activities: ResourceProjectsLocationsActivitytypesActivities = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/policyanalyzer/v1", "policyanalyzer_v1.Resource$Projects$Locations$Activitytypes$Activities")
    @js.native
    open class ResourceProjectsLocationsActivitytypesActivities protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def query(): GaxiosPromise[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse] = js.native
      def query(callback: BodyResponseCallback[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse]): Unit = js.native
      def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse] = js.native
      def query(params: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery): GaxiosPromise[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse] = js.native
      def query(
        params: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery,
        callback: BodyResponseCallback[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse]
      ): Unit = js.native
      def query(
        params: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery,
        options: BodyResponseCallback[Readable | SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse],
        callback: BodyResponseCallback[Readable | SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse]
      ): Unit = js.native
      def query(params: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse] = js.native
      def query(
        params: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse]
      ): Unit = js.native
      /**
        * Queries policy activities on Google Cloud resources.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/policyanalyzer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const policyanalyzer = google.policyanalyzer('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res =
        *     await policyanalyzer.projects.locations.activityTypes.activities.query({
        *       // Optional. Filter expression to restrict the activities returned. For serviceAccountLastAuthentication activities, supported filters are: - `activities.full_resource_name {=\} [STRING]` - `activities.fullResourceName {=\} [STRING]` where `[STRING]` is the full resource name of the service account. For serviceAccountKeyLastAuthentication activities, supported filters are: - `activities.full_resource_name {=\} [STRING]` - `activities.fullResourceName {=\} [STRING]` where `[STRING]` is the full resource name of the service account key.
        *       filter: 'placeholder-value',
        *       // Optional. The maximum number of results to return from this request. Max limit is 1000. Non-positive values are ignored. The presence of `nextPageToken` in the response indicates that more results might be available.
        *       pageSize: 'placeholder-value',
        *       // Optional. If present, then retrieve the next batch of results from the preceding call to this method. `pageToken` must be the value of `nextPageToken` from the previous response. The values of other method parameters should be identical to those in the previous call.
        *       pageToken: 'placeholder-value',
        *       // Required. The container resource on which to execute the request. Acceptable formats: `projects/[PROJECT_ID|PROJECT_NUMBER]/locations/[LOCATION]/activityTypes/[ACTIVITY_TYPE]` LOCATION here refers to Google Cloud Locations: https://cloud.google.com/about/locations/
        *       parent:
        *         'projects/my-project/locations/my-location/activityTypes/my-activityType',
        *     });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "activities": [],
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
      def query(params: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def query(
        params: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery,
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
    
    trait ParamsResourceProjectsLocationsActivitytypesActivitiesQuery
      extends StObject
         with StandardParameters {
      
      /**
        * Optional. Filter expression to restrict the activities returned. For serviceAccountLastAuthentication activities, supported filters are: - `activities.full_resource_name {=\} [STRING]` - `activities.fullResourceName {=\} [STRING]` where `[STRING]` is the full resource name of the service account. For serviceAccountKeyLastAuthentication activities, supported filters are: - `activities.full_resource_name {=\} [STRING]` - `activities.fullResourceName {=\} [STRING]` where `[STRING]` is the full resource name of the service account key.
        */
      var filter: js.UndefOr[String] = js.undefined
      
      /**
        * Optional. The maximum number of results to return from this request. Max limit is 1000. Non-positive values are ignored. The presence of `nextPageToken` in the response indicates that more results might be available.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional. If present, then retrieve the next batch of results from the preceding call to this method. `pageToken` must be the value of `nextPageToken` from the previous response. The values of other method parameters should be identical to those in the previous call.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. The container resource on which to execute the request. Acceptable formats: `projects/[PROJECT_ID|PROJECT_NUMBER]/locations/[LOCATION]/activityTypes/[ACTIVITY_TYPE]` LOCATION here refers to Google Cloud Locations: https://cloud.google.com/about/locations/
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsLocationsActivitytypesActivitiesQuery {
      
      inline def apply(): ParamsResourceProjectsLocationsActivitytypesActivitiesQuery = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsLocationsActivitytypesActivitiesQuery]
      }
      
      extension [Self <: ParamsResourceProjectsLocationsActivitytypesActivitiesQuery](x: Self) {
        
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
    
    trait SchemaGoogleCloudPolicyanalyzerV1Activity extends StObject {
      
      /**
        * A struct of custom fields to explain the activity.
        */
      var activity: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
      
      /**
        * The type of the activity.
        */
      var activityType: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The full resource name that identifies the resource. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
        */
      var fullResourceName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The data observation period to build the activity.
        */
      var observationPeriod: js.UndefOr[SchemaGoogleCloudPolicyanalyzerV1ObservationPeriod] = js.undefined
    }
    object SchemaGoogleCloudPolicyanalyzerV1Activity {
      
      inline def apply(): SchemaGoogleCloudPolicyanalyzerV1Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleCloudPolicyanalyzerV1Activity]
      }
      
      extension [Self <: SchemaGoogleCloudPolicyanalyzerV1Activity](x: Self) {
        
        inline def setActivity(value: StringDictionary[Any]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
        
        inline def setActivityNull: Self = StObject.set(x, "activity", null)
        
        inline def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
        
        inline def setActivityTypeNull: Self = StObject.set(x, "activityType", null)
        
        inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
        
        inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
        
        inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
        
        inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
        
        inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
        
        inline def setObservationPeriod(value: SchemaGoogleCloudPolicyanalyzerV1ObservationPeriod): Self = StObject.set(x, "observationPeriod", value.asInstanceOf[js.Any])
        
        inline def setObservationPeriodUndefined: Self = StObject.set(x, "observationPeriod", js.undefined)
      }
    }
    
    trait SchemaGoogleCloudPolicyanalyzerV1ObservationPeriod extends StObject {
      
      /**
        * The observation end time. The time in this timestamp is always `07:00:00Z`.
        */
      var endTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The observation start time. The time in this timestamp is always `07:00:00Z`.
        */
      var startTime: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleCloudPolicyanalyzerV1ObservationPeriod {
      
      inline def apply(): SchemaGoogleCloudPolicyanalyzerV1ObservationPeriod = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleCloudPolicyanalyzerV1ObservationPeriod]
      }
      
      extension [Self <: SchemaGoogleCloudPolicyanalyzerV1ObservationPeriod](x: Self) {
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    trait SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse extends StObject {
      
      /**
        * The set of activities that match the filter included in the request.
        */
      var activities: js.UndefOr[js.Array[SchemaGoogleCloudPolicyanalyzerV1Activity]] = js.undefined
      
      /**
        * If there might be more results than those appearing in this response, then `nextPageToken` is included. To get the next set of results, call this method again using the value of `nextPageToken` as `pageToken`.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse {
      
      inline def apply(): SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse]
      }
      
      extension [Self <: SchemaGoogleCloudPolicyanalyzerV1QueryActivityResponse](x: Self) {
        
        inline def setActivities(value: js.Array[SchemaGoogleCloudPolicyanalyzerV1Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
        
        inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
        
        inline def setActivitiesVarargs(value: SchemaGoogleCloudPolicyanalyzerV1Activity*): Self = StObject.set(x, "activities", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
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
