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
      def runpagespeed(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPagespeedApiPagespeedResponseV5] = js.native
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
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v5
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v5")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v5): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
        * A Lighthouse category to run; if none are given, only Performance
        * category will be run
        */
      var category: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The locale used to localize formatted results
        */
      var locale: js.UndefOr[String] = js.undefined
      
      /**
        * The analysis strategy (desktop or mobile) to use, and desktop is the
        * default
        */
      var strategy: js.UndefOr[String] = js.undefined
      
      /**
        * The URL to fetch and analyze
        */
      var url: js.UndefOr[String] = js.undefined
      
      /**
        * Campaign name for analytics.
        */
      var utm_campaign: js.UndefOr[String] = js.undefined
      
      /**
        * Campaign source for analytics.
        */
      var utm_source: js.UndefOr[String] = js.undefined
    }
    object ParamsResourcePagespeedapiRunpagespeed {
      
      inline def apply(): ParamsResourcePagespeedapiRunpagespeed = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePagespeedapiRunpagespeed]
      }
      
      extension [Self <: ParamsResourcePagespeedapiRunpagespeed](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCategory(value: js.Array[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        inline def setCategoryVarargs(value: String*): Self = StObject.set(x, "category", js.Array(value :_*))
        
        inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
        
        inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        inline def setUtm_campaign(value: String): Self = StObject.set(x, "utm_campaign", value.asInstanceOf[js.Any])
        
        inline def setUtm_campaignUndefined: Self = StObject.set(x, "utm_campaign", js.undefined)
        
        inline def setUtm_source(value: String): Self = StObject.set(x, "utm_source", value.asInstanceOf[js.Any])
        
        inline def setUtm_sourceUndefined: Self = StObject.set(x, "utm_source", js.undefined)
      }
    }
    
    trait SchemaGoogleprotobufValue extends StObject
    
    trait SchemaLighthouseAuditResultV5 extends StObject {
      
      /**
        * The description of the audit.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Freeform details section of the audit.
        */
      var details: js.UndefOr[StringDictionary[js.Any]] = js.undefined
      
      /**
        * The value that should be displayed on the UI for this audit.
        */
      var displayValue: js.UndefOr[String] = js.undefined
      
      /**
        * An error message from a thrown error inside the audit.
        */
      var errorMessage: js.UndefOr[String] = js.undefined
      
      /**
        * An explanation of the errors in the audit.
        */
      var explanation: js.UndefOr[String] = js.undefined
      
      /**
        * The audit&#39;s id.
        */
      var id: js.UndefOr[String] = js.undefined
      
      var score: js.UndefOr[js.Any] = js.undefined
      
      /**
        * The enumerated score display mode.
        */
      var scoreDisplayMode: js.UndefOr[String] = js.undefined
      
      /**
        * The human readable title.
        */
      var title: js.UndefOr[String] = js.undefined
      
      var warnings: js.UndefOr[js.Any] = js.undefined
    }
    object SchemaLighthouseAuditResultV5 {
      
      inline def apply(): SchemaLighthouseAuditResultV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLighthouseAuditResultV5]
      }
      
      extension [Self <: SchemaLighthouseAuditResultV5](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDetails(value: StringDictionary[js.Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
        
        inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
        
        inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
        
        inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
        
        inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
        
        inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
        
        inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setScore(value: js.Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
        
        inline def setScoreDisplayMode(value: String): Self = StObject.set(x, "scoreDisplayMode", value.asInstanceOf[js.Any])
        
        inline def setScoreDisplayModeUndefined: Self = StObject.set(x, "scoreDisplayMode", js.undefined)
        
        inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setWarnings(value: js.Any): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
        
        inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      }
    }
    
    trait SchemaLighthouseCategoryV5 extends StObject {
      
      /**
        * An array of references to all the audit members of this category.
        */
      var auditRefs: js.UndefOr[js.Array[Group]] = js.undefined
      
      /**
        * A more detailed description of the category and its importance.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * The string identifier of the category.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * A description for the manual audits in the category.
        */
      var manualDescription: js.UndefOr[String] = js.undefined
      
      var score: js.UndefOr[js.Any] = js.undefined
      
      /**
        * The human-friendly name of the category.
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object SchemaLighthouseCategoryV5 {
      
      inline def apply(): SchemaLighthouseCategoryV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLighthouseCategoryV5]
      }
      
      extension [Self <: SchemaLighthouseCategoryV5](x: Self) {
        
        inline def setAuditRefs(value: js.Array[Group]): Self = StObject.set(x, "auditRefs", value.asInstanceOf[js.Any])
        
        inline def setAuditRefsUndefined: Self = StObject.set(x, "auditRefs", js.undefined)
        
        inline def setAuditRefsVarargs(value: Group*): Self = StObject.set(x, "auditRefs", js.Array(value :_*))
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setManualDescription(value: String): Self = StObject.set(x, "manualDescription", value.asInstanceOf[js.Any])
        
        inline def setManualDescriptionUndefined: Self = StObject.set(x, "manualDescription", js.undefined)
        
        inline def setScore(value: js.Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
        
        inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaLighthouseResultV5 extends StObject {
      
      /**
        * Map of audits in the LHR.
        */
      var audits: js.UndefOr[StringDictionary[SchemaLighthouseAuditResultV5]] = js.undefined
      
      /**
        * Map of categories in the LHR.
        */
      var categories: js.UndefOr[Accessibility] = js.undefined
      
      /**
        * Map of category groups in the LHR.
        */
      var categoryGroups: js.UndefOr[StringDictionary[DescriptionTitle]] = js.undefined
      
      /**
        * The configuration settings for this LHR.
        */
      var configSettings: js.UndefOr[EmulatedFormFactor] = js.undefined
      
      /**
        * Environment settings that were used when making this LHR.
        */
      var environment: js.UndefOr[BenchmarkIndex] = js.undefined
      
      /**
        * The time that this run was fetched.
        */
      var fetchTime: js.UndefOr[String] = js.undefined
      
      /**
        * The final resolved url that was audited.
        */
      var finalUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The internationalization strings that are required to render the LHR.
        */
      var i18n: js.UndefOr[RendererFormattedStrings] = js.undefined
      
      /**
        * The lighthouse version that was used to generate this LHR.
        */
      var lighthouseVersion: js.UndefOr[String] = js.undefined
      
      /**
        * The original requested url.
        */
      var requestedUrl: js.UndefOr[String] = js.undefined
      
      /**
        * List of all run warnings in the LHR. Will always output to at least `[]`.
        */
      var runWarnings: js.UndefOr[js.Array[js.Any]] = js.undefined
      
      /**
        * A top-level error message that, if present, indicates a serious enough
        * problem that this Lighthouse result may need to be discarded.
        */
      var runtimeError: js.UndefOr[CodeMessage] = js.undefined
      
      /**
        * Timing information for this LHR.
        */
      var timing: js.UndefOr[Total] = js.undefined
      
      /**
        * The user agent that was used to run this LHR.
        */
      var userAgent: js.UndefOr[String] = js.undefined
    }
    object SchemaLighthouseResultV5 {
      
      inline def apply(): SchemaLighthouseResultV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaLighthouseResultV5]
      }
      
      extension [Self <: SchemaLighthouseResultV5](x: Self) {
        
        inline def setAudits(value: StringDictionary[SchemaLighthouseAuditResultV5]): Self = StObject.set(x, "audits", value.asInstanceOf[js.Any])
        
        inline def setAuditsUndefined: Self = StObject.set(x, "audits", js.undefined)
        
        inline def setCategories(value: Accessibility): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        inline def setCategoryGroups(value: StringDictionary[DescriptionTitle]): Self = StObject.set(x, "categoryGroups", value.asInstanceOf[js.Any])
        
        inline def setCategoryGroupsUndefined: Self = StObject.set(x, "categoryGroups", js.undefined)
        
        inline def setConfigSettings(value: EmulatedFormFactor): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
        
        inline def setConfigSettingsUndefined: Self = StObject.set(x, "configSettings", js.undefined)
        
        inline def setEnvironment(value: BenchmarkIndex): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
        
        inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
        
        inline def setFetchTime(value: String): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
        
        inline def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
        
        inline def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
        
        inline def setFinalUrlUndefined: Self = StObject.set(x, "finalUrl", js.undefined)
        
        inline def setI18n(value: RendererFormattedStrings): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
        
        inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
        
        inline def setLighthouseVersion(value: String): Self = StObject.set(x, "lighthouseVersion", value.asInstanceOf[js.Any])
        
        inline def setLighthouseVersionUndefined: Self = StObject.set(x, "lighthouseVersion", js.undefined)
        
        inline def setRequestedUrl(value: String): Self = StObject.set(x, "requestedUrl", value.asInstanceOf[js.Any])
        
        inline def setRequestedUrlUndefined: Self = StObject.set(x, "requestedUrl", js.undefined)
        
        inline def setRunWarnings(value: js.Array[js.Any]): Self = StObject.set(x, "runWarnings", value.asInstanceOf[js.Any])
        
        inline def setRunWarningsUndefined: Self = StObject.set(x, "runWarnings", js.undefined)
        
        inline def setRunWarningsVarargs(value: js.Any*): Self = StObject.set(x, "runWarnings", js.Array(value :_*))
        
        inline def setRuntimeError(value: CodeMessage): Self = StObject.set(x, "runtimeError", value.asInstanceOf[js.Any])
        
        inline def setRuntimeErrorUndefined: Self = StObject.set(x, "runtimeError", js.undefined)
        
        inline def setTiming(value: Total): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
        
        inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
        
        inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
        
        inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      }
    }
    
    trait SchemaPagespeedApiLoadingExperienceV5 extends StObject {
      
      /**
        * The url, pattern or origin which the metrics are on.
        */
      var id: js.UndefOr[String] = js.undefined
      
      var initial_url: js.UndefOr[String] = js.undefined
      
      var metrics: js.UndefOr[StringDictionary[Percentile]] = js.undefined
      
      var overall_category: js.UndefOr[String] = js.undefined
    }
    object SchemaPagespeedApiLoadingExperienceV5 {
      
      inline def apply(): SchemaPagespeedApiLoadingExperienceV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPagespeedApiLoadingExperienceV5]
      }
      
      extension [Self <: SchemaPagespeedApiLoadingExperienceV5](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
        
        inline def setInitial_urlUndefined: Self = StObject.set(x, "initial_url", js.undefined)
        
        inline def setMetrics(value: StringDictionary[Percentile]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
        
        inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        
        inline def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
        
        inline def setOverall_categoryUndefined: Self = StObject.set(x, "overall_category", js.undefined)
      }
    }
    
    trait SchemaPagespeedApiPagespeedResponseV5 extends StObject {
      
      /**
        * The UTC timestamp of this analysis.
        */
      var analysisUTCTimestamp: js.UndefOr[String] = js.undefined
      
      /**
        * The captcha verify result
        */
      var captchaResult: js.UndefOr[String] = js.undefined
      
      /**
        * Canonicalized and final URL for the document, after following page
        * redirects (if any).
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Kind of result.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * Lighthouse response for the audit url as an object.
        */
      var lighthouseResult: js.UndefOr[SchemaLighthouseResultV5] = js.undefined
      
      /**
        * Metrics of end users&#39; page loading experience.
        */
      var loadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.undefined
      
      /**
        * Metrics of the aggregated page loading experience of the origin
        */
      var originLoadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.undefined
      
      /**
        * The version of PageSpeed used to generate these results.
        */
      var version: js.UndefOr[Major] = js.undefined
    }
    object SchemaPagespeedApiPagespeedResponseV5 {
      
      inline def apply(): SchemaPagespeedApiPagespeedResponseV5 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV5]
      }
      
      extension [Self <: SchemaPagespeedApiPagespeedResponseV5](x: Self) {
        
        inline def setAnalysisUTCTimestamp(value: String): Self = StObject.set(x, "analysisUTCTimestamp", value.asInstanceOf[js.Any])
        
        inline def setAnalysisUTCTimestampUndefined: Self = StObject.set(x, "analysisUTCTimestamp", js.undefined)
        
        inline def setCaptchaResult(value: String): Self = StObject.set(x, "captchaResult", value.asInstanceOf[js.Any])
        
        inline def setCaptchaResultUndefined: Self = StObject.set(x, "captchaResult", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLighthouseResult(value: SchemaLighthouseResultV5): Self = StObject.set(x, "lighthouseResult", value.asInstanceOf[js.Any])
        
        inline def setLighthouseResultUndefined: Self = StObject.set(x, "lighthouseResult", js.undefined)
        
        inline def setLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = StObject.set(x, "loadingExperience", value.asInstanceOf[js.Any])
        
        inline def setLoadingExperienceUndefined: Self = StObject.set(x, "loadingExperience", js.undefined)
        
        inline def setOriginLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = StObject.set(x, "originLoadingExperience", value.asInstanceOf[js.Any])
        
        inline def setOriginLoadingExperienceUndefined: Self = StObject.set(x, "originLoadingExperience", js.undefined)
        
        inline def setVersion(value: Major): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
