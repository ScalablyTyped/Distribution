package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemReturnInfo extends StObject {
  
  /**
    * Required. How many days later the item can be returned.
    */
  var daysToReturn: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Whether the item is returnable.
    */
  var isReturnable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. URL of the item return policy.
    */
  var policyUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderLineItemReturnInfo {
  
  inline def apply(): SchemaOrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemReturnInfo]
  }
  
  extension [Self <: SchemaOrderLineItemReturnInfo](x: Self) {
    
    inline def setDaysToReturn(value: Double): Self = StObject.set(x, "daysToReturn", value.asInstanceOf[js.Any])
    
    inline def setDaysToReturnNull: Self = StObject.set(x, "daysToReturn", null)
    
    inline def setDaysToReturnUndefined: Self = StObject.set(x, "daysToReturn", js.undefined)
    
    inline def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    inline def setIsReturnableNull: Self = StObject.set(x, "isReturnable", null)
    
    inline def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    inline def setPolicyUrl(value: String): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
    
    inline def setPolicyUrlNull: Self = StObject.set(x, "policyUrl", null)
    
    inline def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
  }
}
