package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Domainaliases")
@js.native
class ResourceDomainaliases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.domainAliases.delete
    * @desc Deletes a Domain Alias of the customer.
    * @alias directory.domainAliases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainAliasName Name of domain alias to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainaliasesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDomainaliasesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDomainaliasesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDomainaliasesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDomainaliasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.domainAliases.get
    * @desc Retrieves a domain alias of the customer.
    * @alias directory.domainAliases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainAliasName Name of domain alias to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(params: ParamsResourceDomainaliasesGet): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(params: ParamsResourceDomainaliasesGet, callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def get(
    params: ParamsResourceDomainaliasesGet,
    options: BodyResponseCallback[SchemaDomainAlias],
    callback: BodyResponseCallback[SchemaDomainAlias]
  ): Unit = js.native
  def get(params: ParamsResourceDomainaliasesGet, options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def get(
    params: ParamsResourceDomainaliasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainAlias]
  ): Unit = js.native
  
  /**
    * directory.domainAliases.insert
    * @desc Inserts a Domain alias of the customer.
    * @alias directory.domainAliases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().DomainAlias} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(params: ParamsResourceDomainaliasesInsert): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(params: ParamsResourceDomainaliasesInsert, callback: BodyResponseCallback[SchemaDomainAlias]): Unit = js.native
  def insert(
    params: ParamsResourceDomainaliasesInsert,
    options: BodyResponseCallback[SchemaDomainAlias],
    callback: BodyResponseCallback[SchemaDomainAlias]
  ): Unit = js.native
  def insert(params: ParamsResourceDomainaliasesInsert, options: MethodOptions): GaxiosPromise[SchemaDomainAlias] = js.native
  def insert(
    params: ParamsResourceDomainaliasesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainAlias]
  ): Unit = js.native
  
  /**
    * directory.domainAliases.list
    * @desc Lists the domain aliases of the customer.
    * @alias directory.domainAliases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string=} params.parentDomainName Name of the parent domain for which domain aliases are to be fetched.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(callback: BodyResponseCallback[SchemaDomainAliases]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(params: ParamsResourceDomainaliasesList): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(params: ParamsResourceDomainaliasesList, callback: BodyResponseCallback[SchemaDomainAliases]): Unit = js.native
  def list(
    params: ParamsResourceDomainaliasesList,
    options: BodyResponseCallback[SchemaDomainAliases],
    callback: BodyResponseCallback[SchemaDomainAliases]
  ): Unit = js.native
  def list(params: ParamsResourceDomainaliasesList, options: MethodOptions): GaxiosPromise[SchemaDomainAliases] = js.native
  def list(
    params: ParamsResourceDomainaliasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomainAliases]
  ): Unit = js.native
}
