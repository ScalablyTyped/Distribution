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

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Sitemaps")
@js.native
open class ResourceSitemaps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitemapsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitemapsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSitemapsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSitemapsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitemapsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a sitemap from the Sitemaps report. Does not stop Google from crawling this sitemap or the URLs that were previously crawled in the deleted sitemap.
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
    *   const res = await webmasters.sitemaps.delete({
    *     // The URL of the actual sitemap. For example: `http://www.example.com/sitemap.xml`.
    *     feedpath: 'placeholder-value',
    *     // The site's URL, including protocol. For example: `http://www.example.com/`.
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
  def delete(params: ParamsResourceSitemapsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSitemapsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWmxSitemap] = js.native
  def get(callback: BodyResponseCallback[SchemaWmxSitemap]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWmxSitemap] = js.native
  def get(params: ParamsResourceSitemapsGet): GaxiosPromise[SchemaWmxSitemap] = js.native
  def get(params: ParamsResourceSitemapsGet, callback: BodyResponseCallback[SchemaWmxSitemap]): Unit = js.native
  def get(
    params: ParamsResourceSitemapsGet,
    options: BodyResponseCallback[Readable | SchemaWmxSitemap],
    callback: BodyResponseCallback[Readable | SchemaWmxSitemap]
  ): Unit = js.native
  def get(params: ParamsResourceSitemapsGet, options: MethodOptions): GaxiosPromise[SchemaWmxSitemap] = js.native
  def get(
    params: ParamsResourceSitemapsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWmxSitemap]
  ): Unit = js.native
  /**
    * Retrieves information about a specific sitemap.
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
    *   const res = await webmasters.sitemaps.get({
    *     // The URL of the actual sitemap. For example: `http://www.example.com/sitemap.xml`.
    *     feedpath: 'placeholder-value',
    *     // The site's URL, including protocol. For example: `http://www.example.com/`.
    *     siteUrl: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contents": [],
    *   //   "errors": "my_errors",
    *   //   "isPending": false,
    *   //   "isSitemapsIndex": false,
    *   //   "lastDownloaded": "my_lastDownloaded",
    *   //   "lastSubmitted": "my_lastSubmitted",
    *   //   "path": "my_path",
    *   //   "type": "my_type",
    *   //   "warnings": "my_warnings"
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
  def get(params: ParamsResourceSitemapsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSitemapsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSitemapsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSitemapsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSitemapsListResponse] = js.native
  def list(params: ParamsResourceSitemapsList): GaxiosPromise[SchemaSitemapsListResponse] = js.native
  def list(params: ParamsResourceSitemapsList, callback: BodyResponseCallback[SchemaSitemapsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitemapsList,
    options: BodyResponseCallback[Readable | SchemaSitemapsListResponse],
    callback: BodyResponseCallback[Readable | SchemaSitemapsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitemapsList, options: MethodOptions): GaxiosPromise[SchemaSitemapsListResponse] = js.native
  def list(
    params: ParamsResourceSitemapsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSitemapsListResponse]
  ): Unit = js.native
  /**
    *  Lists the [sitemaps-entries](/webmaster-tools/v3/sitemaps) submitted for this site, or included in the sitemap index file (if `sitemapIndex` is specified in the request).
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
    *   const res = await webmasters.sitemaps.list({
    *     //  A URL of a site's sitemap index. For example: `http://www.example.com/sitemapindex.xml`.
    *     sitemapIndex: 'placeholder-value',
    *     // The site's URL, including protocol. For example: `http://www.example.com/`.
    *     siteUrl: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "sitemap": []
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
  def list(params: ParamsResourceSitemapsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSitemapsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def submit(): GaxiosPromise[Unit] = js.native
  def submit(callback: BodyResponseCallback[Unit]): Unit = js.native
  def submit(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def submit(params: ParamsResourceSitemapsSubmit): GaxiosPromise[Unit] = js.native
  def submit(params: ParamsResourceSitemapsSubmit, callback: BodyResponseCallback[Unit]): Unit = js.native
  def submit(
    params: ParamsResourceSitemapsSubmit,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def submit(params: ParamsResourceSitemapsSubmit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def submit(params: ParamsResourceSitemapsSubmit, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Submits a sitemap for a site.
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
    *   const res = await webmasters.sitemaps.submit({
    *     // The URL of the actual sitemap. For example: `http://www.example.com/sitemap.xml`.
    *     feedpath: 'placeholder-value',
    *     // The site's URL, including protocol. For example: `http://www.example.com/`.
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
  def submit(params: ParamsResourceSitemapsSubmit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def submit(
    params: ParamsResourceSitemapsSubmit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
