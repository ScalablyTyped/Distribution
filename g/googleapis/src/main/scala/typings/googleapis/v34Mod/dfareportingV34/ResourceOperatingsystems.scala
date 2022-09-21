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

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Operatingsystems")
@js.native
open class ResourceOperatingsystems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(callback: BodyResponseCallback[SchemaOperatingSystem]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(params: ParamsResourceOperatingsystemsGet): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(params: ParamsResourceOperatingsystemsGet, callback: BodyResponseCallback[SchemaOperatingSystem]): Unit = js.native
  def get(
    params: ParamsResourceOperatingsystemsGet,
    options: BodyResponseCallback[Readable | SchemaOperatingSystem],
    callback: BodyResponseCallback[Readable | SchemaOperatingSystem]
  ): Unit = js.native
  def get(params: ParamsResourceOperatingsystemsGet, options: MethodOptions): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(
    params: ParamsResourceOperatingsystemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystem]
  ): Unit = js.native
  /**
    * Gets one operating system by DART ID.
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
    *   const res = await dfareporting.operatingSystems.get({
    *     // Operating system DART ID.
    *     dartId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dartId": "my_dartId",
    *   //   "desktop": false,
    *   //   "kind": "my_kind",
    *   //   "mobile": false,
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
  def get(params: ParamsResourceOperatingsystemsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOperatingsystemsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOperatingSystemsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(params: ParamsResourceOperatingsystemsList): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemsList,
    callback: BodyResponseCallback[SchemaOperatingSystemsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOperatingsystemsList,
    options: BodyResponseCallback[Readable | SchemaOperatingSystemsListResponse],
    callback: BodyResponseCallback[Readable | SchemaOperatingSystemsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperatingsystemsList, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystemsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of operating systems.
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
    *   const res = await dfareporting.operatingSystems.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "operatingSystems": []
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
  def list(params: ParamsResourceOperatingsystemsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOperatingsystemsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
