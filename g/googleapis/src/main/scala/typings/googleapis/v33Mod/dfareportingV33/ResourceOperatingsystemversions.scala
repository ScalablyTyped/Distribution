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

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Operatingsystemversions")
@js.native
open class ResourceOperatingsystemversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaOperatingSystemVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(params: ParamsResourceOperatingsystemversionsGet): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(
    params: ParamsResourceOperatingsystemversionsGet,
    callback: BodyResponseCallback[SchemaOperatingSystemVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceOperatingsystemversionsGet,
    options: BodyResponseCallback[Readable | SchemaOperatingSystemVersion],
    callback: BodyResponseCallback[Readable | SchemaOperatingSystemVersion]
  ): Unit = js.native
  def get(params: ParamsResourceOperatingsystemversionsGet, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(
    params: ParamsResourceOperatingsystemversionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystemVersion]
  ): Unit = js.native
  /**
    * Gets one operating system version by ID.
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
    *   const res = await dfareporting.operatingSystemVersions.get({
    *     // Operating system version ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "majorVersion": "my_majorVersion",
    *   //   "minorVersion": "my_minorVersion",
    *   //   "name": "my_name",
    *   //   "operatingSystem": {}
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
  def get(params: ParamsResourceOperatingsystemversionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOperatingsystemversionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(params: ParamsResourceOperatingsystemversionsList): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemversionsList,
    callback: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOperatingsystemversionsList,
    options: BodyResponseCallback[Readable | SchemaOperatingSystemVersionsListResponse],
    callback: BodyResponseCallback[Readable | SchemaOperatingSystemVersionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperatingsystemversionsList, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of operating system versions.
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
    *   const res = await dfareporting.operatingSystemVersions.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "operatingSystemVersions": []
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
  def list(params: ParamsResourceOperatingsystemversionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOperatingsystemversionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
