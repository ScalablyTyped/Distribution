package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1AgentValidationResult extends StObject {
  
  /**
    * Contains all flow validation results.
    */
  var flowValidationResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]] = js.undefined
  
  /**
    * The unique identifier of the agent validation result. Format: `projects//locations//agents//validationResult`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1AgentValidationResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1AgentValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1AgentValidationResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1AgentValidationResult](x: Self) {
    
    inline def setFlowValidationResults(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult]): Self = StObject.set(x, "flowValidationResults", value.asInstanceOf[js.Any])
    
    inline def setFlowValidationResultsUndefined: Self = StObject.set(x, "flowValidationResults", js.undefined)
    
    inline def setFlowValidationResultsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1FlowValidationResult*): Self = StObject.set(x, "flowValidationResults", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
