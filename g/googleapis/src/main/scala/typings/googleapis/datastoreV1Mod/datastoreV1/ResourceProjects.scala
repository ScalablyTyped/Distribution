package typings.googleapis.datastoreV1Mod.datastoreV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datastore/v1", "datastore_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def allocateIds(): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(callback: BodyResponseCallback[SchemaAllocateIdsResponse]): Unit = js.native
  def allocateIds(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(params: ParamsResourceProjectsAllocateids): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(
    params: ParamsResourceProjectsAllocateids,
    callback: BodyResponseCallback[SchemaAllocateIdsResponse]
  ): Unit = js.native
  def allocateIds(
    params: ParamsResourceProjectsAllocateids,
    options: BodyResponseCallback[Readable | SchemaAllocateIdsResponse],
    callback: BodyResponseCallback[Readable | SchemaAllocateIdsResponse]
  ): Unit = js.native
  def allocateIds(params: ParamsResourceProjectsAllocateids, options: MethodOptions): GaxiosPromise[SchemaAllocateIdsResponse] = js.native
  def allocateIds(
    params: ParamsResourceProjectsAllocateids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAllocateIdsResponse]
  ): Unit = js.native
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity before it is inserted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.allocateIds({
    *     // Required. The ID of the project against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "databaseId": "my_databaseId",
    *       //   "keys": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "keys": []
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
  def allocateIds(params: ParamsResourceProjectsAllocateids, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def allocateIds(
    params: ParamsResourceProjectsAllocateids,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def beginTransaction(): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(callback: BodyResponseCallback[SchemaBeginTransactionResponse]): Unit = js.native
  def beginTransaction(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(params: ParamsResourceProjectsBegintransaction): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsBegintransaction,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsResourceProjectsBegintransaction,
    options: BodyResponseCallback[Readable | SchemaBeginTransactionResponse],
    callback: BodyResponseCallback[Readable | SchemaBeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(params: ParamsResourceProjectsBegintransaction, options: MethodOptions): GaxiosPromise[SchemaBeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBeginTransactionResponse]
  ): Unit = js.native
  /**
    * Begins a new transaction.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.beginTransaction({
    *     // Required. The ID of the project against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "databaseId": "my_databaseId",
    *       //   "transactionOptions": {}
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
  def beginTransaction(params: ParamsResourceProjectsBegintransaction, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsBegintransaction,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def commit(): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(callback: BodyResponseCallback[SchemaCommitResponse]): Unit = js.native
  def commit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(params: ParamsResourceProjectsCommit): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(params: ParamsResourceProjectsCommit, callback: BodyResponseCallback[SchemaCommitResponse]): Unit = js.native
  def commit(
    params: ParamsResourceProjectsCommit,
    options: BodyResponseCallback[Readable | SchemaCommitResponse],
    callback: BodyResponseCallback[Readable | SchemaCommitResponse]
  ): Unit = js.native
  def commit(params: ParamsResourceProjectsCommit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  /**
    * Commits a transaction, optionally creating, deleting or modifying some entities.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.commit({
    *     // Required. The ID of the project against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "databaseId": "my_databaseId",
    *       //   "mode": "my_mode",
    *       //   "mutations": [],
    *       //   "transaction": "my_transaction"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitTime": "my_commitTime",
    *   //   "indexUpdates": 0,
    *   //   "mutationResults": []
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
  def commit(params: ParamsResourceProjectsCommit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def commit(
    params: ParamsResourceProjectsCommit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def `export`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(params: ParamsResourceProjectsExport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsExport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsExport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsExport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Exports a copy of all or a subset of entities from Google Cloud Datastore to another storage system, such as Google Cloud Storage. Recent updates to entities may not be reflected in the export. The export occurs in the background and its progress can be monitored and managed via the Operation resource that is created. The output of an export may only be used once the associated operation is done. If an export operation is cancelled before completion it may leave partial data behind in Google Cloud Storage.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.export({
    *     // Required. Project ID against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entityFilter": {},
    *       //   "labels": {},
    *       //   "outputUrlPrefix": "my_outputUrlPrefix"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def `export`(params: ParamsResourceProjectsExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceProjectsExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Imports entities into Google Cloud Datastore. Existing entities with the same key are overwritten. The import occurs in the background and its progress can be monitored and managed via the Operation resource that is created. If an ImportEntities operation is cancelled, it is possible that a subset of the data has already been imported to Cloud Datastore.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.import({
    *     // Required. Project ID against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entityFilter": {},
    *       //   "inputUrl": "my_inputUrl",
    *       //   "labels": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def `import`(params: ParamsResourceProjectsImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var indexes: ResourceProjectsIndexes = js.native
  
  def lookup(): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(callback: BodyResponseCallback[SchemaLookupResponse]): Unit = js.native
  def lookup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(params: ParamsResourceProjectsLookup): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(params: ParamsResourceProjectsLookup, callback: BodyResponseCallback[SchemaLookupResponse]): Unit = js.native
  def lookup(
    params: ParamsResourceProjectsLookup,
    options: BodyResponseCallback[Readable | SchemaLookupResponse],
    callback: BodyResponseCallback[Readable | SchemaLookupResponse]
  ): Unit = js.native
  def lookup(params: ParamsResourceProjectsLookup, options: MethodOptions): GaxiosPromise[SchemaLookupResponse] = js.native
  def lookup(
    params: ParamsResourceProjectsLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLookupResponse]
  ): Unit = js.native
  /**
    * Looks up entities by key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.lookup({
    *     // Required. The ID of the project against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "databaseId": "my_databaseId",
    *       //   "keys": [],
    *       //   "readOptions": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deferred": [],
    *   //   "found": [],
    *   //   "missing": [],
    *   //   "readTime": "my_readTime"
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
  def lookup(params: ParamsResourceProjectsLookup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lookup(
    params: ParamsResourceProjectsLookup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsOperations = js.native
  
  def reserveIds(): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(callback: BodyResponseCallback[SchemaReserveIdsResponse]): Unit = js.native
  def reserveIds(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(params: ParamsResourceProjectsReserveids): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(params: ParamsResourceProjectsReserveids, callback: BodyResponseCallback[SchemaReserveIdsResponse]): Unit = js.native
  def reserveIds(
    params: ParamsResourceProjectsReserveids,
    options: BodyResponseCallback[Readable | SchemaReserveIdsResponse],
    callback: BodyResponseCallback[Readable | SchemaReserveIdsResponse]
  ): Unit = js.native
  def reserveIds(params: ParamsResourceProjectsReserveids, options: MethodOptions): GaxiosPromise[SchemaReserveIdsResponse] = js.native
  def reserveIds(
    params: ParamsResourceProjectsReserveids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReserveIdsResponse]
  ): Unit = js.native
  /**
    * Prevents the supplied keys' IDs from being auto-allocated by Cloud Datastore.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.reserveIds({
    *     // Required. The ID of the project against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "databaseId": "my_databaseId",
    *       //   "keys": []
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
  def reserveIds(params: ParamsResourceProjectsReserveids, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reserveIds(
    params: ParamsResourceProjectsReserveids,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(callback: BodyResponseCallback[SchemaRollbackResponse]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(params: ParamsResourceProjectsRollback): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(params: ParamsResourceProjectsRollback, callback: BodyResponseCallback[SchemaRollbackResponse]): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsRollback,
    options: BodyResponseCallback[Readable | SchemaRollbackResponse],
    callback: BodyResponseCallback[Readable | SchemaRollbackResponse]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsRollback, options: MethodOptions): GaxiosPromise[SchemaRollbackResponse] = js.native
  def rollback(
    params: ParamsResourceProjectsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRollbackResponse]
  ): Unit = js.native
  /**
    * Rolls back a transaction.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.rollback({
    *     // Required. The ID of the project against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "databaseId": "my_databaseId",
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
  def rollback(params: ParamsResourceProjectsRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runQuery(): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(callback: BodyResponseCallback[SchemaRunQueryResponse]): Unit = js.native
  def runQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(params: ParamsResourceProjectsRunquery): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(params: ParamsResourceProjectsRunquery, callback: BodyResponseCallback[SchemaRunQueryResponse]): Unit = js.native
  def runQuery(
    params: ParamsResourceProjectsRunquery,
    options: BodyResponseCallback[Readable | SchemaRunQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaRunQueryResponse]
  ): Unit = js.native
  def runQuery(params: ParamsResourceProjectsRunquery, options: MethodOptions): GaxiosPromise[SchemaRunQueryResponse] = js.native
  def runQuery(
    params: ParamsResourceProjectsRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunQueryResponse]
  ): Unit = js.native
  /**
    * Queries for entities.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastore.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastore = google.datastore('v1');
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
    *   const res = await datastore.projects.runQuery({
    *     // Required. The ID of the project against which to make the request.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "databaseId": "my_databaseId",
    *       //   "gqlQuery": {},
    *       //   "partitionId": {},
    *       //   "query": {},
    *       //   "readOptions": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "batch": {},
    *   //   "query": {}
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
  def runQuery(params: ParamsResourceProjectsRunquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runQuery(
    params: ParamsResourceProjectsRunquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
