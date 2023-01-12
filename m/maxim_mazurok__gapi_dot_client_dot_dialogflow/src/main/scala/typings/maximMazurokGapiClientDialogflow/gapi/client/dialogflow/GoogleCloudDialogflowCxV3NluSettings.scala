package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3NluSettings extends StObject {
  
  /**
    * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the
    * returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain).
    * If set to 0.0, the default of 0.3 is used.
    */
  var classificationThreshold: js.UndefOr[Double] = js.undefined
  
  /** Indicates NLU model training mode. */
  var modelTrainingMode: js.UndefOr[String] = js.undefined
  
  /** Indicates the type of NLU model. */
  var modelType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3NluSettings {
  
  inline def apply(): GoogleCloudDialogflowCxV3NluSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3NluSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3NluSettings] (val x: Self) extends AnyVal {
    
    inline def setClassificationThreshold(value: Double): Self = StObject.set(x, "classificationThreshold", value.asInstanceOf[js.Any])
    
    inline def setClassificationThresholdUndefined: Self = StObject.set(x, "classificationThreshold", js.undefined)
    
    inline def setModelTrainingMode(value: String): Self = StObject.set(x, "modelTrainingMode", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingModeUndefined: Self = StObject.set(x, "modelTrainingMode", js.undefined)
    
    inline def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
  }
}
