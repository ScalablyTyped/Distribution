package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Domains")
@js.native
open class ResourceSitesDomains protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDomain] = js.native
  def create(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def create(params: ParamsResourceSitesDomainsCreate): GaxiosPromise[SchemaDomain] = js.native
  def create(params: ParamsResourceSitesDomainsCreate, callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def create(
    params: ParamsResourceSitesDomainsCreate,
    options: BodyResponseCallback[Readable | SchemaDomain],
    callback: BodyResponseCallback[Readable | SchemaDomain]
  ): Unit = js.native
  def create(params: ParamsResourceSitesDomainsCreate, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def create(
    params: ParamsResourceSitesDomainsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  /**
    * Creates a domain mapping on the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.domains.create({
    *     // Required. The parent to create the domain association for, in the format: sites/site-name
    *     parent: 'sites/my-site',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "domainName": "my_domainName",
    *       //   "domainRedirect": {},
    *       //   "provisioning": {},
    *       //   "site": "my_site",
    *       //   "status": "my_status",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domainName": "my_domainName",
    *   //   "domainRedirect": {},
    *   //   "provisioning": {},
    *   //   "site": "my_site",
    *   //   "status": "my_status",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceSitesDomainsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSitesDomainsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesDomainsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesDomainsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSitesDomainsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSitesDomainsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSitesDomainsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the existing domain mapping on the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.domains.delete({
    *     // Required. The name of the domain association to delete.
    *     name: 'sites/my-site/domains/my-domain',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceSitesDomainsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSitesDomainsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDomain] = js.native
  def get(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(params: ParamsResourceSitesDomainsGet): GaxiosPromise[SchemaDomain] = js.native
  def get(params: ParamsResourceSitesDomainsGet, callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def get(
    params: ParamsResourceSitesDomainsGet,
    options: BodyResponseCallback[Readable | SchemaDomain],
    callback: BodyResponseCallback[Readable | SchemaDomain]
  ): Unit = js.native
  def get(params: ParamsResourceSitesDomainsGet, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(
    params: ParamsResourceSitesDomainsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  /**
    * Gets a domain mapping on the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.domains.get({
    *     // Required. The name of the domain configuration to get.
    *     name: 'sites/my-site/domains/my-domain',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domainName": "my_domainName",
    *   //   "domainRedirect": {},
    *   //   "provisioning": {},
    *   //   "site": "my_site",
    *   //   "status": "my_status",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceSitesDomainsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSitesDomainsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDomainsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(params: ParamsResourceSitesDomainsList): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(params: ParamsResourceSitesDomainsList, callback: BodyResponseCallback[SchemaListDomainsResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitesDomainsList,
    options: BodyResponseCallback[Readable | SchemaListDomainsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesDomainsList, options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(
    params: ParamsResourceSitesDomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDomainsResponse]
  ): Unit = js.native
  /**
    * Lists the domains for the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.domains.list({
    *     // The page size to return. Defaults to 50.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token from a previous request, if provided.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent for which to list domains, in the format: sites/ site-name
    *     parent: 'sites/my-site',
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
  def list(params: ParamsResourceSitesDomainsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSitesDomainsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaDomain] = js.native
  def update(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def update(params: ParamsResourceSitesDomainsUpdate): GaxiosPromise[SchemaDomain] = js.native
  def update(params: ParamsResourceSitesDomainsUpdate, callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def update(
    params: ParamsResourceSitesDomainsUpdate,
    options: BodyResponseCallback[Readable | SchemaDomain],
    callback: BodyResponseCallback[Readable | SchemaDomain]
  ): Unit = js.native
  def update(params: ParamsResourceSitesDomainsUpdate, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def update(
    params: ParamsResourceSitesDomainsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  /**
    * Updates the specified domain mapping, creating the mapping as if it does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.domains.update({
    *     // Required. The name of the domain association to update or create, if an association doesn't already exist.
    *     name: 'sites/my-site/domains/my-domain',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "domainName": "my_domainName",
    *       //   "domainRedirect": {},
    *       //   "provisioning": {},
    *       //   "site": "my_site",
    *       //   "status": "my_status",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domainName": "my_domainName",
    *   //   "domainRedirect": {},
    *   //   "provisioning": {},
    *   //   "site": "my_site",
    *   //   "status": "my_status",
    *   //   "updateTime": "my_updateTime"
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
  def update(params: ParamsResourceSitesDomainsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSitesDomainsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
