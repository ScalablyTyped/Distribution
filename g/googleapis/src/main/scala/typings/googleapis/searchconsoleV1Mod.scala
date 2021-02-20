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

object searchconsoleV1Mod {
  
  object searchconsoleV1 {
    
    @JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Urltestingtools")
    @js.native
    class ResourceUrltestingtools protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var mobileFriendlyTest: ResourceUrltestingtoolsMobilefriendlytest = js.native
    }
    
    @JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Urltestingtools$Mobilefriendlytest")
    @js.native
    class ResourceUrltestingtoolsMobilefriendlytest protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * searchconsole.urlTestingTools.mobileFriendlyTest.run
        * @desc Runs Mobile-Friendly Test for a given URL.
        * @alias searchconsole.urlTestingTools.mobileFriendlyTest.run
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {().RunMobileFriendlyTestRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def run(): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
      def run(callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]): Unit = js.native
      def run(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
      def run(params: ParamsResourceUrltestingtoolsMobilefriendlytestRun): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
      def run(
        params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
        callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
      ): Unit = js.native
      def run(
        params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
        options: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse],
        callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
      ): Unit = js.native
      def run(params: ParamsResourceUrltestingtoolsMobilefriendlytestRun, options: MethodOptions): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
      def run(
        params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
      ): Unit = js.native
    }
    
    /**
      * Google Search Console URL Testing Tools API
      *
      * Provides tools for running validation tests against single URLs
      *
      * @example
      * const {google} = require('googleapis');
      * const searchconsole = google.searchconsole('v1');
      *
      * @namespace searchconsole
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Searchconsole
      */
    @JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Searchconsole")
    @js.native
    class Searchconsole protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var urlTestingTools: ResourceUrltestingtools = js.native
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
    trait ParamsResourceUrltestingtoolsMobilefriendlytestRun extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaRunMobileFriendlyTestRequest] = js.native
    }
    object ParamsResourceUrltestingtoolsMobilefriendlytestRun {
      
      @scala.inline
      def apply(): ParamsResourceUrltestingtoolsMobilefriendlytestRun = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrltestingtoolsMobilefriendlytestRun]
      }
      
      @scala.inline
      implicit class ParamsResourceUrltestingtoolsMobilefriendlytestRunMutableBuilder[Self <: ParamsResourceUrltestingtoolsMobilefriendlytestRun] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaRunMobileFriendlyTestRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    /**
      * Blocked resource.
      */
    @js.native
    trait SchemaBlockedResource extends StObject {
      
      /**
        * URL of the blocked resource.
        */
      var url: js.UndefOr[String] = js.native
    }
    object SchemaBlockedResource {
      
      @scala.inline
      def apply(): SchemaBlockedResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBlockedResource]
      }
      
      @scala.inline
      implicit class SchemaBlockedResourceMutableBuilder[Self <: SchemaBlockedResource] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * Describe image data.
      */
    @js.native
    trait SchemaImage extends StObject {
      
      /**
        * Image data in format determined by the mime type. Currently, the format
        * will always be &quot;image/png&quot;, but this might change in the
        * future.
        */
      var data: js.UndefOr[String] = js.native
      
      /**
        * The mime-type of the image data.
        */
      var mimeType: js.UndefOr[String] = js.native
    }
    object SchemaImage {
      
      @scala.inline
      def apply(): SchemaImage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaImage]
      }
      
      @scala.inline
      implicit class SchemaImageMutableBuilder[Self <: SchemaImage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      }
    }
    
    /**
      * Mobile-friendly issue.
      */
    @js.native
    trait SchemaMobileFriendlyIssue extends StObject {
      
      /**
        * Rule violated.
        */
      var rule: js.UndefOr[String] = js.native
    }
    object SchemaMobileFriendlyIssue {
      
      @scala.inline
      def apply(): SchemaMobileFriendlyIssue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaMobileFriendlyIssue]
      }
      
      @scala.inline
      implicit class SchemaMobileFriendlyIssueMutableBuilder[Self <: SchemaMobileFriendlyIssue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      }
    }
    
    /**
      * Information about a resource with issue.
      */
    @js.native
    trait SchemaResourceIssue extends StObject {
      
      /**
        * Describes a blocked resource issue.
        */
      var blockedResource: js.UndefOr[SchemaBlockedResource] = js.native
    }
    object SchemaResourceIssue {
      
      @scala.inline
      def apply(): SchemaResourceIssue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaResourceIssue]
      }
      
      @scala.inline
      implicit class SchemaResourceIssueMutableBuilder[Self <: SchemaResourceIssue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlockedResource(value: SchemaBlockedResource): Self = StObject.set(x, "blockedResource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockedResourceUndefined: Self = StObject.set(x, "blockedResource", js.undefined)
      }
    }
    
    /**
      * Mobile-friendly test request.
      */
    @js.native
    trait SchemaRunMobileFriendlyTestRequest extends StObject {
      
      /**
        * Whether or not screenshot is requested. Default is false.
        */
      var requestScreenshot: js.UndefOr[Boolean] = js.native
      
      /**
        * URL for inspection.
        */
      var url: js.UndefOr[String] = js.native
    }
    object SchemaRunMobileFriendlyTestRequest {
      
      @scala.inline
      def apply(): SchemaRunMobileFriendlyTestRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRunMobileFriendlyTestRequest]
      }
      
      @scala.inline
      implicit class SchemaRunMobileFriendlyTestRequestMutableBuilder[Self <: SchemaRunMobileFriendlyTestRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRequestScreenshot(value: Boolean): Self = StObject.set(x, "requestScreenshot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestScreenshotUndefined: Self = StObject.set(x, "requestScreenshot", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * Mobile-friendly test response, including mobile-friendly issues and
      * resource issues.
      */
    @js.native
    trait SchemaRunMobileFriendlyTestResponse extends StObject {
      
      /**
        * Test verdict, whether the page is mobile friendly or not.
        */
      var mobileFriendliness: js.UndefOr[String] = js.native
      
      /**
        * List of mobile-usability issues.
        */
      var mobileFriendlyIssues: js.UndefOr[js.Array[SchemaMobileFriendlyIssue]] = js.native
      
      /**
        * Information about embedded resources issues.
        */
      var resourceIssues: js.UndefOr[js.Array[SchemaResourceIssue]] = js.native
      
      /**
        * Screenshot of the requested URL.
        */
      var screenshot: js.UndefOr[SchemaImage] = js.native
      
      /**
        * Final state of the test, can be either complete or an error.
        */
      var testStatus: js.UndefOr[SchemaTestStatus] = js.native
    }
    object SchemaRunMobileFriendlyTestResponse {
      
      @scala.inline
      def apply(): SchemaRunMobileFriendlyTestResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaRunMobileFriendlyTestResponse]
      }
      
      @scala.inline
      implicit class SchemaRunMobileFriendlyTestResponseMutableBuilder[Self <: SchemaRunMobileFriendlyTestResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMobileFriendliness(value: String): Self = StObject.set(x, "mobileFriendliness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMobileFriendlinessUndefined: Self = StObject.set(x, "mobileFriendliness", js.undefined)
        
        @scala.inline
        def setMobileFriendlyIssues(value: js.Array[SchemaMobileFriendlyIssue]): Self = StObject.set(x, "mobileFriendlyIssues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMobileFriendlyIssuesUndefined: Self = StObject.set(x, "mobileFriendlyIssues", js.undefined)
        
        @scala.inline
        def setMobileFriendlyIssuesVarargs(value: SchemaMobileFriendlyIssue*): Self = StObject.set(x, "mobileFriendlyIssues", js.Array(value :_*))
        
        @scala.inline
        def setResourceIssues(value: js.Array[SchemaResourceIssue]): Self = StObject.set(x, "resourceIssues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceIssuesUndefined: Self = StObject.set(x, "resourceIssues", js.undefined)
        
        @scala.inline
        def setResourceIssuesVarargs(value: SchemaResourceIssue*): Self = StObject.set(x, "resourceIssues", js.Array(value :_*))
        
        @scala.inline
        def setScreenshot(value: SchemaImage): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
        
        @scala.inline
        def setTestStatus(value: SchemaTestStatus): Self = StObject.set(x, "testStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestStatusUndefined: Self = StObject.set(x, "testStatus", js.undefined)
      }
    }
    
    /**
      * Final state of the test, including error details if necessary.
      */
    @js.native
    trait SchemaTestStatus extends StObject {
      
      /**
        * Error details if applicable.
        */
      var details: js.UndefOr[String] = js.native
      
      /**
        * Status of the test.
        */
      var status: js.UndefOr[String] = js.native
    }
    object SchemaTestStatus {
      
      @scala.inline
      def apply(): SchemaTestStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTestStatus]
      }
      
      @scala.inline
      implicit class SchemaTestStatusMutableBuilder[Self <: SchemaTestStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
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
