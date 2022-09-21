package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSurveyResult extends StObject {
  
  /** The reason the user selected in the cancel survey. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** Only set for CANCEL_SURVEY_REASON_OTHERS. This is the user's freeform response to the survey. */
  var reasonUserInput: js.UndefOr[String] = js.undefined
}
object CancelSurveyResult {
  
  inline def apply(): CancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSurveyResult]
  }
  
  extension [Self <: CancelSurveyResult](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonUserInput(value: String): Self = StObject.set(x, "reasonUserInput", value.asInstanceOf[js.Any])
    
    inline def setReasonUserInputUndefined: Self = StObject.set(x, "reasonUserInput", js.undefined)
  }
}
