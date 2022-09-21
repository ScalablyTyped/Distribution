package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWatchResponse extends StObject {
  
  /**
    * When Gmail will stop sending notifications for mailbox updates (epoch millis). Call `watch` again before this time to renew the watch.
    */
  var expiration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the mailbox's current history record.
    */
  var historyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaWatchResponse {
  
  inline def apply(): SchemaWatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchResponse]
  }
  
  extension [Self <: SchemaWatchResponse](x: Self) {
    
    inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationNull: Self = StObject.set(x, "expiration", null)
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdNull: Self = StObject.set(x, "historyId", null)
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
  }
}
