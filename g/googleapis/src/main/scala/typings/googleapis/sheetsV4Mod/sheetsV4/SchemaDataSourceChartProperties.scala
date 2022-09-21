package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceChartProperties extends StObject {
  
  /**
    * Output only. The data execution status.
    */
  var dataExecutionStatus: js.UndefOr[SchemaDataExecutionStatus] = js.undefined
  
  /**
    * ID of the data source that the chart is associated with.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataSourceChartProperties {
  
  inline def apply(): SchemaDataSourceChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceChartProperties]
  }
  
  extension [Self <: SchemaDataSourceChartProperties](x: Self) {
    
    inline def setDataExecutionStatus(value: SchemaDataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
