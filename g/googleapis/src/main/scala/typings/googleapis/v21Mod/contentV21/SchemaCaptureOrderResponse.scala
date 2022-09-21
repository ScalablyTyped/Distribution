package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCaptureOrderResponse extends StObject {
  
  /**
    * The status of the execution. Only defined if the request was successful. Acceptable values are: * "duplicate" * "executed"
    */
  var executionStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaCaptureOrderResponse {
  
  inline def apply(): SchemaCaptureOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCaptureOrderResponse]
  }
  
  extension [Self <: SchemaCaptureOrderResponse](x: Self) {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusNull: Self = StObject.set(x, "executionStatus", null)
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
  }
}
