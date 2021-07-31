package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionCancelSurveyResult extends StObject {
  
  /**
    * The cancellation reason the user chose in the survey. Possible values are: 0. Other 1. I don't use this service enough 2. Technical issues 3. Cost-related reasons 4. I found a
    * better app
    */
  var cancelSurveyReason: js.UndefOr[Double] = js.undefined
  
  /** The customized input cancel reason from the user. Only present when cancelReason is 0. */
  var userInputCancelReason: js.UndefOr[String] = js.undefined
}
object SubscriptionCancelSurveyResult {
  
  @scala.inline
  def apply(): SubscriptionCancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionCancelSurveyResult]
  }
  
  @scala.inline
  implicit class SubscriptionCancelSurveyResultMutableBuilder[Self <: SubscriptionCancelSurveyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelSurveyReason(value: Double): Self = StObject.set(x, "cancelSurveyReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelSurveyReasonUndefined: Self = StObject.set(x, "cancelSurveyReason", js.undefined)
    
    @scala.inline
    def setUserInputCancelReason(value: String): Self = StObject.set(x, "userInputCancelReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInputCancelReasonUndefined: Self = StObject.set(x, "userInputCancelReason", js.undefined)
  }
}
