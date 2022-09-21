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

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Regions")
@js.native
open class ResourceRegions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaRegion] = js.native
  def create(callback: BodyResponseCallback[SchemaRegion]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRegion] = js.native
  def create(params: ParamsResourceRegionsCreate): GaxiosPromise[SchemaRegion] = js.native
  def create(params: ParamsResourceRegionsCreate, callback: BodyResponseCallback[SchemaRegion]): Unit = js.native
  def create(
    params: ParamsResourceRegionsCreate,
    options: BodyResponseCallback[Readable | SchemaRegion],
    callback: BodyResponseCallback[Readable | SchemaRegion]
  ): Unit = js.native
  def create(params: ParamsResourceRegionsCreate, options: MethodOptions): GaxiosPromise[SchemaRegion] = js.native
  def create(
    params: ParamsResourceRegionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegion]
  ): Unit = js.native
  /**
    * Creates a region definition in your Merchant Center account.
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
    *   const res = await content.regions.create({
    *     // Required. The id of the merchant for which to create region definition.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the region to create.
    *     regionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "geotargetArea": {},
    *       //   "merchantId": "my_merchantId",
    *       //   "postalCodeArea": {},
    *       //   "regionId": "my_regionId",
    *       //   "regionalInventoryEligible": false,
    *       //   "shippingEligible": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "geotargetArea": {},
    *   //   "merchantId": "my_merchantId",
    *   //   "postalCodeArea": {},
    *   //   "regionId": "my_regionId",
    *   //   "regionalInventoryEligible": false,
    *   //   "shippingEligible": false
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
  def create(params: ParamsResourceRegionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceRegionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRegionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRegionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRegionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRegionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRegionsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a region definition from your Merchant Center account.
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
    *   const res = await content.regions.delete({
    *     // Required. The id of the merchant for which to delete region definition.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the region to delete.
    *     regionId: 'placeholder-value',
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
  def delete(params: ParamsResourceRegionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRegionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRegion] = js.native
  def get(callback: BodyResponseCallback[SchemaRegion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRegion] = js.native
  def get(params: ParamsResourceRegionsGet): GaxiosPromise[SchemaRegion] = js.native
  def get(params: ParamsResourceRegionsGet, callback: BodyResponseCallback[SchemaRegion]): Unit = js.native
  def get(
    params: ParamsResourceRegionsGet,
    options: BodyResponseCallback[Readable | SchemaRegion],
    callback: BodyResponseCallback[Readable | SchemaRegion]
  ): Unit = js.native
  def get(params: ParamsResourceRegionsGet, options: MethodOptions): GaxiosPromise[SchemaRegion] = js.native
  def get(
    params: ParamsResourceRegionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegion]
  ): Unit = js.native
  /**
    * Retrieves a region defined in your Merchant Center account.
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
    *   const res = await content.regions.get({
    *     // Required. The id of the merchant for which to retrieve region definition.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the region to retrieve.
    *     regionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "geotargetArea": {},
    *   //   "merchantId": "my_merchantId",
    *   //   "postalCodeArea": {},
    *   //   "regionId": "my_regionId",
    *   //   "regionalInventoryEligible": false,
    *   //   "shippingEligible": false
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
  def get(params: ParamsResourceRegionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRegionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRegionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRegionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRegionsResponse] = js.native
  def list(params: ParamsResourceRegionsList): GaxiosPromise[SchemaListRegionsResponse] = js.native
  def list(params: ParamsResourceRegionsList, callback: BodyResponseCallback[SchemaListRegionsResponse]): Unit = js.native
  def list(
    params: ParamsResourceRegionsList,
    options: BodyResponseCallback[Readable | SchemaListRegionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRegionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceRegionsList, options: MethodOptions): GaxiosPromise[SchemaListRegionsResponse] = js.native
  def list(
    params: ParamsResourceRegionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRegionsResponse]
  ): Unit = js.native
  /**
    * Lists the regions in your Merchant Center account.
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
    *   const res = await content.regions.list({
    *     // Required. The id of the merchant for which to list region definitions.
    *     merchantId: 'placeholder-value',
    *     // The maximum number of regions to return. The service may return fewer than this value. If unspecified, at most 50 rules will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListRegions` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListRegions` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "regions": []
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
  def list(params: ParamsResourceRegionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRegionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRegion] = js.native
  def patch(callback: BodyResponseCallback[SchemaRegion]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRegion] = js.native
  def patch(params: ParamsResourceRegionsPatch): GaxiosPromise[SchemaRegion] = js.native
  def patch(params: ParamsResourceRegionsPatch, callback: BodyResponseCallback[SchemaRegion]): Unit = js.native
  def patch(
    params: ParamsResourceRegionsPatch,
    options: BodyResponseCallback[Readable | SchemaRegion],
    callback: BodyResponseCallback[Readable | SchemaRegion]
  ): Unit = js.native
  def patch(params: ParamsResourceRegionsPatch, options: MethodOptions): GaxiosPromise[SchemaRegion] = js.native
  def patch(
    params: ParamsResourceRegionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegion]
  ): Unit = js.native
  /**
    * Updates a region definition in your Merchant Center account.
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
    *   const res = await content.regions.patch({
    *     // Required. The id of the merchant for which to update region definition.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the region to update.
    *     regionId: 'placeholder-value',
    *     // Optional. The comma-separated field mask indicating the fields to update. Example: `"displayName,postalCodeArea.regionCode"`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "geotargetArea": {},
    *       //   "merchantId": "my_merchantId",
    *       //   "postalCodeArea": {},
    *       //   "regionId": "my_regionId",
    *       //   "regionalInventoryEligible": false,
    *       //   "shippingEligible": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "geotargetArea": {},
    *   //   "merchantId": "my_merchantId",
    *   //   "postalCodeArea": {},
    *   //   "regionId": "my_regionId",
    *   //   "regionalInventoryEligible": false,
    *   //   "shippingEligible": false
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
  def patch(params: ParamsResourceRegionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceRegionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
