package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for an alert feedback listing request.
  */
trait SchemaListAlertFeedbackResponse extends StObject {
  
  /**
    * The list of alert feedback. Feedback entries for each alert are ordered
    * by creation time descending.
    */
  var feedback: js.UndefOr[js.Array[SchemaAlertFeedback]] = js.undefined
}
object SchemaListAlertFeedbackResponse {
  
  @scala.inline
  def apply(): SchemaListAlertFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertFeedbackResponse]
  }
  
  @scala.inline
  implicit class SchemaListAlertFeedbackResponseMutableBuilder[Self <: SchemaListAlertFeedbackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedback(value: js.Array[SchemaAlertFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    @scala.inline
    def setFeedbackVarargs(value: SchemaAlertFeedback*): Self = StObject.set(x, "feedback", js.Array(value :_*))
  }
}
