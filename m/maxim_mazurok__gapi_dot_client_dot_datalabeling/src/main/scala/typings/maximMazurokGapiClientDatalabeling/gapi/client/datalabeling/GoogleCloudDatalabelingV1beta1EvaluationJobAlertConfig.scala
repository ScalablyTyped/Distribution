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
  
  inline def apply(): GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setMinAcceptableMeanAveragePrecision(value: Double): Self = StObject.set(x, "minAcceptableMeanAveragePrecision", value.asInstanceOf[js.Any])
    
    inline def setMinAcceptableMeanAveragePrecisionUndefined: Self = StObject.set(x, "minAcceptableMeanAveragePrecision", js.undefined)
  }
}
