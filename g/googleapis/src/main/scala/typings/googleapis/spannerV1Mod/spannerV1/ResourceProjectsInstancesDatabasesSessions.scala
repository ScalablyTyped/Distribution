package typings.googleapis.spannerV1Mod.spannerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instances$Databases$Sessions")
@js.native
open class ResourceProjectsInstancesDatabasesSessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreate(): GaxiosPromise[SchemaBatchCreateSessionsResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaBatchCreateSessionsResponse]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchCreateSessionsResponse] = js.native
  def batchCreate(params: ParamsResourceProjectsInstancesDatabasesSessionsBatchcreate): GaxiosPromise[SchemaBatchCreateSessionsResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBatchcreate,
    callback: BodyResponseCallback[SchemaBatchCreateSessionsResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBatchcreate,
    options: BodyResponseCallback[Readable | SchemaBatchCreateSessionsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchCreateSessionsResponse]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceProjectsInstancesDatabasesSessionsBatchcreate, options: MethodOptions): GaxiosPromise[SchemaBatchCreateSessionsResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchCreateSessionsResponse]
  ): Unit = js.native
  /**
    * Creates multiple new sessions. This API can be used to initialize a session cache on the clients. See https://goo.gl/TgSFN2 for best practices on session cache management.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.batchCreate({
    *     // Required. The database in which the new sessions are created.
    *     database: 'projects/my-project/instances/my-instance/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "sessionCount": 0,
    *       //   "sessionTemplate": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "session": []
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
  def batchCreate(params: ParamsResourceProjectsInstancesDatabasesSessionsBatchcreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchCreate(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBatchcreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def beginTransaction(): GaxiosPromise[SchemaTransaction] = js.native
  def beginTransaction(callback: BodyResponseCallback[SchemaTransaction]): Unit = js.native
  def beginTransaction(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransaction] = js.native
  def beginTransaction(params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction): GaxiosPromise[SchemaTransaction] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction,
    callback: BodyResponseCallback[SchemaTransaction]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction,
    options: BodyResponseCallback[Readable | SchemaTransaction],
    callback: BodyResponseCallback[Readable | SchemaTransaction]
  ): Unit = js.native
  def beginTransaction(params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction, options: MethodOptions): GaxiosPromise[SchemaTransaction] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransaction]
  ): Unit = js.native
  /**
    * Begins a new transaction. This step can often be skipped: Read, ExecuteSql and Commit can begin a new transaction as a side-effect.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await spanner.projects.instances.databases.sessions.beginTransaction({
    *       // Required. The session in which the transaction runs.
    *       session:
    *         'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "options": {},
    *         //   "requestOptions": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "readTimestamp": "my_readTimestamp"
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
  def beginTransaction(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def commit(): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(callback: BodyResponseCallback[SchemaCommitResponse]): Unit = js.native
  def commit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(params: ParamsResourceProjectsInstancesDatabasesSessionsCommit): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCommit,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  def commit(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCommit,
    options: BodyResponseCallback[Readable | SchemaCommitResponse],
    callback: BodyResponseCallback[Readable | SchemaCommitResponse]
  ): Unit = js.native
  def commit(params: ParamsResourceProjectsInstancesDatabasesSessionsCommit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  /**
    * Commits a transaction. The request includes the mutations to be applied to rows in the database. `Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is conflicts with concurrent transactions. However, it can also happen for a variety of other reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the beginning, re-using the same session. On very rare occasions, `Commit` might return `UNKNOWN`. This can happen, for example, if the client job experiences a 1+ hour networking failure. At that point, Cloud Spanner has lost track of the transaction outcome and we recommend that you perform another read from the database to see the state of things as they are now.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.commit({
    *     // Required. The session in which the transaction to be committed is running.
    *     session:
    *       'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "mutations": [],
    *       //   "requestOptions": {},
    *       //   "returnCommitStats": false,
    *       //   "singleUseTransaction": {},
    *       //   "transactionId": "my_transactionId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitStats": {},
    *   //   "commitTimestamp": "my_commitTimestamp"
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
  def commit(params: ParamsResourceProjectsInstancesDatabasesSessionsCommit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def commit(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCommit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSession] = js.native
  def create(callback: BodyResponseCallback[SchemaSession]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def create(params: ParamsResourceProjectsInstancesDatabasesSessionsCreate): GaxiosPromise[SchemaSession] = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCreate,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCreate,
    options: BodyResponseCallback[Readable | SchemaSession],
    callback: BodyResponseCallback[Readable | SchemaSession]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesDatabasesSessionsCreate, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  /**
    * Creates a new session. A session can be used to perform transactions that read and/or modify data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive transactions. Sessions can only execute one transaction at a time. To execute multiple concurrent read-write/write-only transactions, create multiple sessions. Note that standalone reads and queries use a transaction internally, and count toward the one transaction limit. Active sessions use additional server resources, so it is a good idea to delete idle and unneeded sessions. Aside from explicit deletes, Cloud Spanner may delete sessions for which no operations are sent for more than an hour. If a session is deleted, requests to it return `NOT_FOUND`. Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT 1"`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.create({
    *     // Required. The database in which the new session is created.
    *     database: 'projects/my-project/instances/my-instance/databases/my-database',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "session": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approximateLastUseTime": "my_approximateLastUseTime",
    *   //   "createTime": "my_createTime",
    *   //   "creatorRole": "my_creatorRole",
    *   //   "labels": {},
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceProjectsInstancesDatabasesSessionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesDatabasesSessionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDatabasesSessionsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDatabasesSessionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesDatabasesSessionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDatabasesSessionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Ends a session, releasing server resources associated with it. This will asynchronously trigger cancellation of any operations that are running with this session.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.delete({
    *     // Required. The name of the session to delete.
    *     name: 'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
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
  def delete(params: ParamsResourceProjectsInstancesDatabasesSessionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDatabasesSessionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def executeBatchDml(): GaxiosPromise[SchemaExecuteBatchDmlResponse] = js.native
  def executeBatchDml(callback: BodyResponseCallback[SchemaExecuteBatchDmlResponse]): Unit = js.native
  def executeBatchDml(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecuteBatchDmlResponse] = js.native
  def executeBatchDml(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml): GaxiosPromise[SchemaExecuteBatchDmlResponse] = js.native
  def executeBatchDml(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml,
    callback: BodyResponseCallback[SchemaExecuteBatchDmlResponse]
  ): Unit = js.native
  def executeBatchDml(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml,
    options: BodyResponseCallback[Readable | SchemaExecuteBatchDmlResponse],
    callback: BodyResponseCallback[Readable | SchemaExecuteBatchDmlResponse]
  ): Unit = js.native
  def executeBatchDml(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml, options: MethodOptions): GaxiosPromise[SchemaExecuteBatchDmlResponse] = js.native
  def executeBatchDml(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecuteBatchDmlResponse]
  ): Unit = js.native
  /**
    * Executes a batch of SQL DML statements. This method allows many statements to be run with lower latency than submitting them sequentially with ExecuteSql. Statements are executed in sequential order. A request can succeed even if a statement fails. The ExecuteBatchDmlResponse.status field in the response provides information about the statement that failed. Clients must inspect this field to determine whether an error occurred. Execution stops after the first failed statement; the remaining statements are not executed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await spanner.projects.instances.databases.sessions.executeBatchDml({
    *       // Required. The session in which the DML statements should be performed.
    *       session:
    *         'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "requestOptions": {},
    *         //   "seqno": "my_seqno",
    *         //   "statements": [],
    *         //   "transaction": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "resultSets": [],
    *   //   "status": {}
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
  def executeBatchDml(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def executeBatchDml(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def executeSql(): GaxiosPromise[SchemaResultSet] = js.native
  def executeSql(callback: BodyResponseCallback[SchemaResultSet]): Unit = js.native
  def executeSql(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResultSet] = js.native
  def executeSql(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql): GaxiosPromise[SchemaResultSet] = js.native
  def executeSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql,
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  def executeSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql,
    options: BodyResponseCallback[Readable | SchemaResultSet],
    callback: BodyResponseCallback[Readable | SchemaResultSet]
  ): Unit = js.native
  def executeSql(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql, options: MethodOptions): GaxiosPromise[SchemaResultSet] = js.native
  def executeSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  /**
    * Executes an SQL statement, returning all results in a single reply. This method cannot be used to return a result set larger than 10 MiB; if the query yields more data than that, the query fails with a `FAILED_PRECONDITION` error. Operations inside read-write transactions might return `ABORTED`. If this occurs, the application should restart the transaction from the beginning. See Transaction for more details. Larger result sets can be fetched in streaming fashion by calling ExecuteStreamingSql instead.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.executeSql({
    *     // Required. The session in which the SQL query should be performed.
    *     session:
    *       'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "paramTypes": {},
    *       //   "params": {},
    *       //   "partitionToken": "my_partitionToken",
    *       //   "queryMode": "my_queryMode",
    *       //   "queryOptions": {},
    *       //   "requestOptions": {},
    *       //   "resumeToken": "my_resumeToken",
    *       //   "seqno": "my_seqno",
    *       //   "sql": "my_sql",
    *       //   "transaction": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadata": {},
    *   //   "rows": [],
    *   //   "stats": {}
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
  def executeSql(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def executeSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def executeStreamingSql(): GaxiosPromise[SchemaPartialResultSet] = js.native
  def executeStreamingSql(callback: BodyResponseCallback[SchemaPartialResultSet]): Unit = js.native
  def executeStreamingSql(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPartialResultSet] = js.native
  def executeStreamingSql(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutestreamingsql): GaxiosPromise[SchemaPartialResultSet] = js.native
  def executeStreamingSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutestreamingsql,
    callback: BodyResponseCallback[SchemaPartialResultSet]
  ): Unit = js.native
  def executeStreamingSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutestreamingsql,
    options: BodyResponseCallback[Readable | SchemaPartialResultSet],
    callback: BodyResponseCallback[Readable | SchemaPartialResultSet]
  ): Unit = js.native
  def executeStreamingSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutestreamingsql,
    options: MethodOptions
  ): GaxiosPromise[SchemaPartialResultSet] = js.native
  def executeStreamingSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutestreamingsql,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartialResultSet]
  ): Unit = js.native
  /**
    * Like ExecuteSql, except returns the result set as a stream. Unlike ExecuteSql, there is no limit on the size of the returned result set. However, no individual row in the result set can exceed 100 MiB, and no column value can exceed 10 MiB.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await spanner.projects.instances.databases.sessions.executeStreamingSql({
    *       // Required. The session in which the SQL query should be performed.
    *       session:
    *         'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "paramTypes": {},
    *         //   "params": {},
    *         //   "partitionToken": "my_partitionToken",
    *         //   "queryMode": "my_queryMode",
    *         //   "queryOptions": {},
    *         //   "requestOptions": {},
    *         //   "resumeToken": "my_resumeToken",
    *         //   "seqno": "my_seqno",
    *         //   "sql": "my_sql",
    *         //   "transaction": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "chunkedValue": false,
    *   //   "metadata": {},
    *   //   "resumeToken": "my_resumeToken",
    *   //   "stats": {},
    *   //   "values": []
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
  def executeStreamingSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutestreamingsql,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def executeStreamingSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutestreamingsql,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSession] = js.native
  def get(callback: BodyResponseCallback[SchemaSession]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def get(params: ParamsResourceProjectsInstancesDatabasesSessionsGet): GaxiosPromise[SchemaSession] = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesSessionsGet,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesSessionsGet,
    options: BodyResponseCallback[Readable | SchemaSession],
    callback: BodyResponseCallback[Readable | SchemaSession]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesDatabasesSessionsGet, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesSessionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  /**
    * Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for determining whether a session is still alive.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.get({
    *     // Required. The name of the session to retrieve.
    *     name: 'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approximateLastUseTime": "my_approximateLastUseTime",
    *   //   "createTime": "my_createTime",
    *   //   "creatorRole": "my_creatorRole",
    *   //   "labels": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsInstancesDatabasesSessionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesSessionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSessionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesDatabasesSessionsList): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesSessionsList,
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesSessionsList,
    options: BodyResponseCallback[Readable | SchemaListSessionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSessionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesDatabasesSessionsList, options: MethodOptions): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesSessionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  /**
    * Lists all sessions in a given database.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.list({
    *     // Required. The database in which to list sessions.
    *     database: 'projects/my-project/instances/my-instance/databases/my-database',
    *     // An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `labels.key` where key is the name of a label Some examples of using filters are: * `labels.env:*` --\> The session has the label "env". * `labels.env:dev` --\> The session has the label "env" and the value of the label contains the string "dev".
    *     filter: 'placeholder-value',
    *     // Number of sessions to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    *     pageSize: 'placeholder-value',
    *     // If non-empty, `page_token` should contain a next_page_token from a previous ListSessionsResponse.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sessions": []
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
  def list(params: ParamsResourceProjectsInstancesDatabasesSessionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesSessionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def partitionQuery(): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionQuery(callback: BodyResponseCallback[SchemaPartitionResponse]): Unit = js.native
  def partitionQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionQuery(params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionQuery(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery,
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  def partitionQuery(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery,
    options: BodyResponseCallback[Readable | SchemaPartitionResponse],
    callback: BodyResponseCallback[Readable | SchemaPartitionResponse]
  ): Unit = js.native
  def partitionQuery(params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery, options: MethodOptions): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionQuery(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  /**
    * Creates a set of partition tokens that can be used to execute a query operation in parallel. Each of the returned partition tokens can be used by ExecuteStreamingSql to specify a subset of the query result to read. The same session and read-only transaction must be used by the PartitionQueryRequest used to create the partition tokens and the ExecuteSqlRequests that use the partition tokens. Partition tokens become invalid when the session used to create them is deleted, is idle for too long, begins a new transaction, or becomes too old. When any of these happen, it is not possible to resume the query, and the whole operation must be restarted from the beginning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await spanner.projects.instances.databases.sessions.partitionQuery({
    *       // Required. The session used to create the partitions.
    *       session:
    *         'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "paramTypes": {},
    *         //   "params": {},
    *         //   "partitionOptions": {},
    *         //   "sql": "my_sql",
    *         //   "transaction": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "partitions": [],
    *   //   "transaction": {}
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
  def partitionQuery(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def partitionQuery(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def partitionRead(): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionRead(callback: BodyResponseCallback[SchemaPartitionResponse]): Unit = js.native
  def partitionRead(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionRead(params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread,
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  def partitionRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread,
    options: BodyResponseCallback[Readable | SchemaPartitionResponse],
    callback: BodyResponseCallback[Readable | SchemaPartitionResponse]
  ): Unit = js.native
  def partitionRead(params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread, options: MethodOptions): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  /**
    * Creates a set of partition tokens that can be used to execute a read operation in parallel. Each of the returned partition tokens can be used by StreamingRead to specify a subset of the read result to read. The same session and read-only transaction must be used by the PartitionReadRequest used to create the partition tokens and the ReadRequests that use the partition tokens. There are no ordering guarantees on rows returned among the returned partition tokens, or even within each individual StreamingRead call issued with a partition_token. Partition tokens become invalid when the session used to create them is deleted, is idle for too long, begins a new transaction, or becomes too old. When any of these happen, it is not possible to resume the read, and the whole operation must be restarted from the beginning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.partitionRead(
    *     {
    *       // Required. The session used to create the partitions.
    *       session:
    *         'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "columns": [],
    *         //   "index": "my_index",
    *         //   "keySet": {},
    *         //   "partitionOptions": {},
    *         //   "table": "my_table",
    *         //   "transaction": {}
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "partitions": [],
    *   //   "transaction": {}
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
  def partitionRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def partitionRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def read(): GaxiosPromise[SchemaResultSet] = js.native
  def read(callback: BodyResponseCallback[SchemaResultSet]): Unit = js.native
  def read(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResultSet] = js.native
  def read(params: ParamsResourceProjectsInstancesDatabasesSessionsRead): GaxiosPromise[SchemaResultSet] = js.native
  def read(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRead,
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  def read(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRead,
    options: BodyResponseCallback[Readable | SchemaResultSet],
    callback: BodyResponseCallback[Readable | SchemaResultSet]
  ): Unit = js.native
  def read(params: ParamsResourceProjectsInstancesDatabasesSessionsRead, options: MethodOptions): GaxiosPromise[SchemaResultSet] = js.native
  def read(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRead,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  /**
    * Reads rows from the database using key lookups and scans, as a simple key/value style alternative to ExecuteSql. This method cannot be used to return a result set larger than 10 MiB; if the read matches more data than that, the read fails with a `FAILED_PRECONDITION` error. Reads inside read-write transactions might return `ABORTED`. If this occurs, the application should restart the transaction from the beginning. See Transaction for more details. Larger result sets can be yielded in streaming fashion by calling StreamingRead instead.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.read({
    *     // Required. The session in which the read should be performed.
    *     session:
    *       'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "columns": [],
    *       //   "index": "my_index",
    *       //   "keySet": {},
    *       //   "limit": "my_limit",
    *       //   "partitionToken": "my_partitionToken",
    *       //   "requestOptions": {},
    *       //   "resumeToken": "my_resumeToken",
    *       //   "table": "my_table",
    *       //   "transaction": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metadata": {},
    *   //   "rows": [],
    *   //   "stats": {}
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
  def read(params: ParamsResourceProjectsInstancesDatabasesSessionsRead, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def read(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRead,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(params: ParamsResourceProjectsInstancesDatabasesSessionsRollback): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRollback,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRollback,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsInstancesDatabasesSessionsRollback, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any transaction that includes one or more Read or ExecuteSql requests and ultimately decides not to commit. `Rollback` returns `OK` if it successfully aborts the transaction, the transaction was already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.rollback({
    *     // Required. The session in which the transaction to roll back is running.
    *     session:
    *       'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "transactionId": "my_transactionId"
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
  def rollback(params: ParamsResourceProjectsInstancesDatabasesSessionsRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def streamingRead(): GaxiosPromise[SchemaPartialResultSet] = js.native
  def streamingRead(callback: BodyResponseCallback[SchemaPartialResultSet]): Unit = js.native
  def streamingRead(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPartialResultSet] = js.native
  def streamingRead(params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread): GaxiosPromise[SchemaPartialResultSet] = js.native
  def streamingRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread,
    callback: BodyResponseCallback[SchemaPartialResultSet]
  ): Unit = js.native
  def streamingRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread,
    options: BodyResponseCallback[Readable | SchemaPartialResultSet],
    callback: BodyResponseCallback[Readable | SchemaPartialResultSet]
  ): Unit = js.native
  def streamingRead(params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread, options: MethodOptions): GaxiosPromise[SchemaPartialResultSet] = js.native
  def streamingRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartialResultSet]
  ): Unit = js.native
  /**
    * Like Read, except returns the result set as a stream. Unlike Read, there is no limit on the size of the returned result set. However, no individual row in the result set can exceed 100 MiB, and no column value can exceed 10 MiB.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/spanner.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const spanner = google.spanner('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/spanner.data',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await spanner.projects.instances.databases.sessions.streamingRead(
    *     {
    *       // Required. The session in which the read should be performed.
    *       session:
    *         'projects/my-project/instances/my-instance/databases/my-database/sessions/my-session',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "columns": [],
    *         //   "index": "my_index",
    *         //   "keySet": {},
    *         //   "limit": "my_limit",
    *         //   "partitionToken": "my_partitionToken",
    *         //   "requestOptions": {},
    *         //   "resumeToken": "my_resumeToken",
    *         //   "table": "my_table",
    *         //   "transaction": {}
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "chunkedValue": false,
    *   //   "metadata": {},
    *   //   "resumeToken": "my_resumeToken",
    *   //   "stats": {},
    *   //   "values": []
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
  def streamingRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def streamingRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
