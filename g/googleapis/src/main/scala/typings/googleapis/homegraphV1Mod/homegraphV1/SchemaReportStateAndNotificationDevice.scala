package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportStateAndNotificationDevice extends StObject {
  
  /**
    * Notifications metadata for devices. See the **Device NOTIFICATIONS** section of the individual trait [reference guides](https://developers.google.com/assistant/smarthome/traits).
    */
  var notifications: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * States of devices to update. See the **Device STATES** section of the individual trait [reference guides](https://developers.google.com/assistant/smarthome/traits).
    */
  var states: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaReportStateAndNotificationDevice {
  
  inline def apply(): SchemaReportStateAndNotificationDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportStateAndNotificationDevice]
  }
  
  extension [Self <: SchemaReportStateAndNotificationDevice](x: Self) {
    
    inline def setNotifications(value: StringDictionary[Any]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsNull: Self = StObject.set(x, "notifications", null)
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setStates(value: StringDictionary[Any]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesNull: Self = StObject.set(x, "states", null)
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
  }
}
