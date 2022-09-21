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

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Accountpermissiongroups")
@js.native
open class ResourceAccountpermissiongroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountPermissionGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(params: ParamsResourceAccountpermissiongroupsGet): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(
    params: ParamsResourceAccountpermissiongroupsGet,
    callback: BodyResponseCallback[SchemaAccountPermissionGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountpermissiongroupsGet,
    options: BodyResponseCallback[Readable | SchemaAccountPermissionGroup],
    callback: BodyResponseCallback[Readable | SchemaAccountPermissionGroup]
  ): Unit = js.native
  def get(params: ParamsResourceAccountpermissiongroupsGet, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(
    params: ParamsResourceAccountpermissiongroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermissionGroup]
  ): Unit = js.native
  /**
    * Gets one account permission group by ID.
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
    *   const res = await dfareporting.accountPermissionGroups.get({
    *     // Account permission group ID.
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
  def get(params: ParamsResourceAccountpermissiongroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountpermissiongroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(params: ParamsResourceAccountpermissiongroupsList): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissiongroupsList,
    callback: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountpermissiongroupsList,
    options: BodyResponseCallback[Readable | SchemaAccountPermissionGroupsListResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountPermissionGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountpermissiongroupsList, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissiongroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse]
  ): Unit = js.native
  /**
    * Retrieves the list of account permission groups.
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
    *   const res = await dfareporting.accountPermissionGroups.list({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountPermissionGroups": [],
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
  def list(params: ParamsResourceAccountpermissiongroupsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountpermissiongroupsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
