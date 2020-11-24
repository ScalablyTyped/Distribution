package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig extends js.Object {
  
  /** Required. An email address to send alerts to. */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Required. A number between 0 and 1 that describes a minimum mean average precision threshold. When the evaluation job runs, if it calculates that your model version's predictions
    * from the recent interval have meanAveragePrecision below this threshold, then it sends an alert to your specified email.
    */
  var minAcceptableMeanAveragePrecision: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigOps[Self <: GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setMinAcceptableMeanAveragePrecision(value: Double): Self = this.set("minAcceptableMeanAveragePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAcceptableMeanAveragePrecision: Self = this.set("minAcceptableMeanAveragePrecision", js.undefined)
  }
}
