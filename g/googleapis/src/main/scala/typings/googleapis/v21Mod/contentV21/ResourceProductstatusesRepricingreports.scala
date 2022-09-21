package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Productstatuses$Repricingreports")
@js.native
open class ResourceProductstatusesRepricingreports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListRepricingProductReportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRepricingProductReportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRepricingProductReportsResponse] = js.native
  def list(params: ParamsResourceProductstatusesRepricingreportsList): GaxiosPromise[SchemaListRepricingProductReportsResponse] = js.native
  def list(
    params: ParamsResourceProductstatusesRepricingreportsList,
    callback: BodyResponseCallback[SchemaListRepricingProductReportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProductstatusesRepricingreportsList,
    options: BodyResponseCallback[Readable | SchemaListRepricingProductReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRepricingProductReportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProductstatusesRepricingreportsList, options: MethodOptions): GaxiosPromise[SchemaListRepricingProductReportsResponse] = js.native
  def list(
    params: ParamsResourceProductstatusesRepricingreportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRepricingProductReportsResponse]
  ): Unit = js.native
  /**
    * Lists the metrics report for a given Repricing product.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.productstatuses.repricingreports.list({
    *     // Gets Repricing reports on and before this date in the merchant's timezone. You can only retrieve data up to 7 days ago (default) or earlier. Format is YYYY-MM-DD.
    *     endDate: 'placeholder-value',
    *     // Required. Id of the merchant who owns the Repricing rule.
    *     merchantId: 'placeholder-value',
    *     // Maximum number of days of reports to return. There can be more than one rule report returned per day. For example, if 3 rule types got applied to the same product within a 24-hour period, then a page_size of 1 will return 3 rule reports. The page size defaults to 50 and values above 1000 are coerced to 1000. This service may return fewer days of reports than this value, for example, if the time between your start and end date is less than the page size.
    *     pageSize: 'placeholder-value',
    *     // Token (if provided) to retrieve the subsequent page. All other parameters must match the original call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Id of the Repricing product. Also known as the [REST_ID](https://developers.google.com/shopping-content/reference/rest/v2.1/products#Product.FIELDS.id)
    *     productId: 'placeholder-value',
    *     // Id of the Repricing rule. If specified, only gets this rule's reports.
    *     ruleId: 'placeholder-value',
    *     // Gets Repricing reports on and after this date in the merchant's timezone, up to one year ago. Do not use a start date later than 7 days ago (default). Format is YYYY-MM-DD.
    *     startDate: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "repricingProductReports": []
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
  def list(params: ParamsResourceProductstatusesRepricingreportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProductstatusesRepricingreportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
