package typings.googleapis.vaultV1Mod.vaultV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Savedqueries")
@js.native
class ResourceMattersSavedqueries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vault.matters.savedQueries.create
    * @desc Creates a saved query.
    * @alias vault.matters.savedQueries.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved query is to be created.
    * @param {().SavedQuery} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def create(params: ParamsResourceMattersSavedqueriesCreate): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(params: ParamsResourceMattersSavedqueriesCreate, callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def create(
    params: ParamsResourceMattersSavedqueriesCreate,
    options: BodyResponseCallback[SchemaSavedQuery],
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  def create(params: ParamsResourceMattersSavedqueriesCreate, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(
    params: ParamsResourceMattersSavedqueriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  /**
    * vault.matters.savedQueries.delete
    * @desc Deletes a saved query by Id.
    * @alias vault.matters.savedQueries.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved query is to be deleted.
    * @param {string} params.savedQueryId Id of the saved query to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceMattersSavedqueriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersSavedqueriesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersSavedqueriesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersSavedqueriesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersSavedqueriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * vault.matters.savedQueries.get
    * @desc Retrieves a saved query by Id.
    * @alias vault.matters.savedQueries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved query is to be retrieved.
    * @param {string} params.savedQueryId Id of the saved query to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def get(params: ParamsResourceMattersSavedqueriesGet): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(params: ParamsResourceMattersSavedqueriesGet, callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def get(
    params: ParamsResourceMattersSavedqueriesGet,
    options: BodyResponseCallback[SchemaSavedQuery],
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  def get(params: ParamsResourceMattersSavedqueriesGet, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(
    params: ParamsResourceMattersSavedqueriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  /**
    * vault.matters.savedQueries.list
    * @desc Lists saved queries within a matter. An empty page token in
    * ListSavedQueriesResponse denotes no more saved queries to list.
    * @alias vault.matters.savedQueries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter id of the parent matter for which the saved queries are to be retrieved.
    * @param {integer=} params.pageSize The maximum number of saved queries to return.
    * @param {string=} params.pageToken The pagination token as returned in the previous response. An empty token means start from the beginning.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSavedQueriesResponse]): Unit = js.native
  def list(params: ParamsResourceMattersSavedqueriesList): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(
    params: ParamsResourceMattersSavedqueriesList,
    callback: BodyResponseCallback[SchemaListSavedQueriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMattersSavedqueriesList,
    options: BodyResponseCallback[SchemaListSavedQueriesResponse],
    callback: BodyResponseCallback[SchemaListSavedQueriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersSavedqueriesList, options: MethodOptions): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(
    params: ParamsResourceMattersSavedqueriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSavedQueriesResponse]
  ): Unit = js.native
}

