package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApproveApprovalRequestMessage extends StObject {
  
  /**
    * The expiration time of this approval.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaApproveApprovalRequestMessage {
  
  inline def apply(): SchemaApproveApprovalRequestMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproveApprovalRequestMessage]
  }
  
  extension [Self <: SchemaApproveApprovalRequestMessage](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
