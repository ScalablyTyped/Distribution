package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApproveDecision extends StObject {
  
  /**
    * The time at which approval was granted.
    */
  var approveTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the approval expires.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaApproveDecision {
  
  inline def apply(): SchemaApproveDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproveDecision]
  }
  
  extension [Self <: SchemaApproveDecision](x: Self) {
    
    inline def setApproveTime(value: String): Self = StObject.set(x, "approveTime", value.asInstanceOf[js.Any])
    
    inline def setApproveTimeNull: Self = StObject.set(x, "approveTime", null)
    
    inline def setApproveTimeUndefined: Self = StObject.set(x, "approveTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
