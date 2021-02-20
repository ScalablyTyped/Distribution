package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
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

object runV1Mod {
  
  object runV1 {
    
    @JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Projects")
    @js.native
    class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var locations: ResourceProjectsLocations = js.native
    }
    
    @JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Projects$Locations")
    @js.native
    class ResourceProjectsLocations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * run.projects.locations.get
        * @desc Gets information about a location.
        * @alias run.projects.locations.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name Resource name for the location.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaLocation] = js.native
      def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
      def get(params: ParamsResourceProjectsLocationsGet): GaxiosPromise[SchemaLocation] = js.native
      def get(params: ParamsResourceProjectsLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
      def get(
        params: ParamsResourceProjectsLocationsGet,
        options: BodyResponseCallback[SchemaLocation],
        callback: BodyResponseCallback[SchemaLocation]
      ): Unit = js.native
      def get(params: ParamsResourceProjectsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
      def get(
        params: ParamsResourceProjectsLocationsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaLocation]
      ): Unit = js.native
    }
    
    /**
      * Cloud Run API
      *
      * Deploy and manage user provided container images that scale automatically
      * based on HTTP traffic.
      *
      * @example
      * const {google} = require('googleapis');
      * const run = google.run('v1');
      *
      * @namespace run
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Run
      */
    @JSImport("googleapis/build/src/apis/run/v1", "run_v1.Run")
    @js.native
    class Run protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
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
    trait ParamsResourceProjectsLocationsGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Resource name for the location.
        */
      var name: js.UndefOr[String] = js.native
    }
    object ParamsResourceProjectsLocationsGet {
      
      @scala.inline
      def apply(): ParamsResourceProjectsLocationsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsLocationsGet]
      }
      
      @scala.inline
      implicit class ParamsResourceProjectsLocationsGetMutableBuilder[Self <: ParamsResourceProjectsLocationsGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    /**
      * A resource that represents Google Cloud Platform location.
      */
    @js.native
    trait SchemaLocation extends StObject {
      
      /**
        * The friendly name for this location, typically a nearby city name. For
        * example, &quot;Tokyo&quot;.
        */
      var displayName: js.UndefOr[String] = js.native
      
      /**
        * Cross-service attributes for the location. For example
        * {&quot;cloud.googleapis.com/region&quot;: &quot;us-east1&quot;}
        */
      var labels: js.UndefOr[StringDictionary[String]] = js.native
      
      /**
        * The canonical id for this location. For example: `&quot;us-east1&quot;`.
        */
      var locationId: js.UndefOr[String] = js.native
      
      /**
        * Service-specific metadata. For example the available capacity at the
        * given location.
        */
      var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
      
      /**
        * Resource name for the location, which may vary between implementations.
        * For example: `&quot;projects/example-project/locations/us-east1&quot;`
        */
      var name: js.UndefOr[String] = js.native
    }
    object SchemaLocation {
      
      @scala.inline
      def apply(): SchemaLocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLocation]
      }
      
      @scala.inline
      implicit class SchemaLocationMutableBuilder[Self <: SchemaLocation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
        
        @scala.inline
        def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.native
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.native
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.native
      
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
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.native
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.native
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
        def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
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
        def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        @scala.inline
        def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
