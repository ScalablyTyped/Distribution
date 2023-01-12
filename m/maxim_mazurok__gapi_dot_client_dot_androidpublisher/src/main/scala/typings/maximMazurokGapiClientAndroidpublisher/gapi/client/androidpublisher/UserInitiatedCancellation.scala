package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInitiatedCancellation extends StObject {
  
  /** Information provided by the user when they complete the subscription cancellation flow (cancellation reason survey). */
  var cancelSurveyResult: js.UndefOr[CancelSurveyResult] = js.undefined
  
  /**
    * The time at which the subscription was canceled by the user. The user might still have access to the subscription after this time. Use line_items.expiry_time to determine if a user
    * still has access.
    */
  var cancelTime: js.UndefOr[String] = js.undefined
}
object UserInitiatedCancellation {
  
  inline def apply(): UserInitiatedCancellation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInitiatedCancellation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserInitiatedCancellation] (val x: Self) extends AnyVal {
    
    inline def setCancelSurveyResult(value: CancelSurveyResult): Self = StObject.set(x, "cancelSurveyResult", value.asInstanceOf[js.Any])
    
    inline def setCancelSurveyResultUndefined: Self = StObject.set(x, "cancelSurveyResult", js.undefined)
    
    inline def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
  }
}
