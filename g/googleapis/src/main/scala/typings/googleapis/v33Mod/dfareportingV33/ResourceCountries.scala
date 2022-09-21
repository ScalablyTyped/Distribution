package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Countries")
@js.native
open class ResourceCountries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCountry] = js.native
  def get(callback: BodyResponseCallback[SchemaCountry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCountry] = js.native
  def get(params: ParamsResourceCountriesGet): GaxiosPromise[SchemaCountry] = js.native
  def get(params: ParamsResourceCountriesGet, callback: BodyResponseCallback[SchemaCountry]): Unit = js.native
  def get(
    params: ParamsResourceCountriesGet,
    options: BodyResponseCallback[Readable | SchemaCountry],
    callback: BodyResponseCallback[Readable | SchemaCountry]
  ): Unit = js.native
  def get(params: ParamsResourceCountriesGet, options: MethodOptions): GaxiosPromise[SchemaCountry] = js.native
  def get(
    params: ParamsResourceCountriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCountry]
  ): Unit = js.native
  /**
    * Gets one country by ID.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.countries.get({
    *     // Country DART ID.
    *     dartId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "countryCode": "my_countryCode",
    *   //   "dartId": "my_dartId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "sslEnabled": false
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
  def get(params: ParamsResourceCountriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCountriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCountriesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(params: ParamsResourceCountriesList): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(params: ParamsResourceCountriesList, callback: BodyResponseCallback[SchemaCountriesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCountriesList,
    options: BodyResponseCallback[Readable | SchemaCountriesListResponse],
    callback: BodyResponseCallback[Readable | SchemaCountriesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCountriesList, options: MethodOptions): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(
    params: ParamsResourceCountriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCountriesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of countries.
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
    * const dfareporting = google.dfareporting('v3.3');
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
    *   const res = await dfareporting.countries.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "countries": [],
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
  def list(params: ParamsResourceCountriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCountriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
