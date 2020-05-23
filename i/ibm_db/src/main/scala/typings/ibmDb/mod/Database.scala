package typings.ibmDb.mod

import typings.ibmDb.anon.Params
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "Database")
@js.native
class Database () extends Options {
  def this(options: Options) = this()
  var conn: js.UndefOr[ODBCConnection] = js.native
  @JSName("connectTimeout")
  var connectTimeout_Database: Double | Null = js.native
  @JSName("connected")
  var connected_Database: Boolean = js.native
  @JSName("fetchMode")
  var fetchMode_Database: Double | Null = js.native
  @JSName("odbc")
  var odbc_Database: ODBC = js.native
  @JSName("queue")
  var queue_Database: SimpleQueue | js.Array[_] = js.native
  def beginTransaction(): js.Promise[Unit] = js.native
   // TODO: add types from stream
  def beginTransaction(cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def beginTransactionSync(): Database = js.native
  def close(): Unit = js.native
  def close(cb: js.Function2[/* err */ Error, /* db */ this.type, _]): Unit = js.native
  def closeSync(): Boolean = js.native
  @JSName("close")
  def close_Promise(): js.Promise[Unit] = js.native
  def columns(
    catalog: String,
    schema: String,
    table: String,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: String,
    schema: String,
    table: String,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: String,
    schema: String,
    table: Null,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: String,
    schema: String,
    table: Null,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: String,
    schema: Null,
    table: String,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: String,
    schema: Null,
    table: String,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: String,
    schema: Null,
    table: Null,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: String,
    schema: Null,
    table: Null,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: String,
    table: String,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: String,
    table: String,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: String,
    table: Null,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: String,
    table: Null,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: Null,
    table: String,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: Null,
    table: String,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: Null,
    table: Null,
    column: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def columns(
    catalog: Null,
    schema: Null,
    table: Null,
    column: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def commitTransaction(): js.Promise[Unit] = js.native
  def commitTransaction(cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def commitTransactionSync(): Database = js.native
  def describe(obj: DescribeObject, cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
  def endTransaction(): js.Promise[Unit] = js.native
  def endTransaction(rollback: Boolean, cb: js.Function2[/* foo */ js.Any, /* bar */ js.Any, _]): js.Any = js.native
  def endTransactionSync(rollback: Boolean): Database = js.native
   // TODO: add types from stream
  def fetchStreamingResults(results: js.Any, stream: js.Any): js.Any = js.native
  def open(connStr: String): js.Promise[ODBCConnection] = js.native
  def open(connStr: String, cb: js.Function2[/* err */ Error, /* conn */ js.UndefOr[ODBCConnection], Unit]): Unit = js.native
  def open(connStr: ConnStr): js.Promise[ODBCConnection] = js.native
  def open(connStr: ConnStr, cb: js.Function2[/* err */ Error, /* conn */ js.UndefOr[ODBCConnection], Unit]): Unit = js.native
  def openSync(connStr: String): Boolean = js.native
  def openSync(connStr: ConnStr): Boolean = js.native
  def prepare(sql: String): js.Promise[ODBCStatement] = js.native
  def prepare(sql: String, cb: js.Function2[/* err */ Error, /* stmt */ ODBCStatement, Unit]): Unit = js.native
  def prepareSync(sql: String): ODBCStatement = js.native
  def query(query: String): js.Promise[js.Array[_]] = js.native
  def query(query: String, cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
  def query(query: String, params: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def query(query: String, params: js.Array[_], cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
  def query(query: Params): js.Promise[js.Array[_]] = js.native
  def query(query: Params, cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
  def query(query: Params, params: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def queryResult(query: String): js.Promise[ODBCResult] = js.native
  def queryResult(query: String, cb: js.Function2[/* err */ Error, /* res */ ODBCResult, Unit]): Unit = js.native
  def queryResult(query: String, params: js.Array[_]): js.Promise[ODBCResult] = js.native
  def queryResult(query: String, params: js.Array[_], cb: js.Function2[/* err */ Error, /* res */ ODBCResult, Unit]): Unit = js.native
  def queryResult(query: Params, cb: js.Function2[/* err */ Error, /* res */ ODBCResult, Unit]): Unit = js.native
  def queryResultSync(query: String): ODBCResult = js.native
  def queryResultSync(query: String, params: js.Array[_]): ODBCResult = js.native
  def queryResultSync(query: Params): ODBCResult = js.native
  def queryResultSync(query: Params, params: js.Array[_]): ODBCResult = js.native
  def queryStream(sql: String, params: js.Array[_]): js.Any = js.native
  def querySync(query: String): js.Array[_] = js.native
  def querySync(query: String, params: js.Array[_]): js.Array[_] = js.native
  def querySync(query: Params): js.Array[_] = js.native
  def querySync(query: Params, params: js.Array[_]): js.Array[_] = js.native
  def rollbackTransaction(): js.Promise[Unit] = js.native
  def rollbackTransaction(cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def rollbackTransactionSync(): Database = js.native
  def setIsolationLevel(isolationLevel: Double): Boolean = js.native
  def tables(
    catalog: String,
    schema: String,
    table: String,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: String,
    schema: String,
    table: String,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: String,
    schema: String,
    table: Null,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: String,
    schema: String,
    table: Null,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: String,
    schema: Null,
    table: String,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: String,
    schema: Null,
    table: String,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: String,
    schema: Null,
    table: Null,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: String,
    schema: Null,
    table: Null,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: String,
    table: String,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: String,
    table: String,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: String,
    table: Null,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: String,
    table: Null,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: Null,
    table: String,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: Null,
    table: String,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: Null,
    table: Null,
    `type`: String,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
  def tables(
    catalog: Null,
    schema: Null,
    table: Null,
    `type`: Null,
    cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]
  ): Unit = js.native
}

