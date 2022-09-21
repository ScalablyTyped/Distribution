package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnPolicyOnlineReturnShippingFee extends StObject {
  
  /**
    * Fixed return shipping fee amount. This value is only applicable when type is FIXED. We will treat the return shipping fee as free if type is FIXED and this value is not set.
    */
  var fixedFee: js.UndefOr[SchemaPriceAmount] = js.undefined
  
  /**
    * Type of return shipping fee.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnPolicyOnlineReturnShippingFee {
  
  inline def apply(): SchemaReturnPolicyOnlineReturnShippingFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnPolicyOnlineReturnShippingFee]
  }
  
  extension [Self <: SchemaReturnPolicyOnlineReturnShippingFee](x: Self) {
    
    inline def setFixedFee(value: SchemaPriceAmount): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    inline def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
