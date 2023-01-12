package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3DeployFlowRequest extends StObject {
  
  /** Required. The flow version to deploy. Format: `projects//locations//agents// flows//versions/`. */
  var flowVersion: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3DeployFlowRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3DeployFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3DeployFlowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3DeployFlowRequest] (val x: Self) extends AnyVal {
    
    inline def setFlowVersion(value: String): Self = StObject.set(x, "flowVersion", value.asInstanceOf[js.Any])
    
    inline def setFlowVersionUndefined: Self = StObject.set(x, "flowVersion", js.undefined)
  }
}
