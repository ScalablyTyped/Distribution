package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Push notification watch response.
  */
trait SchemaWatchResponse extends StObject {
  
  /**
    * When Gmail will stop sending notifications for mailbox updates (epoch
    * millis). Call watch again before this time to renew the watch.
    */
  var expiration: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the mailbox&#39;s current history record.
    */
  var historyId: js.UndefOr[String] = js.undefined
}
object SchemaWatchResponse {
  
  @scala.inline
  def apply(): SchemaWatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchResponse]
  }
  
  @scala.inline
  implicit class SchemaWatchResponseMutableBuilder[Self <: SchemaWatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
  }
}
