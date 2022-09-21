package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertFeedbackResponse extends StObject {
  
  /** The list of alert feedback. Feedback entries for each alert are ordered by creation time descending. */
  var feedback: js.UndefOr[js.Array[AlertFeedback]] = js.undefined
}
object ListAlertFeedbackResponse {
  
  inline def apply(): ListAlertFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertFeedbackResponse]
  }
  
  extension [Self <: ListAlertFeedbackResponse](x: Self) {
    
    inline def setFeedback(value: js.Array[AlertFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setFeedbackVarargs(value: AlertFeedback*): Self = StObject.set(x, "feedback", js.Array(value*))
  }
}
