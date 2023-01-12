package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ExperimentResultMetric extends StObject {
  
  /** The probability that the treatment is better than all other treatments in the experiment */
  var confidenceInterval: js.UndefOr[GoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval] = js.undefined
  
  /** Count value of a metric. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** Count-based metric type. Only one of type or count_type is specified in each Metric. */
  var countType: js.UndefOr[String] = js.undefined
  
  /** Ratio value of a metric. */
  var ratio: js.UndefOr[Double] = js.undefined
  
  /** Ratio-based metric type. Only one of type or count_type is specified in each Metric. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ExperimentResultMetric {
  
  inline def apply(): GoogleCloudDialogflowCxV3ExperimentResultMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ExperimentResultMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ExperimentResultMetric] (val x: Self) extends AnyVal {
    
    inline def setConfidenceInterval(value: GoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval): Self = StObject.set(x, "confidenceInterval", value.asInstanceOf[js.Any])
    
    inline def setConfidenceIntervalUndefined: Self = StObject.set(x, "confidenceInterval", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountType(value: String): Self = StObject.set(x, "countType", value.asInstanceOf[js.Any])
    
    inline def setCountTypeUndefined: Self = StObject.set(x, "countType", js.undefined)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
