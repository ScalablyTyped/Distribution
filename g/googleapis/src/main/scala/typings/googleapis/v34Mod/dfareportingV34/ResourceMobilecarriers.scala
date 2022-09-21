package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Mobilecarriers")
@js.native
open class ResourceMobilecarriers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(callback: BodyResponseCallback[SchemaMobileCarrier]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(params: ParamsResourceMobilecarriersGet): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(params: ParamsResourceMobilecarriersGet, callback: BodyResponseCallback[SchemaMobileCarrier]): Unit = js.native
  def get(
    params: ParamsResourceMobilecarriersGet,
    options: BodyResponseCallback[Readable | SchemaMobileCarrier],
    callback: BodyResponseCallback[Readable | SchemaMobileCarrier]
  ): Unit = js.native
  def get(params: ParamsResourceMobilecarriersGet, options: MethodOptions): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(
    params: ParamsResourceMobilecarriersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileCarrier]
  ): Unit = js.native
  /**
    * Gets one mobile carrier by ID.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.mobileCarriers.get({
    *     // Mobile carrier ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "countryCode": "my_countryCode",
    *   //   "countryDartId": "my_countryDartId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceMobilecarriersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMobilecarriersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaMobileCarriersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(params: ParamsResourceMobilecarriersList): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(
    params: ParamsResourceMobilecarriersList,
    callback: BodyResponseCallback[SchemaMobileCarriersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMobilecarriersList,
    options: BodyResponseCallback[Readable | SchemaMobileCarriersListResponse],
    callback: BodyResponseCallback[Readable | SchemaMobileCarriersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMobilecarriersList, options: MethodOptions): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(
    params: ParamsResourceMobilecarriersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileCarriersListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of mobile carriers.
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
    * const dfareporting = google.dfareporting('v3.4');
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
    *   const res = await dfareporting.mobileCarriers.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "mobileCarriers": []
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
  def list(params: ParamsResourceMobilecarriersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMobilecarriersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
