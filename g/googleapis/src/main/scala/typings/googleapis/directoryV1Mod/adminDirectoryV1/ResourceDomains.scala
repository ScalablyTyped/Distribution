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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Domains")
@js.native
open class ResourceDomains protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDomainsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDomainsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a domain of the customer.
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
    *   const res = await directory.domains.delete({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Name of domain to be deleted
    *     domainName: 'placeholder-value',
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
  def delete(params: ParamsResourceDomainsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDomainsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDomains] = js.native
  def get(callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def get(params: ParamsResourceDomainsGet): GaxiosPromise[SchemaDomains] = js.native
  def get(params: ParamsResourceDomainsGet, callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def get(
    params: ParamsResourceDomainsGet,
    options: BodyResponseCallback[Readable | SchemaDomains],
    callback: BodyResponseCallback[Readable | SchemaDomains]
  ): Unit = js.native
  def get(params: ParamsResourceDomainsGet, options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def get(
    params: ParamsResourceDomainsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomains]
  ): Unit = js.native
  /**
    * Retrieves a domain of the customer.
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
    *   const res = await directory.domains.get({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Name of domain to be retrieved
    *     domainName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "domainAliases": [],
    *   //   "domainName": "my_domainName",
    *   //   "etag": "my_etag",
    *   //   "isPrimary": false,
    *   //   "kind": "my_kind",
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
  def get(params: ParamsResourceDomainsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDomainsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDomains] = js.native
  def insert(callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def insert(params: ParamsResourceDomainsInsert): GaxiosPromise[SchemaDomains] = js.native
  def insert(params: ParamsResourceDomainsInsert, callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def insert(
    params: ParamsResourceDomainsInsert,
    options: BodyResponseCallback[Readable | SchemaDomains],
    callback: BodyResponseCallback[Readable | SchemaDomains]
  ): Unit = js.native
  def insert(params: ParamsResourceDomainsInsert, options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def insert(
    params: ParamsResourceDomainsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomains]
  ): Unit = js.native
  /**
    * Inserts a domain of the customer.
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
    *   const res = await directory.domains.insert({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creationTime": "my_creationTime",
    *       //   "domainAliases": [],
    *       //   "domainName": "my_domainName",
    *       //   "etag": "my_etag",
    *       //   "isPrimary": false,
    *       //   "kind": "my_kind",
    *       //   "verified": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creationTime": "my_creationTime",
    *   //   "domainAliases": [],
    *   //   "domainName": "my_domainName",
    *   //   "etag": "my_etag",
    *   //   "isPrimary": false,
    *   //   "kind": "my_kind",
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
  def insert(params: ParamsResourceDomainsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDomainsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDomains2] = js.native
  def list(callback: BodyResponseCallback[SchemaDomains2]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomains2] = js.native
  def list(params: ParamsResourceDomainsList): GaxiosPromise[SchemaDomains2] = js.native
  def list(params: ParamsResourceDomainsList, callback: BodyResponseCallback[SchemaDomains2]): Unit = js.native
  def list(
    params: ParamsResourceDomainsList,
    options: BodyResponseCallback[Readable | SchemaDomains2],
    callback: BodyResponseCallback[Readable | SchemaDomains2]
  ): Unit = js.native
  def list(params: ParamsResourceDomainsList, options: MethodOptions): GaxiosPromise[SchemaDomains2] = js.native
  def list(
    params: ParamsResourceDomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomains2]
  ): Unit = js.native
  /**
    * Lists the domains of the customer.
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
    *   const res = await directory.domains.list({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domains": [],
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
  def list(params: ParamsResourceDomainsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDomainsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
