package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Domains")
@js.native
class ResourceDomains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.domains.delete
    * @desc Deletes a domain of the customer.
    * @alias directory.domains.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainName Name of domain to be deleted
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDomainsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDomainsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.domains.get
    * @desc Retrieves a domain of the customer.
    * @alias directory.domains.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainName Name of domain to be retrieved
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDomains] = js.native
  def get(callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def get(params: ParamsResourceDomainsGet): GaxiosPromise[SchemaDomains] = js.native
  def get(params: ParamsResourceDomainsGet, callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def get(
    params: ParamsResourceDomainsGet,
    options: BodyResponseCallback[SchemaDomains],
    callback: BodyResponseCallback[SchemaDomains]
  ): Unit = js.native
  def get(params: ParamsResourceDomainsGet, options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def get(
    params: ParamsResourceDomainsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomains]
  ): Unit = js.native
  
  /**
    * directory.domains.insert
    * @desc Inserts a domain of the customer.
    * @alias directory.domains.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().Domains} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaDomains] = js.native
  def insert(callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def insert(params: ParamsResourceDomainsInsert): GaxiosPromise[SchemaDomains] = js.native
  def insert(params: ParamsResourceDomainsInsert, callback: BodyResponseCallback[SchemaDomains]): Unit = js.native
  def insert(
    params: ParamsResourceDomainsInsert,
    options: BodyResponseCallback[SchemaDomains],
    callback: BodyResponseCallback[SchemaDomains]
  ): Unit = js.native
  def insert(params: ParamsResourceDomainsInsert, options: MethodOptions): GaxiosPromise[SchemaDomains] = js.native
  def insert(
    params: ParamsResourceDomainsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomains]
  ): Unit = js.native
  
  /**
    * directory.domains.list
    * @desc Lists the domains of the customer.
    * @alias directory.domains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDomains2] = js.native
  def list(callback: BodyResponseCallback[SchemaDomains2]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomains2] = js.native
  def list(params: ParamsResourceDomainsList): GaxiosPromise[SchemaDomains2] = js.native
  def list(params: ParamsResourceDomainsList, callback: BodyResponseCallback[SchemaDomains2]): Unit = js.native
  def list(
    params: ParamsResourceDomainsList,
    options: BodyResponseCallback[SchemaDomains2],
    callback: BodyResponseCallback[SchemaDomains2]
  ): Unit = js.native
  def list(params: ParamsResourceDomainsList, options: MethodOptions): GaxiosPromise[SchemaDomains2] = js.native
  def list(
    params: ParamsResourceDomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomains2]
  ): Unit = js.native
}
