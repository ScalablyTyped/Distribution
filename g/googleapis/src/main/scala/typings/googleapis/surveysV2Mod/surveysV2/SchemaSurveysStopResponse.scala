package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSurveysStopResponse extends StObject {
  
  /**
    * Unique request ID used for logging and debugging. Please include in any
    * error reporting or troubleshooting requests.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object SchemaSurveysStopResponse {
  
  @scala.inline
  def apply(): SchemaSurveysStopResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveysStopResponse]
  }
  
  @scala.inline
  implicit class SchemaSurveysStopResponseMutableBuilder[Self <: SchemaSurveysStopResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
