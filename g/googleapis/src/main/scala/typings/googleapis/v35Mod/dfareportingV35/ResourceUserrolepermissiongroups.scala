package typings.googleapis.v35Mod.dfareportingV35

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.5", "dfareporting_v3_5.Resource$Userrolepermissiongroups")
@js.native
open class ResourceUserrolepermissiongroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaUserRolePermissionGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(params: ParamsResourceUserrolepermissiongroupsGet): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(
    params: ParamsResourceUserrolepermissiongroupsGet,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceUserrolepermissiongroupsGet,
    options: BodyResponseCallback[Readable | SchemaUserRolePermissionGroup],
    callback: BodyResponseCallback[Readable | SchemaUserRolePermissionGroup]
  ): Unit = js.native
  def get(params: ParamsResourceUserrolepermissiongroupsGet, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(
    params: ParamsResourceUserrolepermissiongroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroup]
  ): Unit = js.native
  /**
    * Gets one user role permission group by ID.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.userRolePermissionGroups.get({
    *     // User role permission group ID.
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
  def get(params: ParamsResourceUserrolepermissiongroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUserrolepermissiongroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(params: ParamsResourceUserrolepermissiongroupsList): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissiongroupsList,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUserrolepermissiongroupsList,
    options: BodyResponseCallback[Readable | SchemaUserRolePermissionGroupsListResponse],
    callback: BodyResponseCallback[Readable | SchemaUserRolePermissionGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserrolepermissiongroupsList, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissiongroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse]
  ): Unit = js.native
  /**
    * Gets a list of all supported user role permission groups.
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
    * const dfareporting = google.dfareporting('v3.5');
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
    *   const res = await dfareporting.userRolePermissionGroups.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "userRolePermissionGroups": []
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
  def list(params: ParamsResourceUserrolepermissiongroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUserrolepermissiongroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
