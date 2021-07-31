package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.CssResponseBytes
import typings.googleapis.anon.Left
import typings.googleapis.anon.Major
import typings.googleapis.anon.Rects
import typings.googleapis.anon.RuleResults
import typings.googleapis.anon.Score
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagespeedonlineV2Mod {
  
  object pagespeedonlineV2 {
    
    /**
      * PageSpeed Insights API
      *
      * Analyzes the performance of a web page and provides tailored suggestions to
      * make that page faster.
      *
      * @example
      * const {google} = require('googleapis');
      * const pagespeedonline = google.pagespeedonline('v2');
      *
      * @namespace pagespeedonline
      * @type {Function}
      * @version v2
      * @variation v2
      * @param {object=} options Options for Pagespeedonline
      */
    @JSImport("googleapis/build/src/apis/pagespeedonline/v2", "pagespeedonline_v2.Pagespeedonline")
    @js.native
    class Pagespeedonline protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var pagespeedapi: ResourcePagespeedapi = js.native
    }
    
    @JSImport("googleapis/build/src/apis/pagespeedonline/v2", "pagespeedonline_v2.Resource$Pagespeedapi")
    @js.native
    class ResourcePagespeedapi protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * pagespeedonline.pagespeedapi.runpagespeed
        * @desc Runs PageSpeed analysis on the page at the specified URL, and
        * returns PageSpeed scores, a list of suggestions to make that page faster,
        * and other information.
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
      def runpagespeed(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResult] = js.native
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
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v2
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v2")
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourcePagespeedapiRunpagespeed
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Indicates if third party resources should be filtered out before
        * PageSpeed analysis.
        */
      var filter_third_party_resources: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The locale used to localize formatted results
        */
      var locale: js.UndefOr[String] = js.undefined
      
      /**
        * A PageSpeed rule to run; if none are given, all rules are run
        */
      var rule: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Indicates if binary data containing a screenshot should be included
        */
      var screenshot: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The analysis strategy to use
        */
      var strategy: js.UndefOr[String] = js.undefined
      
      /**
        * The URL to fetch and analyze
        */
      var url: js.UndefOr[String] = js.undefined
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
    
    trait SchemaPagespeedApiFormatStringV2 extends StObject {
      
      /**
        * List of arguments for the format string.
        */
      var args: js.UndefOr[js.Array[Rects]] = js.undefined
      
      /**
        * A localized format string with {{FOO}} placeholders, where &#39;FOO&#39;
        * is the key of the argument whose value should be substituted. For
        * HYPERLINK arguments, the format string will instead contain {{BEGIN_FOO}}
        * and {{END_FOO}} for the argument with key &#39;FOO&#39;.
        */
      var format: js.UndefOr[String] = js.undefined
    }
    object SchemaPagespeedApiFormatStringV2 {
      
      @scala.inline
      def apply(): SchemaPagespeedApiFormatStringV2 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPagespeedApiFormatStringV2]
      }
      
      @scala.inline
      implicit class SchemaPagespeedApiFormatStringV2MutableBuilder[Self <: SchemaPagespeedApiFormatStringV2] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: js.Array[Rects]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setArgsVarargs(value: Rects*): Self = StObject.set(x, "args", js.Array(value :_*))
        
        @scala.inline
        def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      }
    }
    
    trait SchemaPagespeedApiImageV2 extends StObject {
      
      /**
        * Image data base64 encoded.
        */
      var data: js.UndefOr[String] = js.undefined
      
      /**
        * Height of screenshot in pixels.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * Unique string key, if any, identifying this image.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * Mime type of image data (e.g. &quot;image/jpeg&quot;).
        */
      var mime_type: js.UndefOr[String] = js.undefined
      
      /**
        * The region of the page that is captured by this image, with dimensions
        * measured in CSS pixels.
        */
      var page_rect: js.UndefOr[Left] = js.undefined
      
      /**
        * Width of screenshot in pixels.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object SchemaPagespeedApiImageV2 {
      
      @scala.inline
      def apply(): SchemaPagespeedApiImageV2 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPagespeedApiImageV2]
      }
      
      @scala.inline
      implicit class SchemaPagespeedApiImageV2MutableBuilder[Self <: SchemaPagespeedApiImageV2] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
        
        @scala.inline
        def setPage_rect(value: Left): Self = StObject.set(x, "page_rect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPage_rectUndefined: Self = StObject.set(x, "page_rect", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait SchemaResult extends StObject {
      
      /**
        * The captcha verify result
        */
      var captchaResult: js.UndefOr[String] = js.undefined
      
      /**
        * Localized PageSpeed results. Contains a ruleResults entry for each
        * PageSpeed rule instantiated and run by the server.
        */
      var formattedResults: js.UndefOr[RuleResults] = js.undefined
      
      /**
        * Canonicalized and final URL for the document, after following page
        * redirects (if any).
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * List of rules that were specified in the request, but which the server
        * did not know how to instantiate.
        */
      var invalidRules: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Kind of result.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * Summary statistics for the page, such as number of JavaScript bytes,
        * number of HTML bytes, etc.
        */
      var pageStats: js.UndefOr[CssResponseBytes] = js.undefined
      
      /**
        * Response code for the document. 200 indicates a normal page load. 4xx/5xx
        * indicates an error.
        */
      var responseCode: js.UndefOr[Double] = js.undefined
      
      /**
        * A map with one entry for each rule group in these results.
        */
      var ruleGroups: js.UndefOr[StringDictionary[Score]] = js.undefined
      
      /**
        * Base64-encoded screenshot of the page that was analyzed.
        */
      var screenshot: js.UndefOr[SchemaPagespeedApiImageV2] = js.undefined
      
      /**
        * Title of the page, as displayed in the browser&#39;s title bar.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The version of PageSpeed used to generate these results.
        */
      var version: js.UndefOr[Major] = js.undefined
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
        def setFormattedResults(value: RuleResults): Self = StObject.set(x, "formattedResults", value.asInstanceOf[js.Any])
        
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
        def setRuleGroups(value: StringDictionary[Score]): Self = StObject.set(x, "ruleGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleGroupsUndefined: Self = StObject.set(x, "ruleGroups", js.undefined)
        
        @scala.inline
        def setScreenshot(value: SchemaPagespeedApiImageV2): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
        
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
