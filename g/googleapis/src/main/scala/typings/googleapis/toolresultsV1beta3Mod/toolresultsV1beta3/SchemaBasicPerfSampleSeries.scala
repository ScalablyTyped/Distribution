package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the metadata for basic sample series represented by a line
  * chart
  */
trait SchemaBasicPerfSampleSeries extends StObject {
  
  var perfMetricType: js.UndefOr[String] = js.undefined
  
  var perfUnit: js.UndefOr[String] = js.undefined
  
  var sampleSeriesLabel: js.UndefOr[String] = js.undefined
}
object SchemaBasicPerfSampleSeries {
  
  inline def apply(): SchemaBasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicPerfSampleSeries]
  }
  
  extension [Self <: SchemaBasicPerfSampleSeries](x: Self) {
    
    inline def setPerfMetricType(value: String): Self = StObject.set(x, "perfMetricType", value.asInstanceOf[js.Any])
    
    inline def setPerfMetricTypeUndefined: Self = StObject.set(x, "perfMetricType", js.undefined)
    
    inline def setPerfUnit(value: String): Self = StObject.set(x, "perfUnit", value.asInstanceOf[js.Any])
    
    inline def setPerfUnitUndefined: Self = StObject.set(x, "perfUnit", js.undefined)
    
    inline def setSampleSeriesLabel(value: String): Self = StObject.set(x, "sampleSeriesLabel", value.asInstanceOf[js.Any])
    
    inline def setSampleSeriesLabelUndefined: Self = StObject.set(x, "sampleSeriesLabel", js.undefined)
  }
}
