package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A notification delivered by the API.
  */
trait SchemaNotification extends StObject {
  
  /**
    * The collection that generated the notification.
    */
  var collection: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the item that generated the notification.
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of operation that generated the notification.
    */
  var operation: js.UndefOr[String] = js.undefined
  
  /**
    * A list of actions taken by the user that triggered the notification.
    */
  var userActions: js.UndefOr[js.Array[SchemaUserAction]] = js.undefined
  
  /**
    * The user token provided by the service when it subscribed for
    * notifications.
    */
  var userToken: js.UndefOr[String] = js.undefined
  
  /**
    * The secret verify token provided by the service when it subscribed for
    * notifications.
    */
  var verifyToken: js.UndefOr[String] = js.undefined
}
object SchemaNotification {
  
  inline def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  extension [Self <: SchemaNotification](x: Self) {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setUserActions(value: js.Array[SchemaUserAction]): Self = StObject.set(x, "userActions", value.asInstanceOf[js.Any])
    
    inline def setUserActionsUndefined: Self = StObject.set(x, "userActions", js.undefined)
    
    inline def setUserActionsVarargs(value: SchemaUserAction*): Self = StObject.set(x, "userActions", js.Array(value :_*))
    
    inline def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    inline def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
    
    inline def setVerifyToken(value: String): Self = StObject.set(x, "verifyToken", value.asInstanceOf[js.Any])
    
    inline def setVerifyTokenUndefined: Self = StObject.set(x, "verifyToken", js.undefined)
  }
}
