package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetDatabaseDdlResponse extends StObject {
  
  /**
    * A list of formatted DDL statements defining the schema of the database specified in the request.
    */
  var statements: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGetDatabaseDdlResponse {
  
  inline def apply(): SchemaGetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDatabaseDdlResponse]
  }
  
  extension [Self <: SchemaGetDatabaseDdlResponse](x: Self) {
    
    inline def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsNull: Self = StObject.set(x, "statements", null)
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value*))
  }
}
