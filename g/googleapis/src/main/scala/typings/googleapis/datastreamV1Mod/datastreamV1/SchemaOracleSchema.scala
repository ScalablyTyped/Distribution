package typings.googleapis.datastreamV1Mod.datastreamV1

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
  var schema: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
