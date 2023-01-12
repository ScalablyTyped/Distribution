package typings.lesgo

import typings.lesgo.servicesPaginationPaginatorMod.PaginatorObject
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesAuroraDbServiceMod {
  
  @JSImport("lesgo/services/AuroraDbService", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AuroraDbService {
    def this(params: AuroraDbServiceParams) = this()
  }
  
  @js.native
  trait AuroraDbService extends StObject {
    
    /* protected */ var client: iDataAPIClient = js.native
    
    def connect(opts: AuroraDbServiceParams): Unit = js.native
    
    def insert(sql: String, sqlParams: js.Array[Any]): js.Promise[Any] = js.native
    def insert(sql: String, sqlParams: Any): js.Promise[Any] = js.native
    
    def query(sql: String, params: js.Array[Any]): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: lesgo.lesgo/services/AuroraDbService.iDataAPIClient['query'] */ js.Any
      ] = js.native
    def query(sql: String, params: Any): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: lesgo.lesgo/services/AuroraDbService.iDataAPIClient['query'] */ js.Any
      ] = js.native
    
    def select(sql: String, params: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
    def select(sql: String, params: Any): js.Promise[js.Array[Any]] = js.native
    
    def selectFirst(sql: String, params: js.Array[Any]): js.Promise[Any] = js.native
    def selectFirst(sql: String, params: Any): js.Promise[Any] = js.native
    
    def selectPaginate(sql: String, params: js.Array[Any]): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: js.Array[Any], perPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: js.Array[Any], perPage: Double, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: js.Array[Any], perPage: Double, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: js.Array[Any], perPage: Double, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: js.Array[Any], perPage: Unit, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: js.Array[Any], perPage: Unit, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: js.Array[Any], perPage: Unit, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Double, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Unit, currentPage: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Unit, currentPage: Double, total: Double): PaginatorObject[Any] = js.native
    def selectPaginate(sql: String, params: Any, perPage: Unit, currentPage: Unit, total: Double): PaginatorObject[Any] = js.native
    
    def update(sql: String, sqlParams: js.Array[Any]): js.Promise[Unit] = js.native
    def update(sql: String, sqlParams: Any): js.Promise[Unit] = js.native
  }
  
  /* Inlined std.Pick<lesgo.lesgo/services/AuroraDbService.iParams, 'secretArn' | 'resourceArn' | 'database'> */
  trait AuroraDbServiceParams extends StObject {
    
    var database: js.UndefOr[Any] = js.undefined
    
    var resourceArn: js.UndefOr[Any] = js.undefined
    
    var secretArn: js.UndefOr[Any] = js.undefined
  }
  object AuroraDbServiceParams {
    
    inline def apply(): AuroraDbServiceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuroraDbServiceParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuroraDbServiceParams] (val x: Self) extends AnyVal {
      
      inline def setDatabase(value: Any): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setResourceArn(value: Any): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
      
      inline def setSecretArn(value: Any): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      inline def setSecretArnUndefined: Self = StObject.set(x, "secretArn", js.undefined)
    }
  }
  
  type iDataAPIClient = ReturnType[
    js.Function1[
      /* params */ typings.dataApiClient.mod.iParams, 
      typings.dataApiClient.mod.iDataAPIClient
    ]
  ]
  
  type iParams = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(params : data-api-client.data-api-client.iParams): data-api-client.data-api-client.iDataAPIClient>[0] */ js.Any
}
