package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectsListResponse extends StObject {
  
  /** when the email was added to the denylist */
  var created_at: String
  
  /**
    * extended details about the event, such as the SMTP diagnostic for bounces or the comment for
    * manually-created rejections
    */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /** the email that is blocked */
  var email: String
  
  /** whether the denylist entry has expired */
  var expired: Boolean
  
  /** when the denylist entry will expire (this may be in the past) */
  var expires_at: js.UndefOr[String | Null] = js.undefined
  
  /** the timestamp of the most recent event that either created or renewed this rejection */
  var last_event_at: String
  
  /** the type of event (hard-bounce, soft-bounce, spam, unsub, custom) that caused this rejection */
  var reason: RejectsRejectReason
  
  /** the sender that this denylist entry applies to, or null if none. */
  var sender: js.UndefOr[RejectsRejectedSender | Null] = js.undefined
  
  /** the subaccount that this denylist entry applies to, or null if none. */
  var subaccount: js.UndefOr[String | Null] = js.undefined
}
object RejectsListResponse {
  
  inline def apply(
    created_at: String,
    email: String,
    expired: Boolean,
    last_event_at: String,
    reason: RejectsRejectReason
  ): RejectsListResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], last_event_at = last_event_at.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectsListResponse]
  }
  
  extension [Self <: RejectsListResponse](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    
    inline def setLast_event_at(value: String): Self = StObject.set(x, "last_event_at", value.asInstanceOf[js.Any])
    
    inline def setReason(value: RejectsRejectReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSender(value: RejectsRejectedSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderNull: Self = StObject.set(x, "sender", null)
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
    
    inline def setSubaccountNull: Self = StObject.set(x, "subaccount", null)
    
    inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
  }
}
