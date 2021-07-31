package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Urlcrawlerrorssamples")
@js.native
class ResourceUrlcrawlerrorssamples protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * webmasters.urlcrawlerrorssamples.get
    * @desc Retrieves details about crawl errors for a site's sample URL.
    * @alias webmasters.urlcrawlerrorssamples.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.category The crawl error category. For example: authPermissions
    * @param {string} params.platform The user agent type (platform) that made the request. For example: web
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {string} params.url The relative path (without the site) of the sample URL. It must be one of the URLs returned by list(). For example, for the URL https://www.example.com/pagename on the site https://www.example.com/, the url value is pagename
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUrlCrawlErrorsSample] = js.native
  def get(callback: BodyResponseCallback[SchemaUrlCrawlErrorsSample]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlCrawlErrorsSample] = js.native
  def get(params: ParamsResourceUrlcrawlerrorssamplesGet): GaxiosPromise[SchemaUrlCrawlErrorsSample] = js.native
  def get(
    params: ParamsResourceUrlcrawlerrorssamplesGet,
    callback: BodyResponseCallback[SchemaUrlCrawlErrorsSample]
  ): Unit = js.native
  def get(
    params: ParamsResourceUrlcrawlerrorssamplesGet,
    options: BodyResponseCallback[SchemaUrlCrawlErrorsSample],
    callback: BodyResponseCallback[SchemaUrlCrawlErrorsSample]
  ): Unit = js.native
  def get(params: ParamsResourceUrlcrawlerrorssamplesGet, options: MethodOptions): GaxiosPromise[SchemaUrlCrawlErrorsSample] = js.native
  def get(
    params: ParamsResourceUrlcrawlerrorssamplesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlCrawlErrorsSample]
  ): Unit = js.native
  
  /**
    * webmasters.urlcrawlerrorssamples.list
    * @desc Lists a site's sample URLs for the specified crawl error category
    * and platform.
    * @alias webmasters.urlcrawlerrorssamples.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.category The crawl error category. For example: authPermissions
    * @param {string} params.platform The user agent type (platform) that made the request. For example: web
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUrlCrawlErrorsSamplesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUrlCrawlErrorsSamplesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlCrawlErrorsSamplesListResponse] = js.native
  def list(params: ParamsResourceUrlcrawlerrorssamplesList): GaxiosPromise[SchemaUrlCrawlErrorsSamplesListResponse] = js.native
  def list(
    params: ParamsResourceUrlcrawlerrorssamplesList,
    callback: BodyResponseCallback[SchemaUrlCrawlErrorsSamplesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUrlcrawlerrorssamplesList,
    options: BodyResponseCallback[SchemaUrlCrawlErrorsSamplesListResponse],
    callback: BodyResponseCallback[SchemaUrlCrawlErrorsSamplesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUrlcrawlerrorssamplesList, options: MethodOptions): GaxiosPromise[SchemaUrlCrawlErrorsSamplesListResponse] = js.native
  def list(
    params: ParamsResourceUrlcrawlerrorssamplesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlCrawlErrorsSamplesListResponse]
  ): Unit = js.native
  
  /**
    * webmasters.urlcrawlerrorssamples.markAsFixed
    * @desc Marks the provided site's sample URL as fixed, and removes it from
    * the samples list.
    * @alias webmasters.urlcrawlerrorssamples.markAsFixed
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.category The crawl error category. For example: authPermissions
    * @param {string} params.platform The user agent type (platform) that made the request. For example: web
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {string} params.url The relative path (without the site) of the sample URL. It must be one of the URLs returned by list(). For example, for the URL https://www.example.com/pagename on the site https://www.example.com/, the url value is pagename
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def markAsFixed(): GaxiosPromise[Unit] = js.native
  def markAsFixed(callback: BodyResponseCallback[Unit]): Unit = js.native
  def markAsFixed(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def markAsFixed(params: ParamsResourceUrlcrawlerrorssamplesMarkasfixed): GaxiosPromise[Unit] = js.native
  def markAsFixed(params: ParamsResourceUrlcrawlerrorssamplesMarkasfixed, callback: BodyResponseCallback[Unit]): Unit = js.native
  def markAsFixed(
    params: ParamsResourceUrlcrawlerrorssamplesMarkasfixed,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def markAsFixed(params: ParamsResourceUrlcrawlerrorssamplesMarkasfixed, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def markAsFixed(
    params: ParamsResourceUrlcrawlerrorssamplesMarkasfixed,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
