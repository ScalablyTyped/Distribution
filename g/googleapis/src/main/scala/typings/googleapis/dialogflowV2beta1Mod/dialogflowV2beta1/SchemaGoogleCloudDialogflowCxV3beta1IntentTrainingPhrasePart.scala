package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePart extends StObject {
  
  /**
    * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
    */
  var parameterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The text for this part.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePart {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePart]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePart](x: Self) {
    
    inline def setParameterId(value: String): Self = StObject.set(x, "parameterId", value.asInstanceOf[js.Any])
    
    inline def setParameterIdNull: Self = StObject.set(x, "parameterId", null)
    
    inline def setParameterIdUndefined: Self = StObject.set(x, "parameterId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
