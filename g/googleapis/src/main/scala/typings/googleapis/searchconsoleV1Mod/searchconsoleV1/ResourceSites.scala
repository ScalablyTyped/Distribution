package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Sites")
@js.native
open class ResourceSites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def add(): GaxiosPromise[Unit] = js.native
  def add(callback: BodyResponseCallback[Unit]): Unit = js.native
  def add(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def add(params: ParamsResourceSitesAdd): GaxiosPromise[Unit] = js.native
  def add(params: ParamsResourceSitesAdd, callback: BodyResponseCallback[Unit]): Unit = js.native
  def add(
    params: ParamsResourceSitesAdd,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def add(params: ParamsResourceSitesAdd, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def add(params: ParamsResourceSitesAdd, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    *  Adds a site to the set of the user's sites in Search Console.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/searchconsole.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const searchconsole = google.searchconsole('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/webmasters'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await webmasters.sites.add({
    *     // The URL of the site to add.
    *     siteUrl: 'placeholder-value',
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
  def add(params: ParamsResourceSitesAdd, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def add(
    params: ParamsResourceSitesAdd,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSitesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSitesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    *  Removes a site from the set of the user's Search Console sites.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/searchconsole.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const searchconsole = google.searchconsole('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/webmasters'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await webmasters.sites.delete({
    *     // The URI of the property as defined in Search Console. **Examples:** `http://www.example.com/` or `sc-domain:example.com`.
    *     siteUrl: 'placeholder-value',
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
  def delete(params: ParamsResourceSitesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSitesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWmxSite] = js.native
  def get(callback: BodyResponseCallback[SchemaWmxSite]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWmxSite] = js.native
  def get(params: ParamsResourceSitesGet): GaxiosPromise[SchemaWmxSite] = js.native
  def get(params: ParamsResourceSitesGet, callback: BodyResponseCallback[SchemaWmxSite]): Unit = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: BodyResponseCallback[Readable | SchemaWmxSite],
    callback: BodyResponseCallback[Readable | SchemaWmxSite]
  ): Unit = js.native
  def get(params: ParamsResourceSitesGet, options: MethodOptions): GaxiosPromise[SchemaWmxSite] = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWmxSite]
  ): Unit = js.native
  /**
    *  Retrieves information about specific site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/searchconsole.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const searchconsole = google.searchconsole('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/webmasters',
    *       'https://www.googleapis.com/auth/webmasters.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await webmasters.sites.get({
    *     // The URI of the property as defined in Search Console. **Examples:** `http://www.example.com/` or `sc-domain:example.com`.
    *     siteUrl: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissionLevel": "my_permissionLevel",
    *   //   "siteUrl": "my_siteUrl"
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
  def get(params: ParamsResourceSitesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(params: ParamsResourceSitesList): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(params: ParamsResourceSitesList, callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitesList,
    options: BodyResponseCallback[Readable | SchemaSitesListResponse],
    callback: BodyResponseCallback[Readable | SchemaSitesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesList, options: MethodOptions): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(
    params: ParamsResourceSitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSitesListResponse]
  ): Unit = js.native
  /**
    *  Lists the user's Search Console sites.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/searchconsole.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const searchconsole = google.searchconsole('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/webmasters',
    *       'https://www.googleapis.com/auth/webmasters.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await webmasters.sites.list({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "siteEntry": []
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
  def list(params: ParamsResourceSitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSitesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
