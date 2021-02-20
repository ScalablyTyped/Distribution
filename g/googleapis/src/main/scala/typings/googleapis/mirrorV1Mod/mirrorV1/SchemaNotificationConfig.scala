package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls how notifications for a timeline item are presented to the user.
  */
@js.native
trait SchemaNotificationConfig extends StObject {
  
  /**
    * The time at which the notification should be delivered.
    */
  var deliveryTime: js.UndefOr[String] = js.native
  
  /**
    * Describes how important the notification is. Allowed values are:   -
    * DEFAULT - Notifications of default importance. A chime will be played to
    * alert users.
    */
  var level: js.UndefOr[String] = js.native
}
object SchemaNotificationConfig {
  
  @scala.inline
  def apply(): SchemaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationConfig]
  }
  
  @scala.inline
  implicit class SchemaNotificationConfigMutableBuilder[Self <: SchemaNotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryTime(value: String): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
