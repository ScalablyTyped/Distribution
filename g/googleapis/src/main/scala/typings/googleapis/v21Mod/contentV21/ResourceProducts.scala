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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Products")
@js.native
open class ResourceProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaProductsCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceProductsCustombatch): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductsCustombatch,
    callback: BodyResponseCallback[SchemaProductsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceProductsCustombatch,
    options: BodyResponseCallback[Readable | SchemaProductsCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaProductsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceProductsCustombatch, options: MethodOptions): GaxiosPromise[SchemaProductsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceProductsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductsCustomBatchResponse]
  ): Unit = js.native
  /**
    * Retrieves, inserts, and deletes multiple products in a single request.
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
    *   const res = await content.products.custombatch({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entries": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "kind": "my_kind"
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
  def custombatch(params: ParamsResourceProductsCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceProductsCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceProductsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceProductsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a product from your Merchant Center account.
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
    *   const res = await content.products.delete({
    *     // The Content API Supplemental Feed ID. If present then product deletion applies to the data in a supplemental feed. If absent, entire product will be deleted.
    *     feedId: 'placeholder-value',
    *     // The ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The REST ID of the product.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceProductsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProductsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: BodyResponseCallback[Readable | SchemaProduct],
    callback: BodyResponseCallback[Readable | SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * Retrieves a product from your Merchant Center account.
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
    *   const res = await content.products.get({
    *     // The ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The REST ID of the product.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalImageLinks": [],
    *   //   "additionalSizeType": "my_additionalSizeType",
    *   //   "adsGrouping": "my_adsGrouping",
    *   //   "adsLabels": [],
    *   //   "adsRedirect": "my_adsRedirect",
    *   //   "adult": false,
    *   //   "ageGroup": "my_ageGroup",
    *   //   "availability": "my_availability",
    *   //   "availabilityDate": "my_availabilityDate",
    *   //   "brand": "my_brand",
    *   //   "canonicalLink": "my_canonicalLink",
    *   //   "channel": "my_channel",
    *   //   "color": "my_color",
    *   //   "condition": "my_condition",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "costOfGoodsSold": {},
    *   //   "customAttributes": [],
    *   //   "customLabel0": "my_customLabel0",
    *   //   "customLabel1": "my_customLabel1",
    *   //   "customLabel2": "my_customLabel2",
    *   //   "customLabel3": "my_customLabel3",
    *   //   "customLabel4": "my_customLabel4",
    *   //   "description": "my_description",
    *   //   "displayAdsId": "my_displayAdsId",
    *   //   "displayAdsLink": "my_displayAdsLink",
    *   //   "displayAdsSimilarIds": [],
    *   //   "displayAdsTitle": "my_displayAdsTitle",
    *   //   "displayAdsValue": {},
    *   //   "energyEfficiencyClass": "my_energyEfficiencyClass",
    *   //   "excludedDestinations": [],
    *   //   "expirationDate": "my_expirationDate",
    *   //   "externalSellerId": "my_externalSellerId",
    *   //   "feedLabel": "my_feedLabel",
    *   //   "gender": "my_gender",
    *   //   "googleProductCategory": "my_googleProductCategory",
    *   //   "gtin": "my_gtin",
    *   //   "id": "my_id",
    *   //   "identifierExists": false,
    *   //   "imageLink": "my_imageLink",
    *   //   "includedDestinations": [],
    *   //   "installment": {},
    *   //   "isBundle": false,
    *   //   "itemGroupId": "my_itemGroupId",
    *   //   "kind": "my_kind",
    *   //   "link": "my_link",
    *   //   "linkTemplate": "my_linkTemplate",
    *   //   "loyaltyPoints": {},
    *   //   "material": "my_material",
    *   //   "maxEnergyEfficiencyClass": "my_maxEnergyEfficiencyClass",
    *   //   "maxHandlingTime": "my_maxHandlingTime",
    *   //   "minEnergyEfficiencyClass": "my_minEnergyEfficiencyClass",
    *   //   "minHandlingTime": "my_minHandlingTime",
    *   //   "mobileLink": "my_mobileLink",
    *   //   "mobileLinkTemplate": "my_mobileLinkTemplate",
    *   //   "mpn": "my_mpn",
    *   //   "multipack": "my_multipack",
    *   //   "offerId": "my_offerId",
    *   //   "pattern": "my_pattern",
    *   //   "pause": "my_pause",
    *   //   "pickupMethod": "my_pickupMethod",
    *   //   "pickupSla": "my_pickupSla",
    *   //   "price": {},
    *   //   "productDetails": [],
    *   //   "productHeight": {},
    *   //   "productHighlights": [],
    *   //   "productLength": {},
    *   //   "productTypes": [],
    *   //   "productWeight": {},
    *   //   "productWidth": {},
    *   //   "promotionIds": [],
    *   //   "salePrice": {},
    *   //   "salePriceEffectiveDate": "my_salePriceEffectiveDate",
    *   //   "sellOnGoogleQuantity": "my_sellOnGoogleQuantity",
    *   //   "shipping": [],
    *   //   "shippingHeight": {},
    *   //   "shippingLabel": "my_shippingLabel",
    *   //   "shippingLength": {},
    *   //   "shippingWeight": {},
    *   //   "shippingWidth": {},
    *   //   "shoppingAdsExcludedCountries": [],
    *   //   "sizeSystem": "my_sizeSystem",
    *   //   "sizeType": "my_sizeType",
    *   //   "sizes": [],
    *   //   "source": "my_source",
    *   //   "subscriptionCost": {},
    *   //   "targetCountry": "my_targetCountry",
    *   //   "taxCategory": "my_taxCategory",
    *   //   "taxes": [],
    *   //   "title": "my_title",
    *   //   "transitTimeLabel": "my_transitTimeLabel",
    *   //   "unitPricingBaseMeasure": {},
    *   //   "unitPricingMeasure": {}
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
  def get(params: ParamsResourceProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaProduct] = js.native
  def insert(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def insert(params: ParamsResourceProductsInsert): GaxiosPromise[SchemaProduct] = js.native
  def insert(params: ParamsResourceProductsInsert, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def insert(
    params: ParamsResourceProductsInsert,
    options: BodyResponseCallback[Readable | SchemaProduct],
    callback: BodyResponseCallback[Readable | SchemaProduct]
  ): Unit = js.native
  def insert(params: ParamsResourceProductsInsert, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def insert(
    params: ParamsResourceProductsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * Uploads a product to your Merchant Center account. If an item with the same channel, contentLanguage, offerId, and targetCountry already exists, this method updates that entry.
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
    *   const res = await content.products.insert({
    *     // The Content API Supplemental Feed ID. If present then product insertion applies to the data in a supplemental feed.
    *     feedId: 'placeholder-value',
    *     // The ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalImageLinks": [],
    *       //   "additionalSizeType": "my_additionalSizeType",
    *       //   "adsGrouping": "my_adsGrouping",
    *       //   "adsLabels": [],
    *       //   "adsRedirect": "my_adsRedirect",
    *       //   "adult": false,
    *       //   "ageGroup": "my_ageGroup",
    *       //   "availability": "my_availability",
    *       //   "availabilityDate": "my_availabilityDate",
    *       //   "brand": "my_brand",
    *       //   "canonicalLink": "my_canonicalLink",
    *       //   "channel": "my_channel",
    *       //   "color": "my_color",
    *       //   "condition": "my_condition",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "costOfGoodsSold": {},
    *       //   "customAttributes": [],
    *       //   "customLabel0": "my_customLabel0",
    *       //   "customLabel1": "my_customLabel1",
    *       //   "customLabel2": "my_customLabel2",
    *       //   "customLabel3": "my_customLabel3",
    *       //   "customLabel4": "my_customLabel4",
    *       //   "description": "my_description",
    *       //   "displayAdsId": "my_displayAdsId",
    *       //   "displayAdsLink": "my_displayAdsLink",
    *       //   "displayAdsSimilarIds": [],
    *       //   "displayAdsTitle": "my_displayAdsTitle",
    *       //   "displayAdsValue": {},
    *       //   "energyEfficiencyClass": "my_energyEfficiencyClass",
    *       //   "excludedDestinations": [],
    *       //   "expirationDate": "my_expirationDate",
    *       //   "externalSellerId": "my_externalSellerId",
    *       //   "feedLabel": "my_feedLabel",
    *       //   "gender": "my_gender",
    *       //   "googleProductCategory": "my_googleProductCategory",
    *       //   "gtin": "my_gtin",
    *       //   "id": "my_id",
    *       //   "identifierExists": false,
    *       //   "imageLink": "my_imageLink",
    *       //   "includedDestinations": [],
    *       //   "installment": {},
    *       //   "isBundle": false,
    *       //   "itemGroupId": "my_itemGroupId",
    *       //   "kind": "my_kind",
    *       //   "link": "my_link",
    *       //   "linkTemplate": "my_linkTemplate",
    *       //   "loyaltyPoints": {},
    *       //   "material": "my_material",
    *       //   "maxEnergyEfficiencyClass": "my_maxEnergyEfficiencyClass",
    *       //   "maxHandlingTime": "my_maxHandlingTime",
    *       //   "minEnergyEfficiencyClass": "my_minEnergyEfficiencyClass",
    *       //   "minHandlingTime": "my_minHandlingTime",
    *       //   "mobileLink": "my_mobileLink",
    *       //   "mobileLinkTemplate": "my_mobileLinkTemplate",
    *       //   "mpn": "my_mpn",
    *       //   "multipack": "my_multipack",
    *       //   "offerId": "my_offerId",
    *       //   "pattern": "my_pattern",
    *       //   "pause": "my_pause",
    *       //   "pickupMethod": "my_pickupMethod",
    *       //   "pickupSla": "my_pickupSla",
    *       //   "price": {},
    *       //   "productDetails": [],
    *       //   "productHeight": {},
    *       //   "productHighlights": [],
    *       //   "productLength": {},
    *       //   "productTypes": [],
    *       //   "productWeight": {},
    *       //   "productWidth": {},
    *       //   "promotionIds": [],
    *       //   "salePrice": {},
    *       //   "salePriceEffectiveDate": "my_salePriceEffectiveDate",
    *       //   "sellOnGoogleQuantity": "my_sellOnGoogleQuantity",
    *       //   "shipping": [],
    *       //   "shippingHeight": {},
    *       //   "shippingLabel": "my_shippingLabel",
    *       //   "shippingLength": {},
    *       //   "shippingWeight": {},
    *       //   "shippingWidth": {},
    *       //   "shoppingAdsExcludedCountries": [],
    *       //   "sizeSystem": "my_sizeSystem",
    *       //   "sizeType": "my_sizeType",
    *       //   "sizes": [],
    *       //   "source": "my_source",
    *       //   "subscriptionCost": {},
    *       //   "targetCountry": "my_targetCountry",
    *       //   "taxCategory": "my_taxCategory",
    *       //   "taxes": [],
    *       //   "title": "my_title",
    *       //   "transitTimeLabel": "my_transitTimeLabel",
    *       //   "unitPricingBaseMeasure": {},
    *       //   "unitPricingMeasure": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalImageLinks": [],
    *   //   "additionalSizeType": "my_additionalSizeType",
    *   //   "adsGrouping": "my_adsGrouping",
    *   //   "adsLabels": [],
    *   //   "adsRedirect": "my_adsRedirect",
    *   //   "adult": false,
    *   //   "ageGroup": "my_ageGroup",
    *   //   "availability": "my_availability",
    *   //   "availabilityDate": "my_availabilityDate",
    *   //   "brand": "my_brand",
    *   //   "canonicalLink": "my_canonicalLink",
    *   //   "channel": "my_channel",
    *   //   "color": "my_color",
    *   //   "condition": "my_condition",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "costOfGoodsSold": {},
    *   //   "customAttributes": [],
    *   //   "customLabel0": "my_customLabel0",
    *   //   "customLabel1": "my_customLabel1",
    *   //   "customLabel2": "my_customLabel2",
    *   //   "customLabel3": "my_customLabel3",
    *   //   "customLabel4": "my_customLabel4",
    *   //   "description": "my_description",
    *   //   "displayAdsId": "my_displayAdsId",
    *   //   "displayAdsLink": "my_displayAdsLink",
    *   //   "displayAdsSimilarIds": [],
    *   //   "displayAdsTitle": "my_displayAdsTitle",
    *   //   "displayAdsValue": {},
    *   //   "energyEfficiencyClass": "my_energyEfficiencyClass",
    *   //   "excludedDestinations": [],
    *   //   "expirationDate": "my_expirationDate",
    *   //   "externalSellerId": "my_externalSellerId",
    *   //   "feedLabel": "my_feedLabel",
    *   //   "gender": "my_gender",
    *   //   "googleProductCategory": "my_googleProductCategory",
    *   //   "gtin": "my_gtin",
    *   //   "id": "my_id",
    *   //   "identifierExists": false,
    *   //   "imageLink": "my_imageLink",
    *   //   "includedDestinations": [],
    *   //   "installment": {},
    *   //   "isBundle": false,
    *   //   "itemGroupId": "my_itemGroupId",
    *   //   "kind": "my_kind",
    *   //   "link": "my_link",
    *   //   "linkTemplate": "my_linkTemplate",
    *   //   "loyaltyPoints": {},
    *   //   "material": "my_material",
    *   //   "maxEnergyEfficiencyClass": "my_maxEnergyEfficiencyClass",
    *   //   "maxHandlingTime": "my_maxHandlingTime",
    *   //   "minEnergyEfficiencyClass": "my_minEnergyEfficiencyClass",
    *   //   "minHandlingTime": "my_minHandlingTime",
    *   //   "mobileLink": "my_mobileLink",
    *   //   "mobileLinkTemplate": "my_mobileLinkTemplate",
    *   //   "mpn": "my_mpn",
    *   //   "multipack": "my_multipack",
    *   //   "offerId": "my_offerId",
    *   //   "pattern": "my_pattern",
    *   //   "pause": "my_pause",
    *   //   "pickupMethod": "my_pickupMethod",
    *   //   "pickupSla": "my_pickupSla",
    *   //   "price": {},
    *   //   "productDetails": [],
    *   //   "productHeight": {},
    *   //   "productHighlights": [],
    *   //   "productLength": {},
    *   //   "productTypes": [],
    *   //   "productWeight": {},
    *   //   "productWidth": {},
    *   //   "promotionIds": [],
    *   //   "salePrice": {},
    *   //   "salePriceEffectiveDate": "my_salePriceEffectiveDate",
    *   //   "sellOnGoogleQuantity": "my_sellOnGoogleQuantity",
    *   //   "shipping": [],
    *   //   "shippingHeight": {},
    *   //   "shippingLabel": "my_shippingLabel",
    *   //   "shippingLength": {},
    *   //   "shippingWeight": {},
    *   //   "shippingWidth": {},
    *   //   "shoppingAdsExcludedCountries": [],
    *   //   "sizeSystem": "my_sizeSystem",
    *   //   "sizeType": "my_sizeType",
    *   //   "sizes": [],
    *   //   "source": "my_source",
    *   //   "subscriptionCost": {},
    *   //   "targetCountry": "my_targetCountry",
    *   //   "taxCategory": "my_taxCategory",
    *   //   "taxes": [],
    *   //   "title": "my_title",
    *   //   "transitTimeLabel": "my_transitTimeLabel",
    *   //   "unitPricingBaseMeasure": {},
    *   //   "unitPricingMeasure": {}
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
  def insert(params: ParamsResourceProductsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceProductsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaProductsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(params: ParamsResourceProductsList): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(params: ParamsResourceProductsList, callback: BodyResponseCallback[SchemaProductsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceProductsList,
    options: BodyResponseCallback[Readable | SchemaProductsListResponse],
    callback: BodyResponseCallback[Readable | SchemaProductsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProductsList, options: MethodOptions): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(
    params: ParamsResourceProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductsListResponse]
  ): Unit = js.native
  /**
    * Lists the products in your Merchant Center account. The response might contain fewer items than specified by maxResults. Rely on nextPageToken to determine if there are more items to be requested.
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
    *   const res = await content.products.list({
    *     // The maximum number of products to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that contains the products. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resources": []
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
  def list(params: ParamsResourceProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaProduct] = js.native
  def update(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def update(params: ParamsResourceProductsUpdate): GaxiosPromise[SchemaProduct] = js.native
  def update(params: ParamsResourceProductsUpdate, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def update(
    params: ParamsResourceProductsUpdate,
    options: BodyResponseCallback[Readable | SchemaProduct],
    callback: BodyResponseCallback[Readable | SchemaProduct]
  ): Unit = js.native
  def update(params: ParamsResourceProductsUpdate, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def update(
    params: ParamsResourceProductsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * Updates an existing product in your Merchant Center account. Only updates attributes provided in the request.
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
    *   const res = await content.products.update({
    *     // The ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The REST ID of the product for which to update.
    *     productId: 'placeholder-value',
    *     // The comma-separated list of product attributes to be updated. Example: `"title,salePrice"`. Attributes specified in the update mask without a value specified in the body will be deleted from the product. Only top-level product attributes can be updated. If not defined, product attributes with set values will be updated and other attributes will stay unchanged.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalImageLinks": [],
    *       //   "additionalSizeType": "my_additionalSizeType",
    *       //   "adsGrouping": "my_adsGrouping",
    *       //   "adsLabels": [],
    *       //   "adsRedirect": "my_adsRedirect",
    *       //   "adult": false,
    *       //   "ageGroup": "my_ageGroup",
    *       //   "availability": "my_availability",
    *       //   "availabilityDate": "my_availabilityDate",
    *       //   "brand": "my_brand",
    *       //   "canonicalLink": "my_canonicalLink",
    *       //   "channel": "my_channel",
    *       //   "color": "my_color",
    *       //   "condition": "my_condition",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "costOfGoodsSold": {},
    *       //   "customAttributes": [],
    *       //   "customLabel0": "my_customLabel0",
    *       //   "customLabel1": "my_customLabel1",
    *       //   "customLabel2": "my_customLabel2",
    *       //   "customLabel3": "my_customLabel3",
    *       //   "customLabel4": "my_customLabel4",
    *       //   "description": "my_description",
    *       //   "displayAdsId": "my_displayAdsId",
    *       //   "displayAdsLink": "my_displayAdsLink",
    *       //   "displayAdsSimilarIds": [],
    *       //   "displayAdsTitle": "my_displayAdsTitle",
    *       //   "displayAdsValue": {},
    *       //   "energyEfficiencyClass": "my_energyEfficiencyClass",
    *       //   "excludedDestinations": [],
    *       //   "expirationDate": "my_expirationDate",
    *       //   "externalSellerId": "my_externalSellerId",
    *       //   "feedLabel": "my_feedLabel",
    *       //   "gender": "my_gender",
    *       //   "googleProductCategory": "my_googleProductCategory",
    *       //   "gtin": "my_gtin",
    *       //   "id": "my_id",
    *       //   "identifierExists": false,
    *       //   "imageLink": "my_imageLink",
    *       //   "includedDestinations": [],
    *       //   "installment": {},
    *       //   "isBundle": false,
    *       //   "itemGroupId": "my_itemGroupId",
    *       //   "kind": "my_kind",
    *       //   "link": "my_link",
    *       //   "linkTemplate": "my_linkTemplate",
    *       //   "loyaltyPoints": {},
    *       //   "material": "my_material",
    *       //   "maxEnergyEfficiencyClass": "my_maxEnergyEfficiencyClass",
    *       //   "maxHandlingTime": "my_maxHandlingTime",
    *       //   "minEnergyEfficiencyClass": "my_minEnergyEfficiencyClass",
    *       //   "minHandlingTime": "my_minHandlingTime",
    *       //   "mobileLink": "my_mobileLink",
    *       //   "mobileLinkTemplate": "my_mobileLinkTemplate",
    *       //   "mpn": "my_mpn",
    *       //   "multipack": "my_multipack",
    *       //   "offerId": "my_offerId",
    *       //   "pattern": "my_pattern",
    *       //   "pause": "my_pause",
    *       //   "pickupMethod": "my_pickupMethod",
    *       //   "pickupSla": "my_pickupSla",
    *       //   "price": {},
    *       //   "productDetails": [],
    *       //   "productHeight": {},
    *       //   "productHighlights": [],
    *       //   "productLength": {},
    *       //   "productTypes": [],
    *       //   "productWeight": {},
    *       //   "productWidth": {},
    *       //   "promotionIds": [],
    *       //   "salePrice": {},
    *       //   "salePriceEffectiveDate": "my_salePriceEffectiveDate",
    *       //   "sellOnGoogleQuantity": "my_sellOnGoogleQuantity",
    *       //   "shipping": [],
    *       //   "shippingHeight": {},
    *       //   "shippingLabel": "my_shippingLabel",
    *       //   "shippingLength": {},
    *       //   "shippingWeight": {},
    *       //   "shippingWidth": {},
    *       //   "shoppingAdsExcludedCountries": [],
    *       //   "sizeSystem": "my_sizeSystem",
    *       //   "sizeType": "my_sizeType",
    *       //   "sizes": [],
    *       //   "source": "my_source",
    *       //   "subscriptionCost": {},
    *       //   "targetCountry": "my_targetCountry",
    *       //   "taxCategory": "my_taxCategory",
    *       //   "taxes": [],
    *       //   "title": "my_title",
    *       //   "transitTimeLabel": "my_transitTimeLabel",
    *       //   "unitPricingBaseMeasure": {},
    *       //   "unitPricingMeasure": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalImageLinks": [],
    *   //   "additionalSizeType": "my_additionalSizeType",
    *   //   "adsGrouping": "my_adsGrouping",
    *   //   "adsLabels": [],
    *   //   "adsRedirect": "my_adsRedirect",
    *   //   "adult": false,
    *   //   "ageGroup": "my_ageGroup",
    *   //   "availability": "my_availability",
    *   //   "availabilityDate": "my_availabilityDate",
    *   //   "brand": "my_brand",
    *   //   "canonicalLink": "my_canonicalLink",
    *   //   "channel": "my_channel",
    *   //   "color": "my_color",
    *   //   "condition": "my_condition",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "costOfGoodsSold": {},
    *   //   "customAttributes": [],
    *   //   "customLabel0": "my_customLabel0",
    *   //   "customLabel1": "my_customLabel1",
    *   //   "customLabel2": "my_customLabel2",
    *   //   "customLabel3": "my_customLabel3",
    *   //   "customLabel4": "my_customLabel4",
    *   //   "description": "my_description",
    *   //   "displayAdsId": "my_displayAdsId",
    *   //   "displayAdsLink": "my_displayAdsLink",
    *   //   "displayAdsSimilarIds": [],
    *   //   "displayAdsTitle": "my_displayAdsTitle",
    *   //   "displayAdsValue": {},
    *   //   "energyEfficiencyClass": "my_energyEfficiencyClass",
    *   //   "excludedDestinations": [],
    *   //   "expirationDate": "my_expirationDate",
    *   //   "externalSellerId": "my_externalSellerId",
    *   //   "feedLabel": "my_feedLabel",
    *   //   "gender": "my_gender",
    *   //   "googleProductCategory": "my_googleProductCategory",
    *   //   "gtin": "my_gtin",
    *   //   "id": "my_id",
    *   //   "identifierExists": false,
    *   //   "imageLink": "my_imageLink",
    *   //   "includedDestinations": [],
    *   //   "installment": {},
    *   //   "isBundle": false,
    *   //   "itemGroupId": "my_itemGroupId",
    *   //   "kind": "my_kind",
    *   //   "link": "my_link",
    *   //   "linkTemplate": "my_linkTemplate",
    *   //   "loyaltyPoints": {},
    *   //   "material": "my_material",
    *   //   "maxEnergyEfficiencyClass": "my_maxEnergyEfficiencyClass",
    *   //   "maxHandlingTime": "my_maxHandlingTime",
    *   //   "minEnergyEfficiencyClass": "my_minEnergyEfficiencyClass",
    *   //   "minHandlingTime": "my_minHandlingTime",
    *   //   "mobileLink": "my_mobileLink",
    *   //   "mobileLinkTemplate": "my_mobileLinkTemplate",
    *   //   "mpn": "my_mpn",
    *   //   "multipack": "my_multipack",
    *   //   "offerId": "my_offerId",
    *   //   "pattern": "my_pattern",
    *   //   "pause": "my_pause",
    *   //   "pickupMethod": "my_pickupMethod",
    *   //   "pickupSla": "my_pickupSla",
    *   //   "price": {},
    *   //   "productDetails": [],
    *   //   "productHeight": {},
    *   //   "productHighlights": [],
    *   //   "productLength": {},
    *   //   "productTypes": [],
    *   //   "productWeight": {},
    *   //   "productWidth": {},
    *   //   "promotionIds": [],
    *   //   "salePrice": {},
    *   //   "salePriceEffectiveDate": "my_salePriceEffectiveDate",
    *   //   "sellOnGoogleQuantity": "my_sellOnGoogleQuantity",
    *   //   "shipping": [],
    *   //   "shippingHeight": {},
    *   //   "shippingLabel": "my_shippingLabel",
    *   //   "shippingLength": {},
    *   //   "shippingWeight": {},
    *   //   "shippingWidth": {},
    *   //   "shoppingAdsExcludedCountries": [],
    *   //   "sizeSystem": "my_sizeSystem",
    *   //   "sizeType": "my_sizeType",
    *   //   "sizes": [],
    *   //   "source": "my_source",
    *   //   "subscriptionCost": {},
    *   //   "targetCountry": "my_targetCountry",
    *   //   "taxCategory": "my_taxCategory",
    *   //   "taxes": [],
    *   //   "title": "my_title",
    *   //   "transitTimeLabel": "my_transitTimeLabel",
    *   //   "unitPricingBaseMeasure": {},
    *   //   "unitPricingMeasure": {}
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
  def update(params: ParamsResourceProductsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProductsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
