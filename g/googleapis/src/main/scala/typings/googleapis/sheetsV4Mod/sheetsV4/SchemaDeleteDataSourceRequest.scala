package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteDataSourceRequest extends StObject {
  
  /**
    * The ID of the data source to delete.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteDataSourceRequest {
  
  inline def apply(): SchemaDeleteDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDataSourceRequest]
  }
  
  extension [Self <: SchemaDeleteDataSourceRequest](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
