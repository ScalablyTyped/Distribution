package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval extends StObject {
  
  /**
    * The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
    */
  var confidenceLevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Lower bound of the interval.
    */
  var lowerBound: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The percent change between an experiment metric's value and the value for its control.
    */
  var ratio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Upper bound of the interval.
    */
  var upperBound: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval](x: Self) {
    
    inline def setConfidenceLevel(value: Double): Self = StObject.set(x, "confidenceLevel", value.asInstanceOf[js.Any])
    
    inline def setConfidenceLevelNull: Self = StObject.set(x, "confidenceLevel", null)
    
    inline def setConfidenceLevelUndefined: Self = StObject.set(x, "confidenceLevel", js.undefined)
    
    inline def setLowerBound(value: Double): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundNull: Self = StObject.set(x, "lowerBound", null)
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioNull: Self = StObject.set(x, "ratio", null)
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setUpperBound(value: Double): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundNull: Self = StObject.set(x, "upperBound", null)
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
