package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3IntentTrainingPhrasePart extends StObject {
  
  /** The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase. */
  var parameterId: js.UndefOr[String] = js.undefined
  
  /** Required. The text for this part. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3IntentTrainingPhrasePart {
  
  inline def apply(): GoogleCloudDialogflowCxV3IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3IntentTrainingPhrasePart]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3IntentTrainingPhrasePart](x: Self) {
    
    inline def setParameterId(value: String): Self = StObject.set(x, "parameterId", value.asInstanceOf[js.Any])
    
    inline def setParameterIdUndefined: Self = StObject.set(x, "parameterId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
