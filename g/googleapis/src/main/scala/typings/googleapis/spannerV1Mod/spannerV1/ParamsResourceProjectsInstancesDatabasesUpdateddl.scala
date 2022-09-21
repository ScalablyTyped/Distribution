package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesUpdateddl
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The database to update.
    */
  var database: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateDatabaseDdlRequest] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesUpdateddl {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesUpdateddl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesUpdateddl]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesUpdateddl](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setRequestBody(value: SchemaUpdateDatabaseDdlRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
