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

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Accountpermissions")
@js.native
open class ResourceAccountpermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountPermission]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(params: ParamsResourceAccountpermissionsGet): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(
    params: ParamsResourceAccountpermissionsGet,
    callback: BodyResponseCallback[SchemaAccountPermission]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountpermissionsGet,
    options: BodyResponseCallback[Readable | SchemaAccountPermission],
    callback: BodyResponseCallback[Readable | SchemaAccountPermission]
  ): Unit = js.native
  def get(params: ParamsResourceAccountpermissionsGet, options: MethodOptions): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(
    params: ParamsResourceAccountpermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermission]
  ): Unit = js.native
  /**
    * Gets one account permission by ID.
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
    *   const res = await dfareporting.accountPermissions.get({
    *     // Account permission ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountProfiles": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "level": "my_level",
    *   //   "name": "my_name",
    *   //   "permissionGroupId": "my_permissionGroupId"
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
  def get(params: ParamsResourceAccountpermissionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountpermissionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountPermissionsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(params: ParamsResourceAccountpermissionsList): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissionsList,
    callback: BodyResponseCallback[SchemaAccountPermissionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountpermissionsList,
    options: BodyResponseCallback[Readable | SchemaAccountPermissionsListResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountPermissionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountpermissionsList, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermissionsListResponse]
  ): Unit = js.native
  /**
    * Retrieves the list of account permissions.
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
    *   const res = await dfareporting.accountPermissions.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountPermissions": [],
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
  def list(params: ParamsResourceAccountpermissionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountpermissionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
