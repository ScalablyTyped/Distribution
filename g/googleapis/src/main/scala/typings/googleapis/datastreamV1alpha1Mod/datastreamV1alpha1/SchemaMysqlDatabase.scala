package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlDatabase extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tables in the database.
    */
  var mysqlTables: js.UndefOr[js.Array[SchemaMysqlTable]] = js.undefined
}
object SchemaMysqlDatabase {
  
  inline def apply(): SchemaMysqlDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlDatabase]
  }
  
  extension [Self <: SchemaMysqlDatabase](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameNull: Self = StObject.set(x, "databaseName", null)
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    inline def setMysqlTables(value: js.Array[SchemaMysqlTable]): Self = StObject.set(x, "mysqlTables", value.asInstanceOf[js.Any])
    
    inline def setMysqlTablesUndefined: Self = StObject.set(x, "mysqlTables", js.undefined)
    
    inline def setMysqlTablesVarargs(value: SchemaMysqlTable*): Self = StObject.set(x, "mysqlTables", js.Array(value*))
  }
}
