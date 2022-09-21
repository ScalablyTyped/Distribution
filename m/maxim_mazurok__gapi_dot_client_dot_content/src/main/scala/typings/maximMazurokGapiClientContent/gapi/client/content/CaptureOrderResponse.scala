package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureOrderResponse extends StObject {
  
  /** The status of the execution. Only defined if the request was successful. Acceptable values are: * "duplicate" * "executed" */
  var executionStatus: js.UndefOr[String] = js.undefined
}
object CaptureOrderResponse {
  
  inline def apply(): CaptureOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureOrderResponse]
  }
  
  extension [Self <: CaptureOrderResponse](x: Self) {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
  }
}
