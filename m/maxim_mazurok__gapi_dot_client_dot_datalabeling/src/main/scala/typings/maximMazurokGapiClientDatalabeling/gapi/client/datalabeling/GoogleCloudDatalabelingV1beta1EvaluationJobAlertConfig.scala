package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig extends StObject {
  
  /** Required. An email address to send alerts to. */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A number between 0 and 1 that describes a minimum mean average precision threshold. When the evaluation job runs, if it calculates that your model version's predictions
    * from the recent interval have meanAveragePrecision below this threshold, then it sends an alert to your specified email.
    */
  var minAcceptableMeanAveragePrecision: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setMinAcceptableMeanAveragePrecision(value: Double): Self = StObject.set(x, "minAcceptableMeanAveragePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAcceptableMeanAveragePrecisionUndefined: Self = StObject.set(x, "minAcceptableMeanAveragePrecision", js.undefined)
  }
}
