package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firestore/v1beta1", "firestore_v1beta1.Resource$Projects$Databases$Documents")
@js.native
open class ResourceProjectsDatabasesDocuments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetDocumentsResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(params: ParamsResourceProjectsDatabasesDocumentsBatchget): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsDatabasesDocumentsBatchget,
    callback: BodyResponseCallback[SchemaBatchGetDocumentsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsDatabasesDocumentsBatchget,
    options: BodyResponseCallback[Readable | SchemaBatchGetDocumentsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetDocumentsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsDatabasesDocumentsBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetDocumentsResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsDatabasesDocumentsBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetDocumentsResponse]
  ): Unit = js.native
  /**
    * Gets multiple documents. Documents returned by this method are not guaranteed to be returned in the same order that they were requested.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.batchGet({
    *     // Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`.
    *     database: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "documents": [],
    *       //   "mask": {},
    *       //   "newTransaction": {},
    *       //   "readTime": "my_readTime",
    *       //   "transaction": "my_transaction"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "found": {},
    *   //   "missing": "my_missing",
    *   //   "readTime": "my_readTime",
    *   //   "transaction": "my_transaction"
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
  def batchGet(params: ParamsResourceProjectsDatabasesDocumentsBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceProjectsDatabasesDocumentsBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchWrite(): GaxiosPromise[SchemaBatchWriteResponse] = js.native
  def batchWrite(callback: BodyResponseCallback[SchemaBatchWriteResponse]): Unit = js.native
  def batchWrite(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchWriteResponse] = js.native
  def batchWrite(params: ParamsResourceProjectsDatabasesDocumentsBatchwrite): GaxiosPromise[SchemaBatchWriteResponse] = js.native
  def batchWrite(
    params: ParamsResourceProjectsDatabasesDocumentsBatchwrite,
    callback: BodyResponseCallback[SchemaBatchWriteResponse]
  ): Unit = js.native
  def batchWrite(
    params: ParamsResourceProjectsDatabasesDocumentsBatchwrite,
    options: BodyResponseCallback[Readable | SchemaBatchWriteResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchWriteResponse]
  ): Unit = js.native
  def batchWrite(params: ParamsResourceProjectsDatabasesDocumentsBatchwrite, options: MethodOptions): GaxiosPromise[SchemaBatchWriteResponse] = js.native
  def batchWrite(
    params: ParamsResourceProjectsDatabasesDocumentsBatchwrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchWriteResponse]
  ): Unit = js.native
  /**
    * Applies a batch of write operations. The BatchWrite method does not apply the write operations atomically and can apply them out of order. Method does not allow more than one write per document. Each write succeeds or fails independently. See the BatchWriteResponse for the success status of each write. If you require an atomically applied set of writes, use Commit instead.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.batchWrite({
    *     // Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`.
    *     database: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labels": {},
    *       //   "writes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "status": [],
    *   //   "writeResults": []
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
  def batchWrite(params: ParamsResourceProjectsDatabasesDocumentsBatchwrite, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchWrite(
    params: ParamsResourceProjectsDatabasesDocumentsBatchwrite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def beginTransaction(): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(callback: BodyResponseCallback[SchemaBeginTransactionResponse]): Unit = js.native
  def beginTransaction(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(params: ParamsResourceProjectsDatabasesDocumentsBegintransaction): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsDatabasesDocumentsBegintransaction,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsResourceProjectsDatabasesDocumentsBegintransaction,
    options: BodyResponseCallback[Readable | SchemaBeginTransactionResponse],
    callback: BodyResponseCallback[Readable | SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(params: ParamsResourceProjectsDatabasesDocumentsBegintransaction, options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsDatabasesDocumentsBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  /**
    * Starts a new transaction.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.beginTransaction({
    *     // Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`.
    *     database: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "options": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "transaction": "my_transaction"
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
  def beginTransaction(params: ParamsResourceProjectsDatabasesDocumentsBegintransaction, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsDatabasesDocumentsBegintransaction,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def commit(): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(callback: BodyResponseCallback[SchemaCommitResponse]): Unit = js.native
  def commit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(params: ParamsResourceProjectsDatabasesDocumentsCommit): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsDatabasesDocumentsCommit,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  def commit(
    params: ParamsResourceProjectsDatabasesDocumentsCommit,
    options: BodyResponseCallback[Readable | SchemaCommitResponse],
    callback: BodyResponseCallback[Readable | SchemaCommitResponse]
  ): Unit = js.native
  def commit(params: ParamsResourceProjectsDatabasesDocumentsCommit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsDatabasesDocumentsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  /**
    * Commits a transaction, while optionally updating documents.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.commit({
    *     // Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`.
    *     database: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "transaction": "my_transaction",
    *       //   "writes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitTime": "my_commitTime",
    *   //   "writeResults": []
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
  def commit(params: ParamsResourceProjectsDatabasesDocumentsCommit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def commit(
    params: ParamsResourceProjectsDatabasesDocumentsCommit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def createDocument(): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def createDocument(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(params: ParamsResourceProjectsDatabasesDocumentsCreatedocument): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(
    params: ParamsResourceProjectsDatabasesDocumentsCreatedocument,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def createDocument(
    params: ParamsResourceProjectsDatabasesDocumentsCreatedocument,
    options: BodyResponseCallback[Readable | SchemaDocument],
    callback: BodyResponseCallback[Readable | SchemaDocument]
  ): Unit = js.native
  def createDocument(params: ParamsResourceProjectsDatabasesDocumentsCreatedocument, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def createDocument(
    params: ParamsResourceProjectsDatabasesDocumentsCreatedocument,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  /**
    * Creates a new document.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.createDocument({
    *     // Required. The collection ID, relative to `parent`, to list. For example: `chatrooms`.
    *     collectionId: 'placeholder-value',
    *     // The client-assigned document ID to use for this document. Optional. If not specified, an ID will be assigned by the service.
    *     documentId: 'placeholder-value',
    *     // The list of field paths in the mask. See Document.fields for a field path syntax reference.
    *     'mask.fieldPaths': 'placeholder-value',
    *     // Required. The parent resource. For example: `projects/{project_id\}/databases/{database_id\}/documents` or `projects/{project_id\}/databases/{database_id\}/documents/chatrooms/{chatroom_id\}`
    *     parent: 'projects/my-project/databases/my-database/documents/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "fields": {},
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "fields": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def createDocument(params: ParamsResourceProjectsDatabasesDocumentsCreatedocument, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createDocument(
    params: ParamsResourceProjectsDatabasesDocumentsCreatedocument,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDatabasesDocumentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesDocumentsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesDocumentsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDatabasesDocumentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesDocumentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a document.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.delete({
    *     // When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    *     'currentDocument.exists': 'placeholder-value',
    *     // When set, the target document must exist and have been last updated at that time. Timestamp must be microsecond aligned.
    *     'currentDocument.updateTime': 'placeholder-value',
    *     // Required. The resource name of the Document to delete. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    *     name: 'projects/my-project/databases/my-database/documents/my-document/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsDatabasesDocumentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDatabasesDocumentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDocument] = js.native
  def get(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(params: ParamsResourceProjectsDatabasesDocumentsGet): GaxiosPromise[SchemaDocument] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesDocumentsGet,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatabasesDocumentsGet,
    options: BodyResponseCallback[Readable | SchemaDocument],
    callback: BodyResponseCallback[Readable | SchemaDocument]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatabasesDocumentsGet, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesDocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  /**
    * Gets a single document.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.get({
    *     // The list of field paths in the mask. See Document.fields for a field path syntax reference.
    *     'mask.fieldPaths': 'placeholder-value',
    *     // Required. The resource name of the Document to get. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    *     name: 'projects/my-project/databases/my-database/documents/my-document/.*',
    *     // Reads the version of the document at the given time. This may not be older than 270 seconds.
    *     readTime: 'placeholder-value',
    *     // Reads the document in a transaction.
    *     transaction: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "fields": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsDatabasesDocumentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatabasesDocumentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDocumentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(params: ParamsResourceProjectsDatabasesDocumentsList): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesDocumentsList,
    callback: BodyResponseCallback[SchemaListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatabasesDocumentsList,
    options: BodyResponseCallback[Readable | SchemaListDocumentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDocumentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatabasesDocumentsList, options: MethodOptions): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesDocumentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDocumentsResponse]
  ): Unit = js.native
  /**
    * Lists documents.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.list({
    *     // Required. The collection ID, relative to `parent`, to list. For example: `chatrooms` or `messages`.
    *     collectionId: 'placeholder-value',
    *     // The list of field paths in the mask. See Document.fields for a field path syntax reference.
    *     'mask.fieldPaths': 'placeholder-value',
    *     // The order to sort results by. For example: `priority desc, name`.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of documents to return.
    *     pageSize: 'placeholder-value',
    *     // The `next_page_token` value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name. In the format: `projects/{project_id\}/databases/{database_id\}/documents` or `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`. For example: `projects/my-project/databases/my-database/documents` or `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    *     parent:
    *       'projects/my-project/databases/my-database/documents/my-document/.*',
    *     // Reads documents as they were at the given time. This may not be older than 270 seconds.
    *     readTime: 'placeholder-value',
    *     // If the list should show missing documents. A missing document is a document that does not exist but has sub-documents. These documents will be returned with a key but will not have fields, Document.create_time, or Document.update_time set. Requests with `show_missing` may not specify `where` or `order_by`.
    *     showMissing: 'placeholder-value',
    *     // Reads documents in a transaction.
    *     transaction: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documents": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsDatabasesDocumentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDatabasesDocumentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listCollectionIds(): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(callback: BodyResponseCallback[SchemaListCollectionIdsResponse]): Unit = js.native
  def listCollectionIds(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(params: ParamsResourceProjectsDatabasesDocumentsListcollectionids): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(
    params: ParamsResourceProjectsDatabasesDocumentsListcollectionids,
    callback: BodyResponseCallback[SchemaListCollectionIdsResponse]
  ): Unit = js.native
  def listCollectionIds(
    params: ParamsResourceProjectsDatabasesDocumentsListcollectionids,
    options: BodyResponseCallback[Readable | SchemaListCollectionIdsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCollectionIdsResponse]
  ): Unit = js.native
  def listCollectionIds(params: ParamsResourceProjectsDatabasesDocumentsListcollectionids, options: MethodOptions): GaxiosPromise[SchemaListCollectionIdsResponse] = js.native
  def listCollectionIds(
    params: ParamsResourceProjectsDatabasesDocumentsListcollectionids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCollectionIdsResponse]
  ): Unit = js.native
  /**
    * Lists all the collection IDs underneath a document.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.listCollectionIds({
    *     // Required. The parent document. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`. For example: `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    *     parent:
    *       'projects/my-project/databases/my-database/documents/my-document/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "readTime": "my_readTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "collectionIds": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def listCollectionIds(params: ParamsResourceProjectsDatabasesDocumentsListcollectionids, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listCollectionIds(
    params: ParamsResourceProjectsDatabasesDocumentsListcollectionids,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listDocuments(): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def listDocuments(callback: BodyResponseCallback[SchemaListDocumentsResponse]): Unit = js.native
  def listDocuments(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def listDocuments(params: ParamsResourceProjectsDatabasesDocumentsListdocuments): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def listDocuments(
    params: ParamsResourceProjectsDatabasesDocumentsListdocuments,
    callback: BodyResponseCallback[SchemaListDocumentsResponse]
  ): Unit = js.native
  def listDocuments(
    params: ParamsResourceProjectsDatabasesDocumentsListdocuments,
    options: BodyResponseCallback[Readable | SchemaListDocumentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDocumentsResponse]
  ): Unit = js.native
  def listDocuments(params: ParamsResourceProjectsDatabasesDocumentsListdocuments, options: MethodOptions): GaxiosPromise[SchemaListDocumentsResponse] = js.native
  def listDocuments(
    params: ParamsResourceProjectsDatabasesDocumentsListdocuments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDocumentsResponse]
  ): Unit = js.native
  /**
    * Lists documents.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.listDocuments({
    *     // Required. The collection ID, relative to `parent`, to list. For example: `chatrooms` or `messages`.
    *     collectionId: 'placeholder-value',
    *     // The list of field paths in the mask. See Document.fields for a field path syntax reference.
    *     'mask.fieldPaths': 'placeholder-value',
    *     // The order to sort results by. For example: `priority desc, name`.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of documents to return.
    *     pageSize: 'placeholder-value',
    *     // The `next_page_token` value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name. In the format: `projects/{project_id\}/databases/{database_id\}/documents` or `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`. For example: `projects/my-project/databases/my-database/documents` or `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    *     parent: 'projects/my-project/databases/my-database/documents',
    *     // Reads documents as they were at the given time. This may not be older than 270 seconds.
    *     readTime: 'placeholder-value',
    *     // If the list should show missing documents. A missing document is a document that does not exist but has sub-documents. These documents will be returned with a key but will not have fields, Document.create_time, or Document.update_time set. Requests with `show_missing` may not specify `where` or `order_by`.
    *     showMissing: 'placeholder-value',
    *     // Reads documents in a transaction.
    *     transaction: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documents": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def listDocuments(params: ParamsResourceProjectsDatabasesDocumentsListdocuments, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listDocuments(
    params: ParamsResourceProjectsDatabasesDocumentsListdocuments,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listen(): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(callback: BodyResponseCallback[SchemaListenResponse]): Unit = js.native
  def listen(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(params: ParamsResourceProjectsDatabasesDocumentsListen): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(
    params: ParamsResourceProjectsDatabasesDocumentsListen,
    callback: BodyResponseCallback[SchemaListenResponse]
  ): Unit = js.native
  def listen(
    params: ParamsResourceProjectsDatabasesDocumentsListen,
    options: BodyResponseCallback[Readable | SchemaListenResponse],
    callback: BodyResponseCallback[Readable | SchemaListenResponse]
  ): Unit = js.native
  def listen(params: ParamsResourceProjectsDatabasesDocumentsListen, options: MethodOptions): GaxiosPromise[SchemaListenResponse] = js.native
  def listen(
    params: ParamsResourceProjectsDatabasesDocumentsListen,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListenResponse]
  ): Unit = js.native
  /**
    * Listens to changes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.listen({
    *     // Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`.
    *     database: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addTarget": {},
    *       //   "labels": {},
    *       //   "removeTarget": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documentChange": {},
    *   //   "documentDelete": {},
    *   //   "documentRemove": {},
    *   //   "filter": {},
    *   //   "targetChange": {}
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
  def listen(params: ParamsResourceProjectsDatabasesDocumentsListen, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listen(
    params: ParamsResourceProjectsDatabasesDocumentsListen,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def partitionQuery(): GaxiosPromise[SchemaPartitionQueryResponse] = js.native
  def partitionQuery(callback: BodyResponseCallback[SchemaPartitionQueryResponse]): Unit = js.native
  def partitionQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPartitionQueryResponse] = js.native
  def partitionQuery(params: ParamsResourceProjectsDatabasesDocumentsPartitionquery): GaxiosPromise[SchemaPartitionQueryResponse] = js.native
  def partitionQuery(
    params: ParamsResourceProjectsDatabasesDocumentsPartitionquery,
    callback: BodyResponseCallback[SchemaPartitionQueryResponse]
  ): Unit = js.native
  def partitionQuery(
    params: ParamsResourceProjectsDatabasesDocumentsPartitionquery,
    options: BodyResponseCallback[Readable | SchemaPartitionQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaPartitionQueryResponse]
  ): Unit = js.native
  def partitionQuery(params: ParamsResourceProjectsDatabasesDocumentsPartitionquery, options: MethodOptions): GaxiosPromise[SchemaPartitionQueryResponse] = js.native
  def partitionQuery(
    params: ParamsResourceProjectsDatabasesDocumentsPartitionquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartitionQueryResponse]
  ): Unit = js.native
  /**
    * Partitions a query by returning partition cursors that can be used to run the query in parallel. The returned partition cursors are split points that can be used by RunQuery as starting/end points for the query results.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.partitionQuery({
    *     // Required. The parent resource name. In the format: `projects/{project_id\}/databases/{database_id\}/documents`. Document resource names are not supported; only database resource names can be specified.
    *     parent:
    *       'projects/my-project/databases/my-database/documents/my-document/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "partitionCount": "my_partitionCount",
    *       //   "readTime": "my_readTime",
    *       //   "structuredQuery": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "partitions": []
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
  def partitionQuery(params: ParamsResourceProjectsDatabasesDocumentsPartitionquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def partitionQuery(
    params: ParamsResourceProjectsDatabasesDocumentsPartitionquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDocument] = js.native
  def patch(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def patch(params: ParamsResourceProjectsDatabasesDocumentsPatch): GaxiosPromise[SchemaDocument] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesDocumentsPatch,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesDocumentsPatch,
    options: BodyResponseCallback[Readable | SchemaDocument],
    callback: BodyResponseCallback[Readable | SchemaDocument]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsDatabasesDocumentsPatch, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesDocumentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  /**
    * Updates or inserts a document.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.patch({
    *     // When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    *     'currentDocument.exists': 'placeholder-value',
    *     // When set, the target document must exist and have been last updated at that time. Timestamp must be microsecond aligned.
    *     'currentDocument.updateTime': 'placeholder-value',
    *     // The list of field paths in the mask. See Document.fields for a field path syntax reference.
    *     'mask.fieldPaths': 'placeholder-value',
    *     // The resource name of the document, for example `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    *     name: 'projects/my-project/databases/my-database/documents/my-document/.*',
    *     // The list of field paths in the mask. See Document.fields for a field path syntax reference.
    *     'updateMask.fieldPaths': 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "fields": {},
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "fields": {},
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsDatabasesDocumentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsDatabasesDocumentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(params: ParamsResourceProjectsDatabasesDocumentsRollback): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(
    params: ParamsResourceProjectsDatabasesDocumentsRollback,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsDatabasesDocumentsRollback,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsDatabasesDocumentsRollback, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(
    params: ParamsResourceProjectsDatabasesDocumentsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Rolls back a transaction.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.rollback({
    *     // Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`.
    *     database: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "transaction": "my_transaction"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def rollback(params: ParamsResourceProjectsDatabasesDocumentsRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsDatabasesDocumentsRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runQuery(): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(callback: BodyResponseCallback[SchemaRunQueryResponse]): Unit = js.native
  def runQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(params: ParamsResourceProjectsDatabasesDocumentsRunquery): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(
    params: ParamsResourceProjectsDatabasesDocumentsRunquery,
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
  def runQuery(
    params: ParamsResourceProjectsDatabasesDocumentsRunquery,
    options: BodyResponseCallback[Readable | SchemaRunQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaRunQueryResponse]
  ): Unit = js.native
  def runQuery(params: ParamsResourceProjectsDatabasesDocumentsRunquery, options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(
    params: ParamsResourceProjectsDatabasesDocumentsRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
  /**
    * Runs a query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.runQuery({
    *     // Required. The parent resource name. In the format: `projects/{project_id\}/databases/{database_id\}/documents` or `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`. For example: `projects/my-project/databases/my-database/documents` or `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    *     parent:
    *       'projects/my-project/databases/my-database/documents/my-document/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "newTransaction": {},
    *       //   "readTime": "my_readTime",
    *       //   "structuredQuery": {},
    *       //   "transaction": "my_transaction"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "document": {},
    *   //   "done": false,
    *   //   "readTime": "my_readTime",
    *   //   "skippedResults": 0,
    *   //   "transaction": "my_transaction"
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
  def runQuery(params: ParamsResourceProjectsDatabasesDocumentsRunquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runQuery(
    params: ParamsResourceProjectsDatabasesDocumentsRunquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def write(): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(callback: BodyResponseCallback[SchemaWriteResponse]): Unit = js.native
  def write(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(params: ParamsResourceProjectsDatabasesDocumentsWrite): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(
    params: ParamsResourceProjectsDatabasesDocumentsWrite,
    callback: BodyResponseCallback[SchemaWriteResponse]
  ): Unit = js.native
  def write(
    params: ParamsResourceProjectsDatabasesDocumentsWrite,
    options: BodyResponseCallback[Readable | SchemaWriteResponse],
    callback: BodyResponseCallback[Readable | SchemaWriteResponse]
  ): Unit = js.native
  def write(params: ParamsResourceProjectsDatabasesDocumentsWrite, options: MethodOptions): GaxiosPromise[SchemaWriteResponse] = js.native
  def write(
    params: ParamsResourceProjectsDatabasesDocumentsWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWriteResponse]
  ): Unit = js.native
  /**
    * Streams batches of document updates and deletes, in order.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firestore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/datastore',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firestore.projects.databases.documents.write({
    *     // Required. The database name. In the format: `projects/{project_id\}/databases/{database_id\}`. This is only required in the first message.
    *     database: 'projects/my-project/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labels": {},
    *       //   "streamId": "my_streamId",
    *       //   "streamToken": "my_streamToken",
    *       //   "writes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitTime": "my_commitTime",
    *   //   "streamId": "my_streamId",
    *   //   "streamToken": "my_streamToken",
    *   //   "writeResults": []
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
  def write(params: ParamsResourceProjectsDatabasesDocumentsWrite, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def write(
    params: ParamsResourceProjectsDatabasesDocumentsWrite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
