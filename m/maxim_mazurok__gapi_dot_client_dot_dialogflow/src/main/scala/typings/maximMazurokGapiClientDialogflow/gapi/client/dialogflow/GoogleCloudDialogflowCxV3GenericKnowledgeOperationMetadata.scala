package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata extends StObject {
  
  /** Required. Output only. The current state of this operation. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
