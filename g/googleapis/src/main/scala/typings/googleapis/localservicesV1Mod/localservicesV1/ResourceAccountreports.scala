package typings.googleapis.localservicesV1Mod.localservicesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/localservices/v1", "localservices_v1.Resource$Accountreports")
@js.native
open class ResourceAccountreports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
  def search(
    callback: BodyResponseCallback[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse]
  ): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
  def search(params: ParamsResourceAccountreportsSearch): GaxiosPromise[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
  def search(
    params: ParamsResourceAccountreportsSearch,
    callback: BodyResponseCallback[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceAccountreportsSearch,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse
    ]
  ): Unit = js.native
  def search(params: ParamsResourceAccountreportsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse] = js.native
  def search(
    params: ParamsResourceAccountreportsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse]
  ): Unit = js.native
  /**
    * Get account reports containing aggregate account data of all linked GLS accounts. Caller needs to provide their manager customer id and the associated auth credential that allows them read permissions on their linked accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/localservices.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const localservices = google.localservices('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adwords'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await localservices.accountReports.search({
    *     // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    *     'endDate.day': 'placeholder-value',
    *     // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    *     'endDate.month': 'placeholder-value',
    *     // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    *     'endDate.year': 'placeholder-value',
    *     // The maximum number of accounts to return. If the page size is unset, page size will default to 1000. Maximum page_size is 10000. Optional.
    *     pageSize: 'placeholder-value',
    *     // The `next_page_token` value returned from a previous request to SearchAccountReports that indicates where listing should continue. Optional.
    *     pageToken: 'placeholder-value',
    *     // A query string for searching for account reports. Caller must provide a customer id of their MCC account with an associated Gaia Mint that allows read permission on their linked accounts. Search expressions are case insensitive. Example query: | Query | Description | |-------------------------|-----------------------------------------------| | manager_customer_id:123 | Get Account Report for Manager with id 123. | Required.
    *     query: 'placeholder-value',
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
    *   //   "accountReports": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def search(params: ParamsResourceAccountreportsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceAccountreportsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
