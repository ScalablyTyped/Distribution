package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "Database")
@js.native
class Database () extends Options {
  def this(options: Options) = this()
  var conn: js.UndefOr[ODBCConnection] = js.native
  @JSName("connectTimeout")
  var connectTimeout_Database: scala.Double | scala.Null = js.native
  var connected: scala.Boolean = js.native
  @JSName("fetchMode")
  var fetchMode_Database: scala.Double | scala.Null = js.native
  @JSName("odbc")
  var odbc_Database: ODBC = js.native
  @JSName("queue")
  var queue_Database: SimpleQueue | js.Array[_] = js.native
  def beginTransaction(): stdLib.Promise[scala.Unit] = js.native
   // TODO: add types from stream
  def beginTransaction(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def beginTransactionSync(): Database = js.native
  def close(): scala.Unit = js.native
  def close(cb: js.Function2[/* err */ stdLib.Error, /* db */ this.type, _]): scala.Unit = js.native
  def closeSync(): scala.Boolean = js.native
  @JSName("close")
  def close_Promise(): stdLib.Promise[scala.Unit] = js.native
  def columns(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: java.lang.String,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: java.lang.String,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: scala.Null,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: scala.Null,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: java.lang.String,
    schema: scala.Null,
    table: java.lang.String,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: java.lang.String,
    schema: scala.Null,
    table: java.lang.String,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: java.lang.String,
    schema: scala.Null,
    table: scala.Null,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: java.lang.String,
    schema: scala.Null,
    table: scala.Null,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: java.lang.String,
    table: java.lang.String,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: java.lang.String,
    table: java.lang.String,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: java.lang.String,
    table: scala.Null,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: java.lang.String,
    table: scala.Null,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: scala.Null,
    table: java.lang.String,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: scala.Null,
    table: java.lang.String,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: scala.Null,
    table: scala.Null,
    column: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def columns(
    catalog: scala.Null,
    schema: scala.Null,
    table: scala.Null,
    column: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def commitTransaction(): stdLib.Promise[scala.Unit] = js.native
  def commitTransaction(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def commitTransactionSync(): Database = js.native
  def describe(obj: DescribeObject, cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def endTransaction(): stdLib.Promise[scala.Unit] = js.native
  def endTransaction(rollback: scala.Boolean, cb: js.Function2[/* foo */ js.Any, /* bar */ js.Any, _]): js.Any = js.native
  def endTransactionSync(rollback: scala.Boolean): Database = js.native
   // TODO: add types from stream
  def fetchStreamingResults(results: js.Any, stream: js.Any): js.Any = js.native
  def open(connStr: ConnStr): stdLib.Promise[ODBCConnection] = js.native
  def open(
    connStr: ConnStr,
    cb: js.Function2[/* err */ stdLib.Error, /* conn */ js.UndefOr[ODBCConnection], scala.Unit]
  ): scala.Unit = js.native
  def open(connStr: java.lang.String): stdLib.Promise[ODBCConnection] = js.native
  def open(
    connStr: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* conn */ js.UndefOr[ODBCConnection], scala.Unit]
  ): scala.Unit = js.native
  def openSync(connStr: ConnStr): scala.Boolean = js.native
  def openSync(connStr: java.lang.String): scala.Boolean = js.native
  def prepare(sql: java.lang.String): stdLib.Promise[ODBCStatement] = js.native
  def prepare(
    sql: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* stmt */ ODBCStatement, scala.Unit]
  ): scala.Unit = js.native
  def prepareSync(sql: java.lang.String): ODBCStatement = js.native
  def query(query: ibmUnderscoreDbLib.Anon_Sql): stdLib.Promise[js.Array[_]] = js.native
  def query(
    query: ibmUnderscoreDbLib.Anon_Sql,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def query(query: ibmUnderscoreDbLib.Anon_Sql, params: js.Array[_]): stdLib.Promise[js.Array[_]] = js.native
  def query(query: java.lang.String): stdLib.Promise[js.Array[_]] = js.native
  def query(
    query: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def query(query: java.lang.String, params: js.Array[_]): stdLib.Promise[js.Array[_]] = js.native
  def query(
    query: java.lang.String,
    params: js.Array[_],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def queryResult(
    query: ibmUnderscoreDbLib.Anon_Sql,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ ODBCResult, scala.Unit]
  ): scala.Unit = js.native
  def queryResult(query: java.lang.String): stdLib.Promise[ODBCResult] = js.native
  def queryResult(
    query: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ ODBCResult, scala.Unit]
  ): scala.Unit = js.native
  def queryResult(query: java.lang.String, params: js.Array[_]): stdLib.Promise[ODBCResult] = js.native
  def queryResult(
    query: java.lang.String,
    params: js.Array[_],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ ODBCResult, scala.Unit]
  ): scala.Unit = js.native
  def queryResultSync(query: ibmUnderscoreDbLib.Anon_Sql): ODBCResult = js.native
  def queryResultSync(query: ibmUnderscoreDbLib.Anon_Sql, params: js.Array[_]): ODBCResult = js.native
  def queryResultSync(query: java.lang.String): ODBCResult = js.native
  def queryResultSync(query: java.lang.String, params: js.Array[_]): ODBCResult = js.native
  def queryStream(sql: java.lang.String, params: js.Array[_]): js.Any = js.native
  def querySync(query: ibmUnderscoreDbLib.Anon_Sql): js.Array[_] = js.native
  def querySync(query: ibmUnderscoreDbLib.Anon_Sql, params: js.Array[_]): js.Array[_] = js.native
  def querySync(query: java.lang.String): js.Array[_] = js.native
  def querySync(query: java.lang.String, params: js.Array[_]): js.Array[_] = js.native
  def rollbackTransaction(): stdLib.Promise[scala.Unit] = js.native
  def rollbackTransaction(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def rollbackTransactionSync(): Database = js.native
  def setIsolationLevel(isolationLevel: scala.Double): scala.Boolean = js.native
  def tables(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: java.lang.String,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: java.lang.String,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: scala.Null,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: java.lang.String,
    schema: java.lang.String,
    table: scala.Null,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: java.lang.String,
    schema: scala.Null,
    table: java.lang.String,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: java.lang.String,
    schema: scala.Null,
    table: java.lang.String,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: java.lang.String,
    schema: scala.Null,
    table: scala.Null,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: java.lang.String,
    schema: scala.Null,
    table: scala.Null,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: java.lang.String,
    table: java.lang.String,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: java.lang.String,
    table: java.lang.String,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: java.lang.String,
    table: scala.Null,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: java.lang.String,
    table: scala.Null,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: scala.Null,
    table: java.lang.String,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: scala.Null,
    table: java.lang.String,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: scala.Null,
    table: scala.Null,
    `type`: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def tables(
    catalog: scala.Null,
    schema: scala.Null,
    table: scala.Null,
    `type`: scala.Null,
    cb: js.Function2[/* error */ stdLib.Error, /* res */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
}

