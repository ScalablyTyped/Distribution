package typings.googleapis.datastoreV1Mod.datastoreV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore/v1", "datastore_v1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var indexes: ResourceProjectsIndexes = js.native
  var operations: ResourceProjectsOperations = js.native
  /**
    * datastore.projects.allocateIds
    * @desc Allocates IDs for the given keys, which is useful for referencing
    * an entity before it is inserted.
    * @alias datastore.projects.allocateIds
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().AllocateIdsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def allocateIds(): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(callback: BodyResponseCallback[SchemaAllocateIdsResponse]): Unit = js.native
  def allocateIds(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(params: ParamsResourceProjectsAllocateids): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(
    params: ParamsResourceProjectsAllocateids,
    callback: BodyResponseCallback[SchemaAllocateIdsResponse]
  ): Unit = js.native
  def allocateIds(
    params: ParamsResourceProjectsAllocateids,
    options: BodyResponseCallback[SchemaAllocateIdsResponse],
    callback: BodyResponseCallback[SchemaAllocateIdsResponse]
  ): Unit = js.native
  def allocateIds(params: ParamsResourceProjectsAllocateids, options: MethodOptions): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(
    params: ParamsResourceProjectsAllocateids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAllocateIdsResponse]
  ): Unit = js.native
  /**
    * datastore.projects.beginTransaction
    * @desc Begins a new transaction.
    * @alias datastore.projects.beginTransaction
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().BeginTransactionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def beginTransaction(): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(callback: BodyResponseCallback[SchemaBeginTransactionResponse]): Unit = js.native
  def beginTransaction(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(params: ParamsResourceProjectsBegintransaction): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsBegintransaction,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsResourceProjectsBegintransaction,
    options: BodyResponseCallback[SchemaBeginTransactionResponse],
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(params: ParamsResourceProjectsBegintransaction, options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  /**
    * datastore.projects.commit
    * @desc Commits a transaction, optionally creating, deleting or modifying
    * some entities.
    * @alias datastore.projects.commit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().CommitRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def commit(): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(callback: BodyResponseCallback[SchemaCommitResponse]): Unit = js.native
  def commit(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(params: ParamsResourceProjectsCommit): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(params: ParamsResourceProjectsCommit, callback: BodyResponseCallback[SchemaCommitResponse]): Unit = js.native
  def commit(
    params: ParamsResourceProjectsCommit,
    options: BodyResponseCallback[SchemaCommitResponse],
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  def commit(params: ParamsResourceProjectsCommit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  /**
    * datastore.projects.export
    * @desc Exports a copy of all or a subset of entities from Google Cloud
    * Datastore to another storage system, such as Google Cloud Storage. Recent
    * updates to entities may not be reflected in the export. The export occurs
    * in the background and its progress can be monitored and managed via the
    * Operation resource that is created. The output of an export may only be
    * used once the associated operation is done. If an export operation is
    * cancelled before completion it may leave partial data behind in Google
    * Cloud Storage.
    * @alias datastore.projects.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1ExportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def export(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def export(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def export(params: ParamsResourceProjectsExport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def export(
    params: ParamsResourceProjectsExport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def export(
    params: ParamsResourceProjectsExport,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def export(params: ParamsResourceProjectsExport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def export(
    params: ParamsResourceProjectsExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * datastore.projects.import
    * @desc Imports entities into Google Cloud Datastore. Existing entities with
    * the same key are overwritten. The import occurs in the background and its
    * progress can be monitored and managed via the Operation resource that is
    * created. If an ImportEntities operation is cancelled, it is possible that a
    * subset of the data has already been imported to Cloud Datastore.
    * @alias datastore.projects.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1ImportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * datastore.projects.lookup
    * @desc Looks up entities by key.
    * @alias datastore.projects.lookup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().LookupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lookup(): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(callback: BodyResponseCallback[SchemaLookupResponse]): Unit = js.native
  def lookup(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(params: ParamsResourceProjectsLookup): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(params: ParamsResourceProjectsLookup, callback: BodyResponseCallback[SchemaLookupResponse]): Unit = js.native
  def lookup(
    params: ParamsResourceProjectsLookup,
    options: BodyResponseCallback[SchemaLookupResponse],
    callback: BodyResponseCallback[SchemaLookupResponse]
  ): Unit = js.native
  def lookup(params: ParamsResourceProjectsLookup, options: MethodOptions): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(
    params: ParamsResourceProjectsLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLookupResponse]
  ): Unit = js.native
  /**
    * datastore.projects.reserveIds
    * @desc Prevents the supplied keys' IDs from being auto-allocated by Cloud
    * Datastore.
    * @alias datastore.projects.reserveIds
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().ReserveIdsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reserveIds(): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(callback: BodyResponseCallback[SchemaReserveIdsResponse]): Unit = js.native
  def reserveIds(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(params: ParamsResourceProjectsReserveids): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(params: ParamsResourceProjectsReserveids, callback: BodyResponseCallback[SchemaReserveIdsResponse]): Unit = js.native
  def reserveIds(
    params: ParamsResourceProjectsReserveids,
    options: BodyResponseCallback[SchemaReserveIdsResponse],
    callback: BodyResponseCallback[SchemaReserveIdsResponse]
  ): Unit = js.native
  def reserveIds(params: ParamsResourceProjectsReserveids, options: MethodOptions): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(
    params: ParamsResourceProjectsReserveids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReserveIdsResponse]
  ): Unit = js.native
  /**
    * datastore.projects.rollback
    * @desc Rolls back a transaction.
    * @alias datastore.projects.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().RollbackRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(callback: BodyResponseCallback[SchemaRollbackResponse]): Unit = js.native
  def rollback(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(params: ParamsResourceProjectsRollback): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(params: ParamsResourceProjectsRollback, callback: BodyResponseCallback[SchemaRollbackResponse]): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsRollback,
    options: BodyResponseCallback[SchemaRollbackResponse],
    callback: BodyResponseCallback[SchemaRollbackResponse]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsRollback, options: MethodOptions): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(
    params: ParamsResourceProjectsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRollbackResponse]
  ): Unit = js.native
  /**
    * datastore.projects.runQuery
    * @desc Queries for entities.
    * @alias datastore.projects.runQuery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().RunQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runQuery(): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(callback: BodyResponseCallback[SchemaRunQueryResponse]): Unit = js.native
  def runQuery(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(params: ParamsResourceProjectsRunquery): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(params: ParamsResourceProjectsRunquery, callback: BodyResponseCallback[SchemaRunQueryResponse]): Unit = js.native
  def runQuery(
    params: ParamsResourceProjectsRunquery,
    options: BodyResponseCallback[SchemaRunQueryResponse],
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
  def runQuery(params: ParamsResourceProjectsRunquery, options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(
    params: ParamsResourceProjectsRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
}

