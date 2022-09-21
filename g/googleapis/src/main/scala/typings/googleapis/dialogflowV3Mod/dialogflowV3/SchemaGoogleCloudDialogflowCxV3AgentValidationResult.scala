package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3AgentValidationResult extends StObject {
  
  /**
    * Contains all flow validation results.
    */
  var flowValidationResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3FlowValidationResult]] = js.undefined
  
  /**
    * The unique identifier of the agent validation result. Format: `projects//locations//agents//validationResult`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3AgentValidationResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3AgentValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3AgentValidationResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3AgentValidationResult](x: Self) {
    
    inline def setFlowValidationResults(value: js.Array[SchemaGoogleCloudDialogflowCxV3FlowValidationResult]): Self = StObject.set(x, "flowValidationResults", value.asInstanceOf[js.Any])
    
    inline def setFlowValidationResultsUndefined: Self = StObject.set(x, "flowValidationResults", js.undefined)
    
    inline def setFlowValidationResultsVarargs(value: SchemaGoogleCloudDialogflowCxV3FlowValidationResult*): Self = StObject.set(x, "flowValidationResults", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
