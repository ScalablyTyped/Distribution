package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ExperimentResult extends StObject {
  
  /**
    * The last time the experiment's stats data was updated. Will have default value if stats have never been computed for this experiment.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version variants and metrics.
    */
  var versionMetrics: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetrics]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ExperimentResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ExperimentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ExperimentResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ExperimentResult](x: Self) {
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setVersionMetrics(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetrics]): Self = StObject.set(x, "versionMetrics", value.asInstanceOf[js.Any])
    
    inline def setVersionMetricsUndefined: Self = StObject.set(x, "versionMetrics", js.undefined)
    
    inline def setVersionMetricsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetrics*): Self = StObject.set(x, "versionMetrics", js.Array(value*))
  }
}
