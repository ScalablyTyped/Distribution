package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information provided by the user when they complete the subscription
  * cancellation flow (cancellation reason survey).
  */
trait SchemaSubscriptionCancelSurveyResult extends StObject {
  
  /**
    * The cancellation reason the user chose in the survey. Possible values
    * are:   - Other  - I don&#39;t use this service enough  - Technical issues
    * - Cost-related reasons  - I found a better app
    */
  var cancelSurveyReason: js.UndefOr[Double] = js.undefined
  
  /**
    * The customized input cancel reason from the user. Only present when
    * cancelReason is 0.
    */
  var userInputCancelReason: js.UndefOr[String] = js.undefined
}
object SchemaSubscriptionCancelSurveyResult {
  
  @scala.inline
  def apply(): SchemaSubscriptionCancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionCancelSurveyResult]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionCancelSurveyResultMutableBuilder[Self <: SchemaSubscriptionCancelSurveyResult] (val x: Self) extends AnyVal {
    
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
