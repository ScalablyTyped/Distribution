package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3AgentValidationResult extends StObject {
  
  /** Contains all flow validation results. */
  var flowValidationResults: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3FlowValidationResult]] = js.undefined
  
  /** The unique identifier of the agent validation result. Format: `projects//locations//agents//validationResult`. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3AgentValidationResult {
  
  inline def apply(): GoogleCloudDialogflowCxV3AgentValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3AgentValidationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3AgentValidationResult] (val x: Self) extends AnyVal {
    
    inline def setFlowValidationResults(value: js.Array[GoogleCloudDialogflowCxV3FlowValidationResult]): Self = StObject.set(x, "flowValidationResults", value.asInstanceOf[js.Any])
    
    inline def setFlowValidationResultsUndefined: Self = StObject.set(x, "flowValidationResults", js.undefined)
    
    inline def setFlowValidationResultsVarargs(value: GoogleCloudDialogflowCxV3FlowValidationResult*): Self = StObject.set(x, "flowValidationResults", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
