package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSurveysStartRequest extends StObject {
  
  /**
    * *Deprecated* Threshold to start a survey automatically if the quoted
    * prices is less than or equal to this value. See Survey.Cost for more
    * details. This will no longer be available after June 2018.
    */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.undefined
}
object SchemaSurveysStartRequest {
  
  @scala.inline
  def apply(): SchemaSurveysStartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveysStartRequest]
  }
  
  @scala.inline
  implicit class SchemaSurveysStartRequestMutableBuilder[Self <: SchemaSurveysStartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCostPerResponseNanos(value: String): Self = StObject.set(x, "maxCostPerResponseNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCostPerResponseNanosUndefined: Self = StObject.set(x, "maxCostPerResponseNanos", js.undefined)
  }
}
