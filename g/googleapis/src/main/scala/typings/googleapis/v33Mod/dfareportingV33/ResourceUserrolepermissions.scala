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

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Userrolepermissions")
@js.native
open class ResourceUserrolepermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaUserRolePermission] = js.native
  def get(callback: BodyResponseCallback[SchemaUserRolePermission]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRolePermission] = js.native
  def get(params: ParamsResourceUserrolepermissionsGet): GaxiosPromise[SchemaUserRolePermission] = js.native
  def get(
    params: ParamsResourceUserrolepermissionsGet,
    callback: BodyResponseCallback[SchemaUserRolePermission]
  ): Unit = js.native
  def get(
    params: ParamsResourceUserrolepermissionsGet,
    options: BodyResponseCallback[Readable | SchemaUserRolePermission],
    callback: BodyResponseCallback[Readable | SchemaUserRolePermission]
  ): Unit = js.native
  def get(params: ParamsResourceUserrolepermissionsGet, options: MethodOptions): GaxiosPromise[SchemaUserRolePermission] = js.native
  def get(
    params: ParamsResourceUserrolepermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermission]
  ): Unit = js.native
  /**
    * Gets one user role permission by ID.
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
    *   const res = await dfareporting.userRolePermissions.get({
    *     // User role permission ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availability": "my_availability",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def get(params: ParamsResourceUserrolepermissionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUserrolepermissionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUserRolePermissionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUserRolePermissionsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionsListResponse] = js.native
  def list(params: ParamsResourceUserrolepermissionsList): GaxiosPromise[SchemaUserRolePermissionsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissionsList,
    callback: BodyResponseCallback[SchemaUserRolePermissionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUserrolepermissionsList,
    options: BodyResponseCallback[Readable | SchemaUserRolePermissionsListResponse],
    callback: BodyResponseCallback[Readable | SchemaUserRolePermissionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserrolepermissionsList, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermissionsListResponse]
  ): Unit = js.native
  /**
    * Gets a list of user role permissions, possibly filtered.
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
    *   const res = await dfareporting.userRolePermissions.list({
    *     // Select only user role permissions with these IDs.
    *     ids: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "userRolePermissions": []
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
  def list(params: ParamsResourceUserrolepermissionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUserrolepermissionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
