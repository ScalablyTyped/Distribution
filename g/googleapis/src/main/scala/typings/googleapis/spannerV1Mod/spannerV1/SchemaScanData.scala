package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScanData extends StObject {
  
  /**
    * Cloud Key Visualizer scan data. The range of time this information covers is captured via the above time range fields. Note, this field is not available to the ListScans method.
    */
  var data: js.UndefOr[SchemaVisualizationData] = js.undefined
  
  /**
    * The upper bound for when the contained data is defined.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A range of time (inclusive) for when the contained data is defined. The lower bound for when the contained data is defined.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaScanData {
  
  inline def apply(): SchemaScanData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanData]
  }
  
  extension [Self <: SchemaScanData](x: Self) {
    
    inline def setData(value: SchemaVisualizationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
