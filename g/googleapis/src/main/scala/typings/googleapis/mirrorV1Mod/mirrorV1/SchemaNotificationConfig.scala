package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls how notifications for a timeline item are presented to the user.
  */
@js.native
trait SchemaNotificationConfig extends js.Object {
  
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
  implicit class SchemaNotificationConfigOps[Self <: SchemaNotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeliveryTime(value: String): Self = this.set("deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryTime: Self = this.set("deliveryTime", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
