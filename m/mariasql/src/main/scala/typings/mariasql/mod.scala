package typings.mariasql

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.mariasql.mariasqlStrings.abort
import typings.mariasql.mariasqlStrings.close
import typings.mariasql.mariasqlStrings.connect
import typings.mariasql.mariasqlStrings.end
import typings.mariasql.mariasqlStrings.error
import typings.mariasql.mariasqlStrings.result
import typings.mariasql.mariasqlStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mariasql", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MariaClient
  @JSImport("mariasql", JSImport.Namespace)
  @js.native
  val ^ : Client = js.native
  
  @js.native
  trait Client
    extends StObject
       with Instantiable0[MariaClient] {
    
    def apply(): MariaClient = js.native
  }
  
  trait ClientConfig extends StObject {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var connTimeout: js.UndefOr[Double] = js.undefined
    
    var db: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var keepQueries: js.UndefOr[Boolean] = js.undefined
    
    var local_infile: js.UndefOr[Boolean] = js.undefined
    
    var multiStatements: js.UndefOr[Boolean] = js.undefined
    
    var password: String
    
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var read_default_group: js.UndefOr[String] = js.undefined
    
    var secureAuth: js.UndefOr[Boolean] = js.undefined
    
    var ssl: js.UndefOr[Any] = js.undefined
    
    var unixSocket: js.UndefOr[String] = js.undefined
    
    var user: String
  }
  object ClientConfig {
    
    inline def apply(host: String, password: String, user: String): ClientConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setConnTimeout(value: Double): Self = StObject.set(x, "connTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnTimeoutUndefined: Self = StObject.set(x, "connTimeout", js.undefined)
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setKeepQueries(value: Boolean): Self = StObject.set(x, "keepQueries", value.asInstanceOf[js.Any])
      
      inline def setKeepQueriesUndefined: Self = StObject.set(x, "keepQueries", js.undefined)
      
      inline def setLocal_infile(value: Boolean): Self = StObject.set(x, "local_infile", value.asInstanceOf[js.Any])
      
      inline def setLocal_infileUndefined: Self = StObject.set(x, "local_infile", js.undefined)
      
      inline def setMultiStatements(value: Boolean): Self = StObject.set(x, "multiStatements", value.asInstanceOf[js.Any])
      
      inline def setMultiStatementsUndefined: Self = StObject.set(x, "multiStatements", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRead_default_group(value: String): Self = StObject.set(x, "read_default_group", value.asInstanceOf[js.Any])
      
      inline def setRead_default_groupUndefined: Self = StObject.set(x, "read_default_group", js.undefined)
      
      inline def setSecureAuth(value: Boolean): Self = StObject.set(x, "secureAuth", value.asInstanceOf[js.Any])
      
      inline def setSecureAuthUndefined: Self = StObject.set(x, "secureAuth", js.undefined)
      
      inline def setSsl(value: Any): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setUnixSocket(value: String): Self = StObject.set(x, "unixSocket", value.asInstanceOf[js.Any])
      
      inline def setUnixSocketUndefined: Self = StObject.set(x, "unixSocket", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary = StringDictionary[Any]
  
  type MariaCallBackBoolean = js.Function1[/* result */ Boolean, Unit]
  
  type MariaCallBackError = js.Function1[/* error */ js.Error, Unit]
  
  type MariaCallBackInfo = js.Function1[/* result */ MariaInfo, Unit]
  
  type MariaCallBackObject = js.Function1[/* result */ js.Object, Unit]
  
  type MariaCallBackResult = js.Function1[/* result */ MariaResult, Unit]
  
  type MariaCallBackRow = js.Function1[/* result */ js.Array[Any], Unit]
  
  type MariaCallBackVoid = js.Function0[Unit]
  
  @js.native
  trait MariaClient extends StObject {
    
    def connect(config: ClientConfig): Unit = js.native
    
    var connected: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def end(): Unit = js.native
    
    def escape(query: String): String = js.native
    
    def isMariaDB(): Boolean = js.native
    
    def on(signal: String, cb: MariaCallBackVoid): MariaClient = js.native
    @JSName("on")
    def on_close(signal: close, cb: MariaCallBackObject): MariaClient = js.native
    @JSName("on")
    def on_connect(signal: connect, cb: MariaCallBackVoid): MariaClient = js.native
    @JSName("on")
    def on_error(signal: error, cb: MariaCallBackError): MariaClient = js.native
    
    def prepare(query: String): MariaPreparedQuery = js.native
    
    def query(q: String): MariaQuery = js.native
    def query(q: String, placeHolders: js.Array[Any]): MariaQuery = js.native
    def query(q: String, placeHolders: js.Array[Any], useArray: Boolean): MariaQuery = js.native
    def query(q: String, placeHolders: Unit, useArray: Boolean): MariaQuery = js.native
    def query(q: String, placeHolders: Dictionary): MariaQuery = js.native
    def query(q: String, placeHolders: Dictionary, useArray: Boolean): MariaQuery = js.native
    def query(q: String, useArray: Boolean): MariaQuery = js.native
    
    var threadId: String = js.native
  }
  
  trait MariaInfo extends StObject {
    
    var affectedRows: Double
    
    var insertId: Double
    
    var numRows: Double
  }
  object MariaInfo {
    
    inline def apply(affectedRows: Double, insertId: Double, numRows: Double): MariaInfo = {
      val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], numRows = numRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[MariaInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MariaInfo] (val x: Self) extends AnyVal {
      
      inline def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setNumRows(value: Double): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MariaPreparedQuery extends StObject {
    
    def apply(values: js.Array[Any]): String = js.native
    def apply(values: Dictionary): String = js.native
  }
  
  @js.native
  trait MariaQuery extends StObject {
    
    def abort(): Unit = js.native
    
    def on(signal: String, cb: MariaCallBackVoid): MariaQuery = js.native
    @JSName("on")
    def on_abort(signal: abort, cb: MariaCallBackVoid): MariaQuery = js.native
    @JSName("on")
    def on_end(signal: end, cb: MariaCallBackVoid): MariaQuery = js.native
    @JSName("on")
    def on_error(signal: error, cb: MariaCallBackError): MariaQuery = js.native
    @JSName("on")
    def on_result(signal: result, cb: MariaCallBackResult): MariaQuery = js.native
  }
  
  @js.native
  trait MariaResult extends StObject {
    
    def abort(): Unit = js.native
    
    def on(signal: String, cb: MariaCallBackVoid): MariaResult = js.native
    @JSName("on")
    def on_abort(signal: abort, cb: MariaCallBackVoid): MariaResult = js.native
    @JSName("on")
    def on_end(signal: end, cb: MariaCallBackInfo): MariaResult = js.native
    @JSName("on")
    def on_error(signal: error, cb: MariaCallBackError): MariaResult = js.native
    @JSName("on")
    def on_row(signal: row, cb: MariaCallBackRow): MariaResult = js.native
  }
  
  type _To = Client
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Client = ^
}
