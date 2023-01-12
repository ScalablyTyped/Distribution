package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproveDecision extends StObject {
  
  /** The time at which approval was granted. */
  var approveTime: js.UndefOr[String] = js.undefined
  
  /** True when the request has been auto-approved. */
  var autoApproved: js.UndefOr[Boolean] = js.undefined
  
  /** The time at which the approval expires. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** If set, denotes the timestamp at which the approval is invalidated. */
  var invalidateTime: js.UndefOr[String] = js.undefined
  
  /** The signature for the ApprovalRequest and details on how it was signed. */
  var signatureInfo: js.UndefOr[SignatureInfo] = js.undefined
}
object ApproveDecision {
  
  inline def apply(): ApproveDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproveDecision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApproveDecision] (val x: Self) extends AnyVal {
    
    inline def setApproveTime(value: String): Self = StObject.set(x, "approveTime", value.asInstanceOf[js.Any])
    
    inline def setApproveTimeUndefined: Self = StObject.set(x, "approveTime", js.undefined)
    
    inline def setAutoApproved(value: Boolean): Self = StObject.set(x, "autoApproved", value.asInstanceOf[js.Any])
    
    inline def setAutoApprovedUndefined: Self = StObject.set(x, "autoApproved", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setInvalidateTime(value: String): Self = StObject.set(x, "invalidateTime", value.asInstanceOf[js.Any])
    
    inline def setInvalidateTimeUndefined: Self = StObject.set(x, "invalidateTime", js.undefined)
    
    inline def setSignatureInfo(value: SignatureInfo): Self = StObject.set(x, "signatureInfo", value.asInstanceOf[js.Any])
    
    inline def setSignatureInfoUndefined: Self = StObject.set(x, "signatureInfo", js.undefined)
  }
}
