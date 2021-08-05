package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The headers for the metrics.
  */
trait SchemaMetricHeader extends StObject {
  
  /**
    * Headers for the metrics in the response.
    */
  var metricHeaderEntries: js.UndefOr[js.Array[SchemaMetricHeaderEntry]] = js.undefined
  
  /**
    * Headers for the pivots in the response.
    */
  var pivotHeaders: js.UndefOr[js.Array[SchemaPivotHeader]] = js.undefined
}
object SchemaMetricHeader {
  
  inline def apply(): SchemaMetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricHeader]
  }
  
  extension [Self <: SchemaMetricHeader](x: Self) {
    
    inline def setMetricHeaderEntries(value: js.Array[SchemaMetricHeaderEntry]): Self = StObject.set(x, "metricHeaderEntries", value.asInstanceOf[js.Any])
    
    inline def setMetricHeaderEntriesUndefined: Self = StObject.set(x, "metricHeaderEntries", js.undefined)
    
    inline def setMetricHeaderEntriesVarargs(value: SchemaMetricHeaderEntry*): Self = StObject.set(x, "metricHeaderEntries", js.Array(value :_*))
    
    inline def setPivotHeaders(value: js.Array[SchemaPivotHeader]): Self = StObject.set(x, "pivotHeaders", value.asInstanceOf[js.Any])
    
    inline def setPivotHeadersUndefined: Self = StObject.set(x, "pivotHeaders", js.undefined)
    
    inline def setPivotHeadersVarargs(value: SchemaPivotHeader*): Self = StObject.set(x, "pivotHeaders", js.Array(value :_*))
  }
}
