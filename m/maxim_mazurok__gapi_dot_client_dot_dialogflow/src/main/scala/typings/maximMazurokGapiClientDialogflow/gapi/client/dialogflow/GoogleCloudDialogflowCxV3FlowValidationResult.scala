package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3FlowValidationResult extends StObject {
  
  /** The unique identifier of the flow validation result. Format: `projects//locations//agents//flows//validationResult`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Last time the flow was validated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Contains all validation messages. */
  var validationMessages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ValidationMessage]] = js.undefined
}
object GoogleCloudDialogflowCxV3FlowValidationResult {
  
  inline def apply(): GoogleCloudDialogflowCxV3FlowValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3FlowValidationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3FlowValidationResult] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setValidationMessages(value: js.Array[GoogleCloudDialogflowCxV3ValidationMessage]): Self = StObject.set(x, "validationMessages", value.asInstanceOf[js.Any])
    
    inline def setValidationMessagesUndefined: Self = StObject.set(x, "validationMessages", js.undefined)
    
    inline def setValidationMessagesVarargs(value: GoogleCloudDialogflowCxV3ValidationMessage*): Self = StObject.set(x, "validationMessages", js.Array(value*))
  }
}
