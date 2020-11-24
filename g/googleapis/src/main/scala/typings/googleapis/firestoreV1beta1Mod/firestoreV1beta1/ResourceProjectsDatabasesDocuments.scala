package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore/v1beta1", "firestore_v1beta1.Resource$Projects$Databases$Documents")
@js.native
class ResourceProjectsDatabasesDocuments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * firestore.projects.databases.documents.batchGet
    * @desc Gets multiple documents.  Documents returned by this method are not
    * guaranteed to be returned in the same order that they were requested.
    * @alias firestore.projects.databases.documents.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().BatchGetDocumentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetDocumentsResponse]): Unit = js.native
  def batchGet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(params: ParamsResourceProjectsDatabasesDocumentsBatchget): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsDatabasesDocumentsBatchget,
    callback: BodyResponseCallback[SchemaBatchGetDocumentsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsDatabasesDocumentsBatchget,
    options: BodyResponseCallback[SchemaBatchGetDocumentsResponse],
    callback: BodyResponseCallback[SchemaBatchGetDocumentsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsDatabasesDocumentsBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsDatabasesDocumentsBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetDocumentsResponse]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.beginTransaction
    * @desc Starts a new transaction.
    * @alias firestore.projects.databases.documents.beginTransaction
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().BeginTransactionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def beginTransaction(): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(callback: BodyResponseCallback[SchemaBeginTransactionResponse]): Unit = js.native
  def beginTransaction(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(params: ParamsResourceProjectsDatabasesDocumentsBegintransaction): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsDatabasesDocumentsBegintransaction,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsResourceProjectsDatabasesDocumentsBegintransaction,
    options: BodyResponseCallback[SchemaBeginTransactionResponse],
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(params: ParamsResourceProjectsDatabasesDocumentsBegintransaction, options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsDatabasesDocumentsBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.commit
    * @desc Commits a transaction, while optionally updating documents.
    * @alias firestore.projects.databases.documents.commit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().CommitRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def commit(): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(callback: BodyResponseCallback[SchemaCommitResponse]): Unit = js.native
  def commit(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(params: ParamsResourceProjectsDatabasesDocumentsCommit): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsDatabasesDocumentsCommit,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  def commit(
    params: ParamsResourceProjectsDatabasesDocumentsCommit,
    options: BodyResponseCallback[SchemaCommitResponse],
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  def commit(params: ParamsResourceProjectsDatabasesDocumentsCommit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsDatabasesDocumentsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * firestore.projects.databases.documents.createDocument
    * @desc Creates a new document.
    * @alias firestore.projects.databases.documents.createDocument
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collectionId The collection ID, relative to `parent`, to list. For example: `chatrooms`.
    * @param {string=} params.documentId The client-assigned document ID to use for this document.  Optional. If not specified, an ID will be assigned by the service.
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string} params.parent The parent resource. For example: `projects/{project_id}/databases/{database_id}/documents` or `projects/{project_id}/databases/{database_id}/documents/chatrooms/{chatroom_id}`
    * @param {().Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createDocument(): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def createDocument(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(params: ParamsResourceProjectsDatabasesDocumentsCreatedocument): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(
    params: ParamsResourceProjectsDatabasesDocumentsCreatedocument,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def createDocument(
    params: ParamsResourceProjectsDatabasesDocumentsCreatedocument,
    options: BodyResponseCallback[SchemaDocument],
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def createDocument(params: ParamsResourceProjectsDatabasesDocumentsCreatedocument, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(
    params: ParamsResourceProjectsDatabasesDocumentsCreatedocument,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.delete
    * @desc Deletes a document.
    * @alias firestore.projects.databases.documents.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.currentDocument.exists When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    * @param {string=} params.currentDocument.updateTime When set, the target document must exist and have been last updated at that time.
    * @param {string} params.name The resource name of the Document to delete. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatabasesDocumentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesDocumentsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesDocumentsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDatabasesDocumentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesDocumentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.get
    * @desc Gets a single document.
    * @alias firestore.projects.databases.documents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string} params.name The resource name of the Document to get. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * @param {string=} params.readTime Reads the version of the document at the given time. This may not be older than 60 seconds.
    * @param {string=} params.transaction Reads the document in a transaction.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDocument] = js.native
  def get(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(params: ParamsResourceProjectsDatabasesDocumentsGet): GaxiosPromise[SchemaDocument] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesDocumentsGet,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatabasesDocumentsGet,
    options: BodyResponseCallback[SchemaDocument],
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesDocumentsGet, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesDocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.list
    * @desc Lists documents.
    * @alias firestore.projects.databases.documents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collectionId The collection ID, relative to `parent`, to list. For example: `chatrooms` or `messages`.
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string=} params.orderBy The order to sort results by. For example: `priority desc, name`.
    * @param {integer=} params.pageSize The maximum number of documents to return.
    * @param {string=} params.pageToken The `next_page_token` value returned from a previous List request, if any.
    * @param {string} params.parent The parent resource name. In the format: `projects/{project_id}/databases/{database_id}/documents` or `projects/{project_id}/databases/{database_id}/documents/{document_path}`. For example: `projects/my-project/databases/my-database/documents` or `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    * @param {string=} params.readTime Reads documents as they were at the given time. This may not be older than 60 seconds.
    * @param {boolean=} params.showMissing If the list should show missing documents. A missing document is a document that does not exist but has sub-documents. These documents will be returned with a key but will not have fields, Document.create_time, or Document.update_time set.  Requests with `show_missing` may not specify `where` or `order_by`.
    * @param {string=} params.transaction Reads documents in a transaction.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDocumentsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(params: ParamsResourceProjectsDatabasesDocumentsList): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesDocumentsList,
    callback: BodyResponseCallback[SchemaListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatabasesDocumentsList,
    options: BodyResponseCallback[SchemaListDocumentsResponse],
    callback: BodyResponseCallback[SchemaListDocumentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesDocumentsList, options: MethodOptions): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesDocumentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDocumentsResponse]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.listCollectionIds
    * @desc Lists all the collection IDs underneath a document.
    * @alias firestore.projects.databases.documents.listCollectionIds
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent document. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. For example: `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    * @param {().ListCollectionIdsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listCollectionIds(): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(callback: BodyResponseCallback[SchemaListCollectionIdsResponse]): Unit = js.native
  def listCollectionIds(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(params: ParamsResourceProjectsDatabasesDocumentsListcollectionids): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(
    params: ParamsResourceProjectsDatabasesDocumentsListcollectionids,
    callback: BodyResponseCallback[SchemaListCollectionIdsResponse]
  ): Unit = js.native
  def listCollectionIds(
    params: ParamsResourceProjectsDatabasesDocumentsListcollectionids,
    options: BodyResponseCallback[SchemaListCollectionIdsResponse],
    callback: BodyResponseCallback[SchemaListCollectionIdsResponse]
  ): Unit = js.native
  def listCollectionIds(params: ParamsResourceProjectsDatabasesDocumentsListcollectionids, options: MethodOptions): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(
    params: ParamsResourceProjectsDatabasesDocumentsListcollectionids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCollectionIdsResponse]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.listen
    * @desc Listens to changes.
    * @alias firestore.projects.databases.documents.listen
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().ListenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listen(): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(callback: BodyResponseCallback[SchemaListenResponse]): Unit = js.native
  def listen(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(params: ParamsResourceProjectsDatabasesDocumentsListen): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(
    params: ParamsResourceProjectsDatabasesDocumentsListen,
    callback: BodyResponseCallback[SchemaListenResponse]
  ): Unit = js.native
  def listen(
    params: ParamsResourceProjectsDatabasesDocumentsListen,
    options: BodyResponseCallback[SchemaListenResponse],
    callback: BodyResponseCallback[SchemaListenResponse]
  ): Unit = js.native
  def listen(params: ParamsResourceProjectsDatabasesDocumentsListen, options: MethodOptions): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(
    params: ParamsResourceProjectsDatabasesDocumentsListen,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListenResponse]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.patch
    * @desc Updates or inserts a document.
    * @alias firestore.projects.databases.documents.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.currentDocument.exists When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    * @param {string=} params.currentDocument.updateTime When set, the target document must exist and have been last updated at that time.
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string} params.name The resource name of the document, for example `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * @param {string=} params.updateMask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {().Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaDocument] = js.native
  def patch(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def patch(params: ParamsResourceProjectsDatabasesDocumentsPatch): GaxiosPromise[SchemaDocument] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesDocumentsPatch,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesDocumentsPatch,
    options: BodyResponseCallback[SchemaDocument],
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsDatabasesDocumentsPatch, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesDocumentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.rollback
    * @desc Rolls back a transaction.
    * @alias firestore.projects.databases.documents.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().RollbackRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def rollback(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(params: ParamsResourceProjectsDatabasesDocumentsRollback): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(
    params: ParamsResourceProjectsDatabasesDocumentsRollback,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsDatabasesDocumentsRollback,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsDatabasesDocumentsRollback, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(
    params: ParamsResourceProjectsDatabasesDocumentsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.runQuery
    * @desc Runs a query.
    * @alias firestore.projects.databases.documents.runQuery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name. In the format: `projects/{project_id}/databases/{database_id}/documents` or `projects/{project_id}/databases/{database_id}/documents/{document_path}`. For example: `projects/my-project/databases/my-database/documents` or `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    * @param {().RunQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runQuery(): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(callback: BodyResponseCallback[SchemaRunQueryResponse]): Unit = js.native
  def runQuery(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(params: ParamsResourceProjectsDatabasesDocumentsRunquery): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(
    params: ParamsResourceProjectsDatabasesDocumentsRunquery,
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
  def runQuery(
    params: ParamsResourceProjectsDatabasesDocumentsRunquery,
    options: BodyResponseCallback[SchemaRunQueryResponse],
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
  def runQuery(params: ParamsResourceProjectsDatabasesDocumentsRunquery, options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(
    params: ParamsResourceProjectsDatabasesDocumentsRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
  
  /**
    * firestore.projects.databases.documents.write
    * @desc Streams batches of document updates and deletes, in order.
    * @alias firestore.projects.databases.documents.write
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`. This is only required in the first message.
    * @param {().WriteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def write(): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(callback: BodyResponseCallback[SchemaWriteResponse]): Unit = js.native
  def write(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(params: ParamsResourceProjectsDatabasesDocumentsWrite): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(
    params: ParamsResourceProjectsDatabasesDocumentsWrite,
    callback: BodyResponseCallback[SchemaWriteResponse]
  ): Unit = js.native
  def write(
    params: ParamsResourceProjectsDatabasesDocumentsWrite,
    options: BodyResponseCallback[SchemaWriteResponse],
    callback: BodyResponseCallback[SchemaWriteResponse]
  ): Unit = js.native
  def write(params: ParamsResourceProjectsDatabasesDocumentsWrite, options: MethodOptions): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(
    params: ParamsResourceProjectsDatabasesDocumentsWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWriteResponse]
  ): Unit = js.native
}
