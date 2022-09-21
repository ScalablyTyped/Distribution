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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Groups$Aliases")
@js.native
open class ResourceGroupsAliases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsAliasesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsAliasesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsAliasesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsAliasesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceGroupsAliasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes an alias.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.group'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.groups.aliases.delete({
    *     // The alias to be removed
    *     alias: 'placeholder-value',
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceGroupsAliasesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceGroupsAliasesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAlias] = js.native
  def insert(callback: BodyResponseCallback[SchemaAlias]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlias] = js.native
  def insert(params: ParamsResourceGroupsAliasesInsert): GaxiosPromise[SchemaAlias] = js.native
  def insert(params: ParamsResourceGroupsAliasesInsert, callback: BodyResponseCallback[SchemaAlias]): Unit = js.native
  def insert(
    params: ParamsResourceGroupsAliasesInsert,
    options: BodyResponseCallback[Readable | SchemaAlias],
    callback: BodyResponseCallback[Readable | SchemaAlias]
  ): Unit = js.native
  def insert(params: ParamsResourceGroupsAliasesInsert, options: MethodOptions): GaxiosPromise[SchemaAlias] = js.native
  def insert(
    params: ParamsResourceGroupsAliasesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlias]
  ): Unit = js.native
  /**
    * Adds an alias for the group.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.group'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.groups.aliases.insert({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alias": "my_alias",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "primaryEmail": "my_primaryEmail"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alias": "my_alias",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "primaryEmail": "my_primaryEmail"
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
  def insert(params: ParamsResourceGroupsAliasesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceGroupsAliasesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAliases] = js.native
  def list(callback: BodyResponseCallback[SchemaAliases]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAliases] = js.native
  def list(params: ParamsResourceGroupsAliasesList): GaxiosPromise[SchemaAliases] = js.native
  def list(params: ParamsResourceGroupsAliasesList, callback: BodyResponseCallback[SchemaAliases]): Unit = js.native
  def list(
    params: ParamsResourceGroupsAliasesList,
    options: BodyResponseCallback[Readable | SchemaAliases],
    callback: BodyResponseCallback[Readable | SchemaAliases]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsAliasesList, options: MethodOptions): GaxiosPromise[SchemaAliases] = js.native
  def list(
    params: ParamsResourceGroupsAliasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAliases]
  ): Unit = js.native
  /**
    * Lists all aliases for a group.
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
    *       'https://www.googleapis.com/auth/admin.directory.group',
    *       'https://www.googleapis.com/auth/admin.directory.group.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.groups.aliases.list({
    *     // Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    *     groupKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "aliases": [],
    *   //   "etag": "my_etag",
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
  def list(params: ParamsResourceGroupsAliasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGroupsAliasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
