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

@JSImport("googleapis/build/src/apis/paymentsresellersubscription/v1", "paymentsresellersubscription_v1.Resource$Partners$Promotions")
@js.native
open class ResourcePartnersPromotions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def findEligible(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse] = js.native
  def findEligible(
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse]
  ): Unit = js.native
  def findEligible(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse] = js.native
  def findEligible(params: ParamsResourcePartnersPromotionsFindeligible): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse] = js.native
  def findEligible(
    params: ParamsResourcePartnersPromotionsFindeligible,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse]
  ): Unit = js.native
  def findEligible(
    params: ParamsResourcePartnersPromotionsFindeligible,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse
    ]
  ): Unit = js.native
  def findEligible(params: ParamsResourcePartnersPromotionsFindeligible, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse] = js.native
  def findEligible(
    params: ParamsResourcePartnersPromotionsFindeligible,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse]
  ): Unit = js.native
  /**
    * To find eligible promotions for the current user. The API requires user authorization via OAuth. The user is inferred from the authenticated OAuth credential.
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
    *   const res =
    *     await paymentsresellersubscription.partners.promotions.findEligible({
    *       // Required. The parent, the partner that can resell. Format: partners/{partner\}
    *       parent: 'partners/my-partner',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "filter": "my_filter",
    *         //   "pageSize": 0,
    *         //   "pageToken": "my_pageToken"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "promotions": []
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
  def findEligible(params: ParamsResourcePartnersPromotionsFindeligible, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def findEligible(
    params: ParamsResourcePartnersPromotionsFindeligible,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse] = js.native
  def list(params: ParamsResourcePartnersPromotionsList): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse] = js.native
  def list(
    params: ParamsResourcePartnersPromotionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePartnersPromotionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersPromotionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse] = js.native
  def list(
    params: ParamsResourcePartnersPromotionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListPromotionsResponse]
  ): Unit = js.native
  /**
    * To retrieve the promotions, such as free trial, that can be used by the partner. It should be autenticated with a service account.
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
    *   const res = await paymentsresellersubscription.partners.promotions.list({
    *     // Optional. Specifies the filters for the promotion results. The syntax defined in the EBNF grammar: https://google.aip.dev/assets/misc/ebnf-filtering.txt. An error will be thrown if the specified parameter(s) is not supported. Currently, it can only be used by Youtube partners. Allowed parameters are: - region_codes: "US" - zip_code: "94043" - eligibility_id: "2022H1Campaign" Multiple parameters can be specified, for example: "region_codes=US zip_code=94043 eligibility_id=2022H1Campaign"
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of promotions to return. The service may return fewer than this value. If unspecified, at most 50 products will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListPromotions` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListPromotions` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, the partner that can resell. Format: partners/{partner\}
    *     parent: 'partners/my-partner',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "promotions": []
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
  def list(params: ParamsResourcePartnersPromotionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePartnersPromotionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
