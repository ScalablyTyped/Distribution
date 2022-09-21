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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Promotions")
@js.native
open class ResourcePromotions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPromotion] = js.native
  def create(callback: BodyResponseCallback[SchemaPromotion]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPromotion] = js.native
  def create(params: ParamsResourcePromotionsCreate): GaxiosPromise[SchemaPromotion] = js.native
  def create(params: ParamsResourcePromotionsCreate, callback: BodyResponseCallback[SchemaPromotion]): Unit = js.native
  def create(
    params: ParamsResourcePromotionsCreate,
    options: BodyResponseCallback[Readable | SchemaPromotion],
    callback: BodyResponseCallback[Readable | SchemaPromotion]
  ): Unit = js.native
  def create(params: ParamsResourcePromotionsCreate, options: MethodOptions): GaxiosPromise[SchemaPromotion] = js.native
  def create(
    params: ParamsResourcePromotionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPromotion]
  ): Unit = js.native
  /**
    * Inserts a promotion for your Merchant Center account. If the promotion already exists, then it updates the promotion instead.
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
    *   const res = await content.promotions.create({
    *     // Required. The ID of the account that contains the collection.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "brand": [],
    *       //   "brandExclusion": [],
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "couponValueType": "my_couponValueType",
    *       //   "freeGiftDescription": "my_freeGiftDescription",
    *       //   "freeGiftItemId": "my_freeGiftItemId",
    *       //   "freeGiftValue": {},
    *       //   "genericRedemptionCode": "my_genericRedemptionCode",
    *       //   "getThisQuantityDiscounted": 0,
    *       //   "id": "my_id",
    *       //   "itemGroupId": [],
    *       //   "itemGroupIdExclusion": [],
    *       //   "itemId": [],
    *       //   "itemIdExclusion": [],
    *       //   "limitQuantity": 0,
    *       //   "limitValue": {},
    *       //   "longTitle": "my_longTitle",
    *       //   "minimumPurchaseAmount": {},
    *       //   "minimumPurchaseQuantity": 0,
    *       //   "moneyBudget": {},
    *       //   "moneyOffAmount": {},
    *       //   "offerType": "my_offerType",
    *       //   "orderLimit": 0,
    *       //   "percentOff": 0,
    *       //   "productApplicability": "my_productApplicability",
    *       //   "productType": [],
    *       //   "productTypeExclusion": [],
    *       //   "promotionDestinationIds": [],
    *       //   "promotionDisplayDates": "my_promotionDisplayDates",
    *       //   "promotionDisplayTimePeriod": {},
    *       //   "promotionEffectiveDates": "my_promotionEffectiveDates",
    *       //   "promotionEffectiveTimePeriod": {},
    *       //   "promotionId": "my_promotionId",
    *       //   "redemptionChannel": [],
    *       //   "shippingServiceNames": [],
    *       //   "targetCountry": "my_targetCountry"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "brand": [],
    *   //   "brandExclusion": [],
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "couponValueType": "my_couponValueType",
    *   //   "freeGiftDescription": "my_freeGiftDescription",
    *   //   "freeGiftItemId": "my_freeGiftItemId",
    *   //   "freeGiftValue": {},
    *   //   "genericRedemptionCode": "my_genericRedemptionCode",
    *   //   "getThisQuantityDiscounted": 0,
    *   //   "id": "my_id",
    *   //   "itemGroupId": [],
    *   //   "itemGroupIdExclusion": [],
    *   //   "itemId": [],
    *   //   "itemIdExclusion": [],
    *   //   "limitQuantity": 0,
    *   //   "limitValue": {},
    *   //   "longTitle": "my_longTitle",
    *   //   "minimumPurchaseAmount": {},
    *   //   "minimumPurchaseQuantity": 0,
    *   //   "moneyBudget": {},
    *   //   "moneyOffAmount": {},
    *   //   "offerType": "my_offerType",
    *   //   "orderLimit": 0,
    *   //   "percentOff": 0,
    *   //   "productApplicability": "my_productApplicability",
    *   //   "productType": [],
    *   //   "productTypeExclusion": [],
    *   //   "promotionDestinationIds": [],
    *   //   "promotionDisplayDates": "my_promotionDisplayDates",
    *   //   "promotionDisplayTimePeriod": {},
    *   //   "promotionEffectiveDates": "my_promotionEffectiveDates",
    *   //   "promotionEffectiveTimePeriod": {},
    *   //   "promotionId": "my_promotionId",
    *   //   "redemptionChannel": [],
    *   //   "shippingServiceNames": [],
    *   //   "targetCountry": "my_targetCountry"
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
  def create(params: ParamsResourcePromotionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePromotionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPromotion] = js.native
  def get(callback: BodyResponseCallback[SchemaPromotion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPromotion] = js.native
  def get(params: ParamsResourcePromotionsGet): GaxiosPromise[SchemaPromotion] = js.native
  def get(params: ParamsResourcePromotionsGet, callback: BodyResponseCallback[SchemaPromotion]): Unit = js.native
  def get(
    params: ParamsResourcePromotionsGet,
    options: BodyResponseCallback[Readable | SchemaPromotion],
    callback: BodyResponseCallback[Readable | SchemaPromotion]
  ): Unit = js.native
  def get(params: ParamsResourcePromotionsGet, options: MethodOptions): GaxiosPromise[SchemaPromotion] = js.native
  def get(
    params: ParamsResourcePromotionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPromotion]
  ): Unit = js.native
  /**
    * Retrieves a promotion from your Merchant Center account.
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
    *   const res = await content.promotions.get({
    *     // Required. REST ID of the promotion to retrieve.
    *     id: 'placeholder-value',
    *     // Required. The ID of the account that contains the collection.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "brand": [],
    *   //   "brandExclusion": [],
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "couponValueType": "my_couponValueType",
    *   //   "freeGiftDescription": "my_freeGiftDescription",
    *   //   "freeGiftItemId": "my_freeGiftItemId",
    *   //   "freeGiftValue": {},
    *   //   "genericRedemptionCode": "my_genericRedemptionCode",
    *   //   "getThisQuantityDiscounted": 0,
    *   //   "id": "my_id",
    *   //   "itemGroupId": [],
    *   //   "itemGroupIdExclusion": [],
    *   //   "itemId": [],
    *   //   "itemIdExclusion": [],
    *   //   "limitQuantity": 0,
    *   //   "limitValue": {},
    *   //   "longTitle": "my_longTitle",
    *   //   "minimumPurchaseAmount": {},
    *   //   "minimumPurchaseQuantity": 0,
    *   //   "moneyBudget": {},
    *   //   "moneyOffAmount": {},
    *   //   "offerType": "my_offerType",
    *   //   "orderLimit": 0,
    *   //   "percentOff": 0,
    *   //   "productApplicability": "my_productApplicability",
    *   //   "productType": [],
    *   //   "productTypeExclusion": [],
    *   //   "promotionDestinationIds": [],
    *   //   "promotionDisplayDates": "my_promotionDisplayDates",
    *   //   "promotionDisplayTimePeriod": {},
    *   //   "promotionEffectiveDates": "my_promotionEffectiveDates",
    *   //   "promotionEffectiveTimePeriod": {},
    *   //   "promotionId": "my_promotionId",
    *   //   "redemptionChannel": [],
    *   //   "shippingServiceNames": [],
    *   //   "targetCountry": "my_targetCountry"
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
  def get(params: ParamsResourcePromotionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePromotionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
