package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicPerfSampleSeries extends StObject {
  
  var perfMetricType: js.UndefOr[String | Null] = js.undefined
  
  var perfUnit: js.UndefOr[String | Null] = js.undefined
  
  var sampleSeriesLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaBasicPerfSampleSeries {
  
  inline def apply(): SchemaBasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicPerfSampleSeries]
  }
  
  extension [Self <: SchemaBasicPerfSampleSeries](x: Self) {
    
    inline def setPerfMetricType(value: String): Self = StObject.set(x, "perfMetricType", value.asInstanceOf[js.Any])
    
    inline def setPerfMetricTypeNull: Self = StObject.set(x, "perfMetricType", null)
    
    inline def setPerfMetricTypeUndefined: Self = StObject.set(x, "perfMetricType", js.undefined)
    
    inline def setPerfUnit(value: String): Self = StObject.set(x, "perfUnit", value.asInstanceOf[js.Any])
    
    inline def setPerfUnitNull: Self = StObject.set(x, "perfUnit", null)
    
    inline def setPerfUnitUndefined: Self = StObject.set(x, "perfUnit", js.undefined)
    
    inline def setSampleSeriesLabel(value: String): Self = StObject.set(x, "sampleSeriesLabel", value.asInstanceOf[js.Any])
    
    inline def setSampleSeriesLabelNull: Self = StObject.set(x, "sampleSeriesLabel", null)
    
    inline def setSampleSeriesLabelUndefined: Self = StObject.set(x, "sampleSeriesLabel", js.undefined)
  }
}
