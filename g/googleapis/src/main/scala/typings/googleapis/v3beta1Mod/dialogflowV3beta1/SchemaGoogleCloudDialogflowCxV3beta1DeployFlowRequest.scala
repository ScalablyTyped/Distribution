package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1DeployFlowRequest extends StObject {
  
  /**
    * Required. The flow version to deploy. Format: `projects//locations//agents// flows//versions/`.
    */
  var flowVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1DeployFlowRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1DeployFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1DeployFlowRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1DeployFlowRequest](x: Self) {
    
    inline def setFlowVersion(value: String): Self = StObject.set(x, "flowVersion", value.asInstanceOf[js.Any])
    
    inline def setFlowVersionNull: Self = StObject.set(x, "flowVersion", null)
    
    inline def setFlowVersionUndefined: Self = StObject.set(x, "flowVersion", js.undefined)
  }
}
