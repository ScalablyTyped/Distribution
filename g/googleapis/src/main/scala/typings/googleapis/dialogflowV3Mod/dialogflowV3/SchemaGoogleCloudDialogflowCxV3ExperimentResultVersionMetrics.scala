package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ExperimentResultVersionMetrics extends StObject {
  
  /**
    * The metrics and corresponding confidence intervals in the inference result.
    */
  var metrics: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3ExperimentResultMetric]] = js.undefined
  
  /**
    * Number of sessions that were allocated to this version.
    */
  var sessionCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the flow Version. Format: `projects//locations//agents//flows//versions/`.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ExperimentResultVersionMetrics {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ExperimentResultVersionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ExperimentResultVersionMetrics]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ExperimentResultVersionMetrics](x: Self) {
    
    inline def setMetrics(value: js.Array[SchemaGoogleCloudDialogflowCxV3ExperimentResultMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaGoogleCloudDialogflowCxV3ExperimentResultMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    inline def setSessionCountNull: Self = StObject.set(x, "sessionCount", null)
    
    inline def setSessionCountUndefined: Self = StObject.set(x, "sessionCount", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
