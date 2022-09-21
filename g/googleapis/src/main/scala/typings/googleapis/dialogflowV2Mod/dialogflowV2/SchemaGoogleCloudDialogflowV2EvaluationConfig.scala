package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2EvaluationConfig extends StObject {
  
  /**
    * Required. Datasets used for evaluation.
    */
  var datasets: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2InputDataset]] = js.undefined
  
  /**
    * Configuration for smart compose model evalution.
    */
  var smartComposeConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2EvaluationConfigSmartComposeConfig] = js.undefined
  
  /**
    * Configuration for smart reply model evalution.
    */
  var smartReplyConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2EvaluationConfigSmartReplyConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2EvaluationConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2EvaluationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EvaluationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2EvaluationConfig](x: Self) {
    
    inline def setDatasets(value: js.Array[SchemaGoogleCloudDialogflowV2InputDataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: SchemaGoogleCloudDialogflowV2InputDataset*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setSmartComposeConfig(value: SchemaGoogleCloudDialogflowV2EvaluationConfigSmartComposeConfig): Self = StObject.set(x, "smartComposeConfig", value.asInstanceOf[js.Any])
    
    inline def setSmartComposeConfigUndefined: Self = StObject.set(x, "smartComposeConfig", js.undefined)
    
    inline def setSmartReplyConfig(value: SchemaGoogleCloudDialogflowV2EvaluationConfigSmartReplyConfig): Self = StObject.set(x, "smartReplyConfig", value.asInstanceOf[js.Any])
    
    inline def setSmartReplyConfigUndefined: Self = StObject.set(x, "smartReplyConfig", js.undefined)
  }
}
