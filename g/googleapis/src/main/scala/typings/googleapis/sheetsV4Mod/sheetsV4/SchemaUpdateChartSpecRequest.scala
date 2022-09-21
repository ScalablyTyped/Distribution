package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateChartSpecRequest extends StObject {
  
  /**
    * The ID of the chart to update.
    */
  var chartId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The specification to apply to the chart.
    */
  var spec: js.UndefOr[SchemaChartSpec] = js.undefined
}
object SchemaUpdateChartSpecRequest {
  
  inline def apply(): SchemaUpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateChartSpecRequest]
  }
  
  extension [Self <: SchemaUpdateChartSpecRequest](x: Self) {
    
    inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setChartIdNull: Self = StObject.set(x, "chartId", null)
    
    inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    inline def setSpec(value: SchemaChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
