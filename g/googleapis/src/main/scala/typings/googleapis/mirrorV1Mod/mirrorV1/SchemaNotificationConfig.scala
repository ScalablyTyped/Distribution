package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls how notifications for a timeline item are presented to the user.
  */
trait SchemaNotificationConfig extends StObject {
  
  /**
    * The time at which the notification should be delivered.
    */
  var deliveryTime: js.UndefOr[String] = js.undefined
  
  /**
    * Describes how important the notification is. Allowed values are:   -
    * DEFAULT - Notifications of default importance. A chime will be played to
    * alert users.
    */
  var level: js.UndefOr[String] = js.undefined
}
object SchemaNotificationConfig {
  
  inline def apply(): SchemaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationConfig]
  }
  
  extension [Self <: SchemaNotificationConfig](x: Self) {
    
    inline def setDeliveryTime(value: String): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
