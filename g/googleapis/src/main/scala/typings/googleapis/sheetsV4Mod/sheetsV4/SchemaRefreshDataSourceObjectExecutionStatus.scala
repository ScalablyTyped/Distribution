package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRefreshDataSourceObjectExecutionStatus extends StObject {
  
  /**
    * The data execution status.
    */
  var dataExecutionStatus: js.UndefOr[SchemaDataExecutionStatus] = js.undefined
  
  /**
    * Reference to a data source object being refreshed.
    */
  var reference: js.UndefOr[SchemaDataSourceObjectReference] = js.undefined
}
object SchemaRefreshDataSourceObjectExecutionStatus {
  
  inline def apply(): SchemaRefreshDataSourceObjectExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefreshDataSourceObjectExecutionStatus]
  }
  
  extension [Self <: SchemaRefreshDataSourceObjectExecutionStatus](x: Self) {
    
    inline def setDataExecutionStatus(value: SchemaDataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setReference(value: SchemaDataSourceObjectReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
