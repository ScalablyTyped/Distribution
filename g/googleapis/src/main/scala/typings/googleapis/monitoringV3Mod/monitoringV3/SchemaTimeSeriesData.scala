package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSeriesData extends StObject {
  
  /**
    * The values of the labels in the time series identifier, given in the same order as the label_descriptors field of the TimeSeriesDescriptor associated with this object. Each value must have a value of the type given in the corresponding entry of label_descriptors.
    */
  var labelValues: js.UndefOr[js.Array[SchemaLabelValue]] = js.undefined
  
  /**
    * The points in the time series.
    */
  var pointData: js.UndefOr[js.Array[SchemaPointData]] = js.undefined
}
object SchemaTimeSeriesData {
  
  inline def apply(): SchemaTimeSeriesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeriesData]
  }
  
  extension [Self <: SchemaTimeSeriesData](x: Self) {
    
    inline def setLabelValues(value: js.Array[SchemaLabelValue]): Self = StObject.set(x, "labelValues", value.asInstanceOf[js.Any])
    
    inline def setLabelValuesUndefined: Self = StObject.set(x, "labelValues", js.undefined)
    
    inline def setLabelValuesVarargs(value: SchemaLabelValue*): Self = StObject.set(x, "labelValues", js.Array(value*))
    
    inline def setPointData(value: js.Array[SchemaPointData]): Self = StObject.set(x, "pointData", value.asInstanceOf[js.Any])
    
    inline def setPointDataUndefined: Self = StObject.set(x, "pointData", js.undefined)
    
    inline def setPointDataVarargs(value: SchemaPointData*): Self = StObject.set(x, "pointData", js.Array(value*))
  }
}
