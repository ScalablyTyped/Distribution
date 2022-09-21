package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata extends StObject {
  
  /** Required. Output only. The current state of this operation. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
