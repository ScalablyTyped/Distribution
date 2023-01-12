package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ExperimentResult extends StObject {
  
  /** The last time the experiment's stats data was updated. Will have default value if stats have never been computed for this experiment. */
  var lastUpdateTime: js.UndefOr[String] = js.undefined
  
  /** Version variants and metrics. */
  var versionMetrics: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics]] = js.undefined
}
object GoogleCloudDialogflowCxV3ExperimentResult {
  
  inline def apply(): GoogleCloudDialogflowCxV3ExperimentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ExperimentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ExperimentResult] (val x: Self) extends AnyVal {
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setVersionMetrics(value: js.Array[GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics]): Self = StObject.set(x, "versionMetrics", value.asInstanceOf[js.Any])
    
    inline def setVersionMetricsUndefined: Self = StObject.set(x, "versionMetrics", js.undefined)
    
    inline def setVersionMetricsVarargs(value: GoogleCloudDialogflowCxV3ExperimentResultVersionMetrics*): Self = StObject.set(x, "versionMetrics", js.Array(value*))
  }
}
