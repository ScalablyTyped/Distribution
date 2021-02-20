package typings.ibmDb

import typings.ibmDb.anon.Outparams
import typings.ibmDb.anon.Params
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ibm_db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ibm_db", JSImport.Default)
  @js.native
  def default(): Database = js.native
  @JSImport("ibm_db", JSImport.Default)
  @js.native
  def default(options: Options): Database = js.native
  
  @JSImport("ibm_db", "Database")
  @js.native
  class Database () extends Options {
    def this(options: Options) = this()
    
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
    
    var conn: js.UndefOr[ODBCConnection] = js.native
    
    @JSName("connectTimeout")
    var connectTimeout_Database: Double | Null = js.native
    
    @JSName("connected")
    var connected_Database: Boolean = js.native
    
    def describe(obj: DescribeObject, cb: js.Function2[/* error */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
    
    def endTransaction(): js.Promise[Unit] = js.native
    def endTransaction(rollback: Boolean, cb: js.Function2[/* foo */ js.Any, /* bar */ js.Any, _]): js.Any = js.native
    
    def endTransactionSync(rollback: Boolean): Database = js.native
    
    @JSName("fetchMode")
    var fetchMode_Database: Double | Null = js.native
    
    // TODO: add types from stream
    def fetchStreamingResults(results: js.Any, stream: js.Any): js.Any = js.native
    
    @JSName("odbc")
    var odbc_Database: ODBC = js.native
    
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
    
    @JSName("queue")
    var queue_Database: SimpleQueue | js.Array[_] = js.native
    
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
  
  @JSImport("ibm_db", "FETCH_ARRAY")
  @js.native
  def FETCH_ARRAY: String = js.native
  @scala.inline
  def FETCH_ARRAY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FETCH_ARRAY")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "FETCH_OBJECT")
  @js.native
  def FETCH_OBJECT: String = js.native
  @scala.inline
  def FETCH_OBJECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FETCH_OBJECT")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "ODBC")
  @js.native
  class ODBC () extends StObject {
    
    var FETCH_ARRAY: js.UndefOr[String] = js.native
    
    var FETCH_OBJECT: js.UndefOr[String] = js.native
    
    var SQL_DESTROY: js.UndefOr[String] = js.native
    
    var SQL_DROP: js.UndefOr[String] = js.native
    
    var SQL_RESET_PARAMS: js.UndefOr[String] = js.native
    
    var SQL_UNBIND: js.UndefOr[String] = js.native
    
    var SQSQL_CLOSE: js.UndefOr[String] = js.native
  }
  
  @JSImport("ibm_db", "ODBCConnection")
  @js.native
  class ODBCConnection () extends StObject {
    
    var connectTimeout: Double = js.native
    
    var connected: Boolean = js.native
    
    var loginTimeout: Double = js.native
    
    var systemNaming: Boolean = js.native
  }
  
  @JSImport("ibm_db", "ODBCResult")
  @js.native
  class ODBCResult () extends StObject {
    
    def closeSync(): Unit = js.native
    
    def fetchAllSync(): js.Array[_] = js.native
    
    var fetchMode: Double = js.native
    
    def fetchSync(): js.Array[_] = js.native
    
    def moreResultsSync(): js.Array[_] = js.native
  }
  
  @JSImport("ibm_db", "ODBCStatement")
  @js.native
  class ODBCStatement () extends StObject {
    
    def _bind(params: js.Array[_], cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def _bindSync(ary: js.Array[_]): Unit = js.native
    
    // TODO: type of outparams is unknown
    def _execute(cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
    
    def _executeDirect(sql: String, cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
    
    // _executeDirectSync // TODO: Add missing piece
    def _executeNonQuery(cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
    
    def _executeSync(): ODBCResult = js.native
    def _executeSync(params: js.Array[_]): ODBCResult = js.native
    
    // _executeNonQuerySync // TODO: Add missing piece
    def _prepare(sql: String, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def bind(ary: js.Array[_], cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    var bindQueue: SimpleQueue = js.native
    
    def bindSync(ary: js.Array[_]): Unit = js.native
    
    // TODO: type of outparams is unknown
    def execute(cb: js.Function3[/* err */ Error, /* result */ js.Array[_], /* outparams */ js.Any, Unit]): Unit = js.native
    def execute(params: js.Array[_]): js.Promise[Outparams] = js.native
    def execute(
      params: js.Array[_],
      cb: js.Function3[/* err */ Error, /* result */ js.Array[_], /* outparams */ js.Any, Unit]
    ): Unit = js.native
    
    def executeDirect(sql: String, cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
    
    def executeNonQuery(): js.Promise[Unit] = js.native
    def executeNonQuery(cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
    def executeNonQuery(params: js.Array[_]): js.Promise[Unit] = js.native
    def executeNonQuery(params: js.Array[_], cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
    
    def executeSync(): ODBCResult = js.native
    def executeSync(params: js.Array[_]): ODBCResult = js.native
    
    def prepare(sql: String, cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
    
    var queue: SimpleQueue = js.native
  }
  
  @JSImport("ibm_db", "Pool")
  @js.native
  class Pool () extends PoolOptions {
    def this(options: PoolOptions) = this()
    
    var availablePool: js.Object = js.native
    
    def cleanup(connStr: String): Boolean = js.native
    
    def close(cb: js.Function2[/* foo */ js.Any, /* bar */ js.Any, _]): Unit = js.native
    
    var index: Double = js.native
    
    def init(count: Double, connStr: String): Boolean = js.native
    
    var odbc: ODBC = js.native
    
    def open(connStr: String, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
    
    var options: PoolOptions = js.native
    
    var poolsize: Double = js.native
    
    def setConnectTimeout(timeout: Double): Boolean = js.native
    
    def setMaxPoolSize(count: Double): Boolean = js.native
    
    var usedPool: js.Object = js.native
  }
  
  @JSImport("ibm_db", "SQL_DESTROY")
  @js.native
  def SQL_DESTROY: String = js.native
  @scala.inline
  def SQL_DESTROY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_DESTROY")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQL_DROP")
  @js.native
  def SQL_DROP: String = js.native
  @scala.inline
  def SQL_DROP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_DROP")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQL_RESET_PARAMS")
  @js.native
  def SQL_RESET_PARAMS: String = js.native
  @scala.inline
  def SQL_RESET_PARAMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_RESET_PARAMS")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQL_UNBIND")
  @js.native
  def SQL_UNBIND: String = js.native
  @scala.inline
  def SQL_UNBIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_UNBIND")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQSQL_CLOSE")
  @js.native
  def SQSQL_CLOSE: String = js.native
  @scala.inline
  def SQSQL_CLOSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQSQL_CLOSE")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SimpleQueue")
  @js.native
  class SimpleQueue () extends StObject {
    
    var executing: Boolean = js.native
    
    var fifo: js.Array[_] = js.native
    
    def maybeNext(): Unit = js.native
    
    def next(): Unit = js.native
    
    def push(fn: js.Function2[/* foo */ js.Any, /* bar */ js.Any, Unit]): Unit = js.native
  }
  
  @JSImport("ibm_db", "close")
  @js.native
  def close(db: Database): Unit = js.native
  
  @JSImport("ibm_db", "debug")
  @js.native
  def debug(x: Boolean): Unit = js.native
  
  @JSImport("ibm_db", "getElapsedTime")
  @js.native
  def getElapsedTime(): String = js.native
  
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: String): js.Promise[Database] = js.native
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: String, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: String, options: Options): js.Promise[Database] = js.native
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: String, options: Options, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: ConnStr): js.Promise[Database] = js.native
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: ConnStr, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: ConnStr, options: Options): js.Promise[Database] = js.native
  @JSImport("ibm_db", "open")
  @js.native
  def open(connStr: ConnStr, options: Options, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  
  @JSImport("ibm_db", "openSync")
  @js.native
  def openSync(connStr: String): Database = js.native
  @JSImport("ibm_db", "openSync")
  @js.native
  def openSync(connStr: String, options: Options): Database = js.native
  @JSImport("ibm_db", "openSync")
  @js.native
  def openSync(connStr: ConnStr): Database = js.native
  @JSImport("ibm_db", "openSync")
  @js.native
  def openSync(connStr: ConnStr, options: Options): Database = js.native
  
  @js.native
  trait ConnStr extends StObject {
    
    var DATABASE: String = js.native
    
    var HOSTNAME: String = js.native
    
    var PORT: Double | String = js.native
    
    var PROTOCOL: String = js.native
    
    var PWD: String = js.native
    
    var UID: String = js.native
  }
  object ConnStr {
    
    @scala.inline
    def apply(
      DATABASE: String,
      HOSTNAME: String,
      PORT: Double | String,
      PROTOCOL: String,
      PWD: String,
      UID: String
    ): ConnStr = {
      val __obj = js.Dynamic.literal(DATABASE = DATABASE.asInstanceOf[js.Any], HOSTNAME = HOSTNAME.asInstanceOf[js.Any], PORT = PORT.asInstanceOf[js.Any], PROTOCOL = PROTOCOL.asInstanceOf[js.Any], PWD = PWD.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnStr]
    }
    
    @scala.inline
    implicit class ConnStrMutableBuilder[Self <: ConnStr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDATABASE(value: String): Self = StObject.set(x, "DATABASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOSTNAME(value: String): Self = StObject.set(x, "HOSTNAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPORT(value: Double | String): Self = StObject.set(x, "PORT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPROTOCOL(value: String): Self = StObject.set(x, "PROTOCOL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPWD(value: String): Self = StObject.set(x, "PWD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUID(value: String): Self = StObject.set(x, "UID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescribeObject extends StObject {
    
    var column: js.UndefOr[String] = js.native
    
    var database: String = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object DescribeObject {
    
    @scala.inline
    def apply(database: String): DescribeObject = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeObject]
    }
    
    @scala.inline
    implicit class DescribeObjectMutableBuilder[Self <: DescribeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var connectTimeout: js.UndefOr[Double | Null] = js.native
    
    var connected: js.UndefOr[Boolean] = js.native
    
    var fetchMode: js.UndefOr[Double | Null] = js.native
    
    var odbc: js.UndefOr[ODBC] = js.native
    
    var queue: js.UndefOr[SimpleQueue | js.Array[_]] = js.native
    
    var systemNaming: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutNull: Self = StObject.set(x, "connectTimeout", null)
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      @scala.inline
      def setFetchMode(value: Double): Self = StObject.set(x, "fetchMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchModeNull: Self = StObject.set(x, "fetchMode", null)
      
      @scala.inline
      def setFetchModeUndefined: Self = StObject.set(x, "fetchMode", js.undefined)
      
      @scala.inline
      def setOdbc(value: ODBC): Self = StObject.set(x, "odbc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOdbcUndefined: Self = StObject.set(x, "odbc", js.undefined)
      
      @scala.inline
      def setQueue(value: SimpleQueue | js.Array[_]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      @scala.inline
      def setQueueVarargs(value: js.Any*): Self = StObject.set(x, "queue", js.Array(value :_*))
      
      @scala.inline
      def setSystemNaming(value: Boolean): Self = StObject.set(x, "systemNaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemNamingUndefined: Self = StObject.set(x, "systemNaming", js.undefined)
    }
  }
  
  @js.native
  trait PoolOptions extends StObject {
    
    var autoCleanIdle: js.UndefOr[Boolean] = js.native
    
    var connectTimeout: js.UndefOr[Double] = js.native
    
    var idleTimeout: js.UndefOr[Double] = js.native
    
    var maxPoolSize: js.UndefOr[Double] = js.native
    
    var systemNaming: js.UndefOr[js.Any] = js.native
  }
  object PoolOptions {
    
    @scala.inline
    def apply(): PoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolOptions]
    }
    
    @scala.inline
    implicit class PoolOptionsMutableBuilder[Self <: PoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCleanIdle(value: Boolean): Self = StObject.set(x, "autoCleanIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCleanIdleUndefined: Self = StObject.set(x, "autoCleanIdle", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      @scala.inline
      def setMaxPoolSize(value: Double): Self = StObject.set(x, "maxPoolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPoolSizeUndefined: Self = StObject.set(x, "maxPoolSize", js.undefined)
      
      @scala.inline
      def setSystemNaming(value: js.Any): Self = StObject.set(x, "systemNaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemNamingUndefined: Self = StObject.set(x, "systemNaming", js.undefined)
    }
  }
}
