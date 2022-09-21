package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3DeployFlowRequest extends StObject {
  
  /**
    * Required. The flow version to deploy. Format: `projects//locations//agents// flows//versions/`.
    */
  var flowVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3DeployFlowRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3DeployFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3DeployFlowRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3DeployFlowRequest](x: Self) {
    
    inline def setFlowVersion(value: String): Self = StObject.set(x, "flowVersion", value.asInstanceOf[js.Any])
    
    inline def setFlowVersionNull: Self = StObject.set(x, "flowVersion", null)
    
    inline def setFlowVersionUndefined: Self = StObject.set(x, "flowVersion", js.undefined)
  }
}
