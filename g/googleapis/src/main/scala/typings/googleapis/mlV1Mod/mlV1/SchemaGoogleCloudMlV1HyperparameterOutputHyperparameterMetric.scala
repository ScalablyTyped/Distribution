package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An observed value of a metric.
  */
trait SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends StObject {
  
  /**
    * The objective value at this training step.
    */
  var objectiveValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The global training step for this metric.
    */
  var trainingStep: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric {
  
  inline def apply(): SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric](x: Self) {
    
    inline def setObjectiveValue(value: Double): Self = StObject.set(x, "objectiveValue", value.asInstanceOf[js.Any])
    
    inline def setObjectiveValueUndefined: Self = StObject.set(x, "objectiveValue", js.undefined)
    
    inline def setTrainingStep(value: String): Self = StObject.set(x, "trainingStep", value.asInstanceOf[js.Any])
    
    inline def setTrainingStepUndefined: Self = StObject.set(x, "trainingStep", js.undefined)
  }
}
