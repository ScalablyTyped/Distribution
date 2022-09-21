package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/paymentsresellersubscription/v1", "paymentsresellersubscription_v1.Resource$Partners$Products")
@js.native
open class ResourcePartnersProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse] = js.native
  def list(params: ParamsResourcePartnersProductsList): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse] = js.native
  def list(
    params: ParamsResourcePartnersProductsList,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePartnersProductsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersProductsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse] = js.native
  def list(
    params: ParamsResourcePartnersProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse]
  ): Unit = js.native
  /**
    * To retrieve the products that can be resold by the partner. It should be autenticated with a service account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
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
    *   const res = await paymentsresellersubscription.partners.products.list({
    *     // Optional. Specifies the filters for the products results. The syntax defined in the EBNF grammar: https://google.aip.dev/assets/misc/ebnf-filtering.txt. An error will be thrown if any specified parameter is not supported. Currently, it can only be used by Youtube partners. Allowed parameters are: - regionCodes - zipCode - eligibilityId Multiple parameters can be specified, for example: "regionCodes=US zipCode=94043 eligibilityId=2022H1Campaign"
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of products to return. The service may return fewer than this value. If unspecified, at most 50 products will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListProducts` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListProducts` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, the partner that can resell. Format: partners/{partner\}
    *     parent: 'partners/my-partner',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "products": []
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
  def list(params: ParamsResourcePartnersProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePartnersProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
