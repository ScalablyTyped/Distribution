package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1StudyConfigMetricSpec extends StObject {
  
  /**
    * Required. The optimization goal of the metric.
    */
  var goal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the metric.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1StudyConfigMetricSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1StudyConfigMetricSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1StudyConfigMetricSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1StudyConfigMetricSpec](x: Self) {
    
    inline def setGoal(value: String): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalNull: Self = StObject.set(x, "goal", null)
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
