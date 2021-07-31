package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSurveysStartResponse extends StObject {
  
  /**
    * Unique request ID used for logging and debugging. Please include in any
    * error reporting or troubleshooting requests.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object SchemaSurveysStartResponse {
  
  @scala.inline
  def apply(): SchemaSurveysStartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveysStartResponse]
  }
  
  @scala.inline
  implicit class SchemaSurveysStartResponseMutableBuilder[Self <: SchemaSurveysStartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
