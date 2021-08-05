package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A row in the report.
  */
trait SchemaReportRow extends StObject {
  
  /**
    * List of requested dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of metrics for each requested DateRange.
    */
  var metrics: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.undefined
}
object SchemaReportRow {
  
  inline def apply(): SchemaReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRow]
  }
  
  extension [Self <: SchemaReportRow](x: Self) {
    
    inline def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setMetrics(value: js.Array[SchemaDateRangeValues]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaDateRangeValues*): Self = StObject.set(x, "metrics", js.Array(value :_*))
  }
}
