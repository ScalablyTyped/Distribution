package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistributionCut extends StObject {
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var distributionFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
    */
  var range: js.UndefOr[SchemaGoogleMonitoringV3Range] = js.undefined
}
object SchemaDistributionCut {
  
  inline def apply(): SchemaDistributionCut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionCut]
  }
  
  extension [Self <: SchemaDistributionCut](x: Self) {
    
    inline def setDistributionFilter(value: String): Self = StObject.set(x, "distributionFilter", value.asInstanceOf[js.Any])
    
    inline def setDistributionFilterNull: Self = StObject.set(x, "distributionFilter", null)
    
    inline def setDistributionFilterUndefined: Self = StObject.set(x, "distributionFilter", js.undefined)
    
    inline def setRange(value: SchemaGoogleMonitoringV3Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
