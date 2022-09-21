package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleRdbms extends StObject {
  
  /**
    * Oracle schemas/databases in the database server.
    */
  var oracleSchemas: js.UndefOr[js.Array[SchemaOracleSchema]] = js.undefined
}
object SchemaOracleRdbms {
  
  inline def apply(): SchemaOracleRdbms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleRdbms]
  }
  
  extension [Self <: SchemaOracleRdbms](x: Self) {
    
    inline def setOracleSchemas(value: js.Array[SchemaOracleSchema]): Self = StObject.set(x, "oracleSchemas", value.asInstanceOf[js.Any])
    
    inline def setOracleSchemasUndefined: Self = StObject.set(x, "oracleSchemas", js.undefined)
    
    inline def setOracleSchemasVarargs(value: SchemaOracleSchema*): Self = StObject.set(x, "oracleSchemas", js.Array(value*))
  }
}
