package typings.googleapis.v5Mod.pagespeedonlineV5

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pagespeedonline/v5", "pagespeedonline_v5.Resource$Pagespeedapi")
@js.native
open class ResourcePagespeedapi protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
    options: BodyResponseCallback[Readable | SchemaPagespeedApiPagespeedResponseV5],
    callback: BodyResponseCallback[Readable | SchemaPagespeedApiPagespeedResponseV5]
  ): Unit = js.native
  def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed, options: MethodOptions): GaxiosPromise[SchemaPagespeedApiPagespeedResponseV5] = js.native
  def runpagespeed(
    params: ParamsResourcePagespeedapiRunpagespeed,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPagespeedApiPagespeedResponseV5]
  ): Unit = js.native
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other information.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pagespeedonline.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pagespeedonline = google.pagespeedonline('v5');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['openid'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pagespeedonline.pagespeedapi.runpagespeed({
    *     // The captcha token passed when filling out a captcha.
    *     captchaToken: 'placeholder-value',
    *     // A Lighthouse category to run; if none are given, only Performance category will be run
    *     category: 'placeholder-value',
    *     // The locale used to localize formatted results
    *     locale: '[a-zA-Z]+((_|-)[a-zA-Z]+)?',
    *     // The analysis strategy (desktop or mobile) to use, and desktop is the default
    *     strategy: 'placeholder-value',
    *     // Required. The URL to fetch and analyze
    *     url: '(?i)(url:|origin:)?http(s)?://.*',
    *     // Campaign name for analytics.
    *     utm_campaign: 'placeholder-value',
    *     // Campaign source for analytics.
    *     utm_source: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "analysisUTCTimestamp": "my_analysisUTCTimestamp",
    *   //   "captchaResult": "my_captchaResult",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "lighthouseResult": {},
    *   //   "loadingExperience": {},
    *   //   "originLoadingExperience": {},
    *   //   "version": {}
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
  def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runpagespeed(
    params: ParamsResourcePagespeedapiRunpagespeed,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
