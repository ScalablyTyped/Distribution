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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Productdeliverytime")
@js.native
open class ResourceProductdeliverytime protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def create(callback: BodyResponseCallback[SchemaProductDeliveryTime]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def create(params: ParamsResourceProductdeliverytimeCreate): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def create(
    params: ParamsResourceProductdeliverytimeCreate,
    callback: BodyResponseCallback[SchemaProductDeliveryTime]
  ): Unit = js.native
  def create(
    params: ParamsResourceProductdeliverytimeCreate,
    options: BodyResponseCallback[Readable | SchemaProductDeliveryTime],
    callback: BodyResponseCallback[Readable | SchemaProductDeliveryTime]
  ): Unit = js.native
  def create(params: ParamsResourceProductdeliverytimeCreate, options: MethodOptions): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def create(
    params: ParamsResourceProductdeliverytimeCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductDeliveryTime]
  ): Unit = js.native
  /**
    * Creates or updates the delivery time of a product.
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
    *   const res = await content.productdeliverytime.create({
    *     // The Google merchant ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "areaDeliveryTimes": [],
    *       //   "productId": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "areaDeliveryTimes": [],
    *   //   "productId": {}
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
  def create(params: ParamsResourceProductdeliverytimeCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProductdeliverytimeCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductdeliverytimeDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceProductdeliverytimeDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceProductdeliverytimeDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceProductdeliverytimeDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceProductdeliverytimeDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes the delivery time of a product.
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
    *   const res = await content.productdeliverytime.delete({
    *     // Required. The Google merchant ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // Required. The Content API ID of the product, in the form `channel:contentLanguage:targetCountry:offerId`.
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
  def delete(params: ParamsResourceProductdeliverytimeDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProductdeliverytimeDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def get(callback: BodyResponseCallback[SchemaProductDeliveryTime]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def get(params: ParamsResourceProductdeliverytimeGet): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def get(
    params: ParamsResourceProductdeliverytimeGet,
    callback: BodyResponseCallback[SchemaProductDeliveryTime]
  ): Unit = js.native
  def get(
    params: ParamsResourceProductdeliverytimeGet,
    options: BodyResponseCallback[Readable | SchemaProductDeliveryTime],
    callback: BodyResponseCallback[Readable | SchemaProductDeliveryTime]
  ): Unit = js.native
  def get(params: ParamsResourceProductdeliverytimeGet, options: MethodOptions): GaxiosPromise[SchemaProductDeliveryTime] = js.native
  def get(
    params: ParamsResourceProductdeliverytimeGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductDeliveryTime]
  ): Unit = js.native
  /**
    * Gets `productDeliveryTime` by `productId`.
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
    *   const res = await content.productdeliverytime.get({
    *     // Required. The Google merchant ID of the account that contains the product. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // Required. The Content API ID of the product, in the form `channel:contentLanguage:targetCountry:offerId`.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "areaDeliveryTimes": [],
    *   //   "productId": {}
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
  def get(params: ParamsResourceProductdeliverytimeGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProductdeliverytimeGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
