package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Deployment extends StObject {
  
  /** End time of this deployment. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The name of the flow version for this deployment. Format: projects//locations//agents//flows//versions/. */
  var flowVersion: js.UndefOr[String] = js.undefined
  
  /** The name of the deployment. Format: projects//locations//agents//environments//deployments/. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Result of the deployment. */
  var result: js.UndefOr[GoogleCloudDialogflowCxV3DeploymentResult] = js.undefined
  
  /** Start time of this deployment. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The current state of the deployment. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3Deployment {
  
  inline def apply(): GoogleCloudDialogflowCxV3Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Deployment]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3Deployment](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFlowVersion(value: String): Self = StObject.set(x, "flowVersion", value.asInstanceOf[js.Any])
    
    inline def setFlowVersionUndefined: Self = StObject.set(x, "flowVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResult(value: GoogleCloudDialogflowCxV3DeploymentResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
