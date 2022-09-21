package typings.googleapis.gmailpostmastertoolsV1Mod.gmailpostmastertoolsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmailpostmastertools/v1", "gmailpostmastertools_v1.Resource$Domains")
@js.native
open class ResourceDomains protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDomain] = js.native
  def get(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(params: ParamsResourceDomainsGet): GaxiosPromise[SchemaDomain] = js.native
  def get(params: ParamsResourceDomainsGet, callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def get(
    params: ParamsResourceDomainsGet,
    options: BodyResponseCallback[Readable | SchemaDomain],
    callback: BodyResponseCallback[Readable | SchemaDomain]
  ): Unit = js.native
  def get(params: ParamsResourceDomainsGet, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(
    params: ParamsResourceDomainsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  /**
    * Gets a specific domain registered by the client. Returns NOT_FOUND if the domain does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmailpostmastertools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmailpostmastertools = google.gmailpostmastertools('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/postmaster.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmailpostmastertools.domains.get({
    *     // The resource name of the domain. It should have the form `domains/{domain_name\}`, where domain_name is the fully qualified domain name.
    *     name: 'domains/my-domain',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "permission": "my_permission"
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
  
  def list(): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDomainsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(params: ParamsResourceDomainsList): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(params: ParamsResourceDomainsList, callback: BodyResponseCallback[SchemaListDomainsResponse]): Unit = js.native
  def list(
    params: ParamsResourceDomainsList,
    options: BodyResponseCallback[Readable | SchemaListDomainsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDomainsList, options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(
    params: ParamsResourceDomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDomainsResponse]
  ): Unit = js.native
  /**
    * Lists the domains that have been registered by the client. The order of domains in the response is unspecified and non-deterministic. Newly created domains will not necessarily be added to the end of this list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmailpostmastertools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmailpostmastertools = google.gmailpostmastertools('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/postmaster.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmailpostmastertools.domains.list({
    *     // Requested page size. Server may return fewer domains than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any. This is the value of ListDomainsResponse.next_page_token returned from the previous call to `ListDomains` method.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domains": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  
  var trafficStats: ResourceDomainsTrafficstats = js.native
}
