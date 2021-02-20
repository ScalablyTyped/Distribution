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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mariasql", JSImport.Namespace)
  @js.native
  class ^ () extends MariaClient
  @JSImport("mariasql", JSImport.Namespace)
  @js.native
  val ^ : Client = js.native
  
  @js.native
  trait Client extends Instantiable0[MariaClient] {
    
    def apply(): MariaClient = js.native
  }
  
  @js.native
  trait ClientConfig extends StObject {
    
    var charset: js.UndefOr[String] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var connTimeout: js.UndefOr[Double] = js.native
    
    var db: js.UndefOr[String] = js.native
    
    var host: String = js.native
    
    var keepQueries: js.UndefOr[Boolean] = js.native
    
    var local_infile: js.UndefOr[Boolean] = js.native
    
    var multiStatements: js.UndefOr[Boolean] = js.native
    
    var password: String = js.native
    
    var pingInterval: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var read_default_group: js.UndefOr[String] = js.native
    
    var secureAuth: js.UndefOr[Boolean] = js.native
    
    var ssl: js.UndefOr[js.Any] = js.native
    
    var unixSocket: js.UndefOr[String] = js.native
    
    var user: String = js.native
  }
  object ClientConfig {
    
    @scala.inline
    def apply(host: String, password: String, user: String): ClientConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfig]
    }
    
    @scala.inline
    implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setConnTimeout(value: Double): Self = StObject.set(x, "connTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnTimeoutUndefined: Self = StObject.set(x, "connTimeout", js.undefined)
      
      @scala.inline
      def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepQueries(value: Boolean): Self = StObject.set(x, "keepQueries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepQueriesUndefined: Self = StObject.set(x, "keepQueries", js.undefined)
      
      @scala.inline
      def setLocal_infile(value: Boolean): Self = StObject.set(x, "local_infile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_infileUndefined: Self = StObject.set(x, "local_infile", js.undefined)
      
      @scala.inline
      def setMultiStatements(value: Boolean): Self = StObject.set(x, "multiStatements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiStatementsUndefined: Self = StObject.set(x, "multiStatements", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRead_default_group(value: String): Self = StObject.set(x, "read_default_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead_default_groupUndefined: Self = StObject.set(x, "read_default_group", js.undefined)
      
      @scala.inline
      def setSecureAuth(value: Boolean): Self = StObject.set(x, "secureAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureAuthUndefined: Self = StObject.set(x, "secureAuth", js.undefined)
      
      @scala.inline
      def setSsl(value: js.Any): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setUnixSocket(value: String): Self = StObject.set(x, "unixSocket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnixSocketUndefined: Self = StObject.set(x, "unixSocket", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary = StringDictionary[js.Any]
  
  type MariaCallBackBoolean = js.Function1[/* result */ Boolean, Unit]
  
  type MariaCallBackError = js.Function1[/* error */ Error, Unit]
  
  type MariaCallBackInfo = js.Function1[/* result */ MariaInfo, Unit]
  
  type MariaCallBackObject = js.Function1[/* result */ js.Object, Unit]
  
  type MariaCallBackResult = js.Function1[/* result */ MariaResult, Unit]
  
  type MariaCallBackRow = js.Function1[/* result */ js.Array[js.Any], Unit]
  
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
    def query(q: String, placeHolders: js.UndefOr[scala.Nothing], useArray: Boolean): MariaQuery = js.native
    def query(q: String, placeHolders: js.Array[_]): MariaQuery = js.native
    def query(q: String, placeHolders: js.Array[_], useArray: Boolean): MariaQuery = js.native
    def query(q: String, placeHolders: Dictionary): MariaQuery = js.native
    def query(q: String, placeHolders: Dictionary, useArray: Boolean): MariaQuery = js.native
    def query(q: String, useArray: Boolean): MariaQuery = js.native
    
    var threadId: String = js.native
  }
  
  @js.native
  trait MariaInfo extends StObject {
    
    var affectedRows: Double = js.native
    
    var insertId: Double = js.native
    
    var numRows: Double = js.native
  }
  object MariaInfo {
    
    @scala.inline
    def apply(affectedRows: Double, insertId: Double, numRows: Double): MariaInfo = {
      val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], numRows = numRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[MariaInfo]
    }
    
    @scala.inline
    implicit class MariaInfoMutableBuilder[Self <: MariaInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumRows(value: Double): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MariaPreparedQuery extends StObject {
    
    def apply(values: js.Array[_]): String = js.native
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
