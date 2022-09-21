package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1HumanReviewStatus extends StObject {
  
  /**
    * The name of the operation triggered by the processed document. This field is populated only when the [state] is [HUMAN_REVIEW_IN_PROGRESS]. It has the same response type and metadata as the long running operation returned by [ReviewDocument] method.
    */
  var humanReviewOperation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of human review on the processing request.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message providing more details about the human review state.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1HumanReviewStatus {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1HumanReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1HumanReviewStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1HumanReviewStatus](x: Self) {
    
    inline def setHumanReviewOperation(value: String): Self = StObject.set(x, "humanReviewOperation", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewOperationNull: Self = StObject.set(x, "humanReviewOperation", null)
    
    inline def setHumanReviewOperationUndefined: Self = StObject.set(x, "humanReviewOperation", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
