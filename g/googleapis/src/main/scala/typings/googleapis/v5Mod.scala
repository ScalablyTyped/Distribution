package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Accessibility
import typings.googleapis.anon.BenchmarkIndex
import typings.googleapis.anon.CodeMessage
import typings.googleapis.anon.DescriptionTitle
import typings.googleapis.anon.EmulatedFormFactor
import typings.googleapis.anon.Group
import typings.googleapis.anon.Major
import typings.googleapis.anon.Percentile
import typings.googleapis.anon.RendererFormattedStrings
import typings.googleapis.anon.Total
import typings.googleapis.googleapisStrings.v5
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v5Mod {
  
  object pagespeedonlineV5 {
    
    /**
      * PageSpeed Insights API
      *
      * Analyzes the performance of a web page and provides tailored suggestions to
      * make that page faster.
      *
      * @example
      * const {google} = require('googleapis');
      * const pagespeedonline = google.pagespeedonline('v5');
      *
      * @namespace pagespeedonline
      * @type {Function}
      * @version v5
      * @variation v5
      * @param {object=} options Options for Pagespeedonline
      */
    @JSImport("googleapis/build/src/apis/pagespeedonline/v5", "pagespeedonline_v5.Pagespeedonline")
    @js.native
    class Pagespeedonline protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var pagespeedapi: ResourcePagespeedapi = js.native
    }
    
    @JSImport("googleapis/build/src/apis/pagespeedonline/v5", "pagespeedonline_v5.Resource$Pagespeedapi")
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
        * @param {string=} params.category A Lighthouse category to run; if none are given, only Performance category will be run
        * @param {string=} params.locale The locale used to localize formatted results
        * @param {string=} params.strategy The analysis strategy (desktop or mobile) to use, and desktop is the default
        * @param {string} params.url The URL to fetch and analyze
        * @param {string=} params.utm_campaign Campaign name for analytics.
        * @param {string=} params.utm_source Campaign source for analytics.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def runpagespeed(): GaxiosPromise[SchemaPagespeedApiPagespeedResponseV5] = js.native
      def runpagespeed(callback: BodyResponseCallback[SchemaPagespeedApiPagespeedResponseV5]): Unit = js.native
      def runpagespeed(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPagespeedApiPagespeedResponseV5] = js.native
      def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed): GaxiosPromise[SchemaPagespeedApiPagespeedResponseV5] = js.native
      def runpagespeed(
        params: ParamsResourcePagespeedapiRunpagespeed,
        callback: BodyResponseCallback[SchemaPagespeedApiPagespeedResponseV5]
      ): Unit = js.native
      def runpagespeed(
        params: ParamsResourcePagespeedapiRunpagespeed,
        options: BodyResponseCallback[SchemaPagespeedApiPagespeedResponseV5],
        callback: BodyResponseCallback[SchemaPagespeedApiPagespeedResponseV5]
      ): Unit = js.native
      def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed, options: MethodOptions): GaxiosPromise[SchemaPagespeedApiPagespeedResponseV5] = js.native
      def runpagespeed(
        params: ParamsResourcePagespeedapiRunpagespeed,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaPagespeedApiPagespeedResponseV5]
      ): Unit = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v5 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v5): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v5): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourcePagespeedapiRunpagespeed extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * A Lighthouse category to run; if none are given, only Performance
        * category will be run
        */
      var category: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * The locale used to localize formatted results
        */
      var locale: js.UndefOr[String] = js.native
      
      /**
        * The analysis strategy (desktop or mobile) to use, and desktop is the
        * default
        */
      var strategy: js.UndefOr[String] = js.native
      
      /**
        * The URL to fetch and analyze
        */
      var url: js.UndefOr[String] = js.native
      
      /**
        * Campaign name for analytics.
        */
      var utm_campaign: js.UndefOr[String] = js.native
      
      /**
        * Campaign source for analytics.
        */
      var utm_source: js.UndefOr[String] = js.native
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
        def setCategory(value: js.Array[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        @scala.inline
        def setCategoryVarargs(value: String*): Self = StObject.set(x, "category", js.Array(value :_*))
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        @scala.inline
        def setUtm_campaign(value: String): Self = StObject.set(x, "utm_campaign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUtm_campaignUndefined: Self = StObject.set(x, "utm_campaign", js.undefined)
        
        @scala.inline
        def setUtm_source(value: String): Self = StObject.set(x, "utm_source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUtm_sourceUndefined: Self = StObject.set(x, "utm_source", js.undefined)
      }
    }
    
    @js.native
    trait SchemaGoogleprotobufValue extends StObject
    
    @js.native
    trait SchemaLighthouseAuditResultV5 extends StObject {
      
      /**
        * The description of the audit.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * Freeform details section of the audit.
        */
      var details: js.UndefOr[StringDictionary[js.Any]] = js.native
      
      /**
        * The value that should be displayed on the UI for this audit.
        */
      var displayValue: js.UndefOr[String] = js.native
      
      /**
        * An error message from a thrown error inside the audit.
        */
      var errorMessage: js.UndefOr[String] = js.native
      
      /**
        * An explanation of the errors in the audit.
        */
      var explanation: js.UndefOr[String] = js.native
      
      /**
        * The audit&#39;s id.
        */
      var id: js.UndefOr[String] = js.native
      
      var score: js.UndefOr[js.Any] = js.native
      
      /**
        * The enumerated score display mode.
        */
      var scoreDisplayMode: js.UndefOr[String] = js.native
      
      /**
        * The human readable title.
        */
      var title: js.UndefOr[String] = js.native
      
      var warnings: js.UndefOr[js.Any] = js.native
    }
    object SchemaLighthouseAuditResultV5 {
      
      @scala.inline
      def apply(): SchemaLighthouseAuditResultV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLighthouseAuditResultV5]
      }
      
      @scala.inline
      implicit class SchemaLighthouseAuditResultV5MutableBuilder[Self <: SchemaLighthouseAuditResultV5] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setDetails(value: StringDictionary[js.Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        @scala.inline
        def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
        
        @scala.inline
        def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
        
        @scala.inline
        def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setScore(value: js.Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScoreDisplayMode(value: String): Self = StObject.set(x, "scoreDisplayMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScoreDisplayModeUndefined: Self = StObject.set(x, "scoreDisplayMode", js.undefined)
        
        @scala.inline
        def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setWarnings(value: js.Any): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      }
    }
    
    @js.native
    trait SchemaLighthouseCategoryV5 extends StObject {
      
      /**
        * An array of references to all the audit members of this category.
        */
      var auditRefs: js.UndefOr[js.Array[Group]] = js.native
      
      /**
        * A more detailed description of the category and its importance.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * The string identifier of the category.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * A description for the manual audits in the category.
        */
      var manualDescription: js.UndefOr[String] = js.native
      
      var score: js.UndefOr[js.Any] = js.native
      
      /**
        * The human-friendly name of the category.
        */
      var title: js.UndefOr[String] = js.native
    }
    object SchemaLighthouseCategoryV5 {
      
      @scala.inline
      def apply(): SchemaLighthouseCategoryV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLighthouseCategoryV5]
      }
      
      @scala.inline
      implicit class SchemaLighthouseCategoryV5MutableBuilder[Self <: SchemaLighthouseCategoryV5] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuditRefs(value: js.Array[Group]): Self = StObject.set(x, "auditRefs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuditRefsUndefined: Self = StObject.set(x, "auditRefs", js.undefined)
        
        @scala.inline
        def setAuditRefsVarargs(value: Group*): Self = StObject.set(x, "auditRefs", js.Array(value :_*))
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setManualDescription(value: String): Self = StObject.set(x, "manualDescription", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManualDescriptionUndefined: Self = StObject.set(x, "manualDescription", js.undefined)
        
        @scala.inline
        def setScore(value: js.Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait SchemaLighthouseResultV5 extends StObject {
      
      /**
        * Map of audits in the LHR.
        */
      var audits: js.UndefOr[StringDictionary[SchemaLighthouseAuditResultV5]] = js.native
      
      /**
        * Map of categories in the LHR.
        */
      var categories: js.UndefOr[Accessibility] = js.native
      
      /**
        * Map of category groups in the LHR.
        */
      var categoryGroups: js.UndefOr[StringDictionary[DescriptionTitle]] = js.native
      
      /**
        * The configuration settings for this LHR.
        */
      var configSettings: js.UndefOr[EmulatedFormFactor] = js.native
      
      /**
        * Environment settings that were used when making this LHR.
        */
      var environment: js.UndefOr[BenchmarkIndex] = js.native
      
      /**
        * The time that this run was fetched.
        */
      var fetchTime: js.UndefOr[String] = js.native
      
      /**
        * The final resolved url that was audited.
        */
      var finalUrl: js.UndefOr[String] = js.native
      
      /**
        * The internationalization strings that are required to render the LHR.
        */
      var i18n: js.UndefOr[RendererFormattedStrings] = js.native
      
      /**
        * The lighthouse version that was used to generate this LHR.
        */
      var lighthouseVersion: js.UndefOr[String] = js.native
      
      /**
        * The original requested url.
        */
      var requestedUrl: js.UndefOr[String] = js.native
      
      /**
        * List of all run warnings in the LHR. Will always output to at least `[]`.
        */
      var runWarnings: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * A top-level error message that, if present, indicates a serious enough
        * problem that this Lighthouse result may need to be discarded.
        */
      var runtimeError: js.UndefOr[CodeMessage] = js.native
      
      /**
        * Timing information for this LHR.
        */
      var timing: js.UndefOr[Total] = js.native
      
      /**
        * The user agent that was used to run this LHR.
        */
      var userAgent: js.UndefOr[String] = js.native
    }
    object SchemaLighthouseResultV5 {
      
      @scala.inline
      def apply(): SchemaLighthouseResultV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLighthouseResultV5]
      }
      
      @scala.inline
      implicit class SchemaLighthouseResultV5MutableBuilder[Self <: SchemaLighthouseResultV5] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudits(value: StringDictionary[SchemaLighthouseAuditResultV5]): Self = StObject.set(x, "audits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuditsUndefined: Self = StObject.set(x, "audits", js.undefined)
        
        @scala.inline
        def setCategories(value: Accessibility): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        @scala.inline
        def setCategoryGroups(value: StringDictionary[DescriptionTitle]): Self = StObject.set(x, "categoryGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoryGroupsUndefined: Self = StObject.set(x, "categoryGroups", js.undefined)
        
        @scala.inline
        def setConfigSettings(value: EmulatedFormFactor): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConfigSettingsUndefined: Self = StObject.set(x, "configSettings", js.undefined)
        
        @scala.inline
        def setEnvironment(value: BenchmarkIndex): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
        
        @scala.inline
        def setFetchTime(value: String): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
        
        @scala.inline
        def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFinalUrlUndefined: Self = StObject.set(x, "finalUrl", js.undefined)
        
        @scala.inline
        def setI18n(value: RendererFormattedStrings): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
        
        @scala.inline
        def setLighthouseVersion(value: String): Self = StObject.set(x, "lighthouseVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLighthouseVersionUndefined: Self = StObject.set(x, "lighthouseVersion", js.undefined)
        
        @scala.inline
        def setRequestedUrl(value: String): Self = StObject.set(x, "requestedUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestedUrlUndefined: Self = StObject.set(x, "requestedUrl", js.undefined)
        
        @scala.inline
        def setRunWarnings(value: js.Array[_]): Self = StObject.set(x, "runWarnings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRunWarningsUndefined: Self = StObject.set(x, "runWarnings", js.undefined)
        
        @scala.inline
        def setRunWarningsVarargs(value: js.Any*): Self = StObject.set(x, "runWarnings", js.Array(value :_*))
        
        @scala.inline
        def setRuntimeError(value: CodeMessage): Self = StObject.set(x, "runtimeError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuntimeErrorUndefined: Self = StObject.set(x, "runtimeError", js.undefined)
        
        @scala.inline
        def setTiming(value: Total): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
        
        @scala.inline
        def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      }
    }
    
    @js.native
    trait SchemaPagespeedApiLoadingExperienceV5 extends StObject {
      
      /**
        * The url, pattern or origin which the metrics are on.
        */
      var id: js.UndefOr[String] = js.native
      
      var initial_url: js.UndefOr[String] = js.native
      
      var metrics: js.UndefOr[StringDictionary[Percentile]] = js.native
      
      var overall_category: js.UndefOr[String] = js.native
    }
    object SchemaPagespeedApiLoadingExperienceV5 {
      
      @scala.inline
      def apply(): SchemaPagespeedApiLoadingExperienceV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPagespeedApiLoadingExperienceV5]
      }
      
      @scala.inline
      implicit class SchemaPagespeedApiLoadingExperienceV5MutableBuilder[Self <: SchemaPagespeedApiLoadingExperienceV5] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitial_urlUndefined: Self = StObject.set(x, "initial_url", js.undefined)
        
        @scala.inline
        def setMetrics(value: StringDictionary[Percentile]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        @scala.inline
        def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverall_categoryUndefined: Self = StObject.set(x, "overall_category", js.undefined)
      }
    }
    
    @js.native
    trait SchemaPagespeedApiPagespeedResponseV5 extends StObject {
      
      /**
        * The UTC timestamp of this analysis.
        */
      var analysisUTCTimestamp: js.UndefOr[String] = js.native
      
      /**
        * The captcha verify result
        */
      var captchaResult: js.UndefOr[String] = js.native
      
      /**
        * Canonicalized and final URL for the document, after following page
        * redirects (if any).
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * Kind of result.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Lighthouse response for the audit url as an object.
        */
      var lighthouseResult: js.UndefOr[SchemaLighthouseResultV5] = js.native
      
      /**
        * Metrics of end users&#39; page loading experience.
        */
      var loadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
      
      /**
        * Metrics of the aggregated page loading experience of the origin
        */
      var originLoadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
      
      /**
        * The version of PageSpeed used to generate these results.
        */
      var version: js.UndefOr[Major] = js.native
    }
    object SchemaPagespeedApiPagespeedResponseV5 {
      
      @scala.inline
      def apply(): SchemaPagespeedApiPagespeedResponseV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV5]
      }
      
      @scala.inline
      implicit class SchemaPagespeedApiPagespeedResponseV5MutableBuilder[Self <: SchemaPagespeedApiPagespeedResponseV5] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnalysisUTCTimestamp(value: String): Self = StObject.set(x, "analysisUTCTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnalysisUTCTimestampUndefined: Self = StObject.set(x, "analysisUTCTimestamp", js.undefined)
        
        @scala.inline
        def setCaptchaResult(value: String): Self = StObject.set(x, "captchaResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaptchaResultUndefined: Self = StObject.set(x, "captchaResult", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLighthouseResult(value: SchemaLighthouseResultV5): Self = StObject.set(x, "lighthouseResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLighthouseResultUndefined: Self = StObject.set(x, "lighthouseResult", js.undefined)
        
        @scala.inline
        def setLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = StObject.set(x, "loadingExperience", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadingExperienceUndefined: Self = StObject.set(x, "loadingExperience", js.undefined)
        
        @scala.inline
        def setOriginLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = StObject.set(x, "originLoadingExperience", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginLoadingExperienceUndefined: Self = StObject.set(x, "originLoadingExperience", js.undefined)
        
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
