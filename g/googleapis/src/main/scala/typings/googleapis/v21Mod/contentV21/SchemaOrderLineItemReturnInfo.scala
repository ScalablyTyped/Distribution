package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemReturnInfo extends StObject {
  
  /**
    * How many days later the item can be returned.
    */
  var daysToReturn: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the item is returnable.
    */
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * URL of the item return policy.
    */
  var policyUrl: js.UndefOr[String] = js.undefined
}
object SchemaOrderLineItemReturnInfo {
  
  inline def apply(): SchemaOrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemReturnInfo]
  }
  
  extension [Self <: SchemaOrderLineItemReturnInfo](x: Self) {
    
    inline def setDaysToReturn(value: Double): Self = StObject.set(x, "daysToReturn", value.asInstanceOf[js.Any])
    
    inline def setDaysToReturnUndefined: Self = StObject.set(x, "daysToReturn", js.undefined)
    
    inline def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    inline def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    inline def setPolicyUrl(value: String): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
    
    inline def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
  }
}
