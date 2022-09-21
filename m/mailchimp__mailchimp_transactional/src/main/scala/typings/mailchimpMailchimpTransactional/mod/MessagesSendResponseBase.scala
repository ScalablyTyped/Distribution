package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSendResponseBase extends StObject {
  
  /** The message's unique id */
  var _id: String
  
  /** The email address of the recipient */
  var email: String
  
  /** The reason for the rejection if the recipient status is "rejected". */
  var reject_reason: js.UndefOr[RejectReason | Null] = js.undefined
  
  /** The sending status of the recipient. */
  var status: SendingStatus
}
object MessagesSendResponseBase {
  
  inline def apply(_id: String, email: String, status: SendingStatus): MessagesSendResponseBase = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesSendResponseBase]
  }
  
  extension [Self <: MessagesSendResponseBase](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setReject_reason(value: RejectReason): Self = StObject.set(x, "reject_reason", value.asInstanceOf[js.Any])
    
    inline def setReject_reasonNull: Self = StObject.set(x, "reject_reason", null)
    
    inline def setReject_reasonUndefined: Self = StObject.set(x, "reject_reason", js.undefined)
    
    inline def setStatus(value: SendingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
