package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Sitemaps")
@js.native
class ResourceSitemaps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * webmasters.sitemaps.delete
    * @desc Deletes a sitemap from this site.
    * @alias webmasters.sitemaps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.feedpath The URL of the actual sitemap. For example: http://www.example.com/sitemap.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceSitemapsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitemapsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSitemapsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSitemapsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitemapsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * webmasters.sitemaps.get
    * @desc Retrieves information about a specific sitemap.
    * @alias webmasters.sitemaps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.feedpath The URL of the actual sitemap. For example: http://www.example.com/sitemap.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaWmxSitemap] = js.native
  def get(callback: BodyResponseCallback[SchemaWmxSitemap]): Unit = js.native
  def get(params: ParamsResourceSitemapsGet): GaxiosPromise[SchemaWmxSitemap] = js.native
  def get(params: ParamsResourceSitemapsGet, callback: BodyResponseCallback[SchemaWmxSitemap]): Unit = js.native
  def get(
    params: ParamsResourceSitemapsGet,
    options: BodyResponseCallback[SchemaWmxSitemap],
    callback: BodyResponseCallback[SchemaWmxSitemap]
  ): Unit = js.native
  def get(params: ParamsResourceSitemapsGet, options: MethodOptions): GaxiosPromise[SchemaWmxSitemap] = js.native
  def get(
    params: ParamsResourceSitemapsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWmxSitemap]
  ): Unit = js.native
  /**
    * webmasters.sitemaps.list
    * @desc Lists the sitemaps-entries submitted for this site, or included in
    * the sitemap index file (if sitemapIndex is specified in the request).
    * @alias webmasters.sitemaps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.sitemapIndex A URL of a site's sitemap index. For example: http://www.example.com/sitemapindex.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSitemapsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSitemapsListResponse]): Unit = js.native
  def list(params: ParamsResourceSitemapsList): GaxiosPromise[SchemaSitemapsListResponse] = js.native
  def list(params: ParamsResourceSitemapsList, callback: BodyResponseCallback[SchemaSitemapsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitemapsList,
    options: BodyResponseCallback[SchemaSitemapsListResponse],
    callback: BodyResponseCallback[SchemaSitemapsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitemapsList, options: MethodOptions): GaxiosPromise[SchemaSitemapsListResponse] = js.native
  def list(
    params: ParamsResourceSitemapsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSitemapsListResponse]
  ): Unit = js.native
  /**
    * webmasters.sitemaps.submit
    * @desc Submits a sitemap for a site.
    * @alias webmasters.sitemaps.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.feedpath The URL of the sitemap to add. For example: http://www.example.com/sitemap.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[Unit] = js.native
  def submit(callback: BodyResponseCallback[Unit]): Unit = js.native
  def submit(params: ParamsResourceSitemapsSubmit): GaxiosPromise[Unit] = js.native
  def submit(params: ParamsResourceSitemapsSubmit, callback: BodyResponseCallback[Unit]): Unit = js.native
  def submit(
    params: ParamsResourceSitemapsSubmit,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def submit(params: ParamsResourceSitemapsSubmit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def submit(params: ParamsResourceSitemapsSubmit, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
}

