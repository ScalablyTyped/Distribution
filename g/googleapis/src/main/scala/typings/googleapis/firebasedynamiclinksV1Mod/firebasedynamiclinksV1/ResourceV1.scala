package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Resource$V1")
@js.native
open class ResourceV1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getLinkStats(): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(callback: BodyResponseCallback[SchemaDynamicLinkStats]): Unit = js.native
  def getLinkStats(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(params: ParamsResourceV1Getlinkstats): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(params: ParamsResourceV1Getlinkstats, callback: BodyResponseCallback[SchemaDynamicLinkStats]): Unit = js.native
  def getLinkStats(
    params: ParamsResourceV1Getlinkstats,
    options: BodyResponseCallback[Readable | SchemaDynamicLinkStats],
    callback: BodyResponseCallback[Readable | SchemaDynamicLinkStats]
  ): Unit = js.native
  def getLinkStats(params: ParamsResourceV1Getlinkstats, options: MethodOptions): GaxiosPromise[SchemaDynamicLinkStats] = js.native
  def getLinkStats(
    params: ParamsResourceV1Getlinkstats,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDynamicLinkStats]
  ): Unit = js.native
  /**
    * Fetches analytics stats of a short Dynamic Link for a given duration. Metrics include number of clicks, redirects, installs, app first opens, and app reopens.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasedynamiclinks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/firebase'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasedynamiclinks.getLinkStats({
    *     // The span of time requested in days.
    *     durationDays: 'placeholder-value',
    *     // Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
    *     dynamicLink: 'placeholder-value',
    *     // Google SDK version. Version takes the form "$major.$minor.$patch"
    *     sdkVersion: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "linkEventStats": []
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
  def getLinkStats(params: ParamsResourceV1Getlinkstats, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getLinkStats(
    params: ParamsResourceV1Getlinkstats,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def installAttribution(): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(callback: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse]): Unit = js.native
  def installAttribution(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(params: ParamsResourceV1Installattribution): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(
    params: ParamsResourceV1Installattribution,
    callback: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse]
  ): Unit = js.native
  def installAttribution(
    params: ParamsResourceV1Installattribution,
    options: BodyResponseCallback[Readable | SchemaGetIosPostInstallAttributionResponse],
    callback: BodyResponseCallback[Readable | SchemaGetIosPostInstallAttributionResponse]
  ): Unit = js.native
  def installAttribution(params: ParamsResourceV1Installattribution, options: MethodOptions): GaxiosPromise[SchemaGetIosPostInstallAttributionResponse] = js.native
  def installAttribution(
    params: ParamsResourceV1Installattribution,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetIosPostInstallAttributionResponse]
  ): Unit = js.native
  /**
    * Get iOS strong/weak-match info for post-install attribution.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasedynamiclinks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/firebase'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasedynamiclinks.installAttribution({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appInstallationTime": "my_appInstallationTime",
    *       //   "bundleId": "my_bundleId",
    *       //   "device": {},
    *       //   "iosVersion": "my_iosVersion",
    *       //   "retrievalMethod": "my_retrievalMethod",
    *       //   "sdkVersion": "my_sdkVersion",
    *       //   "uniqueMatchLinkToCheck": "my_uniqueMatchLinkToCheck",
    *       //   "visualStyle": "my_visualStyle"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appMinimumVersion": "my_appMinimumVersion",
    *   //   "attributionConfidence": "my_attributionConfidence",
    *   //   "deepLink": "my_deepLink",
    *   //   "externalBrowserDestinationLink": "my_externalBrowserDestinationLink",
    *   //   "fallbackLink": "my_fallbackLink",
    *   //   "invitationId": "my_invitationId",
    *   //   "isStrongMatchExecutable": false,
    *   //   "matchMessage": "my_matchMessage",
    *   //   "requestIpVersion": "my_requestIpVersion",
    *   //   "requestedLink": "my_requestedLink",
    *   //   "resolvedLink": "my_resolvedLink",
    *   //   "utmCampaign": "my_utmCampaign",
    *   //   "utmContent": "my_utmContent",
    *   //   "utmMedium": "my_utmMedium",
    *   //   "utmSource": "my_utmSource",
    *   //   "utmTerm": "my_utmTerm"
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
  def installAttribution(params: ParamsResourceV1Installattribution, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def installAttribution(
    params: ParamsResourceV1Installattribution,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reopenAttribution(): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(callback: BodyResponseCallback[SchemaGetIosReopenAttributionResponse]): Unit = js.native
  def reopenAttribution(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(params: ParamsResourceV1Reopenattribution): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(
    params: ParamsResourceV1Reopenattribution,
    callback: BodyResponseCallback[SchemaGetIosReopenAttributionResponse]
  ): Unit = js.native
  def reopenAttribution(
    params: ParamsResourceV1Reopenattribution,
    options: BodyResponseCallback[Readable | SchemaGetIosReopenAttributionResponse],
    callback: BodyResponseCallback[Readable | SchemaGetIosReopenAttributionResponse]
  ): Unit = js.native
  def reopenAttribution(params: ParamsResourceV1Reopenattribution, options: MethodOptions): GaxiosPromise[SchemaGetIosReopenAttributionResponse] = js.native
  def reopenAttribution(
    params: ParamsResourceV1Reopenattribution,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetIosReopenAttributionResponse]
  ): Unit = js.native
  /**
    * Get iOS reopen attribution for app universal link open deeplinking.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasedynamiclinks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/firebase'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasedynamiclinks.reopenAttribution({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bundleId": "my_bundleId",
    *       //   "requestedLink": "my_requestedLink",
    *       //   "sdkVersion": "my_sdkVersion"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deepLink": "my_deepLink",
    *   //   "invitationId": "my_invitationId",
    *   //   "iosMinAppVersion": "my_iosMinAppVersion",
    *   //   "resolvedLink": "my_resolvedLink",
    *   //   "utmCampaign": "my_utmCampaign",
    *   //   "utmContent": "my_utmContent",
    *   //   "utmMedium": "my_utmMedium",
    *   //   "utmSource": "my_utmSource",
    *   //   "utmTerm": "my_utmTerm"
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
  def reopenAttribution(params: ParamsResourceV1Reopenattribution, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reopenAttribution(
    params: ParamsResourceV1Reopenattribution,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
