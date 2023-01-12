package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderLineItemReturnInfo extends StObject {
  
  /** Required. How many days later the item can be returned. */
  var daysToReturn: js.UndefOr[Double] = js.undefined
  
  /** Required. Whether the item is returnable. */
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  
  /** Required. URL of the item return policy. */
  var policyUrl: js.UndefOr[String] = js.undefined
}
object OrderLineItemReturnInfo {
  
  inline def apply(): OrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemReturnInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderLineItemReturnInfo] (val x: Self) extends AnyVal {
    
    inline def setDaysToReturn(value: Double): Self = StObject.set(x, "daysToReturn", value.asInstanceOf[js.Any])
    
    inline def setDaysToReturnUndefined: Self = StObject.set(x, "daysToReturn", js.undefined)
    
    inline def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    inline def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    inline def setPolicyUrl(value: String): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
    
    inline def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
  }
}
