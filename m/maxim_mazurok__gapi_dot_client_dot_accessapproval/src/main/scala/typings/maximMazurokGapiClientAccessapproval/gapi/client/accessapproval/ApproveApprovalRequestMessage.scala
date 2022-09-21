package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproveApprovalRequestMessage extends StObject {
  
  /** The expiration time of this approval. */
  var expireTime: js.UndefOr[String] = js.undefined
}
object ApproveApprovalRequestMessage {
  
  inline def apply(): ApproveApprovalRequestMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproveApprovalRequestMessage]
  }
  
  extension [Self <: ApproveApprovalRequestMessage](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
