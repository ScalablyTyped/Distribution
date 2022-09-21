package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.anon.ByteSize
import typings.googleapis.anon.CorrectedQuery
import typings.googleapis.anon.FormattedSearchTime
import typings.googleapis.anon.HeightSource
import typings.googleapis.anon.HtmlTitle
import typings.googleapis.anon.Labelwithop
import typings.googleapis.anon.NextPage
import typings.googleapis.anon.Template
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

object customsearchV1Mod {
  
  object customsearchV1 {
    
    @JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Customsearch")
    @js.native
    open class Customsearch protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var cse: ResourceCse = js.native
    }
    
    @JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Resource$Cse")
    @js.native
    open class ResourceCse protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaSearch] = js.native
      def list(callback: BodyResponseCallback[SchemaSearch]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
      def list(params: ParamsResourceCseList): GaxiosPromise[SchemaSearch] = js.native
      def list(params: ParamsResourceCseList, callback: BodyResponseCallback[SchemaSearch]): Unit = js.native
      def list(
        params: ParamsResourceCseList,
        options: BodyResponseCallback[Readable | SchemaSearch],
        callback: BodyResponseCallback[Readable | SchemaSearch]
      ): Unit = js.native
      def list(params: ParamsResourceCseList, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
      def list(
        params: ParamsResourceCseList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSearch]
      ): Unit = js.native
      /**
        * Returns metadata about the search performed, metadata about the engine used for the search, and the search results.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/customsearch.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const customsearch = google.customsearch('v1');
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
        *   const res = await search.cse.list({
        *     // Enables or disables [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/json_api_reference#chineseSearch). The default value for this parameter is 0 (zero), meaning that the feature is enabled. Supported values are: * `1`: Disabled * `0`: Enabled (default)
        *     c2coff: 'placeholder-value',
        *     // Restricts search results to documents originating in a particular country. You may use [Boolean operators](https://developers.google.com/custom-search/docs/json_api_reference#booleanOperators) in the cr parameter's value. Google Search determines the country of a document by analyzing: * the top-level domain (TLD) of the document's URL * the geographic location of the Web server's IP address See the [Country Parameter Values](https://developers.google.com/custom-search/docs/json_api_reference#countryCollections) page for a list of valid values for this parameter.
        *     cr: 'placeholder-value',
        *     // The Programmable Search Engine ID to use for this request.
        *     cx: 'placeholder-value',
        *     // Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results from the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number of past years.
        *     dateRestrict: 'placeholder-value',
        *     // Identifies a phrase that all documents in the search results must contain.
        *     exactTerms: 'placeholder-value',
        *     // Identifies a word or phrase that should not appear in any documents in the search results.
        *     excludeTerms: 'placeholder-value',
        *     // Restricts results to files of a specified extension. A list of file types indexable by Google can be found in Search Console [Help Center](https://support.google.com/webmasters/answer/35287).
        *     fileType: 'placeholder-value',
        *     // Controls turning on or off the duplicate content filter. * See [Automatic Filtering](https://developers.google.com/custom-search/docs/json_api_reference#automaticFiltering) for more information about Google's search results filters. Note that host crowding filtering applies only to multi-site searches. * By default, Google applies filtering to all search results to improve the quality of those results. Acceptable values are: * `0`: Turns off duplicate content filter. * `1`: Turns on duplicate content filter.
        *     filter: 'placeholder-value',
        *     // Geolocation of end user. * The `gl` parameter value is a two-letter country code. The `gl` parameter boosts search results whose country of origin matches the parameter value. See the [Country Codes](https://developers.google.com/custom-search/docs/json_api_reference#countryCodes) page for a list of valid values. * Specifying a `gl` parameter value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in English- speaking countries other than the United States.
        *     gl: 'placeholder-value',
        *     // **Deprecated**. Use the `gl` parameter for a similar effect. The local Google domain (for example, google.com, google.de, or google.fr) to use to perform the search.
        *     googlehost: 'placeholder-value',
        *     // Specifies the ending value for a search range. * Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        *     highRange: 'placeholder-value',
        *     // Sets the user interface language. * Explicitly setting this parameter improves the performance and the quality of your search results. * See the [Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#wsInterfaceLanguages) section of [Internationalizing Queries and Results Presentation](https://developers.google.com/custom-search/docs/json_api_reference#wsInternationalizing) for more information, and [Supported Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#interfaceLanguages) for a list of supported languages.
        *     hl: 'placeholder-value',
        *     // Appends the specified query terms to the query, as if they were combined with a logical AND operator.
        *     hq: 'placeholder-value',
        *     // Returns black and white, grayscale, transparent, or color images. Acceptable values are: * `"color"` * `"gray"` * `"mono"`: black and white * `"trans"`: transparent background
        *     imgColorType: 'placeholder-value',
        *     // Returns images of a specific dominant color. Acceptable values are: * `"black"` * `"blue"` * `"brown"` * `"gray"` * `"green"` * `"orange"` * `"pink"` * `"purple"` * `"red"` * `"teal"` * `"white"` * `"yellow"`
        *     imgDominantColor: 'placeholder-value',
        *     // Returns images of a specified size. Acceptable values are: * `"huge"` * `"icon"` * `"large"` * `"medium"` * `"small"` * `"xlarge"` * `"xxlarge"`
        *     imgSize: 'placeholder-value',
        *     // Returns images of a type. Acceptable values are: * `"clipart"` * `"face"` * `"lineart"` * `"stock"` * `"photo"` * `"animated"`
        *     imgType: 'placeholder-value',
        *     // Specifies that all search results should contain a link to a particular URL.
        *     linkSite: 'placeholder-value',
        *     // Specifies the starting value for a search range. Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        *     lowRange: 'placeholder-value',
        *     // Restricts the search to documents written in a particular language (e.g., `lr=lang_ja`). Acceptable values are: * `"lang_ar"`: Arabic * `"lang_bg"`: Bulgarian * `"lang_ca"`: Catalan * `"lang_cs"`: Czech * `"lang_da"`: Danish * `"lang_de"`: German * `"lang_el"`: Greek * `"lang_en"`: English * `"lang_es"`: Spanish * `"lang_et"`: Estonian * `"lang_fi"`: Finnish * `"lang_fr"`: French * `"lang_hr"`: Croatian * `"lang_hu"`: Hungarian * `"lang_id"`: Indonesian * `"lang_is"`: Icelandic * `"lang_it"`: Italian * `"lang_iw"`: Hebrew * `"lang_ja"`: Japanese * `"lang_ko"`: Korean * `"lang_lt"`: Lithuanian * `"lang_lv"`: Latvian * `"lang_nl"`: Dutch * `"lang_no"`: Norwegian * `"lang_pl"`: Polish * `"lang_pt"`: Portuguese * `"lang_ro"`: Romanian * `"lang_ru"`: Russian * `"lang_sk"`: Slovak * `"lang_sl"`: Slovenian * `"lang_sr"`: Serbian * `"lang_sv"`: Swedish * `"lang_tr"`: Turkish * `"lang_zh-CN"`: Chinese (Simplified) * `"lang_zh-TW"`: Chinese (Traditional)
        *     lr: 'placeholder-value',
        *     // Number of search results to return. * Valid values are integers between 1 and 10, inclusive.
        *     num: 'placeholder-value',
        *     // Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms.
        *     orTerms: 'placeholder-value',
        *     // Query
        *     q: 'placeholder-value',
        *     // Specifies that all search results should be pages that are related to the specified URL.
        *     relatedSite: 'placeholder-value',
        *     // Filters based on licensing. Supported values include: `cc_publicdomain`, `cc_attribute`, `cc_sharealike`, `cc_noncommercial`, `cc_nonderived` and combinations of these. See [typical combinations](https://wiki.creativecommons.org/wiki/CC_Search_integration).
        *     rights: 'placeholder-value',
        *     // Search safety level. Acceptable values are: * `"active"`: Enables SafeSearch filtering. * `"off"`: Disables SafeSearch filtering. (default)
        *     safe: 'placeholder-value',
        *     // Specifies the search type: `image`. If unspecified, results are limited to webpages. Acceptable values are: * `"image"`: custom image search.
        *     searchType: 'placeholder-value',
        *     // Specifies a given site which should always be included or excluded from results (see `siteSearchFilter` parameter, below).
        *     siteSearch: 'placeholder-value',
        *     // Controls whether to include or exclude results from the site named in the `siteSearch` parameter. Acceptable values are: * `"e"`: exclude * `"i"`: include
        *     siteSearchFilter: 'placeholder-value',
        *     // The sort expression to apply to the results. The sort parameter specifies that the results be sorted according to the specified expression i.e. sort by date. [Example: sort=date](https://developers.google.com/custom-search/docs/structured_search#sort-by-attribute).
        *     sort: 'placeholder-value',
        *     // The index of the first result to return. The default number of results per page is 10, so `&start=11` would start at the top of the second page of results. **Note**: The JSON API will never return more than 100 results, even if more than 100 documents match the query, so setting the sum of `start + num` to a number greater than 100 will produce an error. Also note that the maximum value for `num` is 10.
        *     start: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "context": {},
        *   //   "items": [],
        *   //   "kind": "my_kind",
        *   //   "promotions": [],
        *   //   "queries": {},
        *   //   "searchInformation": {},
        *   //   "spelling": {},
        *   //   "url": {}
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
      def list(params: ParamsResourceCseList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceCseList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var siterestrict: ResourceCseSiterestrict = js.native
    }
    
    @JSImport("googleapis/build/src/apis/customsearch/v1", "customsearch_v1.Resource$Cse$Siterestrict")
    @js.native
    open class ResourceCseSiterestrict protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaSearch] = js.native
      def list(callback: BodyResponseCallback[SchemaSearch]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
      def list(params: ParamsResourceCseSiterestrictList): GaxiosPromise[SchemaSearch] = js.native
      def list(params: ParamsResourceCseSiterestrictList, callback: BodyResponseCallback[SchemaSearch]): Unit = js.native
      def list(
        params: ParamsResourceCseSiterestrictList,
        options: BodyResponseCallback[Readable | SchemaSearch],
        callback: BodyResponseCallback[Readable | SchemaSearch]
      ): Unit = js.native
      def list(params: ParamsResourceCseSiterestrictList, options: MethodOptions): GaxiosPromise[SchemaSearch] = js.native
      def list(
        params: ParamsResourceCseSiterestrictList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSearch]
      ): Unit = js.native
      /**
        * Returns metadata about the search performed, metadata about the engine used for the search, and the search results. Uses a small set of url patterns.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/customsearch.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const customsearch = google.customsearch('v1');
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
        *   const res = await search.cse.siterestrict.list({
        *     // Enables or disables [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/json_api_reference#chineseSearch). The default value for this parameter is 0 (zero), meaning that the feature is enabled. Supported values are: * `1`: Disabled * `0`: Enabled (default)
        *     c2coff: 'placeholder-value',
        *     // Restricts search results to documents originating in a particular country. You may use [Boolean operators](https://developers.google.com/custom-search/docs/json_api_reference#booleanOperators) in the cr parameter's value. Google Search determines the country of a document by analyzing: * the top-level domain (TLD) of the document's URL * the geographic location of the Web server's IP address See the [Country Parameter Values](https://developers.google.com/custom-search/docs/json_api_reference#countryCollections) page for a list of valid values for this parameter.
        *     cr: 'placeholder-value',
        *     // The Programmable Search Engine ID to use for this request.
        *     cx: 'placeholder-value',
        *     // Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results from the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number of past years.
        *     dateRestrict: 'placeholder-value',
        *     // Identifies a phrase that all documents in the search results must contain.
        *     exactTerms: 'placeholder-value',
        *     // Identifies a word or phrase that should not appear in any documents in the search results.
        *     excludeTerms: 'placeholder-value',
        *     // Restricts results to files of a specified extension. A list of file types indexable by Google can be found in Search Console [Help Center](https://support.google.com/webmasters/answer/35287).
        *     fileType: 'placeholder-value',
        *     // Controls turning on or off the duplicate content filter. * See [Automatic Filtering](https://developers.google.com/custom-search/docs/json_api_reference#automaticFiltering) for more information about Google's search results filters. Note that host crowding filtering applies only to multi-site searches. * By default, Google applies filtering to all search results to improve the quality of those results. Acceptable values are: * `0`: Turns off duplicate content filter. * `1`: Turns on duplicate content filter.
        *     filter: 'placeholder-value',
        *     // Geolocation of end user. * The `gl` parameter value is a two-letter country code. The `gl` parameter boosts search results whose country of origin matches the parameter value. See the [Country Codes](https://developers.google.com/custom-search/docs/json_api_reference#countryCodes) page for a list of valid values. * Specifying a `gl` parameter value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in English- speaking countries other than the United States.
        *     gl: 'placeholder-value',
        *     // **Deprecated**. Use the `gl` parameter for a similar effect. The local Google domain (for example, google.com, google.de, or google.fr) to use to perform the search.
        *     googlehost: 'placeholder-value',
        *     // Specifies the ending value for a search range. * Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        *     highRange: 'placeholder-value',
        *     // Sets the user interface language. * Explicitly setting this parameter improves the performance and the quality of your search results. * See the [Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#wsInterfaceLanguages) section of [Internationalizing Queries and Results Presentation](https://developers.google.com/custom-search/docs/json_api_reference#wsInternationalizing) for more information, and [Supported Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#interfaceLanguages) for a list of supported languages.
        *     hl: 'placeholder-value',
        *     // Appends the specified query terms to the query, as if they were combined with a logical AND operator.
        *     hq: 'placeholder-value',
        *     // Returns black and white, grayscale, transparent, or color images. Acceptable values are: * `"color"` * `"gray"` * `"mono"`: black and white * `"trans"`: transparent background
        *     imgColorType: 'placeholder-value',
        *     // Returns images of a specific dominant color. Acceptable values are: * `"black"` * `"blue"` * `"brown"` * `"gray"` * `"green"` * `"orange"` * `"pink"` * `"purple"` * `"red"` * `"teal"` * `"white"` * `"yellow"`
        *     imgDominantColor: 'placeholder-value',
        *     // Returns images of a specified size. Acceptable values are: * `"huge"` * `"icon"` * `"large"` * `"medium"` * `"small"` * `"xlarge"` * `"xxlarge"`
        *     imgSize: 'placeholder-value',
        *     // Returns images of a type. Acceptable values are: * `"clipart"` * `"face"` * `"lineart"` * `"stock"` * `"photo"` * `"animated"`
        *     imgType: 'placeholder-value',
        *     // Specifies that all search results should contain a link to a particular URL.
        *     linkSite: 'placeholder-value',
        *     // Specifies the starting value for a search range. Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        *     lowRange: 'placeholder-value',
        *     // Restricts the search to documents written in a particular language (e.g., `lr=lang_ja`). Acceptable values are: * `"lang_ar"`: Arabic * `"lang_bg"`: Bulgarian * `"lang_ca"`: Catalan * `"lang_cs"`: Czech * `"lang_da"`: Danish * `"lang_de"`: German * `"lang_el"`: Greek * `"lang_en"`: English * `"lang_es"`: Spanish * `"lang_et"`: Estonian * `"lang_fi"`: Finnish * `"lang_fr"`: French * `"lang_hr"`: Croatian * `"lang_hu"`: Hungarian * `"lang_id"`: Indonesian * `"lang_is"`: Icelandic * `"lang_it"`: Italian * `"lang_iw"`: Hebrew * `"lang_ja"`: Japanese * `"lang_ko"`: Korean * `"lang_lt"`: Lithuanian * `"lang_lv"`: Latvian * `"lang_nl"`: Dutch * `"lang_no"`: Norwegian * `"lang_pl"`: Polish * `"lang_pt"`: Portuguese * `"lang_ro"`: Romanian * `"lang_ru"`: Russian * `"lang_sk"`: Slovak * `"lang_sl"`: Slovenian * `"lang_sr"`: Serbian * `"lang_sv"`: Swedish * `"lang_tr"`: Turkish * `"lang_zh-CN"`: Chinese (Simplified) * `"lang_zh-TW"`: Chinese (Traditional)
        *     lr: 'placeholder-value',
        *     // Number of search results to return. * Valid values are integers between 1 and 10, inclusive.
        *     num: 'placeholder-value',
        *     // Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms.
        *     orTerms: 'placeholder-value',
        *     // Query
        *     q: 'placeholder-value',
        *     // Specifies that all search results should be pages that are related to the specified URL.
        *     relatedSite: 'placeholder-value',
        *     // Filters based on licensing. Supported values include: `cc_publicdomain`, `cc_attribute`, `cc_sharealike`, `cc_noncommercial`, `cc_nonderived` and combinations of these. See [typical combinations](https://wiki.creativecommons.org/wiki/CC_Search_integration).
        *     rights: 'placeholder-value',
        *     // Search safety level. Acceptable values are: * `"active"`: Enables SafeSearch filtering. * `"off"`: Disables SafeSearch filtering. (default)
        *     safe: 'placeholder-value',
        *     // Specifies the search type: `image`. If unspecified, results are limited to webpages. Acceptable values are: * `"image"`: custom image search.
        *     searchType: 'placeholder-value',
        *     // Specifies a given site which should always be included or excluded from results (see `siteSearchFilter` parameter, below).
        *     siteSearch: 'placeholder-value',
        *     // Controls whether to include or exclude results from the site named in the `siteSearch` parameter. Acceptable values are: * `"e"`: exclude * `"i"`: include
        *     siteSearchFilter: 'placeholder-value',
        *     // The sort expression to apply to the results. The sort parameter specifies that the results be sorted according to the specified expression i.e. sort by date. [Example: sort=date](https://developers.google.com/custom-search/docs/structured_search#sort-by-attribute).
        *     sort: 'placeholder-value',
        *     // The index of the first result to return. The default number of results per page is 10, so `&start=11` would start at the top of the second page of results. **Note**: The JSON API will never return more than 100 results, even if more than 100 documents match the query, so setting the sum of `start + num` to a number greater than 100 will produce an error. Also note that the maximum value for `num` is 10.
        *     start: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "context": {},
        *   //   "items": [],
        *   //   "kind": "my_kind",
        *   //   "promotions": [],
        *   //   "queries": {},
        *   //   "searchInformation": {},
        *   //   "spelling": {},
        *   //   "url": {}
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
      def list(params: ParamsResourceCseSiterestrictList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceCseSiterestrictList,
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
    
    trait ParamsResourceCseList
      extends StObject
         with StandardParameters {
      
      /**
        * Enables or disables [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/json_api_reference#chineseSearch). The default value for this parameter is 0 (zero), meaning that the feature is enabled. Supported values are: * `1`: Disabled * `0`: Enabled (default)
        */
      var c2coff: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts search results to documents originating in a particular country. You may use [Boolean operators](https://developers.google.com/custom-search/docs/json_api_reference#booleanOperators) in the cr parameter's value. Google Search determines the country of a document by analyzing: * the top-level domain (TLD) of the document's URL * the geographic location of the Web server's IP address See the [Country Parameter Values](https://developers.google.com/custom-search/docs/json_api_reference#countryCollections) page for a list of valid values for this parameter.
        */
      var cr: js.UndefOr[String] = js.undefined
      
      /**
        * The Programmable Search Engine ID to use for this request.
        */
      var cx: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results from the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number of past years.
        */
      var dateRestrict: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a phrase that all documents in the search results must contain.
        */
      var exactTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a word or phrase that should not appear in any documents in the search results.
        */
      var excludeTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts results to files of a specified extension. A list of file types indexable by Google can be found in Search Console [Help Center](https://support.google.com/webmasters/answer/35287).
        */
      var fileType: js.UndefOr[String] = js.undefined
      
      /**
        * Controls turning on or off the duplicate content filter. * See [Automatic Filtering](https://developers.google.com/custom-search/docs/json_api_reference#automaticFiltering) for more information about Google's search results filters. Note that host crowding filtering applies only to multi-site searches. * By default, Google applies filtering to all search results to improve the quality of those results. Acceptable values are: * `0`: Turns off duplicate content filter. * `1`: Turns on duplicate content filter.
        */
      var filter: js.UndefOr[String] = js.undefined
      
      /**
        * Geolocation of end user. * The `gl` parameter value is a two-letter country code. The `gl` parameter boosts search results whose country of origin matches the parameter value. See the [Country Codes](https://developers.google.com/custom-search/docs/json_api_reference#countryCodes) page for a list of valid values. * Specifying a `gl` parameter value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in English- speaking countries other than the United States.
        */
      var gl: js.UndefOr[String] = js.undefined
      
      /**
        * **Deprecated**. Use the `gl` parameter for a similar effect. The local Google domain (for example, google.com, google.de, or google.fr) to use to perform the search.
        */
      var googlehost: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the ending value for a search range. * Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        */
      var highRange: js.UndefOr[String] = js.undefined
      
      /**
        * Sets the user interface language. * Explicitly setting this parameter improves the performance and the quality of your search results. * See the [Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#wsInterfaceLanguages) section of [Internationalizing Queries and Results Presentation](https://developers.google.com/custom-search/docs/json_api_reference#wsInternationalizing) for more information, and [Supported Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#interfaceLanguages) for a list of supported languages.
        */
      var hl: js.UndefOr[String] = js.undefined
      
      /**
        * Appends the specified query terms to the query, as if they were combined with a logical AND operator.
        */
      var hq: js.UndefOr[String] = js.undefined
      
      /**
        * Returns black and white, grayscale, transparent, or color images. Acceptable values are: * `"color"` * `"gray"` * `"mono"`: black and white * `"trans"`: transparent background
        */
      var imgColorType: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specific dominant color. Acceptable values are: * `"black"` * `"blue"` * `"brown"` * `"gray"` * `"green"` * `"orange"` * `"pink"` * `"purple"` * `"red"` * `"teal"` * `"white"` * `"yellow"`
        */
      var imgDominantColor: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specified size. Acceptable values are: * `"huge"` * `"icon"` * `"large"` * `"medium"` * `"small"` * `"xlarge"` * `"xxlarge"`
        */
      var imgSize: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a type. Acceptable values are: * `"clipart"` * `"face"` * `"lineart"` * `"stock"` * `"photo"` * `"animated"`
        */
      var imgType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should contain a link to a particular URL.
        */
      var linkSite: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the starting value for a search range. Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        */
      var lowRange: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts the search to documents written in a particular language (e.g., `lr=lang_ja`). Acceptable values are: * `"lang_ar"`: Arabic * `"lang_bg"`: Bulgarian * `"lang_ca"`: Catalan * `"lang_cs"`: Czech * `"lang_da"`: Danish * `"lang_de"`: German * `"lang_el"`: Greek * `"lang_en"`: English * `"lang_es"`: Spanish * `"lang_et"`: Estonian * `"lang_fi"`: Finnish * `"lang_fr"`: French * `"lang_hr"`: Croatian * `"lang_hu"`: Hungarian * `"lang_id"`: Indonesian * `"lang_is"`: Icelandic * `"lang_it"`: Italian * `"lang_iw"`: Hebrew * `"lang_ja"`: Japanese * `"lang_ko"`: Korean * `"lang_lt"`: Lithuanian * `"lang_lv"`: Latvian * `"lang_nl"`: Dutch * `"lang_no"`: Norwegian * `"lang_pl"`: Polish * `"lang_pt"`: Portuguese * `"lang_ro"`: Romanian * `"lang_ru"`: Russian * `"lang_sk"`: Slovak * `"lang_sl"`: Slovenian * `"lang_sr"`: Serbian * `"lang_sv"`: Swedish * `"lang_tr"`: Turkish * `"lang_zh-CN"`: Chinese (Simplified) * `"lang_zh-TW"`: Chinese (Traditional)
        */
      var lr: js.UndefOr[String] = js.undefined
      
      /**
        * Number of search results to return. * Valid values are integers between 1 and 10, inclusive.
        */
      var num: js.UndefOr[Double] = js.undefined
      
      /**
        * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms.
        */
      var orTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Query
        */
      var q: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should be pages that are related to the specified URL.
        */
      var relatedSite: js.UndefOr[String] = js.undefined
      
      /**
        * Filters based on licensing. Supported values include: `cc_publicdomain`, `cc_attribute`, `cc_sharealike`, `cc_noncommercial`, `cc_nonderived` and combinations of these. See [typical combinations](https://wiki.creativecommons.org/wiki/CC_Search_integration).
        */
      var rights: js.UndefOr[String] = js.undefined
      
      /**
        * Search safety level. Acceptable values are: * `"active"`: Enables SafeSearch filtering. * `"off"`: Disables SafeSearch filtering. (default)
        */
      var safe: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the search type: `image`. If unspecified, results are limited to webpages. Acceptable values are: * `"image"`: custom image search.
        */
      var searchType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies a given site which should always be included or excluded from results (see `siteSearchFilter` parameter, below).
        */
      var siteSearch: js.UndefOr[String] = js.undefined
      
      /**
        * Controls whether to include or exclude results from the site named in the `siteSearch` parameter. Acceptable values are: * `"e"`: exclude * `"i"`: include
        */
      var siteSearchFilter: js.UndefOr[String] = js.undefined
      
      /**
        * The sort expression to apply to the results. The sort parameter specifies that the results be sorted according to the specified expression i.e. sort by date. [Example: sort=date](https://developers.google.com/custom-search/docs/structured_search#sort-by-attribute).
        */
      var sort: js.UndefOr[String] = js.undefined
      
      /**
        * The index of the first result to return. The default number of results per page is 10, so `&start=11` would start at the top of the second page of results. **Note**: The JSON API will never return more than 100 results, even if more than 100 documents match the query, so setting the sum of `start + num` to a number greater than 100 will produce an error. Also note that the maximum value for `num` is 10.
        */
      var start: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceCseList {
      
      inline def apply(): ParamsResourceCseList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceCseList]
      }
      
      extension [Self <: ParamsResourceCseList](x: Self) {
        
        inline def setC2coff(value: String): Self = StObject.set(x, "c2coff", value.asInstanceOf[js.Any])
        
        inline def setC2coffUndefined: Self = StObject.set(x, "c2coff", js.undefined)
        
        inline def setCr(value: String): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
        
        inline def setCrUndefined: Self = StObject.set(x, "cr", js.undefined)
        
        inline def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
        
        inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
        
        inline def setDateRestrict(value: String): Self = StObject.set(x, "dateRestrict", value.asInstanceOf[js.Any])
        
        inline def setDateRestrictUndefined: Self = StObject.set(x, "dateRestrict", js.undefined)
        
        inline def setExactTerms(value: String): Self = StObject.set(x, "exactTerms", value.asInstanceOf[js.Any])
        
        inline def setExactTermsUndefined: Self = StObject.set(x, "exactTerms", js.undefined)
        
        inline def setExcludeTerms(value: String): Self = StObject.set(x, "excludeTerms", value.asInstanceOf[js.Any])
        
        inline def setExcludeTermsUndefined: Self = StObject.set(x, "excludeTerms", js.undefined)
        
        inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
        
        inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
        
        inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
        
        inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
        
        inline def setGooglehost(value: String): Self = StObject.set(x, "googlehost", value.asInstanceOf[js.Any])
        
        inline def setGooglehostUndefined: Self = StObject.set(x, "googlehost", js.undefined)
        
        inline def setHighRange(value: String): Self = StObject.set(x, "highRange", value.asInstanceOf[js.Any])
        
        inline def setHighRangeUndefined: Self = StObject.set(x, "highRange", js.undefined)
        
        inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
        
        inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
        
        inline def setHq(value: String): Self = StObject.set(x, "hq", value.asInstanceOf[js.Any])
        
        inline def setHqUndefined: Self = StObject.set(x, "hq", js.undefined)
        
        inline def setImgColorType(value: String): Self = StObject.set(x, "imgColorType", value.asInstanceOf[js.Any])
        
        inline def setImgColorTypeUndefined: Self = StObject.set(x, "imgColorType", js.undefined)
        
        inline def setImgDominantColor(value: String): Self = StObject.set(x, "imgDominantColor", value.asInstanceOf[js.Any])
        
        inline def setImgDominantColorUndefined: Self = StObject.set(x, "imgDominantColor", js.undefined)
        
        inline def setImgSize(value: String): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
        
        inline def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
        
        inline def setImgType(value: String): Self = StObject.set(x, "imgType", value.asInstanceOf[js.Any])
        
        inline def setImgTypeUndefined: Self = StObject.set(x, "imgType", js.undefined)
        
        inline def setLinkSite(value: String): Self = StObject.set(x, "linkSite", value.asInstanceOf[js.Any])
        
        inline def setLinkSiteUndefined: Self = StObject.set(x, "linkSite", js.undefined)
        
        inline def setLowRange(value: String): Self = StObject.set(x, "lowRange", value.asInstanceOf[js.Any])
        
        inline def setLowRangeUndefined: Self = StObject.set(x, "lowRange", js.undefined)
        
        inline def setLr(value: String): Self = StObject.set(x, "lr", value.asInstanceOf[js.Any])
        
        inline def setLrUndefined: Self = StObject.set(x, "lr", js.undefined)
        
        inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
        
        inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
        
        inline def setOrTerms(value: String): Self = StObject.set(x, "orTerms", value.asInstanceOf[js.Any])
        
        inline def setOrTermsUndefined: Self = StObject.set(x, "orTerms", js.undefined)
        
        inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
        
        inline def setRelatedSite(value: String): Self = StObject.set(x, "relatedSite", value.asInstanceOf[js.Any])
        
        inline def setRelatedSiteUndefined: Self = StObject.set(x, "relatedSite", js.undefined)
        
        inline def setRights(value: String): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
        
        inline def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
        
        inline def setSafe(value: String): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
        
        inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
        
        inline def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
        
        inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
        
        inline def setSiteSearch(value: String): Self = StObject.set(x, "siteSearch", value.asInstanceOf[js.Any])
        
        inline def setSiteSearchFilter(value: String): Self = StObject.set(x, "siteSearchFilter", value.asInstanceOf[js.Any])
        
        inline def setSiteSearchFilterUndefined: Self = StObject.set(x, "siteSearchFilter", js.undefined)
        
        inline def setSiteSearchUndefined: Self = StObject.set(x, "siteSearch", js.undefined)
        
        inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    trait ParamsResourceCseSiterestrictList
      extends StObject
         with StandardParameters {
      
      /**
        * Enables or disables [Simplified and Traditional Chinese Search](https://developers.google.com/custom-search/docs/json_api_reference#chineseSearch). The default value for this parameter is 0 (zero), meaning that the feature is enabled. Supported values are: * `1`: Disabled * `0`: Enabled (default)
        */
      var c2coff: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts search results to documents originating in a particular country. You may use [Boolean operators](https://developers.google.com/custom-search/docs/json_api_reference#booleanOperators) in the cr parameter's value. Google Search determines the country of a document by analyzing: * the top-level domain (TLD) of the document's URL * the geographic location of the Web server's IP address See the [Country Parameter Values](https://developers.google.com/custom-search/docs/json_api_reference#countryCollections) page for a list of valid values for this parameter.
        */
      var cr: js.UndefOr[String] = js.undefined
      
      /**
        * The Programmable Search Engine ID to use for this request.
        */
      var cx: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts results to URLs based on date. Supported values include: * `d[number]`: requests results from the specified number of past days. * `w[number]`: requests results from the specified number of past weeks. * `m[number]`: requests results from the specified number of past months. * `y[number]`: requests results from the specified number of past years.
        */
      var dateRestrict: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a phrase that all documents in the search results must contain.
        */
      var exactTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Identifies a word or phrase that should not appear in any documents in the search results.
        */
      var excludeTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts results to files of a specified extension. A list of file types indexable by Google can be found in Search Console [Help Center](https://support.google.com/webmasters/answer/35287).
        */
      var fileType: js.UndefOr[String] = js.undefined
      
      /**
        * Controls turning on or off the duplicate content filter. * See [Automatic Filtering](https://developers.google.com/custom-search/docs/json_api_reference#automaticFiltering) for more information about Google's search results filters. Note that host crowding filtering applies only to multi-site searches. * By default, Google applies filtering to all search results to improve the quality of those results. Acceptable values are: * `0`: Turns off duplicate content filter. * `1`: Turns on duplicate content filter.
        */
      var filter: js.UndefOr[String] = js.undefined
      
      /**
        * Geolocation of end user. * The `gl` parameter value is a two-letter country code. The `gl` parameter boosts search results whose country of origin matches the parameter value. See the [Country Codes](https://developers.google.com/custom-search/docs/json_api_reference#countryCodes) page for a list of valid values. * Specifying a `gl` parameter value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in English- speaking countries other than the United States.
        */
      var gl: js.UndefOr[String] = js.undefined
      
      /**
        * **Deprecated**. Use the `gl` parameter for a similar effect. The local Google domain (for example, google.com, google.de, or google.fr) to use to perform the search.
        */
      var googlehost: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the ending value for a search range. * Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        */
      var highRange: js.UndefOr[String] = js.undefined
      
      /**
        * Sets the user interface language. * Explicitly setting this parameter improves the performance and the quality of your search results. * See the [Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#wsInterfaceLanguages) section of [Internationalizing Queries and Results Presentation](https://developers.google.com/custom-search/docs/json_api_reference#wsInternationalizing) for more information, and [Supported Interface Languages](https://developers.google.com/custom-search/docs/json_api_reference#interfaceLanguages) for a list of supported languages.
        */
      var hl: js.UndefOr[String] = js.undefined
      
      /**
        * Appends the specified query terms to the query, as if they were combined with a logical AND operator.
        */
      var hq: js.UndefOr[String] = js.undefined
      
      /**
        * Returns black and white, grayscale, transparent, or color images. Acceptable values are: * `"color"` * `"gray"` * `"mono"`: black and white * `"trans"`: transparent background
        */
      var imgColorType: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specific dominant color. Acceptable values are: * `"black"` * `"blue"` * `"brown"` * `"gray"` * `"green"` * `"orange"` * `"pink"` * `"purple"` * `"red"` * `"teal"` * `"white"` * `"yellow"`
        */
      var imgDominantColor: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a specified size. Acceptable values are: * `"huge"` * `"icon"` * `"large"` * `"medium"` * `"small"` * `"xlarge"` * `"xxlarge"`
        */
      var imgSize: js.UndefOr[String] = js.undefined
      
      /**
        * Returns images of a type. Acceptable values are: * `"clipart"` * `"face"` * `"lineart"` * `"stock"` * `"photo"` * `"animated"`
        */
      var imgType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should contain a link to a particular URL.
        */
      var linkSite: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the starting value for a search range. Use `lowRange` and `highRange` to append an inclusive search range of `lowRange...highRange` to the query.
        */
      var lowRange: js.UndefOr[String] = js.undefined
      
      /**
        * Restricts the search to documents written in a particular language (e.g., `lr=lang_ja`). Acceptable values are: * `"lang_ar"`: Arabic * `"lang_bg"`: Bulgarian * `"lang_ca"`: Catalan * `"lang_cs"`: Czech * `"lang_da"`: Danish * `"lang_de"`: German * `"lang_el"`: Greek * `"lang_en"`: English * `"lang_es"`: Spanish * `"lang_et"`: Estonian * `"lang_fi"`: Finnish * `"lang_fr"`: French * `"lang_hr"`: Croatian * `"lang_hu"`: Hungarian * `"lang_id"`: Indonesian * `"lang_is"`: Icelandic * `"lang_it"`: Italian * `"lang_iw"`: Hebrew * `"lang_ja"`: Japanese * `"lang_ko"`: Korean * `"lang_lt"`: Lithuanian * `"lang_lv"`: Latvian * `"lang_nl"`: Dutch * `"lang_no"`: Norwegian * `"lang_pl"`: Polish * `"lang_pt"`: Portuguese * `"lang_ro"`: Romanian * `"lang_ru"`: Russian * `"lang_sk"`: Slovak * `"lang_sl"`: Slovenian * `"lang_sr"`: Serbian * `"lang_sv"`: Swedish * `"lang_tr"`: Turkish * `"lang_zh-CN"`: Chinese (Simplified) * `"lang_zh-TW"`: Chinese (Traditional)
        */
      var lr: js.UndefOr[String] = js.undefined
      
      /**
        * Number of search results to return. * Valid values are integers between 1 and 10, inclusive.
        */
      var num: js.UndefOr[Double] = js.undefined
      
      /**
        * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms.
        */
      var orTerms: js.UndefOr[String] = js.undefined
      
      /**
        * Query
        */
      var q: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies that all search results should be pages that are related to the specified URL.
        */
      var relatedSite: js.UndefOr[String] = js.undefined
      
      /**
        * Filters based on licensing. Supported values include: `cc_publicdomain`, `cc_attribute`, `cc_sharealike`, `cc_noncommercial`, `cc_nonderived` and combinations of these. See [typical combinations](https://wiki.creativecommons.org/wiki/CC_Search_integration).
        */
      var rights: js.UndefOr[String] = js.undefined
      
      /**
        * Search safety level. Acceptable values are: * `"active"`: Enables SafeSearch filtering. * `"off"`: Disables SafeSearch filtering. (default)
        */
      var safe: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies the search type: `image`. If unspecified, results are limited to webpages. Acceptable values are: * `"image"`: custom image search.
        */
      var searchType: js.UndefOr[String] = js.undefined
      
      /**
        * Specifies a given site which should always be included or excluded from results (see `siteSearchFilter` parameter, below).
        */
      var siteSearch: js.UndefOr[String] = js.undefined
      
      /**
        * Controls whether to include or exclude results from the site named in the `siteSearch` parameter. Acceptable values are: * `"e"`: exclude * `"i"`: include
        */
      var siteSearchFilter: js.UndefOr[String] = js.undefined
      
      /**
        * The sort expression to apply to the results. The sort parameter specifies that the results be sorted according to the specified expression i.e. sort by date. [Example: sort=date](https://developers.google.com/custom-search/docs/structured_search#sort-by-attribute).
        */
      var sort: js.UndefOr[String] = js.undefined
      
      /**
        * The index of the first result to return. The default number of results per page is 10, so `&start=11` would start at the top of the second page of results. **Note**: The JSON API will never return more than 100 results, even if more than 100 documents match the query, so setting the sum of `start + num` to a number greater than 100 will produce an error. Also note that the maximum value for `num` is 10.
        */
      var start: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceCseSiterestrictList {
      
      inline def apply(): ParamsResourceCseSiterestrictList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceCseSiterestrictList]
      }
      
      extension [Self <: ParamsResourceCseSiterestrictList](x: Self) {
        
        inline def setC2coff(value: String): Self = StObject.set(x, "c2coff", value.asInstanceOf[js.Any])
        
        inline def setC2coffUndefined: Self = StObject.set(x, "c2coff", js.undefined)
        
        inline def setCr(value: String): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
        
        inline def setCrUndefined: Self = StObject.set(x, "cr", js.undefined)
        
        inline def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
        
        inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
        
        inline def setDateRestrict(value: String): Self = StObject.set(x, "dateRestrict", value.asInstanceOf[js.Any])
        
        inline def setDateRestrictUndefined: Self = StObject.set(x, "dateRestrict", js.undefined)
        
        inline def setExactTerms(value: String): Self = StObject.set(x, "exactTerms", value.asInstanceOf[js.Any])
        
        inline def setExactTermsUndefined: Self = StObject.set(x, "exactTerms", js.undefined)
        
        inline def setExcludeTerms(value: String): Self = StObject.set(x, "excludeTerms", value.asInstanceOf[js.Any])
        
        inline def setExcludeTermsUndefined: Self = StObject.set(x, "excludeTerms", js.undefined)
        
        inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
        
        inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
        
        inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
        
        inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
        
        inline def setGooglehost(value: String): Self = StObject.set(x, "googlehost", value.asInstanceOf[js.Any])
        
        inline def setGooglehostUndefined: Self = StObject.set(x, "googlehost", js.undefined)
        
        inline def setHighRange(value: String): Self = StObject.set(x, "highRange", value.asInstanceOf[js.Any])
        
        inline def setHighRangeUndefined: Self = StObject.set(x, "highRange", js.undefined)
        
        inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
        
        inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
        
        inline def setHq(value: String): Self = StObject.set(x, "hq", value.asInstanceOf[js.Any])
        
        inline def setHqUndefined: Self = StObject.set(x, "hq", js.undefined)
        
        inline def setImgColorType(value: String): Self = StObject.set(x, "imgColorType", value.asInstanceOf[js.Any])
        
        inline def setImgColorTypeUndefined: Self = StObject.set(x, "imgColorType", js.undefined)
        
        inline def setImgDominantColor(value: String): Self = StObject.set(x, "imgDominantColor", value.asInstanceOf[js.Any])
        
        inline def setImgDominantColorUndefined: Self = StObject.set(x, "imgDominantColor", js.undefined)
        
        inline def setImgSize(value: String): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
        
        inline def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
        
        inline def setImgType(value: String): Self = StObject.set(x, "imgType", value.asInstanceOf[js.Any])
        
        inline def setImgTypeUndefined: Self = StObject.set(x, "imgType", js.undefined)
        
        inline def setLinkSite(value: String): Self = StObject.set(x, "linkSite", value.asInstanceOf[js.Any])
        
        inline def setLinkSiteUndefined: Self = StObject.set(x, "linkSite", js.undefined)
        
        inline def setLowRange(value: String): Self = StObject.set(x, "lowRange", value.asInstanceOf[js.Any])
        
        inline def setLowRangeUndefined: Self = StObject.set(x, "lowRange", js.undefined)
        
        inline def setLr(value: String): Self = StObject.set(x, "lr", value.asInstanceOf[js.Any])
        
        inline def setLrUndefined: Self = StObject.set(x, "lr", js.undefined)
        
        inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
        
        inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
        
        inline def setOrTerms(value: String): Self = StObject.set(x, "orTerms", value.asInstanceOf[js.Any])
        
        inline def setOrTermsUndefined: Self = StObject.set(x, "orTerms", js.undefined)
        
        inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
        
        inline def setRelatedSite(value: String): Self = StObject.set(x, "relatedSite", value.asInstanceOf[js.Any])
        
        inline def setRelatedSiteUndefined: Self = StObject.set(x, "relatedSite", js.undefined)
        
        inline def setRights(value: String): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
        
        inline def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
        
        inline def setSafe(value: String): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
        
        inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
        
        inline def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
        
        inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
        
        inline def setSiteSearch(value: String): Self = StObject.set(x, "siteSearch", value.asInstanceOf[js.Any])
        
        inline def setSiteSearchFilter(value: String): Self = StObject.set(x, "siteSearchFilter", value.asInstanceOf[js.Any])
        
        inline def setSiteSearchFilterUndefined: Self = StObject.set(x, "siteSearchFilter", js.undefined)
        
        inline def setSiteSearchUndefined: Self = StObject.set(x, "siteSearch", js.undefined)
        
        inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    trait SchemaPromotion extends StObject {
      
      /**
        * An array of block objects for this promotion.
        */
      var bodyLines: js.UndefOr[js.Array[HtmlTitle] | Null] = js.undefined
      
      /**
        * An abridged version of this search's result URL, e.g. www.example.com.
        */
      var displayLink: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The title of the promotion, in HTML.
        */
      var htmlTitle: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Image belonging to a promotion.
        */
      var image: js.UndefOr[HeightSource | Null] = js.undefined
      
      /**
        * The URL of the promotion.
        */
      var link: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The title of the promotion.
        */
      var title: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaPromotion {
      
      inline def apply(): SchemaPromotion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPromotion]
      }
      
      extension [Self <: SchemaPromotion](x: Self) {
        
        inline def setBodyLines(value: js.Array[HtmlTitle]): Self = StObject.set(x, "bodyLines", value.asInstanceOf[js.Any])
        
        inline def setBodyLinesNull: Self = StObject.set(x, "bodyLines", null)
        
        inline def setBodyLinesUndefined: Self = StObject.set(x, "bodyLines", js.undefined)
        
        inline def setBodyLinesVarargs(value: HtmlTitle*): Self = StObject.set(x, "bodyLines", js.Array(value*))
        
        inline def setDisplayLink(value: String): Self = StObject.set(x, "displayLink", value.asInstanceOf[js.Any])
        
        inline def setDisplayLinkNull: Self = StObject.set(x, "displayLink", null)
        
        inline def setDisplayLinkUndefined: Self = StObject.set(x, "displayLink", js.undefined)
        
        inline def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
        
        inline def setHtmlTitleNull: Self = StObject.set(x, "htmlTitle", null)
        
        inline def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
        
        inline def setImage(value: HeightSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageNull: Self = StObject.set(x, "image", null)
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkNull: Self = StObject.set(x, "link", null)
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaResult extends StObject {
      
      /**
        * Indicates the ID of Google's cached version of the search result.
        */
      var cacheId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * An abridged version of this search result’s URL, e.g. www.example.com.
        */
      var displayLink: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The file format of the search result.
        */
      var fileFormat: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The URL displayed after the snippet for each search result.
        */
      var formattedUrl: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The HTML-formatted URL displayed after the snippet for each search result.
        */
      var htmlFormattedUrl: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The snippet of the search result, in HTML.
        */
      var htmlSnippet: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The title of the search result, in HTML.
        */
      var htmlTitle: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Image belonging to a custom search result.
        */
      var image: js.UndefOr[ByteSize | Null] = js.undefined
      
      /**
        * A unique identifier for the type of current object. For this API, it is `customsearch#result.`
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Encapsulates all information about refinement labels.
        */
      var labels: js.UndefOr[js.Array[Labelwithop] | Null] = js.undefined
      
      /**
        * The full URL to which the search result is pointing, e.g. http://www.example.com/foo/bar.
        */
      var link: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The MIME type of the search result.
        */
      var mime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Contains [PageMap](https://developers.google.com/custom-search/docs/structured_data#pagemaps) information for this search result.
        */
      var pagemap: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
      
      /**
        * The snippet of the search result, in plain text.
        */
      var snippet: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The title of the search result, in plain text.
        */
      var title: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaResult {
      
      inline def apply(): SchemaResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaResult]
      }
      
      extension [Self <: SchemaResult](x: Self) {
        
        inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
        
        inline def setCacheIdNull: Self = StObject.set(x, "cacheId", null)
        
        inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
        
        inline def setDisplayLink(value: String): Self = StObject.set(x, "displayLink", value.asInstanceOf[js.Any])
        
        inline def setDisplayLinkNull: Self = StObject.set(x, "displayLink", null)
        
        inline def setDisplayLinkUndefined: Self = StObject.set(x, "displayLink", js.undefined)
        
        inline def setFileFormat(value: String): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
        
        inline def setFileFormatNull: Self = StObject.set(x, "fileFormat", null)
        
        inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
        
        inline def setFormattedUrl(value: String): Self = StObject.set(x, "formattedUrl", value.asInstanceOf[js.Any])
        
        inline def setFormattedUrlNull: Self = StObject.set(x, "formattedUrl", null)
        
        inline def setFormattedUrlUndefined: Self = StObject.set(x, "formattedUrl", js.undefined)
        
        inline def setHtmlFormattedUrl(value: String): Self = StObject.set(x, "htmlFormattedUrl", value.asInstanceOf[js.Any])
        
        inline def setHtmlFormattedUrlNull: Self = StObject.set(x, "htmlFormattedUrl", null)
        
        inline def setHtmlFormattedUrlUndefined: Self = StObject.set(x, "htmlFormattedUrl", js.undefined)
        
        inline def setHtmlSnippet(value: String): Self = StObject.set(x, "htmlSnippet", value.asInstanceOf[js.Any])
        
        inline def setHtmlSnippetNull: Self = StObject.set(x, "htmlSnippet", null)
        
        inline def setHtmlSnippetUndefined: Self = StObject.set(x, "htmlSnippet", js.undefined)
        
        inline def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
        
        inline def setHtmlTitleNull: Self = StObject.set(x, "htmlTitle", null)
        
        inline def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
        
        inline def setImage(value: ByteSize): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageNull: Self = StObject.set(x, "image", null)
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: js.Array[Labelwithop]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsNull: Self = StObject.set(x, "labels", null)
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLabelsVarargs(value: Labelwithop*): Self = StObject.set(x, "labels", js.Array(value*))
        
        inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkNull: Self = StObject.set(x, "link", null)
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
        
        inline def setMimeNull: Self = StObject.set(x, "mime", null)
        
        inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
        
        inline def setPagemap(value: StringDictionary[Any]): Self = StObject.set(x, "pagemap", value.asInstanceOf[js.Any])
        
        inline def setPagemapNull: Self = StObject.set(x, "pagemap", null)
        
        inline def setPagemapUndefined: Self = StObject.set(x, "pagemap", js.undefined)
        
        inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetNull: Self = StObject.set(x, "snippet", null)
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait SchemaSearch extends StObject {
      
      /**
        * Metadata and refinements associated with the given search engine, including: * The name of the search engine that was used for the query. * A set of [facet objects](https://developers.google.com/custom-search/docs/refinements#create) (refinements) you can use for refining a search.
        */
      var context: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
      
      /**
        * The current set of custom search results.
        */
      var items: js.UndefOr[js.Array[SchemaResult]] = js.undefined
      
      /**
        * Unique identifier for the type of current object. For this API, it is customsearch#search.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The set of [promotions](https://developers.google.com/custom-search/docs/promotions). Present only if the custom search engine's configuration files define any promotions for the given query.
        */
      var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.undefined
      
      /**
        * Query metadata for the previous, current, and next pages of results.
        */
      var queries: js.UndefOr[NextPage | Null] = js.undefined
      
      /**
        * Metadata about a search operation.
        */
      var searchInformation: js.UndefOr[FormattedSearchTime | Null] = js.undefined
      
      /**
        * Spell correction information for a query.
        */
      var spelling: js.UndefOr[CorrectedQuery | Null] = js.undefined
      
      /**
        * OpenSearch template and URL.
        */
      var url: js.UndefOr[Template | Null] = js.undefined
    }
    object SchemaSearch {
      
      inline def apply(): SchemaSearch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSearch]
      }
      
      extension [Self <: SchemaSearch](x: Self) {
        
        inline def setContext(value: StringDictionary[Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextNull: Self = StObject.set(x, "context", null)
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setItems(value: js.Array[SchemaResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaResult*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPromotions(value: js.Array[SchemaPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
        
        inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
        
        inline def setPromotionsVarargs(value: SchemaPromotion*): Self = StObject.set(x, "promotions", js.Array(value*))
        
        inline def setQueries(value: NextPage): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
        
        inline def setQueriesNull: Self = StObject.set(x, "queries", null)
        
        inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
        
        inline def setSearchInformation(value: FormattedSearchTime): Self = StObject.set(x, "searchInformation", value.asInstanceOf[js.Any])
        
        inline def setSearchInformationNull: Self = StObject.set(x, "searchInformation", null)
        
        inline def setSearchInformationUndefined: Self = StObject.set(x, "searchInformation", js.undefined)
        
        inline def setSpelling(value: CorrectedQuery): Self = StObject.set(x, "spelling", value.asInstanceOf[js.Any])
        
        inline def setSpellingNull: Self = StObject.set(x, "spelling", null)
        
        inline def setSpellingUndefined: Self = StObject.set(x, "spelling", js.undefined)
        
        inline def setUrl(value: Template): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlNull: Self = StObject.set(x, "url", null)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
