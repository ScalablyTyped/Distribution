package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Advertiserinvoices")
@js.native
open class ResourceAdvertiserinvoices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaAdvertiserInvoicesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAdvertiserInvoicesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiserInvoicesListResponse] = js.native
  def list(params: ParamsResourceAdvertiserinvoicesList): GaxiosPromise[SchemaAdvertiserInvoicesListResponse] = js.native
  def list(
    params: ParamsResourceAdvertiserinvoicesList,
    callback: BodyResponseCallback[SchemaAdvertiserInvoicesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertiserinvoicesList,
    options: BodyResponseCallback[Readable | SchemaAdvertiserInvoicesListResponse],
    callback: BodyResponseCallback[Readable | SchemaAdvertiserInvoicesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertiserinvoicesList, options: MethodOptions): GaxiosPromise[SchemaAdvertiserInvoicesListResponse] = js.native
  def list(
    params: ParamsResourceAdvertiserinvoicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserInvoicesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of invoices for a particular issue month. The api only works if the billing profile invoice level is set to either advertiser or campaign non-consolidated invoice level.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.advertiserInvoices.list({
    *     // Advertiser ID of this invoice.
    *     advertiserId: 'placeholder-value',
    *     // Month for which invoices are needed in the format YYYYMM. Required field
    *     issueMonth: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "invoices": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceAdvertiserinvoicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertiserinvoicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
