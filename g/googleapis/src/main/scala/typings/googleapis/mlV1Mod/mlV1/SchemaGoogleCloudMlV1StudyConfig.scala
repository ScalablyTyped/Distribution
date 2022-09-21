package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1StudyConfig extends StObject {
  
  /**
    * The search algorithm specified for the study.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for automated stopping of unpromising Trials.
    */
  var automatedStoppingConfig: js.UndefOr[SchemaGoogleCloudMlV1AutomatedStoppingConfig] = js.undefined
  
  /**
    * Metric specs for the study.
    */
  var metrics: js.UndefOr[js.Array[SchemaGoogleCloudMlV1StudyConfigMetricSpec]] = js.undefined
  
  /**
    * Required. The set of parameters to tune.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudMlV1StudyConfigParameterSpec]] = js.undefined
}
object SchemaGoogleCloudMlV1StudyConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1StudyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1StudyConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1StudyConfig](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setAutomatedStoppingConfig(value: SchemaGoogleCloudMlV1AutomatedStoppingConfig): Self = StObject.set(x, "automatedStoppingConfig", value.asInstanceOf[js.Any])
    
    inline def setAutomatedStoppingConfigUndefined: Self = StObject.set(x, "automatedStoppingConfig", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaGoogleCloudMlV1StudyConfigMetricSpec]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaGoogleCloudMlV1StudyConfigMetricSpec*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setParameters(value: js.Array[SchemaGoogleCloudMlV1StudyConfigParameterSpec]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaGoogleCloudMlV1StudyConfigParameterSpec*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
