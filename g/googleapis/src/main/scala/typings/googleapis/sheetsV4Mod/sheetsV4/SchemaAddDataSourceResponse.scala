package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddDataSourceResponse extends StObject {
  
  /**
    * The data execution status.
    */
  var dataExecutionStatus: js.UndefOr[SchemaDataExecutionStatus] = js.undefined
  
  /**
    * The data source that was created.
    */
  var dataSource: js.UndefOr[SchemaDataSource] = js.undefined
}
object SchemaAddDataSourceResponse {
  
  inline def apply(): SchemaAddDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDataSourceResponse]
  }
  
  extension [Self <: SchemaAddDataSourceResponse](x: Self) {
    
    inline def setDataExecutionStatus(value: SchemaDataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSource(value: SchemaDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
