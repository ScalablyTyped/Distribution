package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3Deployment extends StObject {
  
  /**
    * End time of this deployment.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the flow version for this deployment. Format: projects//locations//agents//flows//versions/.
    */
  var flowVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the deployment. Format: projects//locations//agents//environments//deployments/.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Result of the deployment.
    */
  var result: js.UndefOr[SchemaGoogleCloudDialogflowCxV3DeploymentResult] = js.undefined
  
  /**
    * Start time of this deployment.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current state of the deployment.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3Deployment {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3Deployment]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3Deployment](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFlowVersion(value: String): Self = StObject.set(x, "flowVersion", value.asInstanceOf[js.Any])
    
    inline def setFlowVersionNull: Self = StObject.set(x, "flowVersion", null)
    
    inline def setFlowVersionUndefined: Self = StObject.set(x, "flowVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResult(value: SchemaGoogleCloudDialogflowCxV3DeploymentResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
