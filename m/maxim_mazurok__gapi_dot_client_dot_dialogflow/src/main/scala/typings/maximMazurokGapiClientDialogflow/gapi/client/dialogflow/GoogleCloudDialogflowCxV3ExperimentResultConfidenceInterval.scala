package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval extends StObject {
  
  /** The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval. */
  var confidenceLevel: js.UndefOr[Double] = js.undefined
  
  /** Lower bound of the interval. */
  var lowerBound: js.UndefOr[Double] = js.undefined
  
  /** The percent change between an experiment metric's value and the value for its control. */
  var ratio: js.UndefOr[Double] = js.undefined
  
  /** Upper bound of the interval. */
  var upperBound: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval {
  
  inline def apply(): GoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ExperimentResultConfidenceInterval] (val x: Self) extends AnyVal {
    
    inline def setConfidenceLevel(value: Double): Self = StObject.set(x, "confidenceLevel", value.asInstanceOf[js.Any])
    
    inline def setConfidenceLevelUndefined: Self = StObject.set(x, "confidenceLevel", js.undefined)
    
    inline def setLowerBound(value: Double): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setUpperBound(value: Double): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
