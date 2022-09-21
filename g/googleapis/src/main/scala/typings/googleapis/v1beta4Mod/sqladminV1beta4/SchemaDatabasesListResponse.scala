package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatabasesListResponse extends StObject {
  
  /**
    * List of database resources in the instance.
    */
  var items: js.UndefOr[js.Array[SchemaDatabase]] = js.undefined
  
  /**
    * This is always `sql#databasesList`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatabasesListResponse {
  
  inline def apply(): SchemaDatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabasesListResponse]
  }
  
  extension [Self <: SchemaDatabasesListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaDatabase]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaDatabase*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
