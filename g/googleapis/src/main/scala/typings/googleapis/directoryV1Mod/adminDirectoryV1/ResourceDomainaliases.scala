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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Domainaliases")
@js.native
open class ResourceDomainaliases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainaliasesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainaliasesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDomainaliasesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDomainaliasesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDomainaliasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a domain Alias of the customer.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.domain'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.domainAliases.delete({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Name of domain alias to be retrieved.
    *     domainAliasName: 'placeholder-value',
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
  def delete(params: ParamsResourceDomainaliasesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDomainaliasesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(params: ParamsResourceDomainaliasesGet): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(params: ParamsResourceDomainaliasesGet, callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def get(
    params: ParamsResourceDomainaliasesGet,
    options: BodyResponseCallback[Readable | SchemaDomainAlias],
    callback: BodyResponseCallback[Readable | SchemaDomainAlias]
  ): Unit = js.native
  def get(params: ParamsResourceDomainaliasesGet, options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(
    params: ParamsResourceDomainaliasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainAlias]
  ): Unit = js.native
  /**
    * Retrieves a domain alias of the customer.
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
    *       'https://www.googleapis.com/auth/admin.directory.domain',
    *       'https://www.googleapis.com/auth/admin.directory.domain.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.domainAliases.get({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Name of domain alias to be retrieved.
    *     domainAliasName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "domainAliasName": "my_domainAliasName",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "parentDomainName": "my_parentDomainName",
    *   //   "verified": false
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
  def get(params: ParamsResourceDomainaliasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDomainaliasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(params: ParamsResourceDomainaliasesInsert): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(params: ParamsResourceDomainaliasesInsert, callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def insert(
    params: ParamsResourceDomainaliasesInsert,
    options: BodyResponseCallback[Readable | SchemaDomainAlias],
    callback: BodyResponseCallback[Readable | SchemaDomainAlias]
  ): Unit = js.native
  def insert(params: ParamsResourceDomainaliasesInsert, options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(
    params: ParamsResourceDomainaliasesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainAlias]
  ): Unit = js.native
  /**
    * Inserts a domain alias of the customer.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.domain'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.domainAliases.insert({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationTime": "my_creationTime",
    *       //   "domainAliasName": "my_domainAliasName",
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "parentDomainName": "my_parentDomainName",
    *       //   "verified": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "domainAliasName": "my_domainAliasName",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "parentDomainName": "my_parentDomainName",
    *   //   "verified": false
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
  def insert(params: ParamsResourceDomainaliasesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDomainaliasesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(callback: BodyResponseCallback[SchemaDomainAliases]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(params: ParamsResourceDomainaliasesList): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(params: ParamsResourceDomainaliasesList, callback: BodyResponseCallback[SchemaDomainAliases]): Unit = js.native
  def list(
    params: ParamsResourceDomainaliasesList,
    options: BodyResponseCallback[Readable | SchemaDomainAliases],
    callback: BodyResponseCallback[Readable | SchemaDomainAliases]
  ): Unit = js.native
  def list(params: ParamsResourceDomainaliasesList, options: MethodOptions): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(
    params: ParamsResourceDomainaliasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainAliases]
  ): Unit = js.native
  /**
    * Lists the domain aliases of the customer.
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
    *       'https://www.googleapis.com/auth/admin.directory.domain',
    *       'https://www.googleapis.com/auth/admin.directory.domain.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.domainAliases.list({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Name of the parent domain for which domain aliases are to be fetched.
    *     parentDomainName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domainAliases": [],
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
  def list(params: ParamsResourceDomainaliasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDomainaliasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
