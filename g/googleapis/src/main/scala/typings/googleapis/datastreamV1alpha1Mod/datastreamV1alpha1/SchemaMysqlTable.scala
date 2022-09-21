package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlTable extends StObject {
  
  /**
    * MySQL columns in the database. When unspecified as part of include/exclude lists, includes/excludes everything.
    */
  var mysqlColumns: js.UndefOr[js.Array[SchemaMysqlColumn]] = js.undefined
  
  /**
    * Table name.
    */
  var tableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaMysqlTable {
  
  inline def apply(): SchemaMysqlTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlTable]
  }
  
  extension [Self <: SchemaMysqlTable](x: Self) {
    
    inline def setMysqlColumns(value: js.Array[SchemaMysqlColumn]): Self = StObject.set(x, "mysqlColumns", value.asInstanceOf[js.Any])
    
    inline def setMysqlColumnsUndefined: Self = StObject.set(x, "mysqlColumns", js.undefined)
    
    inline def setMysqlColumnsVarargs(value: SchemaMysqlColumn*): Self = StObject.set(x, "mysqlColumns", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameNull: Self = StObject.set(x, "tableName", null)
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
