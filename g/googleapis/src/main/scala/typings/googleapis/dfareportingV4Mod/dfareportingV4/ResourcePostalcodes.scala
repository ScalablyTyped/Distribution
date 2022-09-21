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

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Postalcodes")
@js.native
open class ResourcePostalcodes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPostalCode] = js.native
  def get(callback: BodyResponseCallback[SchemaPostalCode]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPostalCode] = js.native
  def get(params: ParamsResourcePostalcodesGet): GaxiosPromise[SchemaPostalCode] = js.native
  def get(params: ParamsResourcePostalcodesGet, callback: BodyResponseCallback[SchemaPostalCode]): Unit = js.native
  def get(
    params: ParamsResourcePostalcodesGet,
    options: BodyResponseCallback[Readable | SchemaPostalCode],
    callback: BodyResponseCallback[Readable | SchemaPostalCode]
  ): Unit = js.native
  def get(params: ParamsResourcePostalcodesGet, options: MethodOptions): GaxiosPromise[SchemaPostalCode] = js.native
  def get(
    params: ParamsResourcePostalcodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostalCode]
  ): Unit = js.native
  /**
    * Gets one postal code by ID.
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
    *   const res = await dfareporting.postalCodes.get({
    *     // Postal code ID.
    *     code: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code",
    *   //   "countryCode": "my_countryCode",
    *   //   "countryDartId": "my_countryDartId",
    *   //   "id": "my_id",
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
  def get(params: ParamsResourcePostalcodesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePostalcodesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPostalCodesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(params: ParamsResourcePostalcodesList): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    options: BodyResponseCallback[Readable | SchemaPostalCodesListResponse],
    callback: BodyResponseCallback[Readable | SchemaPostalCodesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePostalcodesList, options: MethodOptions): GaxiosPromise[SchemaPostalCodesListResponse] = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostalCodesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of postal codes.
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
    *   const res = await dfareporting.postalCodes.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "postalCodes": []
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
  def list(params: ParamsResourcePostalcodesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePostalcodesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
