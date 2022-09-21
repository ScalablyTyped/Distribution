package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceFormula extends StObject {
  
  /**
    * Output only. The data execution status.
    */
  var dataExecutionStatus: js.UndefOr[SchemaDataExecutionStatus] = js.undefined
  
  /**
    * The ID of the data source the formula is associated with.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataSourceFormula {
  
  inline def apply(): SchemaDataSourceFormula = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceFormula]
  }
  
  extension [Self <: SchemaDataSourceFormula](x: Self) {
    
    inline def setDataExecutionStatus(value: SchemaDataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
