package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1SubAgent extends StObject {
  
  /**
    * Optional. The unique identifier (`environment name` in dialogflow console) of this sub-agent environment. Assumes draft environment if `environment` is not set.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The project of this agent. Format: `projects/` or `projects//locations/`.
    */
  var project: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1SubAgent {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1SubAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SubAgent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1SubAgent](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
