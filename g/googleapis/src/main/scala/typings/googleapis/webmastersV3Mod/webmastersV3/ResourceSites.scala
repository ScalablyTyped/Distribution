package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Sites")
@js.native
class ResourceSites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * webmasters.sites.add
    * @desc Adds a site to the set of the user's sites in Search Console.
    * @alias webmasters.sites.add
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The URL of the site to add.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def add(): GaxiosPromise[Unit] = js.native
  def add(callback: BodyResponseCallback[Unit]): Unit = js.native
  def add(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def add(params: ParamsResourceSitesAdd): GaxiosPromise[Unit] = js.native
  def add(params: ParamsResourceSitesAdd, callback: BodyResponseCallback[Unit]): Unit = js.native
  def add(
    params: ParamsResourceSitesAdd,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def add(params: ParamsResourceSitesAdd, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def add(params: ParamsResourceSitesAdd, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * webmasters.sites.delete
    * @desc Removes a site from the set of the user's Search Console sites.
    * @alias webmasters.sites.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The URI of the property as defined in Search Console. Examples: http://www.example.com/ or android-app://com.example/ Note: for property-sets, use the URI that starts with sc-set: which is used in Search Console URLs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSitesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSitesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSitesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * webmasters.sites.get
    * @desc Retrieves information about specific site.
    * @alias webmasters.sites.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The URI of the property as defined in Search Console. Examples: http://www.example.com/ or android-app://com.example/ Note: for property-sets, use the URI that starts with sc-set: which is used in Search Console URLs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaWmxSite] = js.native
  def get(callback: BodyResponseCallback[SchemaWmxSite]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWmxSite] = js.native
  def get(params: ParamsResourceSitesGet): GaxiosPromise[SchemaWmxSite] = js.native
  def get(params: ParamsResourceSitesGet, callback: BodyResponseCallback[SchemaWmxSite]): Unit = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: BodyResponseCallback[SchemaWmxSite],
    callback: BodyResponseCallback[SchemaWmxSite]
  ): Unit = js.native
  def get(params: ParamsResourceSitesGet, options: MethodOptions): GaxiosPromise[SchemaWmxSite] = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWmxSite]
  ): Unit = js.native
  
  /**
    * webmasters.sites.list
    * @desc Lists the user's Search Console sites.
    * @alias webmasters.sites.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(params: ParamsResourceSitesList): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(params: ParamsResourceSitesList, callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitesList,
    options: BodyResponseCallback[SchemaSitesListResponse],
    callback: BodyResponseCallback[SchemaSitesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesList, options: MethodOptions): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(
    params: ParamsResourceSitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSitesListResponse]
  ): Unit = js.native
}
