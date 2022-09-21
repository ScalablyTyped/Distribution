package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddDataSourceRequest extends StObject {
  
  /**
    * The data source to add.
    */
  var dataSource: js.UndefOr[SchemaDataSource] = js.undefined
}
object SchemaAddDataSourceRequest {
  
  inline def apply(): SchemaAddDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDataSourceRequest]
  }
  
  extension [Self <: SchemaAddDataSourceRequest](x: Self) {
    
    inline def setDataSource(value: SchemaDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
