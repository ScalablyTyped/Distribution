package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionalityReductionMetrics extends StObject {
  
  /** Total percentage of variance explained by the selected principal components. */
  var totalExplainedVarianceRatio: js.UndefOr[Double] = js.undefined
}
object DimensionalityReductionMetrics {
  
  inline def apply(): DimensionalityReductionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionalityReductionMetrics]
  }
  
  extension [Self <: DimensionalityReductionMetrics](x: Self) {
    
    inline def setTotalExplainedVarianceRatio(value: Double): Self = StObject.set(x, "totalExplainedVarianceRatio", value.asInstanceOf[js.Any])
    
    inline def setTotalExplainedVarianceRatioUndefined: Self = StObject.set(x, "totalExplainedVarianceRatio", js.undefined)
  }
}
