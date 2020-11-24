package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionCancelSurveyResult extends js.Object {
  
  /**
    * The cancellation reason the user chose in the survey. Possible values are: 0. Other 1. I don't use this service enough 2. Technical issues 3. Cost-related reasons 4. I found a
    * better app
    */
  var cancelSurveyReason: js.UndefOr[Double] = js.native
  
  /** The customized input cancel reason from the user. Only present when cancelReason is 0. */
  var userInputCancelReason: js.UndefOr[String] = js.native
}
object SubscriptionCancelSurveyResult {
  
  @scala.inline
  def apply(): SubscriptionCancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionCancelSurveyResult]
  }
  
  @scala.inline
  implicit class SubscriptionCancelSurveyResultOps[Self <: SubscriptionCancelSurveyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancelSurveyReason(value: Double): Self = this.set("cancelSurveyReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelSurveyReason: Self = this.set("cancelSurveyReason", js.undefined)
    
    @scala.inline
    def setUserInputCancelReason(value: String): Self = this.set("userInputCancelReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInputCancelReason: Self = this.set("userInputCancelReason", js.undefined)
  }
}
