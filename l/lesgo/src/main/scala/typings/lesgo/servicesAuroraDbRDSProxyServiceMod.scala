package typings.lesgo

import typings.lesgo.servicesPaginationPaginatorMod.PaginatorObject
import typings.mysql2.typingsMysqlLibProtocolPacketsFieldPacketMod.FieldPacket
import typings.mysql2.typingsMysqlMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesAuroraDbRDSProxyServiceMod {
  
  @JSImport("lesgo/services/AuroraDbRDSProxyService", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AuroraDbRDSProxyService {
    def this(params: AuroraDbRDSProxyServiceParams) = this()
  }
  
  @js.native
  trait AuroraDbRDSProxyService extends StObject {
    
    /* protected */ var conn: Connection = js.native
    
    def connect(): js.Promise[Connection] = js.native
    def connect(opts: AuroraDbRDSProxyServiceParams): js.Promise[Connection] = js.native
    
    def end(): Unit = js.native
    def end(conn: Connection): Unit = js.native
    
    def insert(sql: String): js.Promise[Double] = js.native
    def insert(sql: String, sqlParams: Any): js.Promise[Double] = js.native
    def insert(sql: String, sqlParams: Any, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[Double] = js.native
    def insert(sql: String, sqlParams: Unit, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[Double] = js.native
    
    def pConnect(): Unit = js.native
    def pConnect(opts: AuroraDbRDSProxyServiceParams): Unit = js.native
    
    def query(sql: String): js.Promise[AuroraDbRDSProxyServiceResponse] = js.native
    def query(sql: String, params: Any): js.Promise[AuroraDbRDSProxyServiceResponse] = js.native
    def query(sql: String, params: Any, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[AuroraDbRDSProxyServiceResponse] = js.native
    def query(sql: String, params: Unit, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[AuroraDbRDSProxyServiceResponse] = js.native
    
    def select(sql: String): js.Promise[AuroraDbRDSProxyServiceResult] = js.native
    def select(sql: String, params: Any): js.Promise[AuroraDbRDSProxyServiceResult] = js.native
    def select(sql: String, params: Any, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[AuroraDbRDSProxyServiceResult] = js.native
    def select(sql: String, params: Unit, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[AuroraDbRDSProxyServiceResult] = js.native
    
    def selectFirst(sql: String): js.Promise[Any] = js.native
    def selectFirst(sql: String, params: Any): js.Promise[Any] = js.native
    def selectFirst(sql: String, params: Any, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[Any] = js.native
    def selectFirst(sql: String, params: Unit, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[Any] = js.native
    
    def selectPaginate(sql: String): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Double,
      currentPage: Double,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Double,
      currentPage: Double,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Double,
      currentPage: Double,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Double,
      currentPage: Unit,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Double,
      currentPage: Unit,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Double,
      currentPage: Unit,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Unit, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Unit, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Unit,
      currentPage: Double,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Unit,
      currentPage: Double,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Unit,
      currentPage: Double,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Unit, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Unit,
      currentPage: Unit,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Unit,
      currentPage: Unit,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Any,
      perPage: Unit,
      currentPage: Unit,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Unit, perPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Unit, perPage: Double, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Unit, perPage: Double, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Double,
      currentPage: Double,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Double,
      currentPage: Double,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Double,
      currentPage: Double,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Unit, perPage: Double, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Double,
      currentPage: Unit,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Double,
      currentPage: Unit,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Double,
      currentPage: Unit,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Unit, perPage: Unit, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Unit, perPage: Unit, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Unit,
      currentPage: Double,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Unit,
      currentPage: Double,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Unit,
      currentPage: Double,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Unit, perPage: Unit, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Unit,
      currentPage: Unit,
      total: Double,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Unit,
      currentPage: Unit,
      total: Null,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    def selectPaginate(
      sql: String,
      params: Unit,
      perPage: Unit,
      currentPage: Unit,
      total: Unit,
      connectionOpts: AuroraDbRDSProxyServiceParams
    ): PaginatorObject[Any] = js.native
    
    def update(sql: String): js.Promise[Unit] = js.native
    def update(sql: String, sqlParams: Any): js.Promise[Unit] = js.native
    def update(sql: String, sqlParams: Any, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[Unit] = js.native
    def update(sql: String, sqlParams: Unit, connectionOpts: AuroraDbRDSProxyServiceParams): js.Promise[Unit] = js.native
  }
  
  /* Inlined std.Pick<mysql2.mysql2.ConnectionOptions, 'host' | 'user' | 'password' | 'database'> & {  persists :boolean | undefined} */
  trait AuroraDbRDSProxyServiceParams extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var persists: js.UndefOr[Boolean] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object AuroraDbRDSProxyServiceParams {
    
    inline def apply(): AuroraDbRDSProxyServiceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuroraDbRDSProxyServiceParams]
    }
    
    extension [Self <: AuroraDbRDSProxyServiceParams](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPersists(value: Boolean): Self = StObject.set(x, "persists", value.asInstanceOf[js.Any])
      
      inline def setPersistsUndefined: Self = StObject.set(x, "persists", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait AuroraDbRDSProxyServiceResponse extends StObject {
    
    var fields: js.Array[FieldPacket]
    
    var results: AuroraDbRDSProxyServiceResult
  }
  object AuroraDbRDSProxyServiceResponse {
    
    inline def apply(fields: js.Array[FieldPacket], results: AuroraDbRDSProxyServiceResult): AuroraDbRDSProxyServiceResponse = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuroraDbRDSProxyServiceResponse]
    }
    
    extension [Self <: AuroraDbRDSProxyServiceResponse](x: Self) {
      
      inline def setFields(value: js.Array[FieldPacket]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: FieldPacket*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setResults(value: AuroraDbRDSProxyServiceResult): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  type AuroraDbRDSProxyServiceResult = js.Array[Any]
}
