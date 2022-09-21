package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SmartReplyModelMetadata extends StObject {
  
  /**
    * Optional. Type of the smart reply model. If not provided, model_type is used.
    */
  var trainingModelType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SmartReplyModelMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SmartReplyModelMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SmartReplyModelMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SmartReplyModelMetadata](x: Self) {
    
    inline def setTrainingModelType(value: String): Self = StObject.set(x, "trainingModelType", value.asInstanceOf[js.Any])
    
    inline def setTrainingModelTypeNull: Self = StObject.set(x, "trainingModelType", null)
    
    inline def setTrainingModelTypeUndefined: Self = StObject.set(x, "trainingModelType", js.undefined)
  }
}
