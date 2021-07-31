package typings.googleapis.spannerV1Mod.spannerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instances$Databases$Sessions")
@js.native
class ResourceProjectsInstancesDatabasesSessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * spanner.projects.instances.databases.sessions.beginTransaction
    * @desc Begins a new transaction. This step can often be skipped: Read,
    * ExecuteSql and Commit can begin a new transaction as a side-effect.
    * @alias spanner.projects.instances.databases.sessions.beginTransaction
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the transaction runs.
    * @param {().BeginTransactionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaTransaction],
    callback: BodyResponseCallback[SchemaTransaction]
  ): Unit = js.native
  def beginTransaction(params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction, options: MethodOptions): GaxiosPromise[SchemaTransaction] = js.native
  def beginTransaction(
    params: ParamsResourceProjectsInstancesDatabasesSessionsBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransaction]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.commit
    * @desc Commits a transaction. The request includes the mutations to be
    * applied to rows in the database.  `Commit` might return an `ABORTED`
    * error. This can occur at any time; commonly, the cause is conflicts with
    * concurrent transactions. However, it can also happen for a variety of
    * other reasons. If `Commit` returns `ABORTED`, the caller should
    * re-attempt the transaction from the beginning, re-using the same session.
    * @alias spanner.projects.instances.databases.sessions.commit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the transaction to be committed is running.
    * @param {().CommitRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaCommitResponse],
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  def commit(params: ParamsResourceProjectsInstancesDatabasesSessionsCommit, options: MethodOptions): GaxiosPromise[SchemaCommitResponse] = js.native
  def commit(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.create
    * @desc Creates a new session. A session can be used to perform
    * transactions that read and/or modify data in a Cloud Spanner database.
    * Sessions are meant to be reused for many consecutive transactions.
    * Sessions can only execute one transaction at a time. To execute multiple
    * concurrent read-write/write-only transactions, create multiple sessions.
    * Note that standalone reads and queries use a transaction internally, and
    * count toward the one transaction limit.  Cloud Spanner limits the number
    * of sessions that can exist at any given time; thus, it is a good idea to
    * delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud
    * Spanner can delete sessions for which no operations are sent for more
    * than an hour. If a session is deleted, requests to it return `NOT_FOUND`.
    * Idle sessions can be kept alive by sending a trivial SQL query
    * periodically, e.g., `"SELECT 1"`.
    * @alias spanner.projects.instances.databases.sessions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database in which the new session is created.
    * @param {().CreateSessionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaSession],
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesDatabasesSessionsCreate, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def create(
    params: ParamsResourceProjectsInstancesDatabasesSessionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.delete
    * @desc Ends a session, releasing server resources associated with it. This
    * will asynchronously trigger cancellation of any operations that are
    * running with this session.
    * @alias spanner.projects.instances.databases.sessions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the session to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesDatabasesSessionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDatabasesSessionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.executeBatchDml
    * @desc Executes a batch of SQL DML statements. This method allows many
    * statements to be run with lower latency than submitting them sequentially
    * with ExecuteSql.  Statements are executed in order, sequentially.
    * ExecuteBatchDmlResponse will contain a ResultSet for each DML statement
    * that has successfully executed. If a statement fails, its error status
    * will be returned as part of the ExecuteBatchDmlResponse. Execution will
    * stop at the first failed statement; the remaining statements will not
    * run.  ExecuteBatchDml is expected to return an OK status with a response
    * even if there was an error while processing one of the DML statements.
    * Clients must inspect response.status to determine if there were any
    * errors while processing the request.  See more details in
    * ExecuteBatchDmlRequest and ExecuteBatchDmlResponse.
    * @alias spanner.projects.instances.databases.sessions.executeBatchDml
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the DML statements should be performed.
    * @param {().ExecuteBatchDmlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaExecuteBatchDmlResponse],
    callback: BodyResponseCallback[SchemaExecuteBatchDmlResponse]
  ): Unit = js.native
  def executeBatchDml(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml, options: MethodOptions): GaxiosPromise[SchemaExecuteBatchDmlResponse] = js.native
  def executeBatchDml(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecuteBatchDmlResponse]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.executeSql
    * @desc Executes an SQL statement, returning all results in a single reply.
    * This method cannot be used to return a result set larger than 10 MiB; if
    * the query yields more data than that, the query fails with a
    * `FAILED_PRECONDITION` error.  Operations inside read-write transactions
    * might return `ABORTED`. If this occurs, the application should restart
    * the transaction from the beginning. See Transaction for more details.
    * Larger result sets can be fetched in streaming fashion by calling
    * ExecuteStreamingSql instead.
    * @alias spanner.projects.instances.databases.sessions.executeSql
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the SQL query should be performed.
    * @param {().ExecuteSqlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaResultSet],
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  def executeSql(params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql, options: MethodOptions): GaxiosPromise[SchemaResultSet] = js.native
  def executeSql(
    params: ParamsResourceProjectsInstancesDatabasesSessionsExecutesql,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.executeStreamingSql
    * @desc Like ExecuteSql, except returns the result set as a stream. Unlike
    * ExecuteSql, there is no limit on the size of the returned result set.
    * However, no individual row in the result set can exceed 100 MiB, and no
    * column value can exceed 10 MiB.
    * @alias spanner.projects.instances.databases.sessions.executeStreamingSql
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the SQL query should be performed.
    * @param {().ExecuteSqlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaPartialResultSet],
    callback: BodyResponseCallback[SchemaPartialResultSet]
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
    * spanner.projects.instances.databases.sessions.get
    * @desc Gets a session. Returns `NOT_FOUND` if the session does not exist.
    * This is mainly useful for determining whether a session is still alive.
    * @alias spanner.projects.instances.databases.sessions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the session to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaSession],
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesDatabasesSessionsGet, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def get(
    params: ParamsResourceProjectsInstancesDatabasesSessionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.list
    * @desc Lists all sessions in a given database.
    * @alias spanner.projects.instances.databases.sessions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database in which to list sessions.
    * @param {string=} params.filter An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are:    * `labels.key` where key is the name of a label  Some examples of using filters are:    * `labels.env:*` --> The session has the label "env".   * `labels.env:dev` --> The session has the label "env" and the value of                        the label contains the string "dev".
    * @param {integer=} params.pageSize Number of sessions to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    * @param {string=} params.pageToken If non-empty, `page_token` should contain a next_page_token from a previous ListSessionsResponse.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaListSessionsResponse],
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesDatabasesSessionsList, options: MethodOptions): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesDatabasesSessionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.partitionQuery
    * @desc Creates a set of partition tokens that can be used to execute a
    * query operation in parallel.  Each of the returned partition tokens can
    * be used by ExecuteStreamingSql to specify a subset of the query result to
    * read.  The same session and read-only transaction must be used by the
    * PartitionQueryRequest used to create the partition tokens and the
    * ExecuteSqlRequests that use the partition tokens.  Partition tokens
    * become invalid when the session used to create them is deleted, is idle
    * for too long, begins a new transaction, or becomes too old.  When any of
    * these happen, it is not possible to resume the query, and the whole
    * operation must be restarted from the beginning.
    * @alias spanner.projects.instances.databases.sessions.partitionQuery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session used to create the partitions.
    * @param {().PartitionQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaPartitionResponse],
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  def partitionQuery(params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery, options: MethodOptions): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionQuery(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.partitionRead
    * @desc Creates a set of partition tokens that can be used to execute a
    * read operation in parallel.  Each of the returned partition tokens can be
    * used by StreamingRead to specify a subset of the read result to read. The
    * same session and read-only transaction must be used by the
    * PartitionReadRequest used to create the partition tokens and the
    * ReadRequests that use the partition tokens.  There are no ordering
    * guarantees on rows returned among the returned partition tokens, or even
    * within each individual StreamingRead call issued with a partition_token.
    * Partition tokens become invalid when the session used to create them is
    * deleted, is idle for too long, begins a new transaction, or becomes too
    * old.  When any of these happen, it is not possible to resume the read,
    * and the whole operation must be restarted from the beginning.
    * @alias spanner.projects.instances.databases.sessions.partitionRead
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session used to create the partitions.
    * @param {().PartitionReadRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaPartitionResponse],
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  def partitionRead(params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread, options: MethodOptions): GaxiosPromise[SchemaPartitionResponse] = js.native
  def partitionRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsPartitionread,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartitionResponse]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.read
    * @desc Reads rows from the database using key lookups and scans, as a
    * simple key/value style alternative to ExecuteSql.  This method cannot be
    * used to return a result set larger than 10 MiB; if the read matches more
    * data than that, the read fails with a `FAILED_PRECONDITION` error.  Reads
    * inside read-write transactions might return `ABORTED`. If this occurs,
    * the application should restart the transaction from the beginning. See
    * Transaction for more details.  Larger result sets can be yielded in
    * streaming fashion by calling StreamingRead instead.
    * @alias spanner.projects.instances.databases.sessions.read
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the read should be performed.
    * @param {().ReadRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaResultSet],
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  def read(params: ParamsResourceProjectsInstancesDatabasesSessionsRead, options: MethodOptions): GaxiosPromise[SchemaResultSet] = js.native
  def read(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRead,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResultSet]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.rollback
    * @desc Rolls back a transaction, releasing any locks it holds. It is a
    * good idea to call this for any transaction that includes one or more Read
    * or ExecuteSql requests and ultimately decides not to commit.  `Rollback`
    * returns `OK` if it successfully aborts the transaction, the transaction
    * was already aborted, or the transaction is not found. `Rollback` never
    * returns `ABORTED`.
    * @alias spanner.projects.instances.databases.sessions.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the transaction to roll back is running.
    * @param {().RollbackRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsInstancesDatabasesSessionsRollback, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def rollback(
    params: ParamsResourceProjectsInstancesDatabasesSessionsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * spanner.projects.instances.databases.sessions.streamingRead
    * @desc Like Read, except returns the result set as a stream. Unlike Read,
    * there is no limit on the size of the returned result set. However, no
    * individual row in the result set can exceed 100 MiB, and no column value
    * can exceed 10 MiB.
    * @alias spanner.projects.instances.databases.sessions.streamingRead
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The session in which the read should be performed.
    * @param {().ReadRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaPartialResultSet],
    callback: BodyResponseCallback[SchemaPartialResultSet]
  ): Unit = js.native
  def streamingRead(params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread, options: MethodOptions): GaxiosPromise[SchemaPartialResultSet] = js.native
  def streamingRead(
    params: ParamsResourceProjectsInstancesDatabasesSessionsStreamingread,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPartialResultSet]
  ): Unit = js.native
}
