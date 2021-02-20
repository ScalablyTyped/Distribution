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

object v1Mod {
  
  object abusiveexperiencereportV1 {
    
    /**
      * Abusive Experience Report API
      *
      * Views Abusive Experience Report data, and gets a list of sites that have a
      * significant number of abusive experiences.
      *
      * @example
      * const {google} = require('googleapis');
      * const abusiveexperiencereport = google.abusiveexperiencereport('v1');
      *
      * @namespace abusiveexperiencereport
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Abusiveexperiencereport
      */
    @JSImport("googleapis/build/src/apis/abusiveexperiencereport/v1", "abusiveexperiencereport_v1.Abusiveexperiencereport")
    @js.native
    class Abusiveexperiencereport protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var sites: ResourceSites = js.native
      
      var violatingSites: ResourceViolatingsites = js.native
    }
    
    @JSImport("googleapis/build/src/apis/abusiveexperiencereport/v1", "abusiveexperiencereport_v1.Resource$Sites")
    @js.native
    class ResourceSites protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * abusiveexperiencereport.sites.get
        * @desc Gets a summary of the abusive experience rating of a site.
        * @alias abusiveexperiencereport.sites.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The required site name. This is the site property whose abusive experiences have been reviewed, and it must be URL-encoded. For example, sites/https%3A%2F%2Fwww.google.com. The server will return an error of BAD_REQUEST if this field is not filled in. Note that if the site property is not yet verified in Search Console, the reportUrl field returned by the API will lead to the verification page, prompting the user to go through that process before they can gain access to the Abusive Experience Report.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(callback: BodyResponseCallback[SchemaSiteSummaryResponse]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(params: ParamsResourceSitesGet): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(params: ParamsResourceSitesGet, callback: BodyResponseCallback[SchemaSiteSummaryResponse]): Unit = js.native
      def get(
        params: ParamsResourceSitesGet,
        options: BodyResponseCallback[SchemaSiteSummaryResponse],
        callback: BodyResponseCallback[SchemaSiteSummaryResponse]
      ): Unit = js.native
      def get(params: ParamsResourceSitesGet, options: MethodOptions): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(
        params: ParamsResourceSitesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteSummaryResponse]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/abusiveexperiencereport/v1", "abusiveexperiencereport_v1.Resource$Violatingsites")
    @js.native
    class ResourceViolatingsites protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * abusiveexperiencereport.violatingSites.list
        * @desc Lists sites with Abusive Experience Report statuses of "Failing".
        * @alias abusiveexperiencereport.violatingSites.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaViolatingSitesResponse]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(params: ParamsResourceViolatingsitesList): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(
        params: ParamsResourceViolatingsitesList,
        callback: BodyResponseCallback[SchemaViolatingSitesResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceViolatingsitesList,
        options: BodyResponseCallback[SchemaViolatingSitesResponse],
        callback: BodyResponseCallback[SchemaViolatingSitesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceViolatingsitesList, options: MethodOptions): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(
        params: ParamsResourceViolatingsitesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaViolatingSitesResponse]
      ): Unit = js.native
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
    trait ParamsResourceSitesGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The required site name. This is the site property whose abusive
        * experiences have been reviewed, and it must be URL-encoded. For example,
        * sites/https%3A%2F%2Fwww.google.com. The server will return an error of
        * BAD_REQUEST if this field is not filled in. Note that if the site
        * property is not yet verified in Search Console, the reportUrl field
        * returned by the API will lead to the verification page, prompting the
        * user to go through that process before they can gain access to the
        * Abusive Experience Report.
        */
      var name: js.UndefOr[String] = js.native
    }
    object ParamsResourceSitesGet {
      
