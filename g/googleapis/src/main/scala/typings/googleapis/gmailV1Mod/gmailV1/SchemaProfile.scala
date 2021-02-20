package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Profile for a Gmail user.
  */
@js.native
trait SchemaProfile extends StObject {
  
  /**
    * The user&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * The ID of the mailbox&#39;s current history record.
    */
  var historyId: js.UndefOr[String] = js.native
  
  /**
    * The total number of messages in the mailbox.
    */
  var messagesTotal: js.UndefOr[Double] = js.native
  
  /**
    * The total number of threads in the mailbox.
    */
  var threadsTotal: js.UndefOr[Double] = js.native
}
object SchemaProfile {
  
  @scala.inline
  def apply(): SchemaProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfile]
  }
  
  @scala.inline
  implicit class SchemaProfileMutableBuilder[Self <: SchemaProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setMessagesTotal(value: Double): Self = StObject.set(x, "messagesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesTotalUndefined: Self = StObject.set(x, "messagesTotal", js.undefined)
    
    @scala.inline
    def setThreadsTotal(value: Double): Self = StObject.set(x, "threadsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsTotalUndefined: Self = StObject.set(x, "threadsTotal", js.undefined)
  }
}
