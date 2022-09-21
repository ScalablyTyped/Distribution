package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProfile extends StObject {
  
  /**
    * The user's email address.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the mailbox's current history record.
    */
  var historyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of messages in the mailbox.
    */
  var messagesTotal: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of threads in the mailbox.
    */
  var threadsTotal: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProfile {
  
  inline def apply(): SchemaProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfile]
  }
  
  extension [Self <: SchemaProfile](x: Self) {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdNull: Self = StObject.set(x, "historyId", null)
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setMessagesTotal(value: Double): Self = StObject.set(x, "messagesTotal", value.asInstanceOf[js.Any])
    
    inline def setMessagesTotalNull: Self = StObject.set(x, "messagesTotal", null)
    
    inline def setMessagesTotalUndefined: Self = StObject.set(x, "messagesTotal", js.undefined)
    
    inline def setThreadsTotal(value: Double): Self = StObject.set(x, "threadsTotal", value.asInstanceOf[js.Any])
    
    inline def setThreadsTotalNull: Self = StObject.set(x, "threadsTotal", null)
    
    inline def setThreadsTotalUndefined: Self = StObject.set(x, "threadsTotal", js.undefined)
  }
}
