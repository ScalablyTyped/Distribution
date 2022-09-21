package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleTable extends StObject {
  
  /**
    * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
    */
  var oracleColumns: js.UndefOr[js.Array[SchemaOracleColumn]] = js.undefined
  
  /**
    * Table name.
    */
  var tableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaOracleTable {
  
  inline def apply(): SchemaOracleTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleTable]
  }
  
  extension [Self <: SchemaOracleTable](x: Self) {
    
    inline def setOracleColumns(value: js.Array[SchemaOracleColumn]): Self = StObject.set(x, "oracleColumns", value.asInstanceOf[js.Any])
    
    inline def setOracleColumnsUndefined: Self = StObject.set(x, "oracleColumns", js.undefined)
    
    inline def setOracleColumnsVarargs(value: SchemaOracleColumn*): Self = StObject.set(x, "oracleColumns", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameNull: Self = StObject.set(x, "tableName", null)
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