      @scala.inline
      def apply(): ParamsResourceSitesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceSitesGet]
      }
      
      @scala.inline
      implicit class ParamsResourceSitesGetMutableBuilder[Self <: ParamsResourceSitesGet] (val x: Self) extends AnyVal {
        
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
    
    @js.native
    trait ParamsResourceViolatingsitesList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
    }
    object ParamsResourceViolatingsitesList {
      
      @scala.inline
      def apply(): ParamsResourceViolatingsitesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceViolatingsitesList]
      }
      
      @scala.inline
      implicit class ParamsResourceViolatingsitesListMutableBuilder[Self <: ParamsResourceViolatingsitesList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
    
    /**
      * Response message for GetSiteSummary.
      */
    @js.native
    trait SchemaSiteSummaryResponse extends StObject {
      
      /**
        * The status of the site reviewed for the abusive experiences.
        */
      var abusiveStatus: js.UndefOr[String] = js.native
      
      /**
        * The date on which enforcement begins.
        */
      var enforcementTime: js.UndefOr[String] = js.native
      
      /**
        * The abusive experience enforcement status of the site.
        */
      var filterStatus: js.UndefOr[String] = js.native
      
      /**
        * The last time that the site changed status.
        */
      var lastChangeTime: js.UndefOr[String] = js.native
      
      /**
        * A link that leads to a full abusive experience report.
        */
      var reportUrl: js.UndefOr[String] = js.native
      
      /**
        * The name of the site reviewed.
        */
      var reviewedSite: js.UndefOr[String] = js.native
      
      /**
        * Whether the site is currently under review.
        */
      var underReview: js.UndefOr[Boolean] = js.native
    }
    object SchemaSiteSummaryResponse {
      
      @scala.inline
      def apply(): SchemaSiteSummaryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSiteSummaryResponse]
      }
      
      @scala.inline
      implicit class SchemaSiteSummaryResponseMutableBuilder[Self <: SchemaSiteSummaryResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbusiveStatus(value: String): Self = StObject.set(x, "abusiveStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbusiveStatusUndefined: Self = StObject.set(x, "abusiveStatus", js.undefined)
        
        @scala.inline
        def setEnforcementTime(value: String): Self = StObject.set(x, "enforcementTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnforcementTimeUndefined: Self = StObject.set(x, "enforcementTime", js.undefined)
        
        @scala.inline
        def setFilterStatus(value: String): Self = StObject.set(x, "filterStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterStatusUndefined: Self = StObject.set(x, "filterStatus", js.undefined)
        
        @scala.inline
        def setLastChangeTime(value: String): Self = StObject.set(x, "lastChangeTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastChangeTimeUndefined: Self = StObject.set(x, "lastChangeTime", js.undefined)
        
        @scala.inline
        def setReportUrl(value: String): Self = StObject.set(x, "reportUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportUrlUndefined: Self = StObject.set(x, "reportUrl", js.undefined)
        
        @scala.inline
        def setReviewedSite(value: String): Self = StObject.set(x, "reviewedSite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReviewedSiteUndefined: Self = StObject.set(x, "reviewedSite", js.undefined)
        
        @scala.inline
        def setUnderReview(value: Boolean): Self = StObject.set(x, "underReview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnderReviewUndefined: Self = StObject.set(x, "underReview", js.undefined)
      }
    }
    
    /**
      * Response message for ListViolatingSites.
      */
    @js.native
    trait SchemaViolatingSitesResponse extends StObject {
      
      /**
        * A list of summaries of violating sites.
        */
      var violatingSites: js.UndefOr[js.Array[SchemaSiteSummaryResponse]] = js.native
    }
    object SchemaViolatingSitesResponse {
      
      @scala.inline
      def apply(): SchemaViolatingSitesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaViolatingSitesResponse]
      }
      
      @scala.inline
      implicit class SchemaViolatingSitesResponseMutableBuilder[Self <: SchemaViolatingSitesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setViolatingSites(value: js.Array[SchemaSiteSummaryResponse]): Self = StObject.set(x, "violatingSites", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViolatingSitesUndefined: Self = StObject.set(x, "violatingSites", js.undefined)
        
        @scala.inline
        def setViolatingSitesVarargs(value: SchemaSiteSummaryResponse*): Self = StObject.set(x, "violatingSites", js.Array(value :_*))
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
