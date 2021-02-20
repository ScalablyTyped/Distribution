package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Customer-level settings.
  */
@js.native
trait SchemaSettings extends StObject {
  
  /**
    * The list of notifications.
    */
  var notifications: js.UndefOr[js.Array[SchemaNotification]] = js.native
}
object SchemaSettings {
  
  @scala.inline
  def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  
  @scala.inline
  implicit class SchemaSettingsMutableBuilder[Self <: SchemaSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifications(value: js.Array[SchemaNotification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: SchemaNotification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
  }
}
