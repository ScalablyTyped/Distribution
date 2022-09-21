package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlRdbms extends StObject {
  
  /**
    * Mysql databases on the server
    */
  var mysqlDatabases: js.UndefOr[js.Array[SchemaMysqlDatabase]] = js.undefined
}
object SchemaMysqlRdbms {
  
  inline def apply(): SchemaMysqlRdbms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlRdbms]
  }
  
  extension [Self <: SchemaMysqlRdbms](x: Self) {
    
    inline def setMysqlDatabases(value: js.Array[SchemaMysqlDatabase]): Self = StObject.set(x, "mysqlDatabases", value.asInstanceOf[js.Any])
    
    inline def setMysqlDatabasesUndefined: Self = StObject.set(x, "mysqlDatabases", js.undefined)
    
    inline def setMysqlDatabasesVarargs(value: SchemaMysqlDatabase*): Self = StObject.set(x, "mysqlDatabases", js.Array(value*))
  }
}
