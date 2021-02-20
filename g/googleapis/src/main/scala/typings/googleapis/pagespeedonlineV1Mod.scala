package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.CssResponseBytes
import typings.googleapis.anon.Data
import typings.googleapis.anon.Locale
import typings.googleapis.anon.Major
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

object pagespeedonlineV1Mod {
  
  object pagespeedonlineV1 {
    
    /**
      * PageSpeed Insights API
      *
      * Analyzes the performance of a web page and provides tailored suggestions to
      * make that page faster.
      *
      * @example
      * const {google} = require('googleapis');
      * const pagespeedonline = google.pagespeedonline('v1');
      *
      * @namespace pagespeedonline
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Pagespeedonline
      */
    @JSImport("googleapis/build/src/apis/pagespeedonline/v1", "pagespeedonline_v1.Pagespeedonline")
    @js.native
    class Pagespeedonline protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var pagespeedapi: ResourcePagespeedapi = js.native
    }
    
    @JSImport("googleapis/build/src/apis/pagespeedonline/v1", "pagespeedonline_v1.Resource$Pagespeedapi")
    @js.native
    class ResourcePagespeedapi protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * pagespeedonline.pagespeedapi.runpagespeed
        * @desc Runs PageSpeed analysis on the page at the specified URL, and
        * returns a PageSpeed score, a list of suggestions to make that page
        * faster, and other information.
        * @alias pagespeedonline.pagespeedapi.runpagespeed
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {boolean=} params.filter_third_party_resources Indicates if third party resources should be filtered out before PageSpeed analysis.
        * @param {string=} params.locale The locale used to localize formatted results
        * @param {string=} params.rule A PageSpeed rule to run; if none are given, all rules are run
        * @param {boolean=} params.screenshot Indicates if binary data containing a screenshot should be included
        * @param {string=} params.strategy The analysis strategy to use
        * @param {string} params.url The URL to fetch and analyze
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def runpagespeed(): GaxiosPromise[SchemaResult] = js.native
      def runpagespeed(callback: BodyResponseCallback[SchemaResult]): Unit = js.native
      def runpagespeed(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResult] = js.native
      def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed): GaxiosPromise[SchemaResult] = js.native
      def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed, callback: BodyResponseCallback[SchemaResult]): Unit = js.native
      def runpagespeed(
        params: ParamsResourcePagespeedapiRunpagespeed,
        options: BodyResponseCallback[SchemaResult],
        callback: BodyResponseCallback[SchemaResult]
      ): Unit = js.native
      def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed, options: MethodOptions): GaxiosPromise[SchemaResult] = js.native
      def runpagespeed(
        params: ParamsResourcePagespeedapiRunpagespeed,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaResult]
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
    trait ParamsResourcePagespeedapiRunpagespeed extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Indicates if third party resources should be filtered out before
        * PageSpeed analysis.
        */
      var filter_third_party_resources: js.UndefOr[Boolean] = js.native
      
      /**
        * The locale used to localize formatted results
        */
      var locale: js.UndefOr[String] = js.native
      
      /**
        * A PageSpeed rule to run; if none are given, all rules are run
        */
      var rule: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Indicates if binary data containing a screenshot should be included
        */
      var screenshot: js.UndefOr[Boolean] = js.native
      
      /**
        * The analysis strategy to use
        */
      var strategy: js.UndefOr[String] = js.native
      
      /**
        * The URL to fetch and analyze
        */
      var url: js.UndefOr[String] = js.native
    }
    object ParamsResourcePagespeedapiRunpagespeed {
      
      @scala.inline
      def apply(): ParamsResourcePagespeedapiRunpagespeed = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePagespeedapiRunpagespeed]
      }
      
      @scala.inline
      implicit class ParamsResourcePagespeedapiRunpagespeedMutableBuilder[Self <: ParamsResourcePagespeedapiRunpagespeed] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setFilter_third_party_resources(value: Boolean): Self = StObject.set(x, "filter_third_party_resources", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilter_third_party_resourcesUndefined: Self = StObject.set(x, "filter_third_party_resources", js.undefined)
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setRule(value: js.Array[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
        
        @scala.inline
        def setRuleVarargs(value: String*): Self = StObject.set(x, "rule", js.Array(value :_*))
        
        @scala.inline
        def setScreenshot(value: Boolean): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
        
        @scala.inline
        def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait SchemaResult extends StObject {
      
      /**
        * The captcha verify result
        */
      var captchaResult: js.UndefOr[String] = js.native
      
      /**
        * Localized PageSpeed results. Contains a ruleResults entry for each
        * PageSpeed rule instantiated and run by the server.
        */
      var formattedResults: js.UndefOr[Locale] = js.native
      
      /**
        * Canonicalized and final URL for the document, after following page
        * redirects (if any).
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * List of rules that were specified in the request, but which the server
        * did not know how to instantiate.
        */
      var invalidRules: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Kind of result.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Summary statistics for the page, such as number of JavaScript bytes,
        * number of HTML bytes, etc.
        */
      var pageStats: js.UndefOr[CssResponseBytes] = js.native
      
      /**
        * Response code for the document. 200 indicates a normal page load. 4xx/5xx
        * indicates an error.
        */
      var responseCode: js.UndefOr[Double] = js.native
      
      /**
        * The PageSpeed Score (0-100), which indicates how much faster a page could
        * be. A high score indicates little room for improvement, while a lower
        * score indicates more room for improvement.
        */
      var score: js.UndefOr[Double] = js.native
      
      /**
        * Base64-encoded screenshot of the page that was analyzed.
        */
      var screenshot: js.UndefOr[Data] = js.native
      
      /**
        * Title of the page, as displayed in the browser&#39;s title bar.
        */
      var title: js.UndefOr[String] = js.native
      
      /**
        * The version of PageSpeed used to generate these results.
        */
      var version: js.UndefOr[Major] = js.native
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
        def setCaptchaResult(value: String): Self = StObject.set(x, "captchaResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaptchaResultUndefined: Self = StObject.set(x, "captchaResult", js.undefined)
        
        @scala.inline
        def setFormattedResults(value: Locale): Self = StObject.set(x, "formattedResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedResultsUndefined: Self = StObject.set(x, "formattedResults", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setInvalidRules(value: js.Array[String]): Self = StObject.set(x, "invalidRules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvalidRulesUndefined: Self = StObject.set(x, "invalidRules", js.undefined)
        
        @scala.inline
        def setInvalidRulesVarargs(value: String*): Self = StObject.set(x, "invalidRules", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setPageStats(value: CssResponseBytes): Self = StObject.set(x, "pageStats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageStatsUndefined: Self = StObject.set(x, "pageStats", js.undefined)
        
        @scala.inline
        def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
        
        @scala.inline
        def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
        
        @scala.inline
        def setScreenshot(value: Data): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setVersion(value: Major): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
