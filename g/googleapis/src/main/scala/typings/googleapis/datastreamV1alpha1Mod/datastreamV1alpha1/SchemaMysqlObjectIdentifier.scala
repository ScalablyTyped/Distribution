package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlObjectIdentifier extends StObject {
  
  /**
    * Required. The database name.
    */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The table name.
    */
  var table: js.UndefOr[String | Null] = js.undefined
}
object SchemaMysqlObjectIdentifier {
  
  inline def apply(): SchemaMysqlObjectIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlObjectIdentifier]
  }
  
  extension [Self <: SchemaMysqlObjectIdentifier](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
