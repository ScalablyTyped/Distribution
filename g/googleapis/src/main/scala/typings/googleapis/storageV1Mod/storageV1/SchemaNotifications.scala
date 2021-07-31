package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of notification subscriptions.
  */
trait SchemaNotifications extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaNotification]] = js.undefined
  
  /**
    * The kind of item this is. For lists of notifications, this is always
    * storage#notifications.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaNotifications {
  
  @scala.inline
  def apply(): SchemaNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifications]
  }
  
  @scala.inline
  implicit class SchemaNotificationsMutableBuilder[Self <: SchemaNotifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaNotification]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaNotification*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
