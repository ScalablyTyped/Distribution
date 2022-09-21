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

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Cities")
@js.native
open class ResourceCities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCitiesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(params: ParamsResourceCitiesList): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(params: ParamsResourceCitiesList, callback: BodyResponseCallback[SchemaCitiesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCitiesList,
    options: BodyResponseCallback[Readable | SchemaCitiesListResponse],
    callback: BodyResponseCallback[Readable | SchemaCitiesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCitiesList, options: MethodOptions): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(
    params: ParamsResourceCitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCitiesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of cities, possibly filtered.
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
    *   const res = await dfareporting.cities.list({
    *     // Select only cities from these countries.
    *     countryDartIds: 'placeholder-value',
    *     // Select only cities with these DART IDs.
    *     dartIds: 'placeholder-value',
    *     // Select only cities with names starting with this prefix.
    *     namePrefix: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Select only cities from these regions.
    *     regionDartIds: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cities": [],
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
  def list(params: ParamsResourceCitiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
