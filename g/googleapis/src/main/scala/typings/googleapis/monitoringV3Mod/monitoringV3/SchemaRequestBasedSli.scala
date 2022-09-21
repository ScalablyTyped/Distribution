package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestBasedSli extends StObject {
  
  /**
    * distribution_cut is used when good_service is a count of values aggregated in a Distribution that fall into a good range. The total_service is the total count of all values aggregated in the Distribution.
    */
  var distributionCut: js.UndefOr[SchemaDistributionCut] = js.undefined
  
  /**
    * good_total_ratio is used when the ratio of good_service to total_service is computed from two TimeSeries.
    */
  var goodTotalRatio: js.UndefOr[SchemaTimeSeriesRatio] = js.undefined
}
object SchemaRequestBasedSli {
  
  inline def apply(): SchemaRequestBasedSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestBasedSli]
  }
  
  extension [Self <: SchemaRequestBasedSli](x: Self) {
    
    inline def setDistributionCut(value: SchemaDistributionCut): Self = StObject.set(x, "distributionCut", value.asInstanceOf[js.Any])
    
    inline def setDistributionCutUndefined: Self = StObject.set(x, "distributionCut", js.undefined)
    
    inline def setGoodTotalRatio(value: SchemaTimeSeriesRatio): Self = StObject.set(x, "goodTotalRatio", value.asInstanceOf[js.Any])
    
    inline def setGoodTotalRatioUndefined: Self = StObject.set(x, "goodTotalRatio", js.undefined)
  }
}
