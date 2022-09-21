package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Privileges")
@js.native
open class ResourcePrivileges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaPrivileges] = js.native
  def list(callback: BodyResponseCallback[SchemaPrivileges]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPrivileges] = js.native
  def list(params: ParamsResourcePrivilegesList): GaxiosPromise[SchemaPrivileges] = js.native
  def list(params: ParamsResourcePrivilegesList, callback: BodyResponseCallback[SchemaPrivileges]): Unit = js.native
  def list(
    params: ParamsResourcePrivilegesList,
    options: BodyResponseCallback[Readable | SchemaPrivileges],
    callback: BodyResponseCallback[Readable | SchemaPrivileges]
  ): Unit = js.native
  def list(params: ParamsResourcePrivilegesList, options: MethodOptions): GaxiosPromise[SchemaPrivileges] = js.native
  def list(
    params: ParamsResourcePrivilegesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPrivileges]
  ): Unit = js.native
  /**
    * Retrieves a paginated list of all privileges for a customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.rolemanagement',
    *       'https://www.googleapis.com/auth/admin.directory.rolemanagement.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.privileges.list({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
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
  def list(params: ParamsResourcePrivilegesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePrivilegesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
