package typings.googleapis.gmailpostmastertoolsV1beta1Mod.gmailpostmastertoolsV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmailpostmastertools/v1beta1", "gmailpostmastertools_v1beta1.Resource$Domains$Trafficstats")
@js.native
open class ResourceDomainsTrafficstats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTrafficStats] = js.native
  def get(callback: BodyResponseCallback[SchemaTrafficStats]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTrafficStats] = js.native
  def get(params: ParamsResourceDomainsTrafficstatsGet): GaxiosPromise[SchemaTrafficStats] = js.native
  def get(params: ParamsResourceDomainsTrafficstatsGet, callback: BodyResponseCallback[SchemaTrafficStats]): Unit = js.native
  def get(
    params: ParamsResourceDomainsTrafficstatsGet,
    options: BodyResponseCallback[Readable | SchemaTrafficStats],
    callback: BodyResponseCallback[Readable | SchemaTrafficStats]
  ): Unit = js.native
  def get(params: ParamsResourceDomainsTrafficstatsGet, options: MethodOptions): GaxiosPromise[SchemaTrafficStats] = js.native
  def get(
    params: ParamsResourceDomainsTrafficstatsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrafficStats]
  ): Unit = js.native
  /**
    * Get traffic statistics for a domain on a specific date. Returns PERMISSION_DENIED if user does not have permission to access TrafficStats for the domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmailpostmastertools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmailpostmastertools = google.gmailpostmastertools('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/postmaster.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmailpostmastertools.domains.trafficStats.get({
    *     // The resource name of the traffic statistics to get. E.g., domains/mymail.mydomain.com/trafficStats/20160807.
    *     name: 'domains/my-domain/trafficStats/my-trafficStat',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deliveryErrors": [],
    *   //   "dkimSuccessRatio": {},
    *   //   "dmarcSuccessRatio": {},
    *   //   "domainReputation": "my_domainReputation",
    *   //   "inboundEncryptionRatio": {},
    *   //   "ipReputations": [],
    *   //   "name": "my_name",
    *   //   "outboundEncryptionRatio": {},
    *   //   "spammyFeedbackLoops": [],
    *   //   "spfSuccessRatio": {},
    *   //   "userReportedSpamRatio": {}
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
  def get(params: ParamsResourceDomainsTrafficstatsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDomainsTrafficstatsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTrafficStatsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTrafficStatsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTrafficStatsResponse] = js.native
  def list(params: ParamsResourceDomainsTrafficstatsList): GaxiosPromise[SchemaListTrafficStatsResponse] = js.native
  def list(
    params: ParamsResourceDomainsTrafficstatsList,
    callback: BodyResponseCallback[SchemaListTrafficStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDomainsTrafficstatsList,
    options: BodyResponseCallback[Readable | SchemaListTrafficStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTrafficStatsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDomainsTrafficstatsList, options: MethodOptions): GaxiosPromise[SchemaListTrafficStatsResponse] = js.native
  def list(
    params: ParamsResourceDomainsTrafficstatsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTrafficStatsResponse]
  ): Unit = js.native
  /**
    * List traffic statistics for all available days. Returns PERMISSION_DENIED if user does not have permission to access TrafficStats for the domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmailpostmastertools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmailpostmastertools = google.gmailpostmastertools('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/postmaster.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmailpostmastertools.domains.trafficStats.list({
    *     // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    *     'endDate.day': 'placeholder-value',
    *     // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    *     'endDate.month': 'placeholder-value',
    *     // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    *     'endDate.year': 'placeholder-value',
    *     // Requested page size. Server may return fewer TrafficStats than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any. This is the value of ListTrafficStatsResponse.next_page_token returned from the previous call to `ListTrafficStats` method.
    *     pageToken: 'placeholder-value',
    *     // The resource name of the domain whose traffic statistics we'd like to list. It should have the form `domains/{domain_name\}`, where domain_name is the fully qualified domain name.
    *     parent: 'domains/my-domain',
    *     // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    *     'startDate.day': 'placeholder-value',
    *     // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    *     'startDate.month': 'placeholder-value',
    *     // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    *     'startDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "trafficStats": []
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
  def list(params: ParamsResourceDomainsTrafficstatsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDomainsTrafficstatsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
