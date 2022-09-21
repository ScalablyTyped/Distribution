package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDevicesReportstateandnotification
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReportStateAndNotificationRequest] = js.undefined
}
object ParamsResourceDevicesReportstateandnotification {
  
  inline def apply(): ParamsResourceDevicesReportstateandnotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDevicesReportstateandnotification]
  }
  
  extension [Self <: ParamsResourceDevicesReportstateandnotification](x: Self) {
    
    inline def setRequestBody(value: SchemaReportStateAndNotificationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
