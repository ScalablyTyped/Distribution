package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserPageLoadMetricV5 extends StObject {
  
  /**
    * The category of the specific time metric.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metric distributions. Proportions should sum up to 1.
    */
  var distributions: js.UndefOr[js.Array[SchemaBucket]] = js.undefined
  
  /**
    * Identifies the form factor of the metric being collected.
    */
  var formFactor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The median number of the metric, in millisecond.
    */
  var median: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Identifies the type of the metric.
    */
  var metricId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * We use this field to store certain percentile value for this metric. For v4, this field contains pc50. For v5, this field contains pc90.
    */
  var percentile: js.UndefOr[Double | Null] = js.undefined
}
object SchemaUserPageLoadMetricV5 {
  
  inline def apply(): SchemaUserPageLoadMetricV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPageLoadMetricV5]
  }
  
  extension [Self <: SchemaUserPageLoadMetricV5](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDistributions(value: js.Array[SchemaBucket]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: SchemaBucket*): Self = StObject.set(x, "distributions", js.Array(value*))
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorNull: Self = StObject.set(x, "formFactor", null)
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMedianNull: Self = StObject.set(x, "median", null)
    
    inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    inline def setMetricId(value: String): Self = StObject.set(x, "metricId", value.asInstanceOf[js.Any])
    
    inline def setMetricIdNull: Self = StObject.set(x, "metricId", null)
    
    inline def setMetricIdUndefined: Self = StObject.set(x, "metricId", js.undefined)
    
    inline def setPercentile(value: Double): Self = StObject.set(x, "percentile", value.asInstanceOf[js.Any])
    
    inline def setPercentileNull: Self = StObject.set(x, "percentile", null)
    
    inline def setPercentileUndefined: Self = StObject.set(x, "percentile", js.undefined)
  }
}
