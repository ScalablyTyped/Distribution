package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig extends StObject {
  
  /**
    * Required. An email address to send alerts to.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A number between 0 and 1 that describes a minimum mean average precision threshold. When the evaluation job runs, if it calculates that your model version's predictions from the recent interval have meanAveragePrecision below this threshold, then it sends an alert to your specified email.
    */
  var minAcceptableMeanAveragePrecision: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1EvaluationJobAlertConfig](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setMinAcceptableMeanAveragePrecision(value: Double): Self = StObject.set(x, "minAcceptableMeanAveragePrecision", value.asInstanceOf[js.Any])
    
    inline def setMinAcceptableMeanAveragePrecisionNull: Self = StObject.set(x, "minAcceptableMeanAveragePrecision", null)
    
    inline def setMinAcceptableMeanAveragePrecisionUndefined: Self = StObject.set(x, "minAcceptableMeanAveragePrecision", js.undefined)
  }
}
