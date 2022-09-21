package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStateAndNotificationPayload extends StObject {
  
  /**
    * The devices for updating state and sending notifications.
    */
  var devices: js.UndefOr[SchemaReportStateAndNotificationDevice] = js.undefined
}
object SchemaStateAndNotificationPayload {
  
  inline def apply(): SchemaStateAndNotificationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateAndNotificationPayload]
  }
  
  extension [Self <: SchemaStateAndNotificationPayload](x: Self) {
    
    inline def setDevices(value: SchemaReportStateAndNotificationDevice): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
  }
}
