package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportStateAndNotificationResponse extends StObject {
  
  /**
    * Request ID copied from ReportStateAndNotificationRequest.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportStateAndNotificationResponse {
  
  inline def apply(): SchemaReportStateAndNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportStateAndNotificationResponse]
  }
  
  extension [Self <: SchemaReportStateAndNotificationResponse](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
