package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents results of a prediction job.
  */
trait SchemaGoogleCloudMlV1PredictionOutput extends StObject {
  
  /**
    * The number of data instances which resulted in errors.
    */
  var errorCount: js.UndefOr[String] = js.undefined
  
  /**
    * Node hours used by the batch prediction job.
    */
  var nodeHours: js.UndefOr[Double] = js.undefined
  
  /**
    * The output Google Cloud Storage location provided at the job creation
    * time.
    */
  var outputPath: js.UndefOr[String] = js.undefined
  
  /**
    * The number of generated predictions.
    */
  var predictionCount: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1PredictionOutput {
  
  inline def apply(): SchemaGoogleCloudMlV1PredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictionOutput]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1PredictionOutput](x: Self) {
    
    inline def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setNodeHours(value: Double): Self = StObject.set(x, "nodeHours", value.asInstanceOf[js.Any])
    
    inline def setNodeHoursUndefined: Self = StObject.set(x, "nodeHours", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPredictionCount(value: String): Self = StObject.set(x, "predictionCount", value.asInstanceOf[js.Any])
    
    inline def setPredictionCountUndefined: Self = StObject.set(x, "predictionCount", js.undefined)
  }
}
