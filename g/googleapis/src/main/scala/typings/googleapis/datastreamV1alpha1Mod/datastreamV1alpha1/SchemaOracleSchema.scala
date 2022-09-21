package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleSchema extends StObject {
  
  /**
    * Tables in the schema.
    */
  var oracleTables: js.UndefOr[js.Array[SchemaOracleTable]] = js.undefined
  
  /**
    * Schema name.
    */
  var schemaName: js.UndefOr[String | Null] = js.undefined
}
object SchemaOracleSchema {
  
  inline def apply(): SchemaOracleSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleSchema]
  }
  
  extension [Self <: SchemaOracleSchema](x: Self) {
    
    inline def setOracleTables(value: js.Array[SchemaOracleTable]): Self = StObject.set(x, "oracleTables", value.asInstanceOf[js.Any])
    
    inline def setOracleTablesUndefined: Self = StObject.set(x, "oracleTables", js.undefined)
    
    inline def setOracleTablesVarargs(value: SchemaOracleTable*): Self = StObject.set(x, "oracleTables", js.Array(value*))
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameNull: Self = StObject.set(x, "schemaName", null)
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
  }
}
