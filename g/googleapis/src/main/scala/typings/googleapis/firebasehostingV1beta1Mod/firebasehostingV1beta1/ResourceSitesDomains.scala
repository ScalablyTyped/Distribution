package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Domains")
@js.native
class ResourceSitesDomains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebasehosting.sites.domains.create
    * @desc Creates a domain mapping on the specified site.
    * @alias firebasehosting.sites.domains.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent to create the domain association for, in the format: <code>sites/<var>site-name</var></code>
    * @param {().Domain} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaDomain] = js.native
  def create(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def create(params: ParamsResourceSitesDomainsCreate): GaxiosPromise[SchemaDomain] = js.native
  def create(params: ParamsResourceSitesDomainsCreate, callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def create(
    params: ParamsResourceSitesDomainsCreate,
    options: BodyResponseCallback[SchemaDomain],
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  def create(params: ParamsResourceSitesDomainsCreate, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def create(
    params: ParamsResourceSitesDomainsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.delete
    * @desc Deletes the existing domain mapping on the specified site.
    * @alias firebasehosting.sites.domains.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the domain association to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesDomainsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesDomainsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSitesDomainsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSitesDomainsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSitesDomainsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.get
    * @desc Gets a domain mapping on the specified site.
    * @alias firebasehosting.sites.domains.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the domain configuration to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDomain] = js.native
  def get(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(params: ParamsResourceSitesDomainsGet): GaxiosPromise[SchemaDomain] = js.native
  def get(params: ParamsResourceSitesDomainsGet, callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def get(
    params: ParamsResourceSitesDomainsGet,
    options: BodyResponseCallback[SchemaDomain],
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  def get(params: ParamsResourceSitesDomainsGet, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(
    params: ParamsResourceSitesDomainsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.list
    * @desc Lists the domains for the specified site.
    * @alias firebasehosting.sites.domains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The page size to return. Defaults to 50.
    * @param {string=} params.pageToken The next_page_token from a previous request, if provided.
    * @param {string} params.parent Required. The parent for which to list domains, in the format: <code>sites/<var>site-name</var></code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDomainsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(params: ParamsResourceSitesDomainsList): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(params: ParamsResourceSitesDomainsList, callback: BodyResponseCallback[SchemaListDomainsResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitesDomainsList,
    options: BodyResponseCallback[SchemaListDomainsResponse],
    callback: BodyResponseCallback[SchemaListDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesDomainsList, options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(
    params: ParamsResourceSitesDomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDomainsResponse]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.update
    * @desc Updates the specified domain mapping, creating the mapping as if it
    * does not exist.
    * @alias firebasehosting.sites.domains.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the domain association to update or create, if an association doesn't already exist.
    * @param {().Domain} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaDomain] = js.native
  def update(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def update(params: ParamsResourceSitesDomainsUpdate): GaxiosPromise[SchemaDomain] = js.native
  def update(params: ParamsResourceSitesDomainsUpdate, callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def update(
    params: ParamsResourceSitesDomainsUpdate,
    options: BodyResponseCallback[SchemaDomain],
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  def update(params: ParamsResourceSitesDomainsUpdate, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def update(
    params: ParamsResourceSitesDomainsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
}

