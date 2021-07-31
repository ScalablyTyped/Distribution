package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata extends StObject {
  
  /** Required. Output only. The current state of this operation. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1KnowledgeOperationMetadataMutableBuilder[Self <: GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
