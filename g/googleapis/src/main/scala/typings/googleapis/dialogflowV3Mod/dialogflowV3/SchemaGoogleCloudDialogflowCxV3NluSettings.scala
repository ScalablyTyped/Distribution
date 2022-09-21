package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3NluSettings extends StObject {
  
  /**
    * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
    */
  var classificationThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Indicates NLU model training mode.
    */
  var modelTrainingMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the type of NLU model.
    */
  var modelType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3NluSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3NluSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3NluSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3NluSettings](x: Self) {
    
    inline def setClassificationThreshold(value: Double): Self = StObject.set(x, "classificationThreshold", value.asInstanceOf[js.Any])
    
    inline def setClassificationThresholdNull: Self = StObject.set(x, "classificationThreshold", null)
    
    inline def setClassificationThresholdUndefined: Self = StObject.set(x, "classificationThreshold", js.undefined)
    
    inline def setModelTrainingMode(value: String): Self = StObject.set(x, "modelTrainingMode", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingModeNull: Self = StObject.set(x, "modelTrainingMode", null)
    
    inline def setModelTrainingModeUndefined: Self = StObject.set(x, "modelTrainingMode", js.undefined)
    
    inline def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeNull: Self = StObject.set(x, "modelType", null)
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
  }
}
