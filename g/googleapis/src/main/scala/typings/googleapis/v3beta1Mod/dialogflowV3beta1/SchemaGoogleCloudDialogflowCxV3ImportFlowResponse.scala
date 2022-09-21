package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ImportFlowResponse extends StObject {
  
  /**
    * The unique identifier of the new flow. Format: `projects//locations//agents//flows/`.
    */
  var flow: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ImportFlowResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ImportFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ImportFlowResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ImportFlowResponse](x: Self) {
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowNull: Self = StObject.set(x, "flow", null)
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
  }
}
